package com.jbkgraphics.camolights.creativetab;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import com.jbkgraphics.camolights.init.ModBlocks;
import com.jbkgraphics.camolights.init.ModItems;
import com.jbkgraphics.camolights.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;




public class CreativeTabCL {
    public static final CreativeTabs CL_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return Items.glowstone_dust;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Camo Lights";
        }
    };
}
