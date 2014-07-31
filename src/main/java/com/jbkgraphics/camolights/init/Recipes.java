package com.jbkgraphics.camolights.init;




import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
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
        //There are 6 recipes, because there are 6 different types of wooden planks. The same counts when we get to the actual Wood Logs.
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.oakPlanksCamo, 8), new Object[]{"XXX", "XYX", "XXX", 'X', Blocks.glowstone, 'Y', new ItemStack(Blocks.planks)});
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.sprucePlanksCamo, 8), new Object[]{"XXX", "XYX", "XXX", 'X', Blocks.glowstone, 'Y', new ItemStack(Blocks.planks, 1,1)});
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.birchPlanksCamo, 8), new Object[]{"XXX", "XYX", "XXX", 'X', Blocks.glowstone, 'Y', new ItemStack(Blocks.planks, 1,2)});
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.junglePlanksCamo, 8), new Object[]{"XXX", "XYX", "XXX", 'X', Blocks.glowstone, 'Y', new ItemStack(Blocks.planks, 1,3)});
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.acaciaPlanksCamo, 8), new Object[]{"XXX", "XYX", "XXX", 'X', Blocks.glowstone, 'Y', new ItemStack(Blocks.planks, 1,4)});
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.darkPlanksCamo, 8), new Object[]{"XXX", "XYX", "XXX", 'X', Blocks.glowstone, 'Y', new ItemStack(Blocks.planks, 1,5)});


        //Wool Blocks
        //There are 15-16 colors, so 15-16 recipes.
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.whiteWoolCamo, 8), new Object[]{"XXX", "XYX", "XXX", 'X', Blocks.glowstone, 'Y', new ItemStack(Blocks.wool)});
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.orangeWoolCamo, 8), new Object[]{"XXX", "XYX", "XXX", 'X', Blocks.glowstone, 'Y', new ItemStack(Blocks.wool, 1,1)});
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.magentaWoolCamo, 8), new Object[]{"XXX", "XYX", "XXX", 'X', Blocks.glowstone, 'Y', new ItemStack(Blocks.wool, 1,2)});
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.lightBlueWoolCamo, 8), new Object[]{"XXX", "XYX", "XXX", 'X', Blocks.glowstone, 'Y', new ItemStack(Blocks.wool, 1,3)});
    }
}
