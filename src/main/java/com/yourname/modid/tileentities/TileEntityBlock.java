package com.yourname.modid.tileentities;


import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityBlock extends TileEntity
{
   @Override
    public void writeToNBT(NBTTagCompound par1)
   {
       super.writeToNBT(par1);
   }

    @Override
    public void readFromNBT(NBTTagCompound par1)
    {
        super.readFromNBT(par1);
    }
    public int customField;


}
