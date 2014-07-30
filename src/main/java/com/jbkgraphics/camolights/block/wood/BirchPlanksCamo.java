package com.jbkgraphics.camolights.block.wood;

import com.jbkgraphics.camolights.block.BlockCamoLights;
import com.jbkgraphics.camolights.creativetab.CreativeTabCL;
import net.minecraft.block.material.Material;

public class BirchPlanksCamo extends BlockCamoLights {
    public BirchPlanksCamo(){
        super(Material.wood);
        this.setBlockName("birchPlanksCamo");
        this.setHardness(2.0F);
        this.setLightLevel(1.0F);
        this.setStepSound(soundTypeWood);
        this.setCreativeTab(CreativeTabCL.CL_TAB);
    }
}
