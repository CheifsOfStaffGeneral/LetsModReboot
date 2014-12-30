package com.yourname.modid;

import com.yourname.modid.configuration.ConfigurationHandler;
import com.yourname.modid.init.ModBlocks;
import com.yourname.modid.init.ModItems;
import com.yourname.modid.proxy.IProxy;
import com.yourname.modid.reference.Reference;
import com.yourname.modid.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name= Reference.MOD_NAME, version= Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LetsModReboot
{
    @Mod.Instance(Reference.MOD_ID)
    public static LetsModReboot instance;

    @SidedProxy(clientSide =  Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initilization Complete!");

        ModItems.init();

        ModBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initilization Complete!");
        ModBlocks.regitsterTileEntities();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initilization Complete!");
    }
}