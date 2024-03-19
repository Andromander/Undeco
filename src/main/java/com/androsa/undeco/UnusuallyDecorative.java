package com.androsa.undeco;

import com.androsa.undeco.data.*;
import net.minecraft.DetectedVersion;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.metadata.PackMetadataGenerator;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.metadata.pack.PackMetadataSection;
import net.minecraft.util.InclusiveRange;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Optional;
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

        generator.addProvider(event.includeClient(), new UDBlockstateGenerator(output, helper));
        generator.addProvider(event.includeClient(), new UDItemModelGenerator(output, helper));
        generator.addProvider(event.includeServer(), new UDLootTables(output));
        generator.addProvider(event.includeServer(), new UDRecipes(output));
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new UDItemTags(output, provider, blockTags, helper));
        generator.addProvider(true, new PackMetadataGenerator(output).add(
                PackMetadataSection.TYPE,
                new PackMetadataSection(
                        Component.literal("Undeco Resources"),
                        DetectedVersion.BUILT_IN.getPackVersion(PackType.CLIENT_RESOURCES))));
    }
}
