//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 24.02.2017 - 21:59:25
// Last changed on: 24.02.2017 - 21:59:25

package com.flansmod.client.model.psf; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelValkyriefancy extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelValkyriefancy() //Same as Filename
	{
		
		valkyrie = new ModelRendererTurbo[15][];

		valkyrie[0] = new ModelRendererTurbo[33];
		valkyrie[0][0] = new ModelRendererTurbo(this, 0, 205, textureX, textureY); // Import Box7
		valkyrie[0][1] = new ModelRendererTurbo(this, 0, 221, textureX, textureY); // Import Box8
		valkyrie[0][2] = new ModelRendererTurbo(this, 0, 238, textureX, textureY); // Import Box9
		valkyrie[0][3] = new ModelRendererTurbo(this, 90, 420, textureX, textureY); // Import Box17
		valkyrie[0][4] = new ModelRendererTurbo(this, 89, 451, textureX, textureY); // Import Box18
		valkyrie[0][5] = new ModelRendererTurbo(this, 0, 478, textureX, textureY); // Import Box19
		valkyrie[0][6] = new ModelRendererTurbo(this, 0, 478, textureX, textureY); // Import Box20
		valkyrie[0][7] = new ModelRendererTurbo(this, 0, 48, textureX, textureY); // Import Box1
		valkyrie[0][8] = new ModelRendererTurbo(this, 0, 78, textureX, textureY); // Import Box2
		valkyrie[0][9] = new ModelRendererTurbo(this, 0, 102, textureX, textureY); // Import Box3
		valkyrie[0][10] = new ModelRendererTurbo(this, 0, 126, textureX, textureY); // Import Box4
		valkyrie[0][11] = new ModelRendererTurbo(this, 0, 154, textureX, textureY); // Import Box5
		valkyrie[0][12] = new ModelRendererTurbo(this, 0, 181, textureX, textureY); // Import Box6
		valkyrie[0][13] = new ModelRendererTurbo(this, 91, 364, textureX, textureY); // Import Box10
		valkyrie[0][14] = new ModelRendererTurbo(this, 1, 420, textureX, textureY); // Import Box11
		valkyrie[0][15] = new ModelRendererTurbo(this, 146, 480, textureX, textureY); // Import Box7
		valkyrie[0][16] = new ModelRendererTurbo(this, 146, 480, textureX, textureY); // Import Box8
		valkyrie[0][17] = new ModelRendererTurbo(this, 71, 276, textureX, textureY); // Import Box10
		valkyrie[0][18] = new ModelRendererTurbo(this, 0, 455, textureX, textureY); // Import Box11
		valkyrie[0][19] = new ModelRendererTurbo(this, 107, 593, textureX, textureY); // Import Box12
		valkyrie[0][20] = new ModelRendererTurbo(this, 186, 971, textureX, textureY); // Import Box13
		valkyrie[0][21] = new ModelRendererTurbo(this, 304, 967, textureX, textureY); // Import Box2
		valkyrie[0][22] = new ModelRendererTurbo(this, 0, 268, textureX, textureY); // Import Box10
		valkyrie[0][23] = new ModelRendererTurbo(this, 0, 299, textureX, textureY); // Import Box11
		valkyrie[0][24] = new ModelRendererTurbo(this, 0, 332, textureX, textureY); // Import Box12
		valkyrie[0][25] = new ModelRendererTurbo(this, 0, 352, textureX, textureY); // Import Box13
		valkyrie[0][26] = new ModelRendererTurbo(this, 0, 370, textureX, textureY); // Import Box14
		valkyrie[0][27] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Import Box15
		valkyrie[0][28] = new ModelRendererTurbo(this, 110, 1, textureX, textureY); // Import Box0
		valkyrie[0][29] = new ModelRendererTurbo(this, 200, 690, textureX, textureY); // Import Box14
		valkyrie[0][30] = new ModelRendererTurbo(this, 200, 690, textureX, textureY); // Import Box15
		valkyrie[0][31] = new ModelRendererTurbo(this, 200, 690, textureX, textureY); // Import Box16
		valkyrie[0][32] = new ModelRendererTurbo(this, 200, 690, textureX, textureY); // Import Box17

		valkyrie[0][0].addShapeBox(0F, 0F, 0F, 59, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		valkyrie[0][0].setRotationPoint(-59F, 0F, -9.5F);

		valkyrie[0][1].addShapeBox(0F, 0F, 0F, 59, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box8
		valkyrie[0][1].setRotationPoint(-59F, 0F, 7.5F);

		valkyrie[0][2].addShapeBox(0F, 0F, 0F, 59, 6, 19, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -4F); // Import Box9
		valkyrie[0][2].setRotationPoint(-59F, 11F, -9.5F);

		valkyrie[0][3].addShapeBox(0F, 0F, 0F, 6, 3, 21, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		valkyrie[0][3].setRotationPoint(-6F, -11F, -10.5F);

		valkyrie[0][4].addBox(0F, 0F, 0F, 6, 8, 21, 0F); // Import Box18
		valkyrie[0][4].setRotationPoint(-6F, -8F, -10.5F);

		valkyrie[0][5].addShapeBox(0F, 0F, 0F, 17, 8, 2, 0F, 0F, -7F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -7F, 0F, 1F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F); // Import Box19
		valkyrie[0][5].setRotationPoint(-23F, -8F, -9.5F);

		valkyrie[0][6].addShapeBox(0F, 0F, 0F, 17, 8, 2, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -7F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0.5F); // Import Box20
		valkyrie[0][6].setRotationPoint(-23F, -8F, 7.5F);

		valkyrie[0][7].addShapeBox(0F, 0F, 0F, 33, 9, 15, 0F, -4F, -7F, -6F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, -7F, -6F, 0F, 0F, -5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -5F); // Import Box1
		valkyrie[0][7].setRotationPoint(-120F, 0F, -7.5F);

		valkyrie[0][8].addShapeBox(0F, 0F, 0F, 33, 4, 15, 0F, 0F, 0F, -5F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, -5F, -5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F); // Import Box2
		valkyrie[0][8].setRotationPoint(-120F, 9F, -7.5F);

		valkyrie[0][9].addShapeBox(0F, 0F, 0F, 28, 3, 15, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -27F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -27F, 0F, -5F); // Import Box3
		valkyrie[0][9].setRotationPoint(-115F, 13F, -7.5F);

		valkyrie[0][10].addShapeBox(0F, 0F, 0F, 28, 9, 15, 0F, 0F, 0F, -4F, 0F, 5F, -2F, 0F, 5F, -2F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -10F, 2F, 0F, -10F, 2F, 0F, -4F, 0F); // Import Box4
		valkyrie[0][10].setRotationPoint(-87F, 0F, -7.5F);

		valkyrie[0][11].addShapeBox(0F, 0F, 0F, 28, 4, 15, 0F, 0F, 4F, 0F, 0F, 10F, 2F, 0F, 10F, 2F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F); // Import Box5
		valkyrie[0][11].setRotationPoint(-87F, 9F, -7.5F);

		valkyrie[0][12].addShapeBox(0F, 0F, 0F, 28, 3, 15, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -5F); // Import Box6
		valkyrie[0][12].setRotationPoint(-87F, 13F, -7.5F);

		valkyrie[0][13].addShapeBox(0F, 0F, 0F, 20, 3, 20, 0F, 0F, 0F, -3.5F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -0.5F); // Import Box10
		valkyrie[0][13].setRotationPoint(-26F, -12.5F, -10F);

		valkyrie[0][14].addShapeBox(0F, 0F, 0F, 20, 10, 20, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import Box11
		valkyrie[0][14].setRotationPoint(-26F, -9.5F, -10F);

		valkyrie[0][15].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		valkyrie[0][15].setRotationPoint(-26F, -9.5F, -10F);

		valkyrie[0][16].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		valkyrie[0][16].setRotationPoint(-26F, -9.5F, 9F);

		valkyrie[0][17].addShapeBox(0F, 0F, 0F, 2, 3, 20, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box10
		valkyrie[0][17].setRotationPoint(-22F, -12.5F, -10F);

		valkyrie[0][18].addShapeBox(-10F, 0F, 0F, 10, 3, 19, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box11
		valkyrie[0][18].setRotationPoint(-26F, -12.5F, -9.5F);

		valkyrie[0][19].addBox(-10F, 3F, 0F, 10, 10, 19, 0F); // Import Box12
		valkyrie[0][19].setRotationPoint(-26F, -12.5F, -9.5F);

		valkyrie[0][20].addShapeBox(-32F, 0F, 0F, 23, 3, 19, 0F, 0F, -8F, -4.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -8F, -4.5F, 0F, 8.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8.5F, -0.5F); // Import Box13
		valkyrie[0][20].setRotationPoint(-27F, -12.5F, -9.5F);

		valkyrie[0][21].addShapeBox(-32F, 3F, 0F, 23, 10, 19, 0F, 0F, -8.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import Box2
		valkyrie[0][21].setRotationPoint(-27F, -12.5F, -9.5F);

		valkyrie[0][22].addShapeBox(0F, 0F, 0F, 8, 11, 15, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Import Box10
		valkyrie[0][22].setRotationPoint(-59F, 0F, -7.5F);

		valkyrie[0][23].addBox(0F, 0F, 0F, 3, 15, 13, 0F); // Import Box11
		valkyrie[0][23].setRotationPoint(-27F, -4F, -6.5F);

		valkyrie[0][24].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box12
		valkyrie[0][24].setRotationPoint(-27F, -5F, -6.5F);

		valkyrie[0][25].addBox(0F, 0F, 0F, 3, 4, 7, 0F); // Import Box13
		valkyrie[0][25].setRotationPoint(-27F, -9F, -3.5F);

		valkyrie[0][26].addBox(0F, 0F, 0F, 9, 2, 13, 0F); // Import Box14
		valkyrie[0][26].setRotationPoint(-36F, 9F, -6.5F);

		valkyrie[0][27].addShapeBox(0F, 0F, 0F, 23, 15, 13, 0F, 0F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		valkyrie[0][27].setRotationPoint(-24F, -4F, -6.5F);

		valkyrie[0][28].addShapeBox(0F, -3F, -3F, 1, 60, 60, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -54F, 0F, 0F, -54F, 0F, -54F, 0F, 0F, -54F, 0F, 0F, -54F, -54F, 0F, -54F, -54F); // Import Box0
		valkyrie[0][28].setRotationPoint(-45F, -6F, 0F);

		valkyrie[0][29].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box14
		valkyrie[0][29].setRotationPoint(-57F, 16F, -5.5F);
		valkyrie[0][29].rotateAngleX = -0.78539816F;

		valkyrie[0][30].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box15
		valkyrie[0][30].setRotationPoint(-52F, 16F, -5.5F);
		valkyrie[0][30].rotateAngleX = -0.78539816F;

		valkyrie[0][31].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box16
		valkyrie[0][31].setRotationPoint(-57F, 16F, 5.5F);
		valkyrie[0][31].rotateAngleX = 0.78539816F;

		valkyrie[0][32].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box17
		valkyrie[0][32].setRotationPoint(-52F, 16F, 5.5F);
		valkyrie[0][32].rotateAngleX = 0.78539816F;
		
		
		valkyrie[1] = new ModelRendererTurbo[27];
		valkyrie[1][0] = new ModelRendererTurbo(this, 0, 492, textureX, textureY); // Import Box21
		valkyrie[1][1] = new ModelRendererTurbo(this, 0, 518, textureX, textureY); // Import Box22
		valkyrie[1][2] = new ModelRendererTurbo(this, 0, 584, textureX, textureY); // Import Box24
		valkyrie[1][3] = new ModelRendererTurbo(this, 0, 618, textureX, textureY); // Import Box25
		valkyrie[1][4] = new ModelRendererTurbo(this, 0, 636, textureX, textureY); // Import Box27
		valkyrie[1][5] = new ModelRendererTurbo(this, 0, 671, textureX, textureY); // Import Box28
		valkyrie[1][6] = new ModelRendererTurbo(this, 0, 707, textureX, textureY); // Import Box29
		valkyrie[1][7] = new ModelRendererTurbo(this, 0, 729, textureX, textureY); // Import Box30
		valkyrie[1][8] = new ModelRendererTurbo(this, 0, 774, textureX, textureY); // Import Box31
		valkyrie[1][9] = new ModelRendererTurbo(this, 0, 618, textureX, textureY); // Import Box0
		valkyrie[1][10] = new ModelRendererTurbo(this, 0, 584, textureX, textureY); // Import Box1
		valkyrie[1][11] = new ModelRendererTurbo(this, 0, 636, textureX, textureY); // Import Box4
		valkyrie[1][12] = new ModelRendererTurbo(this, 0, 671, textureX, textureY); // Import Box5
		valkyrie[1][13] = new ModelRendererTurbo(this, 0, 707, textureX, textureY); // Import Box6
		valkyrie[1][14] = new ModelRendererTurbo(this, 100, 721, textureX, textureY); // Import Box7
		valkyrie[1][15] = new ModelRendererTurbo(this, 0, 774, textureX, textureY); // Import Box8
		valkyrie[1][16] = new ModelRendererTurbo(this, 200, 150, textureX, textureY); // Import Box12
		valkyrie[1][17] = new ModelRendererTurbo(this, 200, 170, textureX, textureY); // Import Box13
		valkyrie[1][18] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Import Box14
		valkyrie[1][19] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Import Box15
		valkyrie[1][20] = new ModelRendererTurbo(this, 200, 150, textureX, textureY); // Import Box0
		valkyrie[1][21] = new ModelRendererTurbo(this, 200, 170, textureX, textureY); // Import Box1
		valkyrie[1][22] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Import Box2
		valkyrie[1][23] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Import Box3--
		valkyrie[1][24] = new ModelRendererTurbo(this, 200, 690, textureX, textureY); // Import Box12
		valkyrie[1][25] = new ModelRendererTurbo(this, 200, 690, textureX, textureY); // Import Box13
		valkyrie[1][26] = new ModelRendererTurbo(this, 75, 320, textureX, textureY); // Import Box0

		valkyrie[1][0].addShapeBox(0F, 0F, 0F, 52, 3, 21, 0F, 0F, 0F, -3F, 0F, -8F, -8.5F, 0F, -8F, -8.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 6F, -8F, 0F, 6F, -8F, 0F, 0F, 0F); // Import Box21
		valkyrie[1][0].setRotationPoint(-32F, -18F, -10.5F);

		valkyrie[1][1].addShapeBox(0F, 0F, 0F, 52, 8, 21, 0F, 0F, 0F, 0F, 0F, -6F, -8F, 0F, -6F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Import Box22
		valkyrie[1][1].setRotationPoint(-32F, -15F, -10.5F);

		valkyrie[1][2].addShapeBox(0F, 0F, 0F, 19, 1, 26, 0F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box24
		valkyrie[1][2].setRotationPoint(-50F, -3F, -35.5F);

		valkyrie[1][3].addShapeBox(0F, 0F, 0F, 19, 5, 2, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box25
		valkyrie[1][3].setRotationPoint(-50F, -8F, -11.5F);

		valkyrie[1][4].addShapeBox(0F, 0F, 0F, 19, 4, 26, 0F, -18F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, 2F, -18F, 0F, 2F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); // Import Box27
		valkyrie[1][4].setRotationPoint(-43F, -12F, -35.5F);

		valkyrie[1][5].addBox(0F, 0F, 0F, 7, 3, 25, 0F); // Import Box28
		valkyrie[1][5].setRotationPoint(-31F, -3F, -35.5F);

		valkyrie[1][6].addShapeBox(0F, 0F, 0F, 33, 5, 11, 0F, -30F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box29
		valkyrie[1][6].setRotationPoint(-31F, -8F, -46.5F);

		valkyrie[1][7].addShapeBox(0F, 0F, 0F, 26, 4, 33, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -8F, 0F, 0F, -8F); // Import Box30
		valkyrie[1][7].setRotationPoint(-24F, -12F, -35.5F);

		valkyrie[1][8].addBox(0F, 0F, 0F, 26, 8, 33, 0F); // Import Box31
		valkyrie[1][8].setRotationPoint(-24F, -8F, -35.5F);

		valkyrie[1][9].addShapeBox(0F, 0F, 0F, 19, 5, 2, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		valkyrie[1][9].setRotationPoint(-50F, -8F, 9.5F);

		valkyrie[1][10].addShapeBox(0F, 0F, 0F, 19, 1, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F); // Import Box1
		valkyrie[1][10].setRotationPoint(-50F, -3F, 9.5F);

		valkyrie[1][11].addShapeBox(0F, 0F, 0F, 19, 4, 26, 0F, -18F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -25F, -18F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -24F); // Import Box4
		valkyrie[1][11].setRotationPoint(-43F, -12F, 9.5F);

		valkyrie[1][12].addBox(0F, 0F, 0F, 7, 3, 25, 0F); // Import Box5
		valkyrie[1][12].setRotationPoint(-31F, -3F, 10.5F);

		valkyrie[1][13].addShapeBox(0F, 0F, 0F, 33, 5, 11, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -30F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F); // Import Box6
		valkyrie[1][13].setRotationPoint(-31F, -8F, 35.5F);

		valkyrie[1][14].addShapeBox(0F, 0F, 0F, 26, 4, 33, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 1F, 0F, -1F, 1F, 0F); // Import Box7
		valkyrie[1][14].setRotationPoint(-24F, -12F, 2.5F);

		valkyrie[1][15].addBox(0F, 0F, 0F, 26, 8, 33, 0F); // Import Box8
		valkyrie[1][15].setRotationPoint(-24F, -8F, 2.5F);

		valkyrie[1][16].addBox(0F, 0F, 0F, 18, 1, 15, 0F); // Import Box12
		valkyrie[1][16].setRotationPoint(-54F, -2.5F, -25.5F);

		valkyrie[1][17].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box13
		valkyrie[1][17].setRotationPoint(-56F, -2.5F, -25.5F);

		valkyrie[1][18].addShapeBox(0F, 0F, 0F, 21, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 10F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box14
		valkyrie[1][18].setRotationPoint(-52F, -2F, -25.5F);

		valkyrie[1][19].addShapeBox(0F, 0F, 0F, 33, 2, 11, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import Box15
		valkyrie[1][19].setRotationPoint(-31F, -3F, -46.5F);

		valkyrie[1][20].addBox(0F, 0F, 0F, 18, 1, 15, 0F); // Import Box0
		valkyrie[1][20].setRotationPoint(-54F, -2.5F, 10.5F);

		valkyrie[1][21].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box1
		valkyrie[1][21].setRotationPoint(-56F, -2.5F, 10.5F);

		valkyrie[1][22].addShapeBox(0F, 0F, 0F, 21, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 10F, 0F, 0F, 0F); // Import Box2
		valkyrie[1][22].setRotationPoint(-52F, -2F, 9.5F);

		valkyrie[1][23].addShapeBox(0F, 0F, 0F, 33, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -25F, 0F, 0F); // Import Box3--
		valkyrie[1][23].setRotationPoint(-31F, -3F, 35.5F);

		valkyrie[1][24].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box12
		valkyrie[1][24].setRotationPoint(-8F, -17F, 0F);

		valkyrie[1][25].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box13
		valkyrie[1][25].setRotationPoint(-2F, -16F, 0F);

		valkyrie[1][26].addBox(0F, 0F, 0F, 26, 4, 21, 0F); // Import Box0
		valkyrie[1][26].setRotationPoint(-24F, -12F, -10.5F);
		

		valkyrie[2] = new ModelRendererTurbo[35];
		valkyrie[2][0] = new ModelRendererTurbo(this, 0, 549, textureX, textureY); // Import Box23
		valkyrie[2][1] = new ModelRendererTurbo(this, 200, 530, textureX, textureY); // Import Box12
		valkyrie[2][2] = new ModelRendererTurbo(this, 200, 610, textureX, textureY); // Import Box0
		valkyrie[2][3] = new ModelRendererTurbo(this, 200, 610, textureX, textureY); // Import Box1
		valkyrie[2][4] = new ModelRendererTurbo(this, 200, 610, textureX, textureY); // Import Box2
		valkyrie[2][5] = new ModelRendererTurbo(this, 200, 610, textureX, textureY); // Import Box3
		valkyrie[2][6] = new ModelRendererTurbo(this, 200, 620, textureX, textureY); // Import Box4
		valkyrie[2][7] = new ModelRendererTurbo(this, 200, 635, textureX, textureY); // Import Box5
		valkyrie[2][8] = new ModelRendererTurbo(this, 200, 650, textureX, textureY); // Import Box7
		valkyrie[2][9] = new ModelRendererTurbo(this, 200, 635, textureX, textureY); // Import Box0
		valkyrie[2][10] = new ModelRendererTurbo(this, 200, 635, textureX, textureY); // Import Box1
		valkyrie[2][11] = new ModelRendererTurbo(this, 200, 635, textureX, textureY); // Import Box2
		valkyrie[2][12] = new ModelRendererTurbo(this, 200, 700, textureX, textureY); // Import Box8
		valkyrie[2][13] = new ModelRendererTurbo(this, 200, 700, textureX, textureY); // Import Box9
		valkyrie[2][14] = new ModelRendererTurbo(this, 600, 0, textureX, textureY); // Import Box0
		valkyrie[2][15] = new ModelRendererTurbo(this, 600, 20, textureX, textureY); // Import Box1
		valkyrie[2][16] = new ModelRendererTurbo(this, 600, 20, textureX, textureY); // Import Box2
		valkyrie[2][17] = new ModelRendererTurbo(this, 600, 0, textureX, textureY); // Import Box3
		valkyrie[2][18] = new ModelRendererTurbo(this, 600, 40, textureX, textureY); // Import Box0
		valkyrie[2][19] = new ModelRendererTurbo(this, 600, 60, textureX, textureY); // Import Box1
		valkyrie[2][20] = new ModelRendererTurbo(this, 600, 60, textureX, textureY); // Import Box2
		valkyrie[2][21] = new ModelRendererTurbo(this, 600, 80, textureX, textureY); // Import Box3
		valkyrie[2][22] = new ModelRendererTurbo(this, 600, 100, textureX, textureY); // Import Box5
		valkyrie[2][23] = new ModelRendererTurbo(this, 600, 120, textureX, textureY); // Import Box0
		valkyrie[2][24] = new ModelRendererTurbo(this, 600, 140, textureX, textureY); // Import Box1
		valkyrie[2][25] = new ModelRendererTurbo(this, 600, 160, textureX, textureY); // Import Box2
		valkyrie[2][26] = new ModelRendererTurbo(this, 600, 160, textureX, textureY); // Import Box3
		valkyrie[2][27] = new ModelRendererTurbo(this, 600, 180, textureX, textureY); // Import Box4
		valkyrie[2][28] = new ModelRendererTurbo(this, 600, 180, textureX, textureY); // Import Box5
		valkyrie[2][29] = new ModelRendererTurbo(this, 600, 180, textureX, textureY); // Import Box7
		valkyrie[2][30] = new ModelRendererTurbo(this, 600, 200, textureX, textureY); // Import Box8
		valkyrie[2][31] = new ModelRendererTurbo(this, 600, 200, textureX, textureY); // Import Box9
		valkyrie[2][32] = new ModelRendererTurbo(this, 600, 200, textureX, textureY); // Import Box10
		valkyrie[2][33] = new ModelRendererTurbo(this, 600, 100, textureX, textureY); // Import Box4
		valkyrie[2][34] = new ModelRendererTurbo(this, 600, 180, textureX, textureY); // Import Box6

		valkyrie[2][0].addBox(0F, 0F, 0F, 27, 11, 21, 0F); // Import Box23
		valkyrie[2][0].setRotationPoint(-27F, 0F, -10.5F);

		valkyrie[2][1].addShapeBox(0F, 0F, 0F, 27, 4, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -4F); // Import Box12
		valkyrie[2][1].setRotationPoint(-27F, 12F, -10.5F);

		valkyrie[2][2].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, 0F, -6F, 1F, 0F); // Import Box0
		valkyrie[2][2].setRotationPoint(-27F, 16F, -5.5F);

		valkyrie[2][3].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, -6F, 1F, -2F, -6F, 1F, 0F, 0F, 1F, 0F); // Import Box1
		valkyrie[2][3].setRotationPoint(-17F, 16F, -5.5F);

		valkyrie[2][4].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -6F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, -6F, 1F, -2F); // Import Box2
		valkyrie[2][4].setRotationPoint(-27F, 16F, 2.5F);

		valkyrie[2][5].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, -6F, 1F, 0F, -6F, 1F, -2F, 0F, 1F, -2F); // Import Box3
		valkyrie[2][5].setRotationPoint(-17F, 16F, 2.5F);

		valkyrie[2][6].addShapeBox(0F, 0F, 0F, 10, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box4
		valkyrie[2][6].setRotationPoint(-22F, 16F, -2.5F);

		valkyrie[2][7].addShapeBox(0F, 0F, 0F, 24, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box5
		valkyrie[2][7].setRotationPoint(-41F, 16.5F, -4F);

		valkyrie[2][8].addShapeBox(0F, 0F, 0F, 48, 11, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Import Box7
		valkyrie[2][8].setRotationPoint(0F, 7F, -10.5F);

		valkyrie[2][9].addShapeBox(0F, 0F, 0F, 24, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box0
		valkyrie[2][9].setRotationPoint(-41F, 18.5F, -3.9F);

		valkyrie[2][10].addShapeBox(0F, 0F, 0F, 24, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box1
		valkyrie[2][10].setRotationPoint(-41F, 16.5F, 2F);

		valkyrie[2][11].addShapeBox(0F, 0F, 0F, 24, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box2
		valkyrie[2][11].setRotationPoint(-41F, 18.5F, 1.9F);

		valkyrie[2][12].addShapeBox(0F, 0F, 0F, 10, 2, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F); // Import Box8
		valkyrie[2][12].setRotationPoint(-7F, 17F, -10.5F);

		valkyrie[2][13].addShapeBox(0F, 0F, 0F, 10, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F); // Import Box9
		valkyrie[2][13].setRotationPoint(-7F, 17F, 0.5F);

		valkyrie[2][14].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F); // Import Box0
		valkyrie[2][14].setRotationPoint(-23F, 24F, -3.5F);

		valkyrie[2][15].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F); // Import Box1
		valkyrie[2][15].setRotationPoint(-23F, 25F, -3.5F);

		valkyrie[2][16].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box2
		valkyrie[2][16].setRotationPoint(-23F, 25F, 2.5F);

		valkyrie[2][17].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1.5F); // Import Box3
		valkyrie[2][17].setRotationPoint(-23F, 30F, -3.5F);

		valkyrie[2][18].addShapeBox(0F, 0F, 0F, 55, 5, 9, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F); // Import Box0
		valkyrie[2][18].setRotationPoint(-13F, 25F, -4.5F);

		valkyrie[2][19].addShapeBox(0F, 0F, 0F, 55, 2, 9, 0F, 0F, 0F, -2F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F); // Import Box1
		valkyrie[2][19].setRotationPoint(-13F, 23F, -4.5F);

		valkyrie[2][20].addShapeBox(0F, 0F, 0F, 55, 2, 9, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, -2F); // Import Box2
		valkyrie[2][20].setRotationPoint(-13F, 30F, -4.5F);

		valkyrie[2][21].addBox(0F, 0F, 0F, 16, 6, 11, 0F); // Import Box3
		valkyrie[2][21].setRotationPoint(42F, 24.5F, -5.5F);

		valkyrie[2][22].addShapeBox(0F, 0F, 0F, 16, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box5
		valkyrie[2][22].setRotationPoint(42F, 30.5F, -5.5F);

		valkyrie[2][23].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, -0.5F, -2F, 0F, -0.5F); // Import Box0
		valkyrie[2][23].setRotationPoint(-11F, 32F, -1F);

		valkyrie[2][24].addShapeBox(0F, 0F, 0F, 16, 6, 11, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F); // Import Box1
		valkyrie[2][24].setRotationPoint(58F, 24.5F, -5.5F);

		valkyrie[2][25].addShapeBox(0F, 0F, 0F, 16, 2, 11, 0F, 0F, 0F, 0F, 0F, 1.5F, -3F, 0F, 1.5F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.5F, -4F, 0F, -2.5F, -4F, 0F, 0F, -2F); // Import Box2
		valkyrie[2][25].setRotationPoint(58F, 30.5F, -5.5F);

		valkyrie[2][26].addShapeBox(0F, 0F, 0F, 16, 2, 11, 0F, 0F, 0F, -2F, 0F, -2.5F, -4F, 0F, -2.5F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1.5F, -3F, 0F, 1.5F, -3F, 0F, 0F, 0F); // Import Box3
		valkyrie[2][26].setRotationPoint(58F, 22.5F, -5.5F);

		valkyrie[2][27].addShapeBox(0F, 0F, 0F, 10, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Import Box4
		valkyrie[2][27].setRotationPoint(64F, 30F, -1F);

		valkyrie[2][28].addShapeBox(0F, 0F, 0F, 10, 7, 2, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box5
		valkyrie[2][28].setRotationPoint(64F, 18F, -1F);

		valkyrie[2][29].addBox(0F, 0F, 0F, 10, 7, 2, 0F); // Import Box7
		valkyrie[2][29].setRotationPoint(3F, 18F, -1F);

		valkyrie[2][30].addBox(0F, -1.5F, -0.5F, 10, 1, 1, 0F); // Import Box8
		valkyrie[2][30].setRotationPoint(-20F, 27.5F, 0F);

		valkyrie[2][31].addBox(0F, -1.5F, -0.5F, 10, 1, 1, 0F); // Import Box9
		valkyrie[2][31].setRotationPoint(-20F, 27.5F, 0F);
		valkyrie[2][31].rotateAngleX = 2.0943951F;

		valkyrie[2][32].addBox(0F, -1.5F, -0.5F, 10, 1, 1, 0F); // Import Box10
		valkyrie[2][32].setRotationPoint(-20F, 27.5F, 0F);
		valkyrie[2][32].rotateAngleX = -2.0943951F;

		valkyrie[2][33].addShapeBox(0F, 0F, 0F, 16, 2, 11, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box4
		valkyrie[2][33].setRotationPoint(42F, 22.5F, -5.5F);

		valkyrie[2][34].addBox(0F, 0F, 0F, 10, 7, 2, 0F); // Import Box6
		valkyrie[2][34].setRotationPoint(30F, 18F, -1F);
		
		valkyrie[3] = new ModelRendererTurbo[6];
		valkyrie[3][0] = new ModelRendererTurbo(this, 200, 250, textureX, textureY); // Import Box4
		valkyrie[3][1] = new ModelRendererTurbo(this, 200, 350, textureX, textureY); // Import Box5
		valkyrie[3][2] = new ModelRendererTurbo(this, 200, 370, textureX, textureY); // Import Box6
		valkyrie[3][3] = new ModelRendererTurbo(this, 200, 380, textureX, textureY); // Import Box7
		valkyrie[3][4] = new ModelRendererTurbo(this, 200, 390, textureX, textureY); // Import Box8
		valkyrie[3][5] = new ModelRendererTurbo(this, 200, 420, textureX, textureY); // Import Box9

		valkyrie[3][0].addShapeBox(0F, 0F, 0F, 40, 15, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -28F, 0F, 0F); // Import Box4
		valkyrie[3][0].setRotationPoint(0F, 0F, 5.5F);

		valkyrie[3][1].addShapeBox(0F, 0F, 0F, 40, 15, 2, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -28F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F); // Import Box5
		valkyrie[3][1].setRotationPoint(0F, 0F, -7.5F);

		valkyrie[3][2].addShapeBox(0F, 0F, 0F, 12, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Import Box6
		valkyrie[3][2].setRotationPoint(28F, 15F, -7.5F);

		valkyrie[3][3].addShapeBox(0F, 0F, 0F, 12, 3, 2, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		valkyrie[3][3].setRotationPoint(28F, 15F, 5.5F);

		valkyrie[3][4].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F); // Import Box8
		valkyrie[3][4].setRotationPoint(26F, 18F, -7.5F);

		valkyrie[3][5].addShapeBox(0F, 0F, 0F, 12, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box9
		valkyrie[3][5].setRotationPoint(28F, 18F, -7.5F);
		
		
		valkyrie[4] = new ModelRendererTurbo[4];
		valkyrie[4][0] = new ModelRendererTurbo(this, 200, 450, textureX, textureY); // Import Box10
		valkyrie[4][1] = new ModelRendererTurbo(this, 200, 480, textureX, textureY); // Import Box11
		valkyrie[4][2] = new ModelRendererTurbo(this, 200, 560, textureX, textureY); // Import Box13
		valkyrie[4][3] = new ModelRendererTurbo(this, 200, 584, textureX, textureY); // Import Box14

		valkyrie[4][0].addShapeBox(0F, 0F, 0F, 36, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box10
		valkyrie[4][0].setRotationPoint(0F, 9F, -7.5F);

		valkyrie[4][1].addBox(0F, 0F, 0F, 36, 18, 15, 0F); // Import Box11
		valkyrie[4][1].setRotationPoint(0F, -9F, -7.5F);

		valkyrie[4][2].addShapeBox(0F, 0F, 0F, 10, 18, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import Box13
		valkyrie[4][2].setRotationPoint(36F, -9F, -7.5F);

		valkyrie[4][3].addShapeBox(0F, 0F, 0F, 10, 2, 15, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, -2F); // Import Box14
		valkyrie[4][3].setRotationPoint(36F, 9F, -7.5F);

		valkyrie[5] = new ModelRendererTurbo[32];
		valkyrie[5][0] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Import Box42
		valkyrie[5][1] = new ModelRendererTurbo(this, 400, 50, textureX, textureY); // Import Box43
		valkyrie[5][2] = new ModelRendererTurbo(this, 400, 100, textureX, textureY); // Import Box44
		valkyrie[5][3] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Import Box45
		valkyrie[5][4] = new ModelRendererTurbo(this, 400, 200, textureX, textureY); // Import Box46
		valkyrie[5][5] = new ModelRendererTurbo(this, 400, 250, textureX, textureY); // Import Box47
		valkyrie[5][6] = new ModelRendererTurbo(this, 400, 300, textureX, textureY); // Import Box48
		valkyrie[5][7] = new ModelRendererTurbo(this, 400, 350, textureX, textureY); // Import Box49
		valkyrie[5][8] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import Box50
		valkyrie[5][9] = new ModelRendererTurbo(this, 400, 50, textureX, textureY); // Import Box52
		valkyrie[5][10] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Import Box53
		valkyrie[5][11] = new ModelRendererTurbo(this, 400, 250, textureX, textureY); // Import Box54
		valkyrie[5][12] = new ModelRendererTurbo(this, 400, 350, textureX, textureY); // Import Box55
		valkyrie[5][13] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import Box56
		valkyrie[5][14] = new ModelRendererTurbo(this, 400, 450, textureX, textureY); // Import Box57
		valkyrie[5][15] = new ModelRendererTurbo(this, 400, 470, textureX, textureY); // Import Box58
		valkyrie[5][16] = new ModelRendererTurbo(this, 400, 470, textureX, textureY); // Import Box59
		valkyrie[5][17] = new ModelRendererTurbo(this, 400, 450, textureX, textureY); // Import Box60
		valkyrie[5][18] = new ModelRendererTurbo(this, 400, 500, textureX, textureY); // Import Box61
		valkyrie[5][19] = new ModelRendererTurbo(this, 400, 500, textureX, textureY); // Import Box62
		valkyrie[5][20] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Import Box63
		valkyrie[5][21] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Import Box64
		valkyrie[5][22] = new ModelRendererTurbo(this, 400, 515, textureX, textureY); // Import Box65
		valkyrie[5][23] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Import Box66
		valkyrie[5][24] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Import Box67
		valkyrie[5][25] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Import Box68
		valkyrie[5][26] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Import Box69
		valkyrie[5][27] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Import Box70
		valkyrie[5][28] = new ModelRendererTurbo(this, 400, 550, textureX, textureY); // Import Box71
		valkyrie[5][29] = new ModelRendererTurbo(this, 600, 400, textureX, textureY); // Box 33
		valkyrie[5][30] = new ModelRendererTurbo(this, 600, 450, textureX, textureY); // Box 35
		valkyrie[5][31] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Box 36

		valkyrie[5][0].addShapeBox(0F, 0F, 0F, 15, 19, 16, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Import Box42
		valkyrie[5][0].setRotationPoint(-15F, -14F, -8F);

		valkyrie[5][1].addShapeBox(0F, 0F, 0F, 15, 19, 3, 0F, -4F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -2F, -12F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Import Box43
		valkyrie[5][1].setRotationPoint(-15F, -14F, -11F);

		valkyrie[5][2].addShapeBox(0F, 0F, 0F, 17, 24, 16, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box44
		valkyrie[5][2].setRotationPoint(0F, -16F, -8F);

		valkyrie[5][3].addShapeBox(0F, 0F, 0F, 17, 24, 3, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box45
		valkyrie[5][3].setRotationPoint(0F, -16F, -11F);

		valkyrie[5][4].addShapeBox(0F, 0F, 0F, 15, 25, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box46
		valkyrie[5][4].setRotationPoint(17F, -16F, -8F);

		valkyrie[5][5].addShapeBox(0F, 0F, 0F, 15, 25, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box47
		valkyrie[5][5].setRotationPoint(17F, -16F, -11F);

		valkyrie[5][6].addBox(0F, 0F, 0F, 36, 25, 16, 0F); // Import Box48
		valkyrie[5][6].setRotationPoint(32F, -16F, -8F);

		valkyrie[5][7].addShapeBox(0F, 0F, 0F, 36, 25, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box49
		valkyrie[5][7].setRotationPoint(32F, -16F, -11F);

		valkyrie[5][8].addShapeBox(0F, 0F, 0F, 18, 25, 3, 0F, 0F, -2F, 0F, -2F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Import Box50
		valkyrie[5][8].setRotationPoint(68F, -16F, -11F);

		valkyrie[5][9].addShapeBox(0F, 0F, 0F, 15, 19, 3, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -4F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -12F, 0F); // Import Box52
		valkyrie[5][9].setRotationPoint(-15F, -14F, 8F);

		valkyrie[5][10].addShapeBox(0F, 0F, 0F, 17, 24, 3, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F); // Import Box53
		valkyrie[5][10].setRotationPoint(0F, -16F, 8F);

		valkyrie[5][11].addShapeBox(0F, 0F, 0F, 15, 25, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F); // Import Box54
		valkyrie[5][11].setRotationPoint(17F, -16F, 8F);

		valkyrie[5][12].addShapeBox(0F, 0F, 0F, 36, 25, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Import Box55
		valkyrie[5][12].setRotationPoint(32F, -16F, 8F);

		valkyrie[5][13].addShapeBox(0F, 0F, 0F, 18, 25, 3, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -7F, 0F, 0F, -2F, 0F); // Import Box56
		valkyrie[5][13].setRotationPoint(68F, -16F, 8F);

		valkyrie[5][14].addShapeBox(0F, 0F, 0F, 35, 2, 12, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box57
		valkyrie[5][14].setRotationPoint(68F, -15F, -6F);

		valkyrie[5][15].addShapeBox(0F, 0F, 0F, 35, 11, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, -2F, 0F, 0F, -2F); // Import Box58
		valkyrie[5][15].setRotationPoint(68F, -13F, -6F);

		valkyrie[5][16].addShapeBox(0F, 0F, 0F, 35, 11, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -7F, 0F, -2F, -7F, 0F, 2F, 0F, 0F, 2F); // Import Box59
		valkyrie[5][16].setRotationPoint(68F, -13F, 4F);

		valkyrie[5][17].addShapeBox(0F, 0F, 0F, 35, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box60
		valkyrie[5][17].setRotationPoint(68F, 6F, -6F);

		valkyrie[5][18].addShapeBox(0F, 0F, 0F, 35, 8, 2, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Import Box61
		valkyrie[5][18].setRotationPoint(68F, -2F, -8F);

		valkyrie[5][19].addShapeBox(0F, 0F, 0F, 35, 8, 2, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box62
		valkyrie[5][19].setRotationPoint(68F, -2F, 6F);

		valkyrie[5][20].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Import Box63
		valkyrie[5][20].setRotationPoint(68F, -13F, -3.5F);

		valkyrie[5][21].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Import Box64
		valkyrie[5][21].setRotationPoint(68F, -13F, -1.5F);

		valkyrie[5][22].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Import Box65
		valkyrie[5][22].setRotationPoint(68F, -13F, 0.5F);

		valkyrie[5][23].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Import Box66
		valkyrie[5][23].setRotationPoint(68F, -13F, 2.5F);

		valkyrie[5][24].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box67
		valkyrie[5][24].setRotationPoint(68F, 5F, -3.5F);

		valkyrie[5][25].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box68
		valkyrie[5][25].setRotationPoint(68F, 5F, -1.5F);

		valkyrie[5][26].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box69
		valkyrie[5][26].setRotationPoint(68F, 5F, 0.5F);

		valkyrie[5][27].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box70
		valkyrie[5][27].setRotationPoint(68F, 5F, 2.5F);

		valkyrie[5][28].addShapeBox(0F, 0F, -0.5F, 41, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -7F, -5F, 0F, -7F, -5F, 0F, -14F, 0F, 0F); // Import Box71
		valkyrie[5][28].setRotationPoint(25F, 7F, -10F);
		valkyrie[5][28].rotateAngleX = -0.78539816F;

		valkyrie[5][29].addBox(0F, 0F, 0F, 84, 10, 1, 0F); // Box 33
		valkyrie[5][29].setRotationPoint(0F, -9F, -11.1F);

		valkyrie[5][30].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 35
		valkyrie[5][30].setRotationPoint(-12F, -9F, -11.1F);

		valkyrie[5][31].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F); // Box 36
		valkyrie[5][31].setRotationPoint(-13F, -7F, -11.1F);

		

		valkyrie[6] = new ModelRendererTurbo[6];
		valkyrie[6][0] = new ModelRendererTurbo(this, 200, 250, textureX, textureY); // Import Box4
		valkyrie[6][1] = new ModelRendererTurbo(this, 200, 350, textureX, textureY); // Import Box5
		valkyrie[6][2] = new ModelRendererTurbo(this, 200, 370, textureX, textureY); // Import Box6
		valkyrie[6][3] = new ModelRendererTurbo(this, 200, 380, textureX, textureY); // Import Box7
		valkyrie[6][4] = new ModelRendererTurbo(this, 200, 390, textureX, textureY); // Import Box8
		valkyrie[6][5] = new ModelRendererTurbo(this, 200, 420, textureX, textureY); // Import Box9

		valkyrie[6][0].addShapeBox(0F, 0F, 0F, 40, 15, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -28F, 0F, 0F); // Import Box4
		valkyrie[6][0].setRotationPoint(0F, 0F, 5.5F);

		valkyrie[6][1].addShapeBox(0F, 0F, 0F, 40, 15, 2, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -28F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F); // Import Box5
		valkyrie[6][1].setRotationPoint(0F, 0F, -7.5F);

		valkyrie[6][2].addShapeBox(0F, 0F, 0F, 12, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Import Box6
		valkyrie[6][2].setRotationPoint(28F, 15F, -7.5F);

		valkyrie[6][3].addShapeBox(0F, 0F, 0F, 12, 3, 2, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		valkyrie[6][3].setRotationPoint(28F, 15F, 5.5F);

		valkyrie[6][4].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F); // Import Box8
		valkyrie[6][4].setRotationPoint(26F, 18F, -7.5F);

		valkyrie[6][5].addShapeBox(0F, 0F, 0F, 12, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box9
		valkyrie[6][5].setRotationPoint(28F, 18F, -7.5F);

		
		valkyrie[7] = new ModelRendererTurbo[4];
		valkyrie[7][0] = new ModelRendererTurbo(this, 200, 450, textureX, textureY); // Import Box10
		valkyrie[7][1] = new ModelRendererTurbo(this, 200, 480, textureX, textureY); // Import Box11
		valkyrie[7][2] = new ModelRendererTurbo(this, 200, 560, textureX, textureY); // Import Box13
		valkyrie[7][3] = new ModelRendererTurbo(this, 200, 584, textureX, textureY); // Import Box14

		valkyrie[7][0].addShapeBox(0F, 0F, 0F, 36, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box10
		valkyrie[7][0].setRotationPoint(0F, 9F, -7.5F);

		valkyrie[7][1].addBox(0F, 0F, 0F, 36, 18, 15, 0F); // Import Box11
		valkyrie[7][1].setRotationPoint(0F, -9F, -7.5F);

		valkyrie[7][2].addShapeBox(0F, 0F, 0F, 10, 18, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import Box13
		valkyrie[7][2].setRotationPoint(36F, -9F, -7.5F);

		valkyrie[7][3].addShapeBox(0F, 0F, 0F, 10, 2, 15, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, -2F); // Import Box14
		valkyrie[7][3].setRotationPoint(36F, 9F, -7.5F);

	
		valkyrie[8] = new ModelRendererTurbo[32];
		valkyrie[8][0] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Import Box72
		valkyrie[8][1] = new ModelRendererTurbo(this, 400, 50, textureX, textureY); // Import Box73
		valkyrie[8][2] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Import Box74
		valkyrie[8][3] = new ModelRendererTurbo(this, 400, 250, textureX, textureY); // Import Box75
		valkyrie[8][4] = new ModelRendererTurbo(this, 400, 350, textureX, textureY); // Import Box76
		valkyrie[8][5] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import Box77
		valkyrie[8][6] = new ModelRendererTurbo(this, 400, 100, textureX, textureY); // Import Box78
		valkyrie[8][7] = new ModelRendererTurbo(this, 400, 200, textureX, textureY); // Import Box79
		valkyrie[8][8] = new ModelRendererTurbo(this, 400, 300, textureX, textureY); // Import Box80
		valkyrie[8][9] = new ModelRendererTurbo(this, 400, 50, textureX, textureY); // Import Box81
		valkyrie[8][10] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Import Box82
		valkyrie[8][11] = new ModelRendererTurbo(this, 400, 250, textureX, textureY); // Import Box83
		valkyrie[8][12] = new ModelRendererTurbo(this, 400, 350, textureX, textureY); // Import Box84
		valkyrie[8][13] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import Box85
		valkyrie[8][14] = new ModelRendererTurbo(this, 400, 450, textureX, textureY); // Import Box86
		valkyrie[8][15] = new ModelRendererTurbo(this, 400, 450, textureX, textureY); // Import Box87
		valkyrie[8][16] = new ModelRendererTurbo(this, 400, 470, textureX, textureY); // Import Box88
		valkyrie[8][17] = new ModelRendererTurbo(this, 400, 470, textureX, textureY); // Import Box89
		valkyrie[8][18] = new ModelRendererTurbo(this, 400, 500, textureX, textureY); // Import Box90
		valkyrie[8][19] = new ModelRendererTurbo(this, 400, 500, textureX, textureY); // Import Box91
		valkyrie[8][20] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Import Box92
		valkyrie[8][21] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Import Box93
		valkyrie[8][22] = new ModelRendererTurbo(this, 400, 515, textureX, textureY); // Import Box94
		valkyrie[8][23] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Import Box95
		valkyrie[8][24] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Import Box96
		valkyrie[8][25] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Import Box97
		valkyrie[8][26] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Import Box98
		valkyrie[8][27] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Import Box99
		valkyrie[8][28] = new ModelRendererTurbo(this, 400, 550, textureX, textureY); // Import Box100
		valkyrie[8][29] = new ModelRendererTurbo(this, 600, 400, textureX, textureY); // Box 40
		valkyrie[8][30] = new ModelRendererTurbo(this, 600, 450, textureX, textureY); // Box 41
		valkyrie[8][31] = new ModelRendererTurbo(this, 600, 500, textureX, textureY); // Box 42

		valkyrie[8][0].addShapeBox(0F, 0F, 0F, 15, 19, 16, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Import Box72
		valkyrie[8][0].setRotationPoint(-15F, -14F, -8F);

		valkyrie[8][1].addShapeBox(0F, 0F, 0F, 15, 19, 3, 0F, -4F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -2F, -12F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -12F, 0F); // Import Box73
		valkyrie[8][1].setRotationPoint(-15F, -14F, -11F);

		valkyrie[8][2].addShapeBox(0F, 0F, 0F, 17, 24, 3, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box74
		valkyrie[8][2].setRotationPoint(0F, -16F, -11F);

		valkyrie[8][3].addShapeBox(0F, 0F, 0F, 15, 25, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box75
		valkyrie[8][3].setRotationPoint(17F, -16F, -11F);

		valkyrie[8][4].addShapeBox(0F, 0F, 0F, 36, 25, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box76
		valkyrie[8][4].setRotationPoint(32F, -16F, -11F);

		valkyrie[8][5].addShapeBox(0F, 0F, 0F, 18, 25, 3, 0F, 0F, -2F, 0F, -2F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Import Box77
		valkyrie[8][5].setRotationPoint(68F, -16F, -11F);

		valkyrie[8][6].addShapeBox(0F, 0F, 0F, 17, 24, 16, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box78
		valkyrie[8][6].setRotationPoint(0F, -16F, -8F);

		valkyrie[8][7].addShapeBox(0F, 0F, 0F, 15, 25, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box79
		valkyrie[8][7].setRotationPoint(17F, -16F, -8F);

		valkyrie[8][8].addBox(0F, 0F, 0F, 36, 25, 16, 0F); // Import Box80
		valkyrie[8][8].setRotationPoint(32F, -16F, -8F);

		valkyrie[8][9].addShapeBox(0F, 0F, 0F, 15, 19, 3, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -4F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -12F, 0F); // Import Box81
		valkyrie[8][9].setRotationPoint(-15F, -14F, 8F);

		valkyrie[8][10].addShapeBox(0F, 0F, 0F, 17, 24, 3, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F); // Import Box82
		valkyrie[8][10].setRotationPoint(0F, -16F, 8F);

		valkyrie[8][11].addShapeBox(0F, 0F, 0F, 15, 25, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F); // Import Box83
		valkyrie[8][11].setRotationPoint(17F, -16F, 8F);

		valkyrie[8][12].addShapeBox(0F, 0F, 0F, 36, 25, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Import Box84
		valkyrie[8][12].setRotationPoint(32F, -16F, 8F);

		valkyrie[8][13].addShapeBox(0F, 0F, 0F, 18, 25, 3, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -7F, 0F, 0F, -2F, 0F); // Import Box85
		valkyrie[8][13].setRotationPoint(68F, -16F, 8F);

		valkyrie[8][14].addShapeBox(0F, 0F, 0F, 35, 2, 12, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box86
		valkyrie[8][14].setRotationPoint(68F, -15F, -6F);

		valkyrie[8][15].addShapeBox(0F, 0F, 0F, 35, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box87
		valkyrie[8][15].setRotationPoint(68F, 6F, -6F);

		valkyrie[8][16].addShapeBox(0F, 0F, 0F, 35, 11, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, -2F, 0F, 0F, -2F); // Import Box88
		valkyrie[8][16].setRotationPoint(68F, -13F, -6F);

		valkyrie[8][17].addShapeBox(0F, 0F, 0F, 35, 11, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -7F, 0F, -2F, -7F, 0F, 2F, 0F, 0F, 2F); // Import Box89
		valkyrie[8][17].setRotationPoint(68F, -13F, 4F);

		valkyrie[8][18].addShapeBox(0F, 0F, 0F, 35, 8, 2, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Import Box90
		valkyrie[8][18].setRotationPoint(68F, -2F, -8F);

		valkyrie[8][19].addShapeBox(0F, 0F, 0F, 35, 8, 2, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box91
		valkyrie[8][19].setRotationPoint(68F, -2F, 6F);

		valkyrie[8][20].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Import Box92
		valkyrie[8][20].setRotationPoint(68F, -13F, 2.5F);

		valkyrie[8][21].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Import Box93
		valkyrie[8][21].setRotationPoint(68F, -13F, 0.5F);

		valkyrie[8][22].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Import Box94
		valkyrie[8][22].setRotationPoint(68F, -13F, -1.5F);

		valkyrie[8][23].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Import Box95
		valkyrie[8][23].setRotationPoint(68F, -13F, -3.5F);

		valkyrie[8][24].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box96
		valkyrie[8][24].setRotationPoint(68F, 5F, 2.5F);

		valkyrie[8][25].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box97
		valkyrie[8][25].setRotationPoint(68F, 5F, 0.5F);

		valkyrie[8][26].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box98
		valkyrie[8][26].setRotationPoint(68F, 5F, -1.5F);

		valkyrie[8][27].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box99
		valkyrie[8][27].setRotationPoint(68F, 5F, -3.5F);

		valkyrie[8][28].addShapeBox(0F, 0F, -0.5F, 41, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -7F, -5F, 0F, -7F, -5F, 0F, -14F, 0F, 0F); // Import Box100
		valkyrie[8][28].setRotationPoint(25F, 7F, 10F);
		valkyrie[8][28].rotateAngleX = 0.78539816F;

		valkyrie[8][29].addBox(0F, 0F, 0F, 84, 10, 1, 0F); // Box 40
		valkyrie[8][29].setRotationPoint(0F, -9F, 10.1F);

		valkyrie[8][30].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 41
		valkyrie[8][30].setRotationPoint(-12F, -9F, 10.1F);

		valkyrie[8][31].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F); // Box 42
		valkyrie[8][31].setRotationPoint(-13F, -7F, 10.1F);



		valkyrie[9] = new ModelRendererTurbo[8];
		valkyrie[9][0] = new ModelRendererTurbo(this, 0, 817, textureX, textureY); // Import Box32
		valkyrie[9][1] = new ModelRendererTurbo(this, 0, 839, textureX, textureY); // Import Box33
		valkyrie[9][2] = new ModelRendererTurbo(this, 0, 881, textureX, textureY); // Import Box34
		valkyrie[9][3] = new ModelRendererTurbo(this, 0, 817, textureX, textureY); // Import Box9
		valkyrie[9][4] = new ModelRendererTurbo(this, 0, 839, textureX, textureY); // Import Box11--
		valkyrie[9][5] = new ModelRendererTurbo(this, 200, 650, textureX, textureY); // Import Box103
		valkyrie[9][6] = new ModelRendererTurbo(this, 200, 750, textureX, textureY); // Import Box10
		valkyrie[9][7] = new ModelRendererTurbo(this, 0, 881, textureX, textureY); // Import Box29

		valkyrie[9][0].addShapeBox(0F, 0F, 0F, 31, 7, 11, 0F, 0F, -3F, 0F, -4F, -3F, -8F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -8F, 0F, 1F, 0F, 0F, 1F, 0F); // Import Box32
		valkyrie[9][0].setRotationPoint(0F, -7F, -46.5F);

		valkyrie[9][1].addShapeBox(0F, 0F, 0F, 40, 12, 25, 0F, 0F, -4F, 0F, -9F, -7F, 0F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Import Box33
		valkyrie[9][1].setRotationPoint(0F, -11F, -35.5F);

		valkyrie[9][2].addShapeBox(0F, 0F, 0F, 40, 11, 29, 0F, 0F, 0F, -4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Import Box34
		valkyrie[9][2].setRotationPoint(0F, -11F, -14.5F);

		valkyrie[9][3].addShapeBox(0F, 0F, 0F, 31, 7, 11, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -3F, -8F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -4F, 0F, -8F, 0F, 0F, 0F); // Import Box9
		valkyrie[9][3].setRotationPoint(0F, -7F, 35.5F);

		valkyrie[9][4].addShapeBox(0F, 0F, 0F, 40, 12, 25, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -9F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -9F, 0F, 0F, 0F, 0F, 0F); // Import Box11--
		valkyrie[9][4].setRotationPoint(0F, -11F, 10.5F);

		valkyrie[9][5].addShapeBox(0F, 0F, 0F, 9, 11, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box103
		valkyrie[9][5].setRotationPoint(41F, 0F, -10.5F);

		valkyrie[9][6].addShapeBox(0F, 0F, 0F, 8, 6, 29, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F); // Import Box10
		valkyrie[9][6].setRotationPoint(40F, -6F, -14.5F);

		valkyrie[9][7].addShapeBox(0F, 0F, 0F, 8, 2, 29, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box29
		valkyrie[9][7].setRotationPoint(40F, -8F, -14.5F);
		

		valkyrie[10] = new ModelRendererTurbo[7];
		valkyrie[10][0] = new ModelRendererTurbo(this, 198, 810, textureX, textureY); // Import Box11
		valkyrie[10][1] = new ModelRendererTurbo(this, 200, 830, textureX, textureY); // Import Box18
		valkyrie[10][2] = new ModelRendererTurbo(this, 200, 830, textureX, textureY); // Import Box19
		valkyrie[10][3] = new ModelRendererTurbo(this, 200, 860, textureX, textureY); // Import Box20
		valkyrie[10][4] = new ModelRendererTurbo(this, 200, 900, textureX, textureY); // Import Box21
		valkyrie[10][5] = new ModelRendererTurbo(this, 200, 940, textureX, textureY); // Import Box22
		valkyrie[10][6] = new ModelRendererTurbo(this, 200, 940, textureX, textureY); // Import Box23

		valkyrie[10][0].addBox(0F, -1F, 0F, 52, 2, 31, 0F); // Import Box11
		valkyrie[10][0].setRotationPoint(0F, 1F, -15.5F);

		valkyrie[10][1].addShapeBox(0F, -1F, 0F, 4, 1, 3, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		valkyrie[10][1].setRotationPoint(4F, 0F, -8.5F);

		valkyrie[10][2].addShapeBox(0F, -1F, 0F, 4, 1, 3, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box19
		valkyrie[10][2].setRotationPoint(4F, 0F, 5.5F);

		valkyrie[10][3].addShapeBox(0F, -1F, 0F, 52, 4, 31, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box20
		valkyrie[10][3].setRotationPoint(0F, 3F, -15.5F);

		valkyrie[10][4].addShapeBox(0F, -1F, 0F, 22, 2, 31, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Import Box21
		valkyrie[10][4].setRotationPoint(52F, 1F, -15.5F);

		valkyrie[10][5].addBox(0F, -1F, 0F, 6, 1, 2, 0F); // Import Box22
		valkyrie[10][5].setRotationPoint(71F, 0.5F, -9.5F);

		valkyrie[10][6].addBox(0F, -1F, 0F, 6, 1, 2, 0F); // Import Box23
		valkyrie[10][6].setRotationPoint(71F, 0.5F, 7.5F);

		
		valkyrie[11] = new ModelRendererTurbo[4];
		valkyrie[11][0] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box25
		valkyrie[11][1] = new ModelRendererTurbo(this, 48, 970, textureX, textureY); // Import Box26
		valkyrie[11][2] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Import Box27
		valkyrie[11][3] = new ModelRendererTurbo(this, 0, 930, textureX, textureY); // Import Box37

		valkyrie[11][0].addShapeBox(47F, -11F, -1F, 14, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F); // Import Box25
		valkyrie[11][0].setRotationPoint(0F, 0F, 0F);
		valkyrie[11][0].rotateAngleX = 0.34906585F;

		valkyrie[11][1].addShapeBox(47F, -36F, -1F, 14, 25, 2, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box26
		valkyrie[11][1].setRotationPoint(0F, 0F, 0F);
		valkyrie[11][1].rotateAngleX = 0.34906585F;

		valkyrie[11][2].addShapeBox(47F, -36F, -1F, 12, 25, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, 0F, 0F, 0F); // Import Box27
		valkyrie[11][2].setRotationPoint(14F, 0F, 0F);
		valkyrie[11][2].rotateAngleX = 0.34906585F;

		valkyrie[11][3].addShapeBox(0F, -30F, -1F, 47, 30, 2, 0F, 0F, -29F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -29F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box37
		valkyrie[11][3].setRotationPoint(0F, 0F, 0F);
		valkyrie[11][3].rotateAngleX = 0.34906585F;


		valkyrie[12] = new ModelRendererTurbo[4];
		valkyrie[12][0] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Box25
		valkyrie[12][1] = new ModelRendererTurbo(this, 48, 970, textureX, textureY); // Import Box26
		valkyrie[12][2] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Import Box27
		valkyrie[12][3] = new ModelRendererTurbo(this, 0, 930, textureX, textureY); // Import Box37

		valkyrie[12][0].addShapeBox(47F, -11F, -1F, 14, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F); // Import Box25
		valkyrie[12][0].setRotationPoint(0F, 0F, 0F);
		valkyrie[12][0].rotateAngleX = -0.34906585F;

		valkyrie[12][1].addShapeBox(47F, -36F, -1F, 14, 25, 2, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box26
		valkyrie[12][1].setRotationPoint(0F, 0F, 0F);
		valkyrie[12][1].rotateAngleX = -0.34906585F;

		valkyrie[12][2].addShapeBox(47F, -36F, -1F, 12, 25, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, 0F, 0F, 0F); // Import Box27
		valkyrie[12][2].setRotationPoint(14F, 0F, 0F);
		valkyrie[12][2].rotateAngleX = -0.34906585F;

		valkyrie[12][3].addShapeBox(0F, -30F, -1F, 47, 30, 2, 0F, 0F, -29F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -29F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box37
		valkyrie[12][3].setRotationPoint(0F, 0F, 0F);
		valkyrie[12][3].rotateAngleX = -0.34906585F;
		

		valkyrie[13] = new ModelRendererTurbo[10];
		valkyrie[13][0] = new ModelRendererTurbo(this, 400, 500, textureX, textureY); // Import Box104
		valkyrie[13][1] = new ModelRendererTurbo(this, 250, 620, textureX, textureY); // Import Box105
		valkyrie[13][2] = new ModelRendererTurbo(this, 350, 519, textureX, textureY); // Import Box106
		valkyrie[13][3] = new ModelRendererTurbo(this, 400, 620, textureX, textureY); // Import Box107
		valkyrie[13][4] = new ModelRendererTurbo(this, 250, 500, textureX, textureY); // Import Box108
		valkyrie[13][5] = new ModelRendererTurbo(this, 400, 640, textureX, textureY); // Import Box109
		valkyrie[13][6] = new ModelRendererTurbo(this, 400, 610, textureX, textureY); // Import Box111
		valkyrie[13][7] = new ModelRendererTurbo(this, 400, 580, textureX, textureY); // Import Box112
		valkyrie[13][8] = new ModelRendererTurbo(this, 420, 570, textureX, textureY); // Import Box113
		valkyrie[13][9] = new ModelRendererTurbo(this, 400, 760, textureX, textureY); // Import Box110

		valkyrie[13][0].addShapeBox(0F, 0F, -103F, 19, 2, 103, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box104
		valkyrie[13][0].setRotationPoint(0F, 0F, 0F);
		valkyrie[13][0].rotateAngleY = 0.66322512F;

		valkyrie[13][1].addShapeBox(-6F, 0F, -103F, 6, 2, 99, 0F, -9F, -0.5F, 0F, 6F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, -9F, -0.5F, 0F, 6F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F); // Import Box105
		valkyrie[13][1].setRotationPoint(0F, 0F, 0F);
		valkyrie[13][1].rotateAngleY = 0.66322512F;

		valkyrie[13][2].addBox(19F, 0F, -32F, 6, 2, 24, 0F); // Import Box106
		valkyrie[13][2].setRotationPoint(0F, 0F, 0F);
		valkyrie[13][2].rotateAngleY = 0.66322512F;

		valkyrie[13][3].addShapeBox(25F, 0F, -32F, 6, 2, 9, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Import Box107
		valkyrie[13][3].setRotationPoint(0F, 0F, 0F);
		valkyrie[13][3].rotateAngleY = 0.66322512F;

		valkyrie[13][4].addBox(19F, 0F, -103F, 4, 2, 71, 0F); // Import Box108
		valkyrie[13][4].setRotationPoint(0F, 0F, 0F);
		valkyrie[13][4].rotateAngleY = 0.66322512F;

		valkyrie[13][5].addShapeBox(23F, 0F, -103F, 7, 2, 33, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box109
		valkyrie[13][5].setRotationPoint(0F, 0F, 0F);
		valkyrie[13][5].rotateAngleY = 0.66322512F;

		valkyrie[13][6].addShapeBox(3F, 0F, -105F, 3, 2, 2, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import Box111
		valkyrie[13][6].setRotationPoint(0F, 0F, 0F);
		valkyrie[13][6].rotateAngleY = 0.66322512F;

		valkyrie[13][7].addShapeBox(6F, 0F, -105F, 18, 2, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box112
		valkyrie[13][7].setRotationPoint(0F, 0F, 0F);
		valkyrie[13][7].rotateAngleY = 0.66322512F;

		valkyrie[13][8].addShapeBox(24F, 0F, -105F, 5, 2, 2, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box113
		valkyrie[13][8].setRotationPoint(0F, 0F, 0F);
		valkyrie[13][8].rotateAngleY = 0.66322512F;

		valkyrie[13][9].addShapeBox(0F, 0F, -52F, 8, 2, 38, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box110
		valkyrie[13][9].setRotationPoint(29F, 0F, 0F);
		valkyrie[13][9].rotateAngleY = 0.66322512F;
		
		valkyrie[14] = new ModelRendererTurbo[10];
		valkyrie[14][0] = new ModelRendererTurbo(this, 400, 610, textureX, textureY); // Import Box0
		valkyrie[14][1] = new ModelRendererTurbo(this, 400, 720, textureX, textureY); // Import Box1
		valkyrie[14][2] = new ModelRendererTurbo(this, 350, 520, textureX, textureY); // Import Box2
		valkyrie[14][3] = new ModelRendererTurbo(this, 400, 620, textureX, textureY); // Import Box3
		valkyrie[14][4] = new ModelRendererTurbo(this, 250, 500, textureX, textureY); // Import Box4
		valkyrie[14][5] = new ModelRendererTurbo(this, 400, 640, textureX, textureY); // Import Box5
		valkyrie[14][6] = new ModelRendererTurbo(this, 400, 610, textureX, textureY); // Import Box6
		valkyrie[14][7] = new ModelRendererTurbo(this, 400, 580, textureX, textureY); // Import Box7
		valkyrie[14][8] = new ModelRendererTurbo(this, 420, 570, textureX, textureY); // Import Box8
		valkyrie[14][9] = new ModelRendererTurbo(this, 400, 760, textureX, textureY); // Import Box9

		valkyrie[14][0].addShapeBox(0F, 0F, 0F, 19, 2, 103, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Import Box0
		valkyrie[14][0].setRotationPoint(0F, 0F, 0F);
		valkyrie[14][0].rotateAngleY = -0.66322512F;

		valkyrie[14][1].addShapeBox(-6F, 0F, 4F, 6, 2, 99, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 6F, 0F, 0F, -9F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 6F, 0F, 0F, -9F, -0.5F, 0F); // Import Box1
		valkyrie[14][1].setRotationPoint(0F, 0F, 0F);
		valkyrie[14][1].rotateAngleY = -0.66322512F;

		valkyrie[14][2].addBox(19F, 0F, 8F, 6, 2, 24, 0F); // Import Box2
		valkyrie[14][2].setRotationPoint(0F, 0F, 0F);
		valkyrie[14][2].rotateAngleY = -0.66322512F;

		valkyrie[14][3].addShapeBox(25F, 0F, 23F, 6, 2, 9, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box3
		valkyrie[14][3].setRotationPoint(0F, 0F, 0F);
		valkyrie[14][3].rotateAngleY = -0.66322512F;

		valkyrie[14][4].addBox(19F, 0F, 32F, 4, 2, 71, 0F); // Import Box4
		valkyrie[14][4].setRotationPoint(0F, 0F, 0F);
		valkyrie[14][4].rotateAngleY = -0.66322512F;

		valkyrie[14][5].addShapeBox(23F, 0F, 70F, 7, 2, 33, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box5
		valkyrie[14][5].setRotationPoint(0F, 0F, 0F);
		valkyrie[14][5].rotateAngleY = -0.66322512F;

		valkyrie[14][6].addShapeBox(3F, 0F, 103F, 3, 2, 2, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Import Box6
		valkyrie[14][6].setRotationPoint(0F, 0F, 0F);
		valkyrie[14][6].rotateAngleY = -0.66322512F;

		valkyrie[14][7].addShapeBox(6F, 0F, 103F, 18, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box7
		valkyrie[14][7].setRotationPoint(0F, 0F, 0F);
		valkyrie[14][7].rotateAngleY = -0.66322512F;

		valkyrie[14][8].addShapeBox(24F, 0F, 103F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F); // Import Box8
		valkyrie[14][8].setRotationPoint(0F, 0F, 0F);
		valkyrie[14][8].rotateAngleY = -0.66322512F;

		valkyrie[14][9].addShapeBox(0F, 0F, 14F, 8, 2, 38, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box9
		valkyrie[14][9].setRotationPoint(29F, 0F, 0F);
		valkyrie[14][9].rotateAngleY = -0.66322512F;
		
		translateAll(0F, 0F, 0F);


		flipAll();
	}
}