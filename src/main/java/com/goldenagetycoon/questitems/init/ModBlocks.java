package com.goldenagetycoon.questitems.init;

import com.goldenagetycoon.questitems.blocks.BlockBase;
import com.goldenagetycoon.questitems.blocks.BlockFluid;

import com.goldenagetycoon.questitems.blocks.slabs.BlockSlabDoubleBase;
import com.goldenagetycoon.questitems.blocks.slabs.BlockSlabHalfBase;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    // Blocks
    public static final Block BALLAST = new BlockBase("resource_ballast", Material.ROCK);


    //Slabs
    public static final BlockSlab RAIL_TIE_DOUBLE = new BlockSlabDoubleBase("rail_tie_double", Material.WOOD, ModBlocks.RAIL_TIE_HALF);
    public static final BlockSlab RAIL_TIE_HALF = new BlockSlabHalfBase("rail_tie_half", Material.WOOD, ModBlocks.RAIL_TIE_HALF, ModBlocks.RAIL_TIE_DOUBLE);

    //Fluids
    public static final Block TEST_FLUID_BLOCK = new BlockFluid("test_fluid", ModFluids.TEST_FLUID, Material.WATER);
    public static final Block RESOURCE_OIL_BLOCK = new BlockFluid("resource_oil", ModFluids.RESOURCE_OIL, Material.WATER);
    public static final Block RESOURCE_FUEL_BLOCK = new BlockFluid("resource_fuel", ModFluids.RESOURCE_FUEL, Material.WATER);

    public static final Block RESOURCE_MILK_BLOCK = new BlockFluid("resource_milk", ModFluids.RESOURCE_MILK, Material.WATER);

    public static final Block RESOURCE_ALCOHOL_BLOCK = new BlockFluid("resource_alcohol", ModFluids.RESOURCE_ALCOHOL, Material.WATER);
}
