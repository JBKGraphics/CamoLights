package com.jbkgraphics.camolights.block;

import net.minecraft.block.material.Material;

public class OakPlanksCamo extends BlockCamoLights {
    public OakPlanksCamo(){
        super(Material.wood);
        this.setBlockName("oakPlanksCamo");
        this.setHardness(2.0F);
        this.setStepSound(soundTypeWood);
        this.setLightLevel(1.0F);

    }
}