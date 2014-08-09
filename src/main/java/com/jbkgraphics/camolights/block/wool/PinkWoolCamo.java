package com.jbkgraphics.camolights.block.wool;

import com.jbkgraphics.camolights.block.BlockCamoLights;
import com.jbkgraphics.camolights.creativetab.CreativeTabCL;
import net.minecraft.block.material.Material;

public class PinkWoolCamo extends BlockCamoLights {
    public PinkWoolCamo() {
        super(Material.cloth);
        this.setBlockName("pinkWoolCamo");
        this.setHardness(2.0F);
        this.setLightLevel(1.0F);
        this.setStepSound(soundTypeCloth);
        this.setCreativeTab(CreativeTabCL.CL_TAB);
    }
}
