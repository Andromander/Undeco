package com.androsa.undeco;

import com.androsa.undeco.data.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.CompletableFuture;

@Mod(UnusuallyDecorative.MODID)
public class UnusuallyDecorative {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "undeco";

    public UnusuallyDecorative(IEventBus bus) {
        bus.addListener(this::gatherData);

        ModBlocks.BLOCKS.register(bus);
        ModBlocks.ITEMS.register(bus);
    }

    private void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper helper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> provider = event.getLookupProvider();
        BlockTagsProvider blockTags = new UDBlockTags(output, provider, helper);

        if (event.includeClient()) {
            generator.addProvider(true, new UDBlockstateGenerator(output, helper));
            generator.addProvider(true, new UDItemModelGenerator(output, helper));
        }
        if (event.includeServer()) {
            generator.addProvider(true, new UDLootTables(output));
            generator.addProvider(true, new UDRecipes(output, provider));
            generator.addProvider(true, blockTags);
            generator.addProvider(true, new UDItemTags(output, provider, blockTags, helper));
        }
    }
}
