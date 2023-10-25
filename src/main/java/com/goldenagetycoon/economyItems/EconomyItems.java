package com.goldenagetycoon.economyItems;



import com.goldenagetycoon.economyItems.proxy.CommonProxy;
import com.goldenagetycoon.economyItems.tab.TabMenu;
import com.goldenagetycoon.economyItems.util.Reference;
import com.goldenagetycoon.economyItems.util.handlers.RegistryHandler;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = QuestItems.MODID, name = QuestItems.NAME, version = QuestItems.VERSION)
public class QuestItems
{
    public static final String MODID = "questitems";
    public static final String NAME = "Quest Items";
    public static final String VERSION = "1.4";

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    static { FluidRegistry.enableUniversalBucket(); }

    public static final TabMenu tab = new TabMenu("customtab");

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent event)
    {
        RegistryHandler.preInitRegistries(event);
    }

}
