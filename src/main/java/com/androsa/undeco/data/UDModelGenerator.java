package com.androsa.undeco.data;

import com.androsa.undeco.UnusuallyDecorative;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.data.PackOutput;

public class UDModelGenerator extends ModelProvider {
    public UDModelGenerator(PackOutput output) {
        super(output, UnusuallyDecorative.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        new UDBlockstateGenerator(blockModels).runBlockGen();
    }
}
