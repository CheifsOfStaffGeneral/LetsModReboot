package com.yourname.modid.init;


import com.yourname.modid.item.ItemAxe;
import com.yourname.modid.item.ItemHappyFace;
import com.yourname.modid.item.ItemLMRB;
import com.yourname.modid.item.ItemMapleLeaf;
import com.yourname.modid.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();
    public static final ItemLMRB happyFace = new ItemHappyFace();
    public static final ItemLMRB axe = new ItemAxe();

    public static  void init()
    {
        GameRegistry.registerItem(mapleLeaf,"mapleLeaf");
        GameRegistry.registerItem(happyFace,"happyFace");
        GameRegistry.registerItem(axe,"axe");
    }

}
