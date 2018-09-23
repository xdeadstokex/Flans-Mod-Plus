package com.flansmod.client.gui;

import com.flansmod.common.guns.boxes.ContainerGunBox;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.World;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.client.FMLClientHandler;

import com.flansmod.common.guns.boxes.GunBoxType;

import java.util.Collections;
import java.util.List;

public class GuiGunBox extends GuiContainer
{
	private static final ResourceLocation texture = new ResourceLocation("flansmod", "gui/weaponBoxDefault.png");
	private static RenderItem itemRenderer = new RenderItem();
	private InventoryPlayer inventory;
	private Minecraft mc;
	private GunBoxType type;
	private GuiButton craft;
	private String recipeTooltip = null;
	private int mouseX, mouseY;
	private int hoverOver = -1;
	private int selectedItem = -1;
	private int selectedAmmoitem = -1;
	private boolean tabToAmmo = false;
	
	public GuiGunBox(InventoryPlayer playerinventory, GunBoxType type, World w)
	{
		super(new ContainerGunBox(playerinventory, w));
		inventory = playerinventory;
		mc = FMLClientHandler.instance().getClient();
		this.type = type;

		xSize = 273;
		ySize = 233;
	}

	@Override
	public void initGui()
	{
		super.initGui();

		int xOrigin = (width - xSize) / 2;
		int yOrigin = (height - ySize) / 2;

		craft = new GuiButton(0, xOrigin + 126, yOrigin + 110, 64, 20, "Craft");
		craft.visible = false;
		buttonList.add(craft);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int x, int y)
	{
		//Draw titles
		fontRendererObj.drawString(type.name, 7, 6, 0x404040);

		for(int i = 0; i < type.guns.length && i < 8; i++)
			if(type.guns[i] != null)
				fontRendererObj.drawString(type.guns[i].name, 19, 45 + (12 * i) ,0x404040);

		//If a weapon has been selected from the list
		if(selectedItem != -1)
		{
			drawSlotInventory(new ItemStack(type.guns[selectedItem].getItem()), 127, 26);
			if(type.bullets[selectedItem] != null)
				drawSlotInventory(new ItemStack(type.bullets[selectedItem].getItem()), 155, 26);

			if(!tabToAmmo)
			{
				fontRendererObj.drawString(type.guns[selectedItem].name, 127, 52, 0x404040);
				drawRecipe(type.gunParts);
			}
			else if(type.bullets[selectedItem] != null)
			{
				fontRendererObj.drawString(type.bullets[selectedItem].name, 127, 52, 0x404040);
				drawRecipe(type.bulletParts);
			}
		}

		//Draw tooltips
		if(recipeTooltip != null)
			drawHoveringText(Collections.singletonList(recipeTooltip), mouseX - guiLeft, mouseY - guiTop, fontRendererObj);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

		int xOrigin = (width - xSize) / 2;
		int yOrigin = (height - ySize) / 2;

		mc.renderEngine.bindTexture(texture);
		drawTexturedModalRect(xOrigin, yOrigin, 0, 0, xSize, ySize);

		if(hoverOver != -1)
		{
			drawTexturedModalRect(xOrigin + 8, yOrigin + 43 + (hoverOver * 12), 383, 5, 108, 12);
		}

		if(selectedItem != -1)
		{
			drawTexturedModalRect(xOrigin + 8, yOrigin + 43 + (selectedItem * 12), 275, 5, 108, 12);
			drawTexturedModalRect(xOrigin + 121, yOrigin + 20, 275, 207, 144, 25);
			if(!tabToAmmo)
			{
				drawTexturedModalRect(xOrigin + 121, yOrigin + 45, 275, 17, 144, 95);
				drawTexturedModalRect(xOrigin + 127, yOrigin + 26, 419, 33, 16, 16);
			}
			else
			{
				drawTexturedModalRect(xOrigin + 121, yOrigin + 45, 275, 112, 144, 95);
			}
		}

		if(tabToAmmo && selectedAmmoitem != -1)
			drawTexturedModalRect(xOrigin + 155, yOrigin + 26, 419, 17, 16, 16);

	}

	@Override
	public void drawTexturedModalRect(int par1, int par2, int par3, int par4, int par5, int par6)
	{
		float f = 1F / 512F;
		float f1 = 1F / 256F;
		Tessellator tessellator = Tessellator.instance;
		tessellator.startDrawingQuads();
		tessellator.addVertexWithUV((double)(par1), (double)(par2 + par6), (double)this.zLevel, (double)((float)(par3) * f), (double)((float)(par4 + par6) * f1));
		tessellator.addVertexWithUV((double)(par1 + par5), (double)(par2 + par6), (double)this.zLevel, (double)((float)(par3 + par5) * f), (double)((float)(par4 + par6) * f1));
		tessellator.addVertexWithUV((double)(par1 + par5), (double)(par2), (double)this.zLevel, (double)((float)(par3 + par5) * f), (double)((float)(par4) * f1));
		tessellator.addVertexWithUV((double)(par1), (double)(par2), (double)this.zLevel, (double)((float)(par3) * f), (double)((float)(par4) * f1));
		tessellator.draw();
	}

	@Override
	public void handleMouseInput()
	{
		super.handleMouseInput();

		mouseX = Mouse.getEventX() * this.width / this.mc.displayWidth;
		mouseY = this.height - Mouse.getEventY() * this.height / this.mc.displayHeight - 1;

		int mouseXInGUI = mouseX - guiLeft;
		int mouseYInGUI = mouseY - guiTop;

		//Hover over gun lists
		hoverOver = -1;
		int sectionX = 8;
		for(int i = 0; i < type.guns.length && i < 8; i++)
		{
			int sectionY = 43 + (i * 12);
			if(mouseXInGUI >= sectionX && mouseXInGUI < sectionX + 108 && mouseYInGUI >= sectionY && mouseYInGUI < sectionY + 12)
			{
				hoverOver = i;
			}
		}

		//Hover for recipe tooltips
		recipeTooltip = null;
		for(int i = 0; i < 8; i++)
		{
			int itemX = 127 + (i * 19);
			int itemY = 68;
			if(i >= 4)
				itemY = 87;

			if(selectedItem != -1 && mouseXInGUI >= itemX && mouseXInGUI < itemX + 16 && mouseYInGUI >= itemY && mouseYInGUI < itemY + 16)
			{
				try
				{
					if(tabToAmmo && type.bulletParts[selectedItem].get(i) != null)
						recipeTooltip = type.bulletParts[selectedItem].get(i).getDisplayName();
					else if(!tabToAmmo && type.gunParts[selectedItem].get(i) != null)
						recipeTooltip = type.gunParts[selectedItem].get(i).getDisplayName();
				}
				catch (IndexOutOfBoundsException ex)
				{
					//Temporary catch fix because I can't think of anything else
				}
			}
		}
	}

	@Override
	protected void mouseClicked(int x, int y, int button)
	{
		int xOrigin = (width - xSize) / 2;
		int yOrigin = (height - ySize) / 2;

		super.mouseClicked(x, y, button);
		int m = x - xOrigin;
		int n = y - yOrigin;

		if (button == 0 || button == 1)
		{
			//If an item is selected in the list
			if(hoverOver != -1 && hoverOver < type.guns.length)
			{
				selectedItem = hoverOver;
				craft.visible = true;
				if(type.bullets[selectedItem] != null)
					selectedAmmoitem = selectedItem;
				else
					selectedAmmoitem = -1;
			}

			//Switch to ammo tab
			if(m >= 149 && m <= 264 && n >= 20 && n <= 44)
				tabToAmmo = true;

			//Switch to weapon tab
			if(m >= 121 && m <= 148 && n >= 20 && n <= 44)
				tabToAmmo = false;
		}

		if(button != 0)
			return;
	}

	private void drawSlotInventory(ItemStack itemstack, int i, int j)
	{
		if(itemstack == null || itemstack.getItem() == null)
			return;
		RenderHelper.enableGUIStandardItemLighting();
		itemRenderer.renderItemIntoGUI(fontRendererObj, mc.renderEngine, itemstack, i, j);
		itemRenderer.renderItemOverlayIntoGUI(fontRendererObj, mc.renderEngine, itemstack, i, j);
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_DEPTH_TEST);
	}

	private void drawRecipe(List<ItemStack>[] parts)
	{
		int count = parts[selectedItem].size();
		for(int i = 0; i < count; i++)
		{
			if(i < 4)
				drawSlotInventory(parts[selectedItem].get(i), 127 + (i * 19), 68);
			else
				drawSlotInventory(parts[selectedItem].get(i), 127 + ((i - 4) * 19), 87);
		}
	}

//	@Override
//	public void drawScreen(int i, int j, float f)
//	{
//		ScaledResolution scaledresolution = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
//		int k = scaledresolution.getScaledWidth();
//		int l = scaledresolution.getScaledHeight();
//		FontRenderer fontrenderer = mc.fontRenderer;
//		drawDefaultBackground();
//		GL11.glEnable(3042 /*GL_BLEND*/);
//		mc.renderEngine.bindTexture(texture);
//		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
//		int m = guiOriginX = k / 2 - 88;
//		int n = guiOriginY = l / 2 - 102;
//		drawTexturedModalRect(m, n, 0, 0, 176, 204);
//
//		//No idea why this works, but it makes the text bind its texture correctly
//		//mc.renderEngine.bindTexture("/terrain.png");
//		//TODO : Investigate
//
//		drawCenteredString(fontRendererObj, type.name, k / 2, n + 5, 0xffffff);
//		mc.renderEngine.bindTexture(texture);
//
//		// Draw the gun slots in the second gun panel if there is a second gun
//		// on this page
//		if (type.numGuns > page * 2 + 1 && type.guns[page * 2] != null && type.guns[page * 2 + 1] != null)
//			drawTexturedModalRect(m + 89, n + 18, 5, 18, 82, 90);
//		// Grey out buttons when they are unavaliable
//		if (page == 0)
//			drawTexturedModalRect(m + 77, n + 109, 176, 0, 10, 10);
//		if (type.numGuns <= page * 2 + 2)
//			drawTexturedModalRect(m + 89, n + 109, 186, 0, 10, 10);
//
//		RenderHelper.enableGUIStandardItemLighting();
//		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
//		GL11.glEnable(GL12.GL_RESCALE_NORMAL);
//		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240F, 240F);
//
//		// Fill the gun panels with guns
//		drawRecipe(fontrenderer, m, n, page * 2, 0);
//		if (type.numGuns > page * 2 + 1)
//			drawRecipe(fontrenderer, m, n, page * 2 + 1, 1);
//		// Draw the inventory slots (not real slots)
//		for (int row = 0; row < 3; row++)
//		{
//			for (int col = 0; col < 9; col++)
//			{
//				drawSlotInventory(inventory.getStackInSlot(col + (row + 1) * 9), m + 8 + col * 18, n + 122 + row * 18);
//			}
//		}
//		for (int col = 0; col < 9; col++)
//		{
//			drawSlotInventory(inventory.getStackInSlot(col), m + 8 + col * 18, n + 180);
//		}
//
//		GL11.glDisable(3042 /*GL_BLEND*/);
//	}
//
//	private void drawRecipe(FontRenderer fontrenderer, int m, int n, int q, int offset)
//	{
//		m += offset * 84;
//		if (type.guns[q] != null)
//		{
//			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
//			//fontRenderer.drawString(type.guns[q].name, m + 9, n + 22, 0xffffffff);
//			drawSlotInventory(new ItemStack(type.guns[q].getItem()), m + 9, n + 44);
//			if(type.bullets[q] != null)
//				drawSlotInventory(new ItemStack(type.bullets[q].getItem()), m + 9, n + 66);
//			if(type.altBullets[q] != null)
//				drawSlotInventory(new ItemStack(type.altBullets[q].getItem()), m + 9, n + 88);
//			int numParts = type.gunParts[q].size();
//			int startPart = 0;
//			if (numParts >= 4)
//			{
//				startPart = (scroll / 40) % (numParts - 2);
//			}
//			for (int p = 0; p < (numParts < 3 ? numParts : 3); p++)
//			{
//				drawSlotInventory(type.gunParts[q].get(startPart + p), m + 30 + p * 19, n + 44);
//			}
//			if(type.bullets[q] != null)
//			{
//				numParts = type.bulletParts[q].size();
//				startPart = 0;
//				if (numParts >= 4)
//				{
//					startPart = (scroll / 40) % (numParts - 2);
//				}
//				for (int p = 0; p < (numParts < 3 ? numParts : 3); p++)
//				{
//					drawSlotInventory(type.bulletParts[q].get(startPart + p), m + 30 + p * 19, n + 66);
//				}
//			}
//			if(type.altBullets[q] != null)
//			{
//				numParts = type.altBulletParts[q].size();
//				startPart = 0;
//				if (numParts >= 4)
//				{
//					startPart = (scroll / 40) % (numParts - 2);
//				}
//				for (int p = 0; p < (numParts < 3 ? numParts : 3); p++)
//				{
//					drawSlotInventory(type.altBulletParts[q].get(startPart + p), m + 30 + p * 19, n + 88);
//				}
//			}
//			RenderHelper.disableStandardItemLighting();
//			String name = type.guns[q].name;
//			if (name.length() > 12)
//			{
//				int nextSpace = name.indexOf(" ", 10);
//				if (nextSpace != -1)
//				{
//					drawCenteredString(fontrenderer, name.substring(0, nextSpace), m + 46, n + 22, 0xffffff);
//					drawCenteredString(fontrenderer, name.substring(nextSpace + 1, name.length()), m + 46, n + 32, 0xffffff);
//				} else
//					drawCenteredString(fontrenderer, name, m + 46, n + 25, 0xffffff);
//			} else
//				drawCenteredString(fontrenderer, name, m + 46, n + 25, 0xffffff);
//			RenderHelper.enableGUIStandardItemLighting();
//
//		}
//	}
//

//	@Override
//	protected void mouseClicked(int i, int j, int k)
//	{
//		super.mouseClicked(i, j, k);
//		int m = i - guiOriginX;
//		int n = j - guiOriginY;
//		if (k == 0 || k == 1)
//		{
//			// Back button
//			if (m > 77 && m < 87 && n > 109 && n < 119)
//			{
//				if (page > 0)
//					page--;
//			}
//
//			// Forwards button
//			if (m > 89 && m < 99 && n > 109 && n < 119)
//			{
//				if (type.numGuns > page * 2 + 2)
//					page++;
//			}
//
//			// Gun 1
//			if (type.guns[page * 2] != null && m > 7 && m < 27 && n > 42 && n < 62)
//			{
//				type.block.buyGun(page * 2, inventory, type);
//			}
//			// Ammo 1
//			if (type.bullets[page * 2] != null && m > 7 && m < 27 && n > 64 && n < 84)
//			{
//				type.block.buyAmmo(page * 2, inventory, type);
//			}
//			// Alt Ammo 1
//			if (type.altBullets[page * 2] != null && m > 7 && m < 27 && n > 86 && n < 106)
//			{
//				type.block.buyAltAmmo(page * 2, inventory, type);
//			}
//
//			// Gun 2
//			if (page * 2 + 1 < type.numGuns && type.guns[page * 2 + 1] != null && m > 91 && m < 111 && n > 42 && n < 62)
//			{
//				type.block.buyGun(page * 2 + 1, inventory, type);
//			}
//			// Ammo 2
//			if (page * 2 + 1 < type.numGuns && type.bullets[page * 2 + 1] != null && m > 91 && m < 111 && n > 64 && n < 84)
//			{
//				type.block.buyAmmo(page * 2 + 1, inventory, type);
//			}
//			// Alt Ammo 2
//			if (page * 2 + 1 < type.numGuns && type.altBullets[page * 2 + 1] != null && m > 91 && m < 111 && n > 86 && n < 106)
//			{
//				type.block.buyAltAmmo(page * 2 + 1, inventory, type);
//			}
//		}
//	}

	@Override
	protected void keyTyped(char c, int i)
	{
		if (i == 1 || i == mc.gameSettings.keyBindInventory.getKeyCode())
		{
			mc.thePlayer.closeScreen();
		}
	}

	@Override
	public boolean doesGuiPauseGame()
	{
		return false;
	}
}
