package com.goldenagetycoon.questitems.init;

import com.goldenagetycoon.questitems.fluids.FluidBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ModFluids {
    public static final Fluid TEST_FLUID = new FluidBase("test_fluid", new ResourceLocation("questitems:blocks/testfluid_still"), new ResourceLocation("questitems:blocks/testfluid_flow"));
    public static final Fluid RESOURCE_OIL = new FluidBase("resource_oil", new ResourceLocation("questitems:blocks/resource_oil_still"), new ResourceLocation("questitems:blocks/resource_oil_flow"));
    public static final Fluid RESOURCE_FUEL = new FluidBase("resource_fuel", new ResourceLocation("questitems:blocks/resource_fuel_still"), new ResourceLocation("questitems:blocks/resource_fuel_flow"));
    public static final Fluid RESOURCE_MILK = new FluidBase("resource_milk", new ResourceLocation("questitems:blocks/resource_milk_still"), new ResourceLocation("questitems:blocks/resource_milk_flow"));
    public static final Fluid RESOURCE_ALCOHOL = new FluidBase("resource_alcohol", new ResourceLocation("questitems:blocks/resource_alcohol_still"), new ResourceLocation("questitems:blocks/resource_alcohol_flow"));



    public static void registerFluids()
    {
        registerFluid(TEST_FLUID);
        registerFluid(RESOURCE_OIL);
        registerFluid(RESOURCE_FUEL);
        registerFluid(RESOURCE_MILK);
        registerFluid(RESOURCE_ALCOHOL);
    }

    public static void registerFluid(Fluid fluid)
    {
        FluidRegistry.registerFluid(fluid);
        FluidRegistry.addBucketForFluid(fluid);
    }
}
