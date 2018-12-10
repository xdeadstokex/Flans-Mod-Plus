package com.flansmod.client.model;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;

public class ModelFlash extends ModelBase
{
    public ModelRendererTurbo[] flashModel = new ModelRendererTurbo[0];


    public void renderFlash(float f)
    {
        for(ModelRendererTurbo model : flashModel)
            if(model != null)
                model.render(f);
    }

    protected void flipAll()
    {
        for (ModelRendererTurbo casing : flashModel)
        {
            casing.doMirror(false, true, true);
            casing.setRotationPoint(casing.rotationPointX, -casing.rotationPointY, -casing.rotationPointZ);
        }
    }
}
