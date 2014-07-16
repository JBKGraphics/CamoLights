package com.jbkgraphics.camolights.block;

import net.minecraft.block.material.Material;

public class SprucePlanksCamo extends BlockCamoLights {
    public SprucePlanksCamo(){
        super(Material.wood);
        this.setBlockName("sprucePlanksCamo");
        this.setHardness(2.0F);
        this.setStepSound(soundTypeWood);
        this.setLightLevel(1.0F);
    }
}
