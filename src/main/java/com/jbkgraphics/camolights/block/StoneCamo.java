package com.jbkgraphics.camolights.block;

import com.jbkgraphics.camolights.block.BlockCamoLights;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

public class StoneCamo extends BlockCamoLights {
    public StoneCamo() {
        super(Material.rock);
        this.setBlockName("stoneCamo");
        this.setLightLevel(1.0F);
    }
}
