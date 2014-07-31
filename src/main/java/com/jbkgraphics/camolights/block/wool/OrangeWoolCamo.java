package com.jbkgraphics.camolights.block.wool;

import com.jbkgraphics.camolights.CamoLights;
import com.jbkgraphics.camolights.block.BlockCamoLights;
import com.jbkgraphics.camolights.creativetab.CreativeTabCL;
import net.minecraft.block.material.Material;

public class OrangeWoolCamo extends BlockCamoLights {
    public OrangeWoolCamo(){
        super(Material.cloth);
        this.setBlockName("orangeWoolCamo");
        this.setHardness(2.0F);
        this.setLightLevel(1.0F);
        this.setStepSound(soundTypeCloth);
        this.setCreativeTab(CreativeTabCL.CL_TAB);

    }
}
