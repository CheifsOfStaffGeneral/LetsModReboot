package com.yourname.modid.creativetab;


import com.yourname.modid.init.ModItems;
import com.yourname.modid.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTest
{
    public static final CreativeTabs LMRBTEST_TAB = new CreativeTabs(Reference.MOD_NAME)
    {

        @Override
        public Item getTabIconItem() {

            {
                return ModItems.mapleLeaf;
            }
        }

                @Override
            public String getTranslatedTabLabel ()
            {
                return "Let's Mod Reboot Extension";
            }

        };
    }

