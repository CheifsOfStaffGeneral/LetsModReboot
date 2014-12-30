package com.yourname.modid.creativetab;


import com.yourname.modid.init.ModItems;
import com.yourname.modid.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class CreativeTabLMRB
{
    public static final CreativeTabs LMRB_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
           return ModItems.happyFace;
        }




        @Override
        public String getTranslatedTabLabel ()
        {
            return "Let's Mod Reboot";
        }

    };

  }

