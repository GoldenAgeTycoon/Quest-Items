package com.goldenagetycoon.questitems.items;

import com.goldenagetycoon.questitems.QuestItems;
import com.goldenagetycoon.questitems.init.ModItems;
import com.goldenagetycoon.questitems.util.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(QuestItems.tab);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        QuestItems.proxy.registerItemRenderer(this, 0 );
    }
}
