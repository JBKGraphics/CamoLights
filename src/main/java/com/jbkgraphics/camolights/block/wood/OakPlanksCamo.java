package com.jbkgraphics.camolights.block.wood;

import com.jbkgraphics.camolights.block.BlockCamoLights;
import com.jbkgraphics.camolights.creativetab.CreativeTabCL;
import net.minecraft.block.material.Material;

public class OakPlanksCamo extends BlockCamoLights {
    public OakPlanksCamo(){
        super(Material.wood);
        this.setBlockName("oakPlanksCamo");
        this.setHardness(2.0F);
        this.setStepSound(soundTypeWood);
        this.setLightLevel(1.0F);
        this.setCreativeTab(CreativeTabCL.CL_TAB);

    }
}