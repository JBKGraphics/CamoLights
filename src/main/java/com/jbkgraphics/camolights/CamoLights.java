package com.jbkgraphics.camolights;

import com.jbkgraphics.camolights.configuration.ConfigurationHandler;
import com.jbkgraphics.camolights.init.ModBlocks;
import com.jbkgraphics.camolights.init.ModItems;
import com.jbkgraphics.camolights.init.Recipes;
import com.jbkgraphics.camolights.proxy.IProxy;
import com.jbkgraphics.camolights.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;



@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = "1.0 ")
public class CamoLights {


    /* You create a reference, like a VARIABLE */
    @Mod.Instance(Reference.MOD_ID)
    public static CamoLights instance;

    @SidedProxy(clientSide = "com.jbkgraphics.camolights.proxy.ClientProxy", serverSide = "com.jbkgraphics.camolights.proxy.ServerProxy")
    public static IProxy proxy;


    /* PreInitialization event = blocks get made, configuration is here,   */
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        //ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        //ModItems.init();

        //ModBlocks.init();
    }



    /* Inizialitation ecebt = GUI, start af recipies osv. */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

        //Recipes.init();
    }



    /* Her wrapper man op på ens mod */
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
