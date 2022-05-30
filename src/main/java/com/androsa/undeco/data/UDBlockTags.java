package com.androsa.undeco.data;

import com.androsa.ornamental.data.provider.OrnamentalBlockTagProvider;
import com.androsa.undeco.ModBlocks;
import com.androsa.undeco.UnusuallyDecorative;
import com.google.common.collect.ImmutableSet;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.*;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.function.Supplier;

public class UDBlockTags extends OrnamentalBlockTagProvider {

    public static final ImmutableSet<Supplier<? extends Block>> doors = ImmutableSet.of(
            ModBlocks.granite_door, ModBlocks.polished_granite_door, ModBlocks.diorite_door, ModBlocks.polished_diorite_door, ModBlocks.andesite_door, ModBlocks.polished_andesite_door,
            ModBlocks.oak_log_door, ModBlocks.spruce_log_door, ModBlocks.birch_log_door, ModBlocks.jungle_log_door, ModBlocks.acacia_log_door, ModBlocks.dark_oak_log_door,
            ModBlocks.crimson_stem_door, ModBlocks.warped_stem_door, ModBlocks.blackstone_door, ModBlocks.polished_blackstone_door, ModBlocks.stone_door, ModBlocks.smooth_stone_door,
            ModBlocks.cobblestone_door, ModBlocks.mossy_cobblestone_door, ModBlocks.sandstone_door, ModBlocks.smooth_sandstone_door, ModBlocks.red_sandstone_door,
            ModBlocks.smooth_red_sandstone_door, ModBlocks.stone_brick_door, ModBlocks.cracked_stone_brick_door, ModBlocks.mossy_stone_brick_door, ModBlocks.prismarine_door,
            ModBlocks.prismarine_brick_door, ModBlocks.dark_prismarine_door, ModBlocks.purpur_door);
    public static final ImmutableSet<Supplier<? extends Block>> fence_gates = ImmutableSet.of(
            ModBlocks.granite_fence_gate, ModBlocks.polished_granite_fence_gate, ModBlocks.diorite_fence_gate, ModBlocks.polished_diorite_fence_gate, ModBlocks.andesite_fence_gate,
            ModBlocks.polished_andesite_fence_gate, ModBlocks.oak_log_fence_gate, ModBlocks.spruce_log_fence_gate, ModBlocks.birch_log_fence_gate, ModBlocks.jungle_log_fence_gate,
            ModBlocks.acacia_log_fence_gate, ModBlocks.dark_oak_log_fence_gate, ModBlocks.crimson_stem_fence_gate, ModBlocks.warped_stem_fence_gate, ModBlocks.blackstone_fence_gate,
            ModBlocks.polished_blackstone_fence_gate, ModBlocks.stone_fence_gate, ModBlocks.smooth_stone_fence_gate, ModBlocks.cobblestone_fence_gate, ModBlocks.mossy_cobblestone_fence_gate,
            ModBlocks.sandstone_fence_gate, ModBlocks.smooth_sandstone_fence_gate, ModBlocks.red_sandstone_fence_gate, ModBlocks.smooth_red_sandstone_fence_gate, ModBlocks.stone_brick_fence_gate,
            ModBlocks.cracked_stone_brick_fence_gate, ModBlocks.mossy_stone_brick_fence_gate, ModBlocks.prismarine_fence_gate, ModBlocks.prismarine_brick_fence_gate, ModBlocks.dark_prismarine_fence_gate, ModBlocks.purpur_fence_gate);
    public static final ImmutableSet<Supplier<? extends Block>> fences = ImmutableSet.of(
            ModBlocks.granite_fence, ModBlocks.polished_granite_fence, ModBlocks.diorite_fence, ModBlocks.polished_diorite_fence, ModBlocks.andesite_fence,
            ModBlocks.polished_andesite_fence, ModBlocks.oak_log_fence, ModBlocks.spruce_log_fence, ModBlocks.birch_log_fence, ModBlocks.jungle_log_fence, ModBlocks.acacia_log_fence,
            ModBlocks.dark_oak_log_fence, ModBlocks.crimson_stem_fence, ModBlocks.warped_stem_fence, ModBlocks.blackstone_fence, ModBlocks.polished_blackstone_fence, ModBlocks.stone_fence,
            ModBlocks.smooth_stone_fence, ModBlocks.cobblestone_fence, ModBlocks.mossy_cobblestone_fence, ModBlocks.sandstone_fence, ModBlocks.smooth_sandstone_fence,
            ModBlocks.red_sandstone_fence,  ModBlocks.smooth_red_sandstone_fence, ModBlocks.stone_brick_fence, ModBlocks.cracked_stone_brick_fence, ModBlocks.mossy_stone_brick_fence,
            ModBlocks.prismarine_fence, ModBlocks.prismarine_brick_fence, ModBlocks.dark_prismarine_fence, ModBlocks.purpur_fence);
    public static final ImmutableSet<Supplier<? extends Block>> nonflamable = ImmutableSet.of(
            ModBlocks.warped_stem_stairs, ModBlocks.warped_stem_slab, ModBlocks.warped_stem_fence, ModBlocks.warped_stem_trapdoor, ModBlocks.warped_stem_fence_gate, ModBlocks.warped_stem_door, ModBlocks.warped_stem_pole, ModBlocks.warped_stem_beam, ModBlocks.warped_stem_wall,
            ModBlocks.crimson_stem_stairs, ModBlocks.crimson_stem_slab, ModBlocks.crimson_stem_fence, ModBlocks.crimson_stem_trapdoor, ModBlocks.crimson_stem_fence_gate, ModBlocks.crimson_stem_door, ModBlocks.crimson_stem_pole, ModBlocks.crimson_stem_beam, ModBlocks.crimson_stem_wall);
    public static final ImmutableSet<Supplier<? extends Block>> slabs = ImmutableSet.of(
            ModBlocks.oak_log_slab, ModBlocks.spruce_log_slab, ModBlocks.birch_log_slab, ModBlocks.jungle_log_slab, ModBlocks.acacia_log_slab,
            ModBlocks.dark_oak_log_slab, ModBlocks.crimson_stem_slab, ModBlocks.warped_stem_slab, ModBlocks.cracked_stone_brick_slab);
    public static final ImmutableSet<Supplier<? extends Block>> stairs = ImmutableSet.of(
            ModBlocks.oak_log_stairs, ModBlocks.spruce_log_stairs, ModBlocks.birch_log_stairs, ModBlocks.jungle_log_stairs, ModBlocks.acacia_log_stairs, ModBlocks.dark_oak_log_stairs,
            ModBlocks.crimson_stem_stairs, ModBlocks.warped_stem_stairs, ModBlocks.smooth_stone_stairs, ModBlocks.cracked_stone_brick_stairs);
    public static final ImmutableSet<Supplier<? extends Block>> wooddoor = ImmutableSet.of(
            ModBlocks.oak_log_door, ModBlocks.spruce_log_door, ModBlocks.birch_log_door, ModBlocks.jungle_log_door,
            ModBlocks.acacia_log_door, ModBlocks.dark_oak_log_door, ModBlocks.crimson_stem_door, ModBlocks.warped_stem_door);
    public static final ImmutableSet<Supplier<? extends Block>> woodfence = ImmutableSet.of(
            ModBlocks.oak_log_fence, ModBlocks.spruce_log_fence, ModBlocks.birch_log_fence, ModBlocks.jungle_log_fence,
            ModBlocks.acacia_log_fence, ModBlocks.dark_oak_log_fence, ModBlocks.crimson_stem_fence, ModBlocks.warped_stem_fence);
    public static final ImmutableSet<Supplier<? extends Block>> woodslab = ImmutableSet.of(
            ModBlocks.oak_log_slab, ModBlocks.spruce_log_slab, ModBlocks.birch_log_slab, ModBlocks.jungle_log_slab,
            ModBlocks.acacia_log_slab, ModBlocks.dark_oak_log_slab, ModBlocks.crimson_stem_slab,ModBlocks.warped_stem_slab);
    public static final ImmutableSet<Supplier<? extends Block>> woodstairs = ImmutableSet.of(
            ModBlocks.oak_log_stairs, ModBlocks.spruce_log_stairs, ModBlocks.birch_log_stairs, ModBlocks.jungle_log_stairs,
            ModBlocks.acacia_log_stairs, ModBlocks.dark_oak_log_stairs, ModBlocks.crimson_stem_stairs, ModBlocks.warped_stem_stairs);
    public static final ImmutableSet<Supplier<? extends Block>> woodtrapdoor = ImmutableSet.of(
            ModBlocks.oak_log_trapdoor, ModBlocks.spruce_log_trapdoor, ModBlocks.birch_log_trapdoor, ModBlocks.jungle_log_trapdoor,
            ModBlocks.acacia_log_trapdoor, ModBlocks.dark_oak_log_trapdoor, ModBlocks.crimson_stem_trapdoor, ModBlocks.warped_stem_trapdoor);
    public static final ImmutableSet<Supplier<? extends Block>> woodfencegate = ImmutableSet.of(
            ModBlocks.oak_log_fence_gate, ModBlocks.spruce_log_fence_gate, ModBlocks.birch_log_fence_gate, ModBlocks.jungle_log_fence_gate,
            ModBlocks.acacia_log_fence_gate, ModBlocks.dark_oak_log_fence_gate, ModBlocks.crimson_stem_fence_gate, ModBlocks.warped_stem_fence_gate);
    public static final ImmutableSet<Supplier<? extends Block>> walls = ImmutableSet.of(
			ModBlocks.oak_wall, ModBlocks.spruce_wall, ModBlocks.birch_wall, ModBlocks.jungle_wall, ModBlocks.acacia_wall, ModBlocks.dark_oak_wall, ModBlocks.crimson_wall, ModBlocks.warped_wall,
			ModBlocks.polished_granite_wall, ModBlocks.polished_diorite_wall, ModBlocks.polished_andesite_wall, ModBlocks.oak_log_wall, ModBlocks.spruce_log_wall, ModBlocks.birch_log_wall,
			ModBlocks.jungle_log_wall, ModBlocks.acacia_log_wall, ModBlocks.dark_oak_log_wall, ModBlocks.crimson_stem_wall, ModBlocks.warped_stem_wall, ModBlocks.stone_wall,
			ModBlocks.smooth_stone_wall, ModBlocks.smooth_sandstone_wall, ModBlocks.smooth_red_sandstone_wall, ModBlocks.cracked_stone_brick_wall, ModBlocks.prismarine_brick_wall,
			ModBlocks.dark_prismarine_wall, ModBlocks.purpur_wall);

    public UDBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, UnusuallyDecorative.MODID, helper);
    }

    @Override
    protected void addTags() {
        addToTag(BlockTags.DOORS, doors);
        addToTag(BlockTags.FENCE_GATES, fence_gates);
        addToTag(Tags.Blocks.FENCE_GATES, fence_gates);
        addToTag(BlockTags.FENCES, fences);
        addToTag(Tags.Blocks.FENCES, fences);
        addToTag(BlockTags.NON_FLAMMABLE_WOOD, nonflamable);
        addToTag(BlockTags.SLABS, slabs);
        addToTag(BlockTags.STAIRS, stairs);
        addToTag(BlockTags.WOODEN_DOORS, wooddoor);
        addToTag(BlockTags.WOODEN_FENCES, woodfence);
        addToTag(Tags.Blocks.FENCES_WOODEN, woodfence);
        addToTag(BlockTags.WOODEN_SLABS, woodslab);
        addToTag(BlockTags.WOODEN_STAIRS, woodstairs);
        addToTag(BlockTags.WOODEN_TRAPDOORS, woodtrapdoor);
        addToTag(Tags.Blocks.FENCE_GATES_WOODEN, woodfencegate);
        addToTag(BlockTags.WALLS, walls);
    }
}
