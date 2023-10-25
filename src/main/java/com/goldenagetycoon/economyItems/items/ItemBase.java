package com.goldenagetycoon.economyItems.items;

import com.goldenagetycoon.economyItems.EconomyItems;
import com.goldenagetycoon.economyItems.init.ModItems;
import com.goldenagetycoon.economyItems.util.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(EconomyItems.tab);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        EconomyItems.proxy.registerItemRenderer(this, 0 );
    }
}
