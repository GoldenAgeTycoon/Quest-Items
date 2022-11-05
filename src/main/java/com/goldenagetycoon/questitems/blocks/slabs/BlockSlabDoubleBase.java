package com.goldenagetycoon.questitems.blocks.slabs;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;

public class BlockSlabDoubleBase extends BlockSlabBase{
    public BlockSlabDoubleBase(String name, Material materialIn, BlockSlab half)
    {
        super(name, materialIn, half);
    }

    @Override
    public boolean isDouble()
    {
        return true;
    }
}
