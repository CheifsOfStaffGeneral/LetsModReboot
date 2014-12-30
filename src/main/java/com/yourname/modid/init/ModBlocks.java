package com.yourname.modid.init;


import com.yourname.modid.block.*;
import com.yourname.modid.reference.Reference;
import com.yourname.modid.tileentities.TileEntityBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMRB flag = new BlockFlag();
    public static final BlockLMRB candianFlag = new BlockCanadianFlag();
    public static final BlockLMRB newBlock = new BlockNewBlock();
    public static final BlockLMRB tileEntity = new BlockTileEntity();


    public static  void init()
    {
        GameRegistry.registerBlock(flag, "flag");
        GameRegistry.registerBlock(candianFlag, "candianFlag");
        GameRegistry.registerBlock(newBlock, "newBlock");
        GameRegistry.registerBlock(tileEntity, "tileEntity");
    }

    public static void regitsterTileEntities()
    {
        GameRegistry.registerTileEntity(TileEntityBlock.class, "blockTileEntity");
    }
}
