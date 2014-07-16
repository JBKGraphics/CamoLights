package com.jbkgraphics.camolights.block;

import net.minecraft.block.material.Material;

public class WoodPlanksCamo extends BlockCamoLights {
    public static final String[] field_150096_a = new String[] {"oak", "spruce", "birch", "jungle", "acacia", "big_oak"};


    public WoodPlanksCamo(){
        super(Material.wood);
        this.setBlockName("woodPlanksCamo");

    }
}