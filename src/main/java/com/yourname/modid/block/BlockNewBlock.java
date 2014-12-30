package com.yourname.modid.block;


import com.yourname.modid.creativetab.CreativeTabLMRB;
import com.yourname.modid.creativetab.CreativeTabTest;
import com.yourname.modid.init.ModBlocks;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockNewBlock extends BlockLMRB
{
        public BlockNewBlock()
        {
            super(Material.rock);
            this.setBlockName("newBlock");
            this.setBlockTextureName("newBlock");
            this.setHardness(1.25F);
            this.setResistance(0.5F);
            this.setStepSound(soundTypePiston);
            this.setCreativeTab(CreativeTabTest.LMRBTEST_TAB);

        }


    public Item getItemDropped(int par1, Random random, int par2)
    {
        return Item.getItemFromBlock(ModBlocks.newBlock);
    }

    public int quantityDropped(Random p_149745_1_)
    {
        return 1;
    }
}


