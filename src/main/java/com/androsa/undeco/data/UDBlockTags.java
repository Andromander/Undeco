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
            ModBlocks.blackstone_door, ModBlocks.polished_blackstone_door, ModBlocks.stone_door, ModBlocks.smooth_stone_door, ModBlocks.cobblestone_door, ModBlocks.mossy_cobblestone_door,
            ModBlocks.sandstone_door, ModBlocks.smooth_sandstone_door, ModBlocks.red_sandstone_door, ModBlocks.smooth_red_sandstone_door, ModBlocks.stone_brick_door,
            ModBlocks.cracked_stone_brick_door, ModBlocks.mossy_stone_brick_door, ModBlocks.prismarine_door, ModBlocks.prismarine_brick_door, ModBlocks.dark_prismarine_door, ModBlocks.purpur_door);
    public static final ImmutableSet<Supplier<? extends Block>> fence_gates = ImmutableSet.of(
            ModBlocks.granite_fence_gate, ModBlocks.polished_granite_fence_gate, ModBlocks.diorite_fence_gate, ModBlocks.polished_diorite_fence_gate, ModBlocks.andesite_fence_gate,
            ModBlocks.polished_andesite_fence_gate, ModBlocks.oak_log_fence_gate, ModBlocks.spruce_log_fence_gate, ModBlocks.birch_log_fence_gate, ModBlocks.jungle_log_fence_gate,
            ModBlocks.acacia_log_fence_gate, ModBlocks.dark_oak_log_fence_gate, ModBlocks.crimson_stem_fence_gate, ModBlocks.warped_stem_fence_gate, ModBlocks.blackstone_fence_gate,
            ModBlocks.polished_blackstone_fence_gate, ModBlocks.stone_fence_gate, ModBlocks.smooth_stone_fence_gate, ModBlocks.cobblestone_fence_gate, ModBlocks.mossy_cobblestone_fence_gate,
            ModBlocks.sandstone_fence_gate, ModBlocks.smooth_sandstone_fence_gate, ModBlocks.red_sandstone_fence_gate, ModBlocks.smooth_red_sandstone_fence_gate, ModBlocks.stone_brick_fence_gate,
            ModBlocks.cracked_stone_brick_fence_gate, ModBlocks.mossy_stone_brick_fence_gate, ModBlocks.prismarine_fence_gate, ModBlocks.prismarine_brick_fence_gate, ModBlocks.dark_prismarine_fence_gate, ModBlocks.purpur_fence_gate);
    public static final ImmutableSet<Supplier<? extends Block>> fences = ImmutableSet.of(
            ModBlocks.granite_fence, ModBlocks.polished_granite_fence, ModBlocks.diorite_fence, ModBlocks.polished_diorite_fence, ModBlocks.andesite_fence,
            ModBlocks.polished_andesite_fence, ModBlocks.blackstone_fence, ModBlocks.polished_blackstone_fence, ModBlocks.stone_fence, ModBlocks.smooth_stone_fence,
            ModBlocks.cobblestone_fence, ModBlocks.mossy_cobblestone_fence, ModBlocks.sandstone_fence, ModBlocks.smooth_sandstone_fence, ModBlocks.red_sandstone_fence,
            ModBlocks.smooth_red_sandstone_fence, ModBlocks.stone_brick_fence, ModBlocks.cracked_stone_brick_fence, ModBlocks.mossy_stone_brick_fence, ModBlocks.prismarine_fence,
            ModBlocks.prismarine_brick_fence, ModBlocks.dark_prismarine_fence, ModBlocks.purpur_fence);
    public static final ImmutableSet<Supplier<? extends Block>> nonflamable = ImmutableSet.of(
            ModBlocks.warped_stem_stairs, ModBlocks.warped_stem_slab, ModBlocks.warped_stem_fence, ModBlocks.warped_stem_trapdoor, ModBlocks.warped_stem_fence_gate, ModBlocks.warped_stem_door, ModBlocks.warped_stem_pole, ModBlocks.warped_stem_beam, ModBlocks.warped_stem_wall,
            ModBlocks.crimson_stem_stairs, ModBlocks.crimson_stem_slab, ModBlocks.crimson_stem_fence, ModBlocks.crimson_stem_trapdoor, ModBlocks.crimson_stem_fence_gate, ModBlocks.crimson_stem_door, ModBlocks.crimson_stem_pole, ModBlocks.crimson_stem_beam, ModBlocks.crimson_stem_wall);
    public static final ImmutableSet<Supplier<? extends Block>> slabs = ImmutableSet.of(ModBlocks.cracked_stone_brick_slab);
    public static final ImmutableSet<Supplier<? extends Block>> stairs = ImmutableSet.of(ModBlocks.smooth_stone_stairs, ModBlocks.cracked_stone_brick_stairs);
    public static final ImmutableSet<Supplier<? extends Block>> trapdoors = ImmutableSet.of(
            ModBlocks.granite_trapdoor, ModBlocks.polished_granite_trapdoor, ModBlocks.diorite_trapdoor, ModBlocks.polished_diorite_trapdoor, ModBlocks.andesite_trapdoor,
            ModBlocks.polished_andesite_trapdoor, ModBlocks.blackstone_trapdoor, ModBlocks.polished_blackstone_trapdoor,ModBlocks.stone_trapdoor, ModBlocks.smooth_stone_trapdoor,
            ModBlocks.cobblestone_trapdoor, ModBlocks.mossy_cobblestone_trapdoor, ModBlocks.sandstone_trapdoor, ModBlocks.smooth_sandstone_trapdoor,ModBlocks.red_sandstone_trapdoor,
            ModBlocks.smooth_red_sandstone_trapdoor, ModBlocks.stone_brick_trapdoor, ModBlocks.cracked_stone_brick_trapdoor, ModBlocks.mossy_stone_brick_trapdoor,
            ModBlocks.prismarine_trapdoor, ModBlocks.prismarine_brick_trapdoor, ModBlocks.dark_prismarine_trapdoor, ModBlocks.purpur_trapdoor);
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

    public static final ImmutableSet<Supplier<? extends Block>> axetool = ImmutableSet.of(
            ModBlocks.oak_pole, ModBlocks.oak_beam, ModBlocks.oak_wall, ModBlocks.oak_saddle_door,
            ModBlocks.spruce_pole, ModBlocks.spruce_beam, ModBlocks.spruce_wall, ModBlocks.spruce_saddle_door,
            ModBlocks.birch_pole, ModBlocks.birch_beam, ModBlocks.birch_wall, ModBlocks.birch_saddle_door,
            ModBlocks.jungle_pole, ModBlocks.jungle_beam, ModBlocks.jungle_wall, ModBlocks.jungle_saddle_door,
            ModBlocks.acacia_pole, ModBlocks.acacia_beam, ModBlocks.acacia_wall, ModBlocks.acacia_saddle_door,
            ModBlocks.dark_oak_pole, ModBlocks.dark_oak_beam, ModBlocks.dark_oak_wall, ModBlocks.dark_oak_saddle_door,
            ModBlocks.crimson_pole, ModBlocks.crimson_beam, ModBlocks.crimson_wall, ModBlocks.crimson_saddle_door,
            ModBlocks.warped_pole, ModBlocks.warped_beam, ModBlocks.warped_wall, ModBlocks.warped_saddle_door,
            ModBlocks.oak_log_stairs, ModBlocks.oak_log_slab, ModBlocks.oak_log_fence, ModBlocks.oak_log_trapdoor, ModBlocks.oak_log_fence_gate, ModBlocks.oak_log_door, ModBlocks.oak_log_pole, ModBlocks.oak_log_beam, ModBlocks.oak_log_wall, ModBlocks.oak_log_saddle_door,
            ModBlocks.spruce_log_stairs, ModBlocks.spruce_log_slab, ModBlocks.spruce_log_fence, ModBlocks.spruce_log_trapdoor, ModBlocks.spruce_log_fence_gate, ModBlocks.spruce_log_door, ModBlocks.spruce_log_pole, ModBlocks.spruce_log_beam, ModBlocks.spruce_log_wall, ModBlocks.spruce_log_saddle_door,
            ModBlocks.birch_log_stairs, ModBlocks.birch_log_slab, ModBlocks.birch_log_fence, ModBlocks.birch_log_trapdoor, ModBlocks.birch_log_fence_gate, ModBlocks.birch_log_door, ModBlocks.birch_log_pole, ModBlocks.birch_log_beam, ModBlocks.birch_log_wall, ModBlocks.birch_log_saddle_door,
            ModBlocks.jungle_log_stairs, ModBlocks.jungle_log_slab, ModBlocks.jungle_log_fence, ModBlocks.jungle_log_trapdoor, ModBlocks.jungle_log_fence_gate, ModBlocks.jungle_log_door, ModBlocks.jungle_log_pole, ModBlocks.jungle_log_beam, ModBlocks.jungle_log_wall, ModBlocks.jungle_log_saddle_door,
            ModBlocks.acacia_log_stairs, ModBlocks.acacia_log_slab, ModBlocks.acacia_log_fence, ModBlocks.acacia_log_trapdoor, ModBlocks.acacia_log_fence_gate, ModBlocks.acacia_log_door, ModBlocks.acacia_log_pole, ModBlocks.acacia_log_beam, ModBlocks.acacia_log_wall, ModBlocks.acacia_log_saddle_door,
            ModBlocks.dark_oak_log_stairs, ModBlocks.dark_oak_log_slab, ModBlocks.dark_oak_log_fence, ModBlocks.dark_oak_log_trapdoor, ModBlocks.dark_oak_log_fence_gate, ModBlocks.dark_oak_log_door, ModBlocks.dark_oak_log_pole, ModBlocks.dark_oak_log_beam, ModBlocks.dark_oak_log_wall, ModBlocks.dark_oak_log_saddle_door,
            ModBlocks.crimson_stem_stairs, ModBlocks.crimson_stem_slab, ModBlocks.crimson_stem_fence, ModBlocks.crimson_stem_trapdoor, ModBlocks.crimson_stem_fence_gate, ModBlocks.crimson_stem_door, ModBlocks.crimson_stem_pole, ModBlocks.crimson_stem_beam, ModBlocks.crimson_stem_wall, ModBlocks.crimson_stem_saddle_door,
            ModBlocks.warped_stem_stairs, ModBlocks.warped_stem_slab, ModBlocks.warped_stem_fence, ModBlocks.warped_stem_trapdoor, ModBlocks.warped_stem_fence_gate, ModBlocks.warped_stem_door, ModBlocks.warped_stem_pole, ModBlocks.warped_stem_beam, ModBlocks.warped_stem_wall, ModBlocks.warped_stem_saddle_door);
    public static final ImmutableSet<Supplier<? extends Block>> pickaxetool = ImmutableSet.of(
            ModBlocks.granite_fence, ModBlocks.granite_trapdoor, ModBlocks.granite_fence_gate, ModBlocks.granite_door, ModBlocks.granite_pole, ModBlocks.granite_beam, ModBlocks.granite_saddle_door,
            ModBlocks.polished_granite_fence, ModBlocks.polished_granite_trapdoor, ModBlocks.polished_granite_fence_gate, ModBlocks.polished_granite_door, ModBlocks.polished_granite_pole, ModBlocks.polished_granite_beam, ModBlocks.polished_granite_wall, ModBlocks.polished_granite_saddle_door,
            ModBlocks.diorite_fence, ModBlocks.diorite_trapdoor, ModBlocks.diorite_fence_gate, ModBlocks.diorite_door, ModBlocks.diorite_pole, ModBlocks.diorite_beam, ModBlocks.diorite_saddle_door,
            ModBlocks.polished_diorite_fence, ModBlocks.polished_diorite_trapdoor, ModBlocks.polished_diorite_fence_gate, ModBlocks.polished_diorite_door, ModBlocks.polished_diorite_pole, ModBlocks.polished_diorite_beam, ModBlocks.polished_diorite_wall, ModBlocks.polished_diorite_saddle_door,
            ModBlocks.andesite_fence, ModBlocks.andesite_trapdoor, ModBlocks.andesite_fence_gate, ModBlocks.andesite_door, ModBlocks.andesite_pole, ModBlocks.andesite_beam, ModBlocks.andesite_saddle_door,
            ModBlocks.polished_andesite_fence, ModBlocks.polished_andesite_trapdoor, ModBlocks.polished_andesite_fence_gate, ModBlocks.polished_andesite_door, ModBlocks.polished_andesite_pole, ModBlocks.polished_andesite_beam, ModBlocks.polished_andesite_wall, ModBlocks.polished_andesite_saddle_door,
            ModBlocks.blackstone_fence, ModBlocks.blackstone_trapdoor, ModBlocks.blackstone_fence_gate, ModBlocks.blackstone_door, ModBlocks.blackstone_pole, ModBlocks.blackstone_beam, ModBlocks.blackstone_saddle_door,
            ModBlocks.polished_blackstone_fence, ModBlocks.polished_blackstone_trapdoor, ModBlocks.polished_blackstone_fence_gate, ModBlocks.polished_blackstone_door, ModBlocks.polished_blackstone_pole, ModBlocks.polished_blackstone_beam, ModBlocks.polished_blackstone_saddle_door,
            ModBlocks.stone_fence, ModBlocks.stone_trapdoor, ModBlocks.stone_fence_gate, ModBlocks.stone_door, ModBlocks.stone_pole, ModBlocks.stone_beam, ModBlocks.stone_wall, ModBlocks.stone_saddle_door,
            ModBlocks.smooth_stone_stairs, ModBlocks.smooth_stone_fence, ModBlocks.smooth_stone_trapdoor, ModBlocks.smooth_stone_fence_gate, ModBlocks.smooth_stone_door, ModBlocks.smooth_stone_pole, ModBlocks.smooth_stone_beam, ModBlocks.smooth_stone_wall, ModBlocks.smooth_stone_saddle_door,
            ModBlocks.cobblestone_fence, ModBlocks.cobblestone_trapdoor, ModBlocks.cobblestone_fence_gate, ModBlocks.cobblestone_door, ModBlocks.cobblestone_pole, ModBlocks.cobblestone_beam, ModBlocks.cobblestone_saddle_door,
            ModBlocks.mossy_cobblestone_fence, ModBlocks.mossy_cobblestone_trapdoor, ModBlocks.mossy_cobblestone_fence_gate, ModBlocks.mossy_cobblestone_door, ModBlocks.mossy_cobblestone_pole, ModBlocks.mossy_cobblestone_beam, ModBlocks.mossy_cobblestone_saddle_door,
            ModBlocks.sandstone_fence, ModBlocks.sandstone_trapdoor, ModBlocks.sandstone_fence_gate, ModBlocks.sandstone_door, ModBlocks.sandstone_pole, ModBlocks.sandstone_beam, ModBlocks.sandstone_saddle_door,
            ModBlocks.smooth_sandstone_fence, ModBlocks.smooth_sandstone_trapdoor, ModBlocks.smooth_sandstone_fence_gate, ModBlocks.smooth_sandstone_door, ModBlocks.smooth_sandstone_pole, ModBlocks.smooth_sandstone_beam, ModBlocks.smooth_sandstone_wall, ModBlocks.smooth_sandstone_saddle_door,
            ModBlocks.red_sandstone_fence, ModBlocks.red_sandstone_trapdoor, ModBlocks.red_sandstone_fence_gate, ModBlocks.red_sandstone_door, ModBlocks.red_sandstone_pole, ModBlocks.red_sandstone_beam, ModBlocks.red_sandstone_saddle_door,
            ModBlocks.smooth_red_sandstone_fence, ModBlocks.smooth_red_sandstone_trapdoor, ModBlocks.smooth_red_sandstone_fence_gate, ModBlocks.smooth_red_sandstone_door, ModBlocks.smooth_red_sandstone_pole, ModBlocks.smooth_red_sandstone_beam, ModBlocks.smooth_red_sandstone_wall, ModBlocks.smooth_red_sandstone_saddle_door,
            ModBlocks.stone_brick_fence, ModBlocks.stone_brick_trapdoor, ModBlocks.stone_brick_fence_gate, ModBlocks.stone_brick_door, ModBlocks.stone_brick_pole, ModBlocks.stone_brick_beam, ModBlocks.stone_brick_saddle_door,
            ModBlocks.cracked_stone_brick_stairs, ModBlocks.cracked_stone_brick_slab, ModBlocks.cracked_stone_brick_fence, ModBlocks.cracked_stone_brick_trapdoor, ModBlocks.cracked_stone_brick_fence_gate, ModBlocks.cracked_stone_brick_door, ModBlocks.cracked_stone_brick_pole, ModBlocks.cracked_stone_brick_beam, ModBlocks.cracked_stone_brick_wall, ModBlocks.cracked_stone_brick_saddle_door,
            ModBlocks.mossy_stone_brick_fence, ModBlocks.mossy_stone_brick_trapdoor, ModBlocks.mossy_stone_brick_fence_gate, ModBlocks.mossy_stone_brick_door, ModBlocks.mossy_stone_brick_pole, ModBlocks.mossy_stone_brick_beam, ModBlocks.mossy_stone_brick_saddle_door,
            ModBlocks.prismarine_fence, ModBlocks.prismarine_trapdoor, ModBlocks.prismarine_fence_gate, ModBlocks.prismarine_door, ModBlocks.prismarine_pole, ModBlocks.prismarine_beam, ModBlocks.prismarine_saddle_door,
            ModBlocks.prismarine_brick_fence, ModBlocks.prismarine_brick_trapdoor, ModBlocks.prismarine_brick_fence_gate, ModBlocks.prismarine_brick_door, ModBlocks.prismarine_brick_pole, ModBlocks.prismarine_brick_beam, ModBlocks.prismarine_brick_wall, ModBlocks.prismarine_brick_saddle_door,
            ModBlocks.dark_prismarine_fence, ModBlocks.dark_prismarine_trapdoor, ModBlocks.dark_prismarine_fence_gate, ModBlocks.dark_prismarine_door, ModBlocks.dark_prismarine_pole, ModBlocks.dark_prismarine_beam, ModBlocks.dark_prismarine_wall, ModBlocks.dark_prismarine_saddle_door,
            ModBlocks.purpur_fence, ModBlocks.purpur_trapdoor, ModBlocks.purpur_fence_gate, ModBlocks.purpur_door, ModBlocks.purpur_pole, ModBlocks.purpur_beam, ModBlocks.purpur_wall, ModBlocks.purpur_saddle_door);

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
        addToTag(BlockTags.TRAPDOORS, trapdoors);
        addToTag(BlockTags.WOODEN_DOORS, wooddoor);
        addToTag(BlockTags.WOODEN_FENCES, woodfence);
        addToTag(Tags.Blocks.FENCES_WOODEN, woodfence);
        addToTag(BlockTags.WOODEN_SLABS, woodslab);
        addToTag(BlockTags.WOODEN_STAIRS, woodstairs);
        addToTag(BlockTags.WOODEN_TRAPDOORS, woodtrapdoor);
        addToTag(Tags.Blocks.FENCE_GATES_WOODEN, woodfencegate);
        addToTag(BlockTags.WALLS, walls);

        addToTag(BlockTags.MINEABLE_WITH_AXE, axetool);
        addToTag(BlockTags.MINEABLE_WITH_PICKAXE, pickaxetool);
    }
}
