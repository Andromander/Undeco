package com.androsa.undeco.data;

import com.androsa.ornamental.data.provider.OrnamentLootTableProvider;
import com.androsa.undeco.ModBlocks;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class UDLootTables extends LootTableProvider {

    public UDLootTables(DataGenerator generator) {
        super(generator);
    }

    @Override
    public String getName() {
        return "Ornamental: Unusually Decorative Loot Tables";
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> getTables() {
        return ImmutableList.of(Pair.of(UDLootTables.BlockTables::new, LootContextParamSets.BLOCK));
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationContext validationtracker) {

    }

    public static class BlockTables extends OrnamentLootTableProvider {

        @Override
        protected void addTables() {
            dropSelf(ModBlocks.oak_log_stairs);
            dropSelf(ModBlocks.spruce_log_stairs);
            dropSelf(ModBlocks.birch_log_stairs);
            dropSelf(ModBlocks.jungle_log_stairs);
            dropSelf(ModBlocks.acacia_log_stairs);
            dropSelf(ModBlocks.dark_oak_log_stairs);
            dropSelf(ModBlocks.mangrove_log_stairs);
            dropSelf(ModBlocks.crimson_stem_stairs);
            dropSelf(ModBlocks.warped_stem_stairs);
            dropSelf(ModBlocks.smooth_stone_stairs);
            dropSelf(ModBlocks.cracked_stone_brick_stairs);

            dropSlab(ModBlocks.oak_log_slab);
            dropSlab(ModBlocks.spruce_log_slab);
            dropSlab(ModBlocks.birch_log_slab);
            dropSlab(ModBlocks.jungle_log_slab);
            dropSlab(ModBlocks.acacia_log_slab);
            dropSlab(ModBlocks.dark_oak_log_slab);
            dropSlab(ModBlocks.mangrove_log_slab);
            dropSlab(ModBlocks.crimson_stem_slab);
            dropSlab(ModBlocks.warped_stem_slab);
            dropSlab(ModBlocks.cracked_stone_brick_slab);

            dropSelf(ModBlocks.granite_fence);
            dropSelf(ModBlocks.polished_granite_fence);
            dropSelf(ModBlocks.diorite_fence);
            dropSelf(ModBlocks.polished_diorite_fence);
            dropSelf(ModBlocks.andesite_fence);
            dropSelf(ModBlocks.polished_andesite_fence);
            dropSelf(ModBlocks.oak_log_fence);
            dropSelf(ModBlocks.spruce_log_fence);
            dropSelf(ModBlocks.birch_log_fence);
            dropSelf(ModBlocks.jungle_log_fence);
            dropSelf(ModBlocks.acacia_log_fence);
            dropSelf(ModBlocks.dark_oak_log_fence);
            dropSelf(ModBlocks.mangrove_log_fence);
            dropSelf(ModBlocks.crimson_stem_fence);
            dropSelf(ModBlocks.warped_stem_fence);
            dropSelf(ModBlocks.blackstone_fence);
            dropSelf(ModBlocks.polished_blackstone_fence);
            dropSelf(ModBlocks.stone_fence);
            dropSelf(ModBlocks.smooth_stone_fence);
            dropSelf(ModBlocks.cobblestone_fence);
            dropSelf(ModBlocks.mossy_cobblestone_fence);
            dropSelf(ModBlocks.sandstone_fence);
            dropSelf(ModBlocks.smooth_sandstone_fence);
            dropSelf(ModBlocks.red_sandstone_fence);
            dropSelf(ModBlocks.smooth_red_sandstone_fence);
            dropSelf(ModBlocks.stone_brick_fence);
            dropSelf(ModBlocks.cracked_stone_brick_fence);
            dropSelf(ModBlocks.mossy_stone_brick_fence);
            dropSelf(ModBlocks.prismarine_fence);
            dropSelf(ModBlocks.prismarine_brick_fence);
            dropSelf(ModBlocks.dark_prismarine_fence);
            dropSelf(ModBlocks.purpur_fence);

            dropSelf(ModBlocks.granite_trapdoor);
            dropSelf(ModBlocks.polished_granite_trapdoor);
            dropSelf(ModBlocks.diorite_trapdoor);
            dropSelf(ModBlocks.polished_diorite_trapdoor);
            dropSelf(ModBlocks.andesite_trapdoor);
            dropSelf(ModBlocks.polished_andesite_trapdoor);
            dropSelf(ModBlocks.oak_log_trapdoor);
            dropSelf(ModBlocks.spruce_log_trapdoor);
            dropSelf(ModBlocks.birch_log_trapdoor);
            dropSelf(ModBlocks.jungle_log_trapdoor);
            dropSelf(ModBlocks.acacia_log_trapdoor);
            dropSelf(ModBlocks.dark_oak_log_trapdoor);
            dropSelf(ModBlocks.mangrove_log_trapdoor);
            dropSelf(ModBlocks.crimson_stem_trapdoor);
            dropSelf(ModBlocks.warped_stem_trapdoor);
            dropSelf(ModBlocks.blackstone_trapdoor);
            dropSelf(ModBlocks.polished_blackstone_trapdoor);
            dropSelf(ModBlocks.stone_trapdoor);
            dropSelf(ModBlocks.smooth_stone_trapdoor);
            dropSelf(ModBlocks.cobblestone_trapdoor);
            dropSelf(ModBlocks.mossy_cobblestone_trapdoor);
            dropSelf(ModBlocks.sandstone_trapdoor);
            dropSelf(ModBlocks.smooth_sandstone_trapdoor);
            dropSelf(ModBlocks.red_sandstone_trapdoor);
            dropSelf(ModBlocks.smooth_red_sandstone_trapdoor);
            dropSelf(ModBlocks.stone_brick_trapdoor);
            dropSelf(ModBlocks.cracked_stone_brick_trapdoor);
            dropSelf(ModBlocks.mossy_stone_brick_trapdoor);
            dropSelf(ModBlocks.prismarine_trapdoor);
            dropSelf(ModBlocks.prismarine_brick_trapdoor);
            dropSelf(ModBlocks.dark_prismarine_trapdoor);
            dropSelf(ModBlocks.purpur_trapdoor);

            dropSelf(ModBlocks.granite_fence_gate);
            dropSelf(ModBlocks.polished_granite_fence_gate);
            dropSelf(ModBlocks.diorite_fence_gate);
            dropSelf(ModBlocks.polished_diorite_fence_gate);
            dropSelf(ModBlocks.andesite_fence_gate);
            dropSelf(ModBlocks.polished_andesite_fence_gate);
            dropSelf(ModBlocks.oak_log_fence_gate);
            dropSelf(ModBlocks.spruce_log_fence_gate);
            dropSelf(ModBlocks.birch_log_fence_gate);
            dropSelf(ModBlocks.jungle_log_fence_gate);
            dropSelf(ModBlocks.acacia_log_fence_gate);
            dropSelf(ModBlocks.dark_oak_log_fence_gate);
            dropSelf(ModBlocks.mangrove_log_fence_gate);
            dropSelf(ModBlocks.crimson_stem_fence_gate);
            dropSelf(ModBlocks.warped_stem_fence_gate);
            dropSelf(ModBlocks.blackstone_fence_gate);
            dropSelf(ModBlocks.polished_blackstone_fence_gate);
            dropSelf(ModBlocks.stone_fence_gate);
            dropSelf(ModBlocks.smooth_stone_fence_gate);
            dropSelf(ModBlocks.cobblestone_fence_gate);
            dropSelf(ModBlocks.mossy_cobblestone_fence_gate);
            dropSelf(ModBlocks.sandstone_fence_gate);
            dropSelf(ModBlocks.smooth_sandstone_fence_gate);
            dropSelf(ModBlocks.red_sandstone_fence_gate);
            dropSelf(ModBlocks.smooth_red_sandstone_fence_gate);
            dropSelf(ModBlocks.stone_brick_fence_gate);
            dropSelf(ModBlocks.cracked_stone_brick_fence_gate);
            dropSelf(ModBlocks.mossy_stone_brick_fence_gate);
            dropSelf(ModBlocks.prismarine_fence_gate);
            dropSelf(ModBlocks.prismarine_brick_fence_gate);
            dropSelf(ModBlocks.dark_prismarine_fence_gate);
            dropSelf(ModBlocks.purpur_fence_gate);

            dropDoor(ModBlocks.granite_door);
            dropDoor(ModBlocks.polished_granite_door);
            dropDoor(ModBlocks.diorite_door);
            dropDoor(ModBlocks.polished_diorite_door);
            dropDoor(ModBlocks.andesite_door);
            dropDoor(ModBlocks.polished_andesite_door);
            dropDoor(ModBlocks.oak_log_door);
            dropDoor(ModBlocks.spruce_log_door);
            dropDoor(ModBlocks.birch_log_door);
            dropDoor(ModBlocks.jungle_log_door);
            dropDoor(ModBlocks.acacia_log_door);
            dropDoor(ModBlocks.dark_oak_log_door);
            dropDoor(ModBlocks.mangrove_log_door);
            dropDoor(ModBlocks.crimson_stem_door);
            dropDoor(ModBlocks.warped_stem_door);
            dropDoor(ModBlocks.blackstone_door);
            dropDoor(ModBlocks.polished_blackstone_door);
            dropDoor(ModBlocks.stone_door);
            dropDoor(ModBlocks.smooth_stone_door);
            dropDoor(ModBlocks.cobblestone_door);
            dropDoor(ModBlocks.mossy_cobblestone_door);
            dropDoor(ModBlocks.sandstone_door);
            dropDoor(ModBlocks.smooth_sandstone_door);
            dropDoor(ModBlocks.red_sandstone_door);
            dropDoor(ModBlocks.smooth_red_sandstone_door);
            dropDoor(ModBlocks.stone_brick_door);
            dropDoor(ModBlocks.cracked_stone_brick_door);
            dropDoor(ModBlocks.mossy_stone_brick_door);
            dropDoor(ModBlocks.prismarine_door);
            dropDoor(ModBlocks.prismarine_brick_door);
            dropDoor(ModBlocks.dark_prismarine_door);
            dropDoor(ModBlocks.purpur_door);

            dropSelf(ModBlocks.oak_pole);
            dropSelf(ModBlocks.spruce_pole);
            dropSelf(ModBlocks.birch_pole);
            dropSelf(ModBlocks.jungle_pole);
            dropSelf(ModBlocks.acacia_pole);
            dropSelf(ModBlocks.dark_oak_pole);
            dropSelf(ModBlocks.mangrove_pole);
            dropSelf(ModBlocks.crimson_pole);
            dropSelf(ModBlocks.warped_pole);
            dropSelf(ModBlocks.granite_pole);
            dropSelf(ModBlocks.polished_granite_pole);
            dropSelf(ModBlocks.diorite_pole);
            dropSelf(ModBlocks.polished_diorite_pole);
            dropSelf(ModBlocks.andesite_pole);
            dropSelf(ModBlocks.polished_andesite_pole);
            dropSelf(ModBlocks.oak_log_pole);
            dropSelf(ModBlocks.spruce_log_pole);
            dropSelf(ModBlocks.birch_log_pole);
            dropSelf(ModBlocks.jungle_log_pole);
            dropSelf(ModBlocks.acacia_log_pole);
            dropSelf(ModBlocks.dark_oak_log_pole);
            dropSelf(ModBlocks.mangrove_log_pole);
            dropSelf(ModBlocks.crimson_stem_pole);
            dropSelf(ModBlocks.warped_stem_pole);
            dropSelf(ModBlocks.blackstone_pole);
            dropSelf(ModBlocks.polished_blackstone_pole);
            dropSelf(ModBlocks.stone_pole);
            dropSelf(ModBlocks.smooth_stone_pole);
            dropSelf(ModBlocks.cobblestone_pole);
            dropSelf(ModBlocks.mossy_cobblestone_pole);
            dropSelf(ModBlocks.sandstone_pole);
            dropSelf(ModBlocks.smooth_sandstone_pole);
            dropSelf(ModBlocks.red_sandstone_pole);
            dropSelf(ModBlocks.smooth_red_sandstone_pole);
            dropSelf(ModBlocks.stone_brick_pole);
            dropSelf(ModBlocks.cracked_stone_brick_pole);
            dropSelf(ModBlocks.mossy_stone_brick_pole);
            dropSelf(ModBlocks.prismarine_pole);
            dropSelf(ModBlocks.prismarine_brick_pole);
            dropSelf(ModBlocks.dark_prismarine_pole);
            dropSelf(ModBlocks.purpur_pole);

            dropSelf(ModBlocks.oak_beam);
            dropSelf(ModBlocks.spruce_beam);
            dropSelf(ModBlocks.birch_beam);
            dropSelf(ModBlocks.jungle_beam);
            dropSelf(ModBlocks.acacia_beam);
            dropSelf(ModBlocks.dark_oak_beam);
            dropSelf(ModBlocks.mangrove_beam);
            dropSelf(ModBlocks.crimson_beam);
            dropSelf(ModBlocks.warped_beam);
            dropSelf(ModBlocks.granite_beam);
            dropSelf(ModBlocks.polished_granite_beam);
            dropSelf(ModBlocks.diorite_beam);
            dropSelf(ModBlocks.polished_diorite_beam);
            dropSelf(ModBlocks.andesite_beam);
            dropSelf(ModBlocks.polished_andesite_beam);
            dropSelf(ModBlocks.oak_log_beam);
            dropSelf(ModBlocks.spruce_log_beam);
            dropSelf(ModBlocks.birch_log_beam);
            dropSelf(ModBlocks.jungle_log_beam);
            dropSelf(ModBlocks.acacia_log_beam);
            dropSelf(ModBlocks.dark_oak_log_beam);
            dropSelf(ModBlocks.mangrove_log_beam);
            dropSelf(ModBlocks.crimson_stem_beam);
            dropSelf(ModBlocks.warped_stem_beam);
            dropSelf(ModBlocks.blackstone_beam);
            dropSelf(ModBlocks.polished_blackstone_beam);
            dropSelf(ModBlocks.stone_beam);
            dropSelf(ModBlocks.smooth_stone_beam);
            dropSelf(ModBlocks.cobblestone_beam);
            dropSelf(ModBlocks.mossy_cobblestone_beam);
            dropSelf(ModBlocks.sandstone_beam);
            dropSelf(ModBlocks.smooth_sandstone_beam);
            dropSelf(ModBlocks.red_sandstone_beam);
            dropSelf(ModBlocks.smooth_red_sandstone_beam);
            dropSelf(ModBlocks.stone_brick_beam);
            dropSelf(ModBlocks.cracked_stone_brick_beam);
            dropSelf(ModBlocks.mossy_stone_brick_beam);
            dropSelf(ModBlocks.prismarine_beam);
            dropSelf(ModBlocks.prismarine_brick_beam);
            dropSelf(ModBlocks.dark_prismarine_beam);
            dropSelf(ModBlocks.purpur_beam);

			dropSelf(ModBlocks.oak_wall);
			dropSelf(ModBlocks.spruce_wall);
			dropSelf(ModBlocks.birch_wall);
			dropSelf(ModBlocks.jungle_wall);
			dropSelf(ModBlocks.acacia_wall);
			dropSelf(ModBlocks.dark_oak_wall);
			dropSelf(ModBlocks.mangrove_wall);
			dropSelf(ModBlocks.crimson_wall);
			dropSelf(ModBlocks.warped_wall);
			dropSelf(ModBlocks.polished_granite_wall);
			dropSelf(ModBlocks.polished_diorite_wall);
			dropSelf(ModBlocks.polished_andesite_wall);
			dropSelf(ModBlocks.oak_log_wall);
			dropSelf(ModBlocks.spruce_log_wall);
			dropSelf(ModBlocks.birch_log_wall);
			dropSelf(ModBlocks.jungle_log_wall);
			dropSelf(ModBlocks.acacia_log_wall);
			dropSelf(ModBlocks.dark_oak_log_wall);
			dropSelf(ModBlocks.mangrove_log_wall);
			dropSelf(ModBlocks.crimson_stem_wall);
			dropSelf(ModBlocks.warped_stem_wall);
			dropSelf(ModBlocks.stone_wall);
			dropSelf(ModBlocks.smooth_stone_wall);
			dropSelf(ModBlocks.smooth_sandstone_wall);
			dropSelf(ModBlocks.smooth_red_sandstone_wall);
			dropSelf(ModBlocks.cracked_stone_brick_wall);
			dropSelf(ModBlocks.prismarine_brick_wall);
			dropSelf(ModBlocks.dark_prismarine_wall);
			dropSelf(ModBlocks.purpur_wall);

            dropSelf(ModBlocks.oak_saddle_door);
            dropSelf(ModBlocks.spruce_saddle_door);
            dropSelf(ModBlocks.birch_saddle_door);
            dropSelf(ModBlocks.jungle_saddle_door);
            dropSelf(ModBlocks.acacia_saddle_door);
            dropSelf(ModBlocks.dark_oak_saddle_door);
            dropSelf(ModBlocks.mangrove_saddle_door);
            dropSelf(ModBlocks.crimson_saddle_door);
            dropSelf(ModBlocks.warped_saddle_door);
            dropSelf(ModBlocks.granite_saddle_door);
            dropSelf(ModBlocks.polished_granite_saddle_door);
            dropSelf(ModBlocks.diorite_saddle_door);
            dropSelf(ModBlocks.polished_diorite_saddle_door);
            dropSelf(ModBlocks.andesite_saddle_door);
            dropSelf(ModBlocks.polished_andesite_saddle_door);
            dropSelf(ModBlocks.oak_log_saddle_door);
            dropSelf(ModBlocks.spruce_log_saddle_door);
            dropSelf(ModBlocks.birch_log_saddle_door);
            dropSelf(ModBlocks.jungle_log_saddle_door);
            dropSelf(ModBlocks.acacia_log_saddle_door);
            dropSelf(ModBlocks.dark_oak_log_saddle_door);
            dropSelf(ModBlocks.mangrove_log_saddle_door);
            dropSelf(ModBlocks.crimson_stem_saddle_door);
            dropSelf(ModBlocks.warped_stem_saddle_door);
            dropSelf(ModBlocks.blackstone_saddle_door);
            dropSelf(ModBlocks.polished_blackstone_saddle_door);
            dropSelf(ModBlocks.stone_saddle_door);
            dropSelf(ModBlocks.smooth_stone_saddle_door);
            dropSelf(ModBlocks.cobblestone_saddle_door);
            dropSelf(ModBlocks.mossy_cobblestone_saddle_door);
            dropSelf(ModBlocks.sandstone_saddle_door);
            dropSelf(ModBlocks.smooth_sandstone_saddle_door);
            dropSelf(ModBlocks.red_sandstone_saddle_door);
            dropSelf(ModBlocks.smooth_red_sandstone_saddle_door);
            dropSelf(ModBlocks.stone_brick_saddle_door);
            dropSelf(ModBlocks.cracked_stone_brick_saddle_door);
            dropSelf(ModBlocks.mossy_stone_brick_saddle_door);
            dropSelf(ModBlocks.prismarine_saddle_door);
            dropSelf(ModBlocks.prismarine_brick_saddle_door);
            dropSelf(ModBlocks.dark_prismarine_saddle_door);
            dropSelf(ModBlocks.purpur_saddle_door);
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return ModBlocks.BLOCKS.getEntries().stream().map(Supplier::get).collect(Collectors.toList());
        }
    }
}
