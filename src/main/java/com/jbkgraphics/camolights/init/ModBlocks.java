package com.jbkgraphics.camolights.init;

import com.jbkgraphics.camolights.block.BlockCamoLights;
import com.jbkgraphics.camolights.block.StoneCamo;
import cpw.mods.fml.common.registry.GameRegistry;


public class ModBlocks {
    public static final StoneCamo stoneCamo = new StoneCamo();

    public static void init() {
        GameRegistry.registerBlock(stoneCamo, "stoneCamo");
    }
}
