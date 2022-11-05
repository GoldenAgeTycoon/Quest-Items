package com.goldenagetycoon.questitems.tab;

import com.goldenagetycoon.questitems.init.ModFluids;
import com.goldenagetycoon.questitems.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidUtil;

public class TabMenu extends CreativeTabs {

    public TabMenu(String label) {
        super(label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.TESTITEM);
    }

    @Override
    public void displayAllRelevantItems(NonNullList<ItemStack> items) {
        super.displayAllRelevantItems(items);
        items.add(FluidUtil.getFilledBucket(new FluidStack(ModFluids.TEST_FLUID, 1)));
        items.add(FluidUtil.getFilledBucket(new FluidStack(ModFluids.RESOURCE_OIL, 1)));
        items.add(FluidUtil.getFilledBucket(new FluidStack(ModFluids.RESOURCE_FUEL, 1)));
        items.add(FluidUtil.getFilledBucket(new FluidStack(ModFluids.RESOURCE_ALCOHOL, 1)));
        items.add(FluidUtil.getFilledBucket(new FluidStack(ModFluids.RESOURCE_MILK, 1)));

    }
}
