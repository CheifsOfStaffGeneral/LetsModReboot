package com.yourname.modid.block;


import com.yourname.modid.creativetab.CreativeTabTest;
import com.yourname.modid.tileentities.TileEntityBlock;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockTileEntity extends BlockLMRB implements ITileEntityProvider
{

    public BlockTileEntity()
    {
        super(Material.ground);
        this.setBlockName("tileEntity");
        this.setBlockTextureName("tileEntity");
        this.setHardness(1.0F);
        this.setResistance(0.5F);
        this.setStepSound(soundTypePiston);
        this.setCreativeTab(CreativeTabTest.LMRBTEST_TAB);

    }


    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
    {
        return new TileEntityBlock();
    }
}