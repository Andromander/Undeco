package com.androsa.undeco;

import com.androsa.undeco.data.*;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(UnusuallyDecorative.MODID)
public class UnusuallyDecorative {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "undeco";

    public UnusuallyDecorative() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::gatherData);

        MinecraftForge.EVENT_BUS.register(this);

        ModBlocks.BLOCKS.register(bus);
        ModBlocks.ITEMS.register(bus);
    }

    private void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();
        BlockTagsProvider blockTags = new UDBlockTags(generator, helper);

        if (event.includeClient()) {
            generator.addProvider(true, new UDBlockstateGenerator(generator, helper));
            generator.addProvider(true, new UDItemModelGenerator(generator, helper));
        }
        if (event.includeServer()) {
            generator.addProvider(true, new UDLootTables(generator));
            generator.addProvider(true, new UDRecipes(generator));
            generator.addProvider(true, blockTags);
            generator.addProvider(true, new UDItemTags(generator, blockTags, helper));
        }
    }
}
