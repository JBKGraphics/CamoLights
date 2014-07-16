package com.jbkgraphics.camolights.init;


import com.jbkgraphics.camolights.block.StoneBrickCamo;
import com.jbkgraphics.camolights.block.StoneCamo;
import com.jbkgraphics.camolights.block.WoodPlanksCamo;
import cpw.mods.fml.common.registry.GameRegistry;


public class ModBlocks
{
    //An instance of the block.
    public static final StoneCamo stoneCamo = new StoneCamo();
    public static final StoneBrickCamo stoneBrickCamo = new StoneBrickCamo();
    public static final WoodPlanksCamo woodPlanksCamo = new WoodPlanksCamo();




    //Registering the block.
    public static void init()
    {
        GameRegistry.registerBlock(stoneCamo, "stoneCamo");
        GameRegistry.registerBlock(stoneBrickCamo, "stoneBrickCamo");
        GameRegistry.registerBlock(woodPlanksCamo, "woodPlanksCamo");
    }
}
