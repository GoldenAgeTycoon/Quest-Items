package com.goldenagetycoon.questitems.blocks;

import com.goldenagetycoon.questitems.QuestItems;
import com.goldenagetycoon.questitems.init.ModBlocks;
import com.goldenagetycoon.questitems.init.ModItems;
import com.goldenagetycoon.questitems.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

    public BlockBase(String name, Material material)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(QuestItems.tab);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }

    @Override
    public void registerModels()
    {
        QuestItems.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0);
    }
}
