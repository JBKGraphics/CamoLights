package com.jbkgraphics.camolights.init;


import com.jbkgraphics.camolights.block.OakPlanksCamo;
import com.jbkgraphics.camolights.block.SprucePlanksCamo;
import com.jbkgraphics.camolights.block.StoneBrickCamo;
import com.jbkgraphics.camolights.block.StoneCamo;
import cpw.mods.fml.common.registry.GameRegistry;


public class ModBlocks
{
    //An instance of the block.
    //Stone Blocks
    public static final StoneCamo stoneCamo = new StoneCamo();
    public static final StoneBrickCamo stoneBrickCamo = new StoneBrickCamo();

    //Wood Blocks
    public static final OakPlanksCamo oakPlanksCamo= new OakPlanksCamo();
    public static final SprucePlanksCamo sprucePlanksCamo = new SprucePlanksCamo();




    //Registering the block.
    public static void init()
    {
        //Stone Blocks
        GameRegistry.registerBlock(stoneCamo, "stoneCamo");
        GameRegistry.registerBlock(stoneBrickCamo, "stoneBrickCamo");

        //Wood Blocks
        GameRegistry.registerBlock(oakPlanksCamo, "oakPlanksCamo");
        GameRegistry.registerBlock(sprucePlanksCamo, "sprucePlanksCamo");
    }
}
