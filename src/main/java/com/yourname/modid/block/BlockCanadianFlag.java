package com.yourname.modid.block;


import com.yourname.modid.creativetab.CreativeTabLMRB;
import com.yourname.modid.init.ModBlocks;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockCanadianFlag extends BlockLMRB
{


    public BlockCanadianFlag()
    {
        super(Material.grass);
        this.setBlockName("candianFlag");
        this.setBlockTextureName("candianFlag");
        this.setHardness(0.5F);
        this.setResistance(0.5F);
        this.setStepSound(soundTypeCloth);
        this.setCreativeTab(CreativeTabLMRB.LMRB_TAB);

    }


    public Item getItemDropped(int par1, Random random, int par2)
    {
        return Item.getItemFromBlock(ModBlocks.candianFlag);
    }

    public int quantityDropped(Random p_149745_1_)
    {
        return 1;
    }
}







