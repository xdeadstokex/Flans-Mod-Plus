package com.flansmod.client.model;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;

public class ModelCasing extends ModelBase
{
    public ModelRendererTurbo[] casingModel = new ModelRendererTurbo[0];

    //  Used for casing ejection animation
    //  Total distance to translate
    public Vector3f casingAnimDistance = new Vector3f(0, 0, 16);
    //  Total range in variance for random motion
    public Vector3f casingAnimSpread = new Vector3f(2, 4, 4);
    //  Rotation of the casing, 180° is the total rotation. If you do not understand rotation vectors, like me, just use the standard value here.
    public Vector3f casingRotateVector = new Vector3f(0.1F, 1F, 0.1F);

    public void renderCasing(float f)
    {
        for(ModelRendererTurbo model : casingModel)
            if(model != null)
                model.render(f);
    }

    protected void flipAll()
    {
        for (ModelRendererTurbo casing : casingModel)
        {
            casing.doMirror(false, true, true);
            casing.setRotationPoint(casing.rotationPointX, -casing.rotationPointY, -casing.rotationPointZ);
        }
    }
}
