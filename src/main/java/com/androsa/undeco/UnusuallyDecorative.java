package com.androsa.undeco;

import com.androsa.undeco.data.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(UnusuallyDecorative.MODID)
public class UnusuallyDecorative {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "undeco";

    public UnusuallyDecorative() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::doClientStuff);
        bus.addListener(this::gatherData);

        MinecraftForge.EVENT_BUS.register(this);

        ModBlocks.BLOCKS.register(bus);
        ModBlocks.ITEMS.register(bus);
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> UnusuallyDecorative::registerRenderTypes));
    }

    private void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();
        BlockTagsProvider blockTags = new UDBlockTags(generator, helper);

        if (event.includeClient()) {
            generator.addProvider(new UDBlockstateGenerator(generator, helper));
            generator.addProvider(new UDItemModelGenerator(generator, helper));
        }
        if (event.includeServer()) {
            generator.addProvider(new UDLootTables(generator));
            generator.addProvider(new UDRecipes(generator));
            generator.addProvider(blockTags);
            generator.addProvider(new UDItemTags(generator, blockTags, helper));
        }
    }

    private static void registerRenderTypes() {
        cutout(ModBlocks.granite_trapdoor.get());
        cutout(ModBlocks.polished_granite_trapdoor.get());
        cutout(ModBlocks.diorite_trapdoor.get());
        cutout(ModBlocks.polished_diorite_trapdoor.get());
        cutout(ModBlocks.andesite_trapdoor.get());
        cutout(ModBlocks.polished_andesite_trapdoor.get());
        cutout(ModBlocks.oak_log_trapdoor.get());
        cutout(ModBlocks.spruce_log_trapdoor.get());
        cutout(ModBlocks.birch_log_trapdoor.get());
        cutout(ModBlocks.jungle_log_trapdoor.get());
        cutout(ModBlocks.acacia_log_trapdoor.get());
        cutout(ModBlocks.dark_oak_log_trapdoor.get());
        cutout(ModBlocks.crimson_stem_trapdoor.get());
        cutout(ModBlocks.warped_stem_trapdoor.get());
        cutout(ModBlocks.blackstone_trapdoor.get());
        cutout(ModBlocks.polished_blackstone_trapdoor.get());
        cutout(ModBlocks.stone_trapdoor.get());
        cutout(ModBlocks.smooth_stone_trapdoor.get());
        cutout(ModBlocks.cobblestone_trapdoor.get());
        cutout(ModBlocks.mossy_cobblestone_trapdoor.get());
        cutout(ModBlocks.sandstone_trapdoor.get());
        cutout(ModBlocks.smooth_sandstone_trapdoor.get());
        cutout(ModBlocks.red_sandstone_trapdoor.get());
        cutout(ModBlocks.smooth_red_sandstone_trapdoor.get());
        cutout(ModBlocks.stone_brick_trapdoor.get());
        cutout(ModBlocks.cracked_stone_brick_trapdoor.get());
        cutout(ModBlocks.mossy_stone_brick_trapdoor.get());
        cutout(ModBlocks.prismarine_trapdoor.get());
        cutout(ModBlocks.prismarine_brick_trapdoor.get());
        cutout(ModBlocks.dark_prismarine_trapdoor.get());
        cutout(ModBlocks.purpur_trapdoor.get());

        cutout(ModBlocks.oak_saddle_door.get());
        cutout(ModBlocks.spruce_saddle_door.get());
        cutout(ModBlocks.birch_saddle_door.get());
        cutout(ModBlocks.jungle_saddle_door.get());
        cutout(ModBlocks.acacia_saddle_door.get());
        cutout(ModBlocks.dark_oak_saddle_door.get());
        cutout(ModBlocks.crimson_saddle_door.get());
        cutout(ModBlocks.warped_saddle_door.get());
        cutout(ModBlocks.granite_saddle_door.get());
        cutout(ModBlocks.polished_granite_saddle_door.get());
        cutout(ModBlocks.diorite_saddle_door.get());
        cutout(ModBlocks.polished_diorite_saddle_door.get());
        cutout(ModBlocks.andesite_saddle_door.get());
        cutout(ModBlocks.polished_andesite_saddle_door.get());
        cutout(ModBlocks.oak_log_saddle_door.get());
        cutout(ModBlocks.spruce_log_saddle_door.get());
        cutout(ModBlocks.birch_log_saddle_door.get());
        cutout(ModBlocks.jungle_log_saddle_door.get());
        cutout(ModBlocks.acacia_log_saddle_door.get());
        cutout(ModBlocks.dark_oak_log_saddle_door.get());
        cutout(ModBlocks.crimson_stem_saddle_door.get());
        cutout(ModBlocks.warped_stem_saddle_door.get());
        cutout(ModBlocks.blackstone_saddle_door.get());
        cutout(ModBlocks.polished_blackstone_saddle_door.get());
        cutout(ModBlocks.stone_saddle_door.get());
        cutout(ModBlocks.smooth_stone_saddle_door.get());
        cutout(ModBlocks.cobblestone_saddle_door.get());
        cutout(ModBlocks.mossy_cobblestone_saddle_door.get());
        cutout(ModBlocks.sandstone_saddle_door.get());
        cutout(ModBlocks.smooth_sandstone_saddle_door.get());
        cutout(ModBlocks.red_sandstone_saddle_door.get());
        cutout(ModBlocks.smooth_red_sandstone_saddle_door.get());
        cutout(ModBlocks.stone_brick_saddle_door.get());
        cutout(ModBlocks.cracked_stone_brick_saddle_door.get());
        cutout(ModBlocks.mossy_stone_brick_saddle_door.get());
        cutout(ModBlocks.prismarine_saddle_door.get());
        cutout(ModBlocks.prismarine_brick_saddle_door.get());
        cutout(ModBlocks.dark_prismarine_saddle_door.get());
        cutout(ModBlocks.purpur_saddle_door.get());
    }

    private static void cutout(Block block) {
        ItemBlockRenderTypes.setRenderLayer(block, RenderType.cutout());
    }
}
