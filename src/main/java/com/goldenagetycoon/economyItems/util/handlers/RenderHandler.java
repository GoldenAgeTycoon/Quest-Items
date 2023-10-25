package com.goldenagetycoon.economyItems.util.handlers;

import com.goldenagetycoon.economyItems.init.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraftforge.client.model.ModelLoader;

public class RenderHandler {
    public static void registerCustomStateMapper()
    {
        ModelLoader.setCustomStateMapper(ModBlocks.TEST_FLUID_BLOCK, new StateMapperBase()
        {
            @Override
            protected ModelResourceLocation getModelResourceLocation(IBlockState state)
            {
                return new ModelResourceLocation("economyitems:test_fluid", "fluid");
            }
        });
        ModelLoader.setCustomStateMapper(ModBlocks.RESOURCE_OIL_BLOCK, new StateMapperBase()
        {
            @Override
            protected ModelResourceLocation getModelResourceLocation(IBlockState state)
            {
                return new ModelResourceLocation("economyitems:resource_oil", "fluid");
            }
        });
        ModelLoader.setCustomStateMapper(ModBlocks.RESOURCE_FUEL_BLOCK, new StateMapperBase()
        {
            @Override
            protected ModelResourceLocation getModelResourceLocation(IBlockState state)
            {
                return new ModelResourceLocation("economyitems:resource_fuel", "fluid");
            }
        });

        ModelLoader.setCustomStateMapper(ModBlocks.RESOURCE_ALCOHOL_BLOCK, new StateMapperBase()
        {
            @Override
            protected ModelResourceLocation getModelResourceLocation(IBlockState state)
            {
                return new ModelResourceLocation("economyitems:resource_alcohol", "fluid");
            }
        });

        ModelLoader.setCustomStateMapper(ModBlocks.RESOURCE_MILK_BLOCK, new StateMapperBase()
        {
            @Override
            protected ModelResourceLocation getModelResourceLocation(IBlockState state)
            {
                return new ModelResourceLocation("economyitems:resource_milk", "fluid");
            }
        });
    }
}
