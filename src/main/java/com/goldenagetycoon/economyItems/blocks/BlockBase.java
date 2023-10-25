package com.goldenagetycoon.economyItems.blocks;

import com.goldenagetycoon.economyItems.EconomyItems;
import com.goldenagetycoon.economyItems.init.ModBlocks;
import com.goldenagetycoon.economyItems.init.ModItems;
import com.goldenagetycoon.economyItems.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

    public BlockBase(String name, Material material)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(EconomyItems.tab);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }

    @Override
    public void registerModels()
    {
        EconomyItems.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0);
    }
}
