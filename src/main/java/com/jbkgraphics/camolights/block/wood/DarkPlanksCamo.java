package com.jbkgraphics.camolights.block.wood;

import com.jbkgraphics.camolights.block.BlockCamoLights;
import com.jbkgraphics.camolights.creativetab.CreativeTabCL;
import net.minecraft.block.material.Material;

public class DarkPlanksCamo extends BlockCamoLights {
    public DarkPlanksCamo(){
        super(Material.wood);
        this.setBlockName("darkPlanksCamo");
        this.setLightLevel(1.0F);
        this.setHardness(2.0F);
        this.setStepSound(soundTypeWood);
        this.setCreativeTab(CreativeTabCL.CL_TAB);
    }
}
