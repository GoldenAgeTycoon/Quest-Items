package com.goldenagetycoon.questitems.blocks.slabs;

import com.goldenagetycoon.questitems.QuestItems;
import com.goldenagetycoon.questitems.init.ModItems;
import com.goldenagetycoon.questitems.util.IHasModel;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;

public class BlockSlabHalfBase extends BlockSlabBase implements IHasModel {
    public BlockSlabHalfBase(String name, Material materialIn,  BlockSlab half, BlockSlab doubleSlab)
    {
        super(name, materialIn, half);

        ModItems.ITEMS.add(new ItemSlab(this, this, doubleSlab).setRegistryName(name));
    }

    @Override
    public boolean isDouble()
    {
        return false;
    }

    @Override
    public void registerModels()
    {
        QuestItems.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0);
    }
}
