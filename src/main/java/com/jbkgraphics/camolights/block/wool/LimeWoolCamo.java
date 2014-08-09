package com.jbkgraphics.camolights.block.wool;

import com.jbkgraphics.camolights.block.BlockCamoLights;
import com.jbkgraphics.camolights.creativetab.CreativeTabCL;
import net.minecraft.block.material.Material;

public class LimeWoolCamo extends BlockCamoLights {
    public LimeWoolCamo() {
        super(Material.cloth);
        this.setBlockName("limeWoolCamo");
        this.setHardness(2.0F);
        this.setLightLevel(1.0F);
        this.setStepSound(soundTypeCloth);
        this.setCreativeTab(CreativeTabCL.CL_TAB);
    }
}
