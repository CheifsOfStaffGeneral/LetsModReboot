package com.yourname.modid.block;



import com.yourname.modid.LetsModReboot;
import com.yourname.modid.creativetab.CreativeTabLMRB;
import com.yourname.modid.init.ModBlocks;
import com.yourname.modid.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import sun.net.www.content.text.Generic;

import java.util.Random;

public class BlockFlag extends BlockLMRB
{
    public BlockFlag()
    {
        super();
        this.setBlockName("flag");
        this.setBlockTextureName("flag");
        this.setHardness(3.5F);
        this.setResistance(0.5F);
        this.setStepSound(soundTypePiston);
        this.setCreativeTab(CreativeTabLMRB.LMRB_TAB);
    }


    public Item getItemDropped(int par1, Random random, int par2)
    {
        return Item.getItemFromBlock(ModBlocks.flag);
    }

}
