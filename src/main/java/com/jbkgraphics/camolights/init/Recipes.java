package com.jbkgraphics.camolights.init;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes {
    public static void init() {

        initModRecipes();
    }


    private static void initModRecipes(){


        //Stone Recipes
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.stoneCamo, 8), new Object []{"XXX", "XYX", "XXX", 'X', Blocks.glowstone, 'Y', Blocks.stone});
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.stoneBrickCamo, 8), new Object []{"XXX", "XYX", "XXX", 'X', Blocks.glowstone, 'Y', Blocks.stonebrick});

        //Wooden Planks Recipes
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.woodPlanksCamo, 8), new Object[]{"XXX", "XYX", "XXX", 'X', Blocks.glowstone, 'Y', new ItemStack(Blocks.planks, 1,1)});
    }


}
