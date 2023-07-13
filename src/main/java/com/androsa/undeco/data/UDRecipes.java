package com.androsa.undeco.data;

import com.androsa.ornamental.data.provider.OrnamentalRecipeProvider;
import com.androsa.undeco.ModBlocks;
import com.androsa.undeco.UnusuallyDecorative;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

public class UDRecipes extends OrnamentalRecipeProvider {

    public UDRecipes(PackOutput output) {
        super(output, UnusuallyDecorative.MODID);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        stairs(consumer, ModBlocks.oak_log_stairs, Blocks.OAK_LOG);
        stairs(consumer, ModBlocks.spruce_log_stairs, Blocks.SPRUCE_LOG);
        stairs(consumer, ModBlocks.birch_log_stairs, Blocks.BIRCH_LOG);
        stairs(consumer, ModBlocks.jungle_log_stairs, Blocks.JUNGLE_LOG);
        stairs(consumer, ModBlocks.acacia_log_stairs, Blocks.ACACIA_LOG);
        stairs(consumer, ModBlocks.cherry_log_stairs, Blocks.CHERRY_LOG);
        stairs(consumer, ModBlocks.dark_oak_log_stairs, Blocks.DARK_OAK_LOG);
        stairs(consumer, ModBlocks.mangrove_log_stairs, Blocks.MANGROVE_LOG);
        stairs(consumer, ModBlocks.bamboo_block_stairs, Blocks.BAMBOO_BLOCK);
        stairs(consumer, ModBlocks.crimson_stem_stairs, Blocks.CRIMSON_STEM);
        stairs(consumer, ModBlocks.warped_stem_stairs, Blocks.WARPED_STEM);
        stairs(consumer, ModBlocks.smooth_stone_stairs, Blocks.SMOOTH_STONE);
        stairs(consumer, ModBlocks.cracked_stone_brick_stairs, Blocks.CRACKED_STONE_BRICKS);
        stairs(consumer, ModBlocks.tuff_stairs, Blocks.TUFF);

        slab(consumer, ModBlocks.oak_log_slab, Blocks.OAK_LOG);
        slab(consumer, ModBlocks.spruce_log_slab, Blocks.SPRUCE_LOG);
        slab(consumer, ModBlocks.birch_log_slab, Blocks.BIRCH_LOG);
        slab(consumer, ModBlocks.jungle_log_slab, Blocks.JUNGLE_LOG);
        slab(consumer, ModBlocks.acacia_log_slab, Blocks.ACACIA_LOG);
        slab(consumer, ModBlocks.cherry_log_slab, Blocks.CHERRY_LOG);
        slab(consumer, ModBlocks.dark_oak_log_slab, Blocks.DARK_OAK_LOG);
        slab(consumer, ModBlocks.mangrove_log_slab, Blocks.MANGROVE_LOG);
        slab(consumer, ModBlocks.bamboo_block_slab, Blocks.BAMBOO_BLOCK);
        slab(consumer, ModBlocks.crimson_stem_slab, Blocks.CRIMSON_STEM);
        slab(consumer, ModBlocks.warped_stem_slab, Blocks.WARPED_STEM);
        slab(consumer, ModBlocks.cracked_stone_brick_slab, Blocks.CRACKED_STONE_BRICKS);
        slab(consumer, ModBlocks.tuff_slab, Blocks.TUFF);

        fence(consumer, ModBlocks.granite_fence, Blocks.GRANITE, Blocks.GRANITE_SLAB);
        fence(consumer, ModBlocks.polished_granite_fence, Blocks.POLISHED_GRANITE, Blocks.POLISHED_GRANITE_SLAB);
        fence(consumer, ModBlocks.diorite_fence, Blocks.DIORITE, Blocks.DIORITE_SLAB);
        fence(consumer, ModBlocks.polished_diorite_fence, Blocks.POLISHED_DIORITE, Blocks.POLISHED_DIORITE_SLAB);
        fence(consumer, ModBlocks.andesite_fence, Blocks.ANDESITE, Blocks.ANDESITE_SLAB);
        fence(consumer, ModBlocks.polished_andesite_fence, Blocks.POLISHED_ANDESITE, Blocks.POLISHED_ANDESITE_SLAB);
        fence(consumer, ModBlocks.oak_log_fence, Blocks.OAK_LOG, Items.STICK);
        fence(consumer, ModBlocks.spruce_log_fence, Blocks.SPRUCE_LOG, Items.STICK);
        fence(consumer, ModBlocks.birch_log_fence, Blocks.BIRCH_LOG, Items.STICK);
        fence(consumer, ModBlocks.jungle_log_fence, Blocks.JUNGLE_LOG, Items.STICK);
        fence(consumer, ModBlocks.acacia_log_fence, Blocks.ACACIA_LOG, Items.STICK);
        fence(consumer, ModBlocks.cherry_log_fence, Blocks.CHERRY_LOG, Items.STICK);
        fence(consumer, ModBlocks.dark_oak_log_fence, Blocks.DARK_OAK_LOG, Items.STICK);
        fence(consumer, ModBlocks.mangrove_log_fence, Blocks.MANGROVE_LOG, Items.STICK);
        fence(consumer, ModBlocks.bamboo_block_fence, Blocks.BAMBOO_BLOCK, Blocks.BAMBOO);
        fence(consumer, ModBlocks.crimson_stem_fence, Blocks.CRIMSON_STEM, Items.STICK);
        fence(consumer, ModBlocks.warped_stem_fence, Blocks.WARPED_STEM, Items.STICK);
        fence(consumer, ModBlocks.blackstone_fence, Blocks.BLACKSTONE, Blocks.BLACKSTONE_SLAB);
        fence(consumer, ModBlocks.polished_blackstone_fence, Blocks.POLISHED_BLACKSTONE, Blocks.POLISHED_BLACKSTONE_SLAB);
        fence(consumer, ModBlocks.stone_fence, Blocks.STONE, Blocks.STONE_SLAB);
        fence(consumer, ModBlocks.smooth_stone_fence, Blocks.SMOOTH_STONE, Blocks.SMOOTH_STONE_SLAB);
        fence(consumer, ModBlocks.cobblestone_fence, Blocks.COBBLESTONE, Blocks.COBBLESTONE_SLAB);
        fence(consumer, ModBlocks.mossy_cobblestone_fence, Blocks.MOSSY_COBBLESTONE, Blocks.MOSSY_COBBLESTONE_SLAB);
        fence(consumer, ModBlocks.sandstone_fence, Blocks.SANDSTONE, Blocks.SANDSTONE_SLAB);
        fence(consumer, ModBlocks.smooth_sandstone_fence, Blocks.SMOOTH_SANDSTONE, Blocks.SMOOTH_SANDSTONE_SLAB);
        fence(consumer, ModBlocks.red_sandstone_fence, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE_SLAB);
        fence(consumer, ModBlocks.smooth_red_sandstone_fence, Blocks.SMOOTH_RED_SANDSTONE, Blocks.SMOOTH_RED_SANDSTONE_SLAB);
        fence(consumer, ModBlocks.stone_brick_fence, Blocks.STONE_BRICKS, Blocks.STONE_BRICK_SLAB);
        fence(consumer, ModBlocks.cracked_stone_brick_fence, Blocks.CRACKED_STONE_BRICKS, ModBlocks.cracked_stone_brick_slab);
        fence(consumer, ModBlocks.mossy_stone_brick_fence, Blocks.MOSSY_STONE_BRICKS, Blocks.MOSSY_STONE_BRICK_SLAB);
        fence(consumer, ModBlocks.prismarine_fence, Blocks.PRISMARINE, Items.PRISMARINE_SHARD);
        fence(consumer, ModBlocks.prismarine_brick_fence, Blocks.PRISMARINE_BRICKS, Items.PRISMARINE_SHARD);
        fence(consumer, ModBlocks.dark_prismarine_fence, Blocks.DARK_PRISMARINE, Items.PRISMARINE_SHARD);
        fence(consumer, ModBlocks.purpur_fence, Blocks.PURPUR_BLOCK, Blocks.PURPUR_SLAB);
        fence(consumer, ModBlocks.tuff_fence, Blocks.TUFF, ModBlocks.tuff_slab);

        trapdoorWide(consumer, ModBlocks.granite_trapdoor, Blocks.GRANITE_SLAB);
        trapdoorWide(consumer, ModBlocks.polished_granite_trapdoor, Blocks.POLISHED_GRANITE_SLAB);
        trapdoorWide(consumer, ModBlocks.diorite_trapdoor, Blocks.DIORITE_SLAB);
        trapdoorWide(consumer, ModBlocks.polished_diorite_trapdoor, Blocks.POLISHED_DIORITE_SLAB);
        trapdoorWide(consumer, ModBlocks.andesite_trapdoor, Blocks.ANDESITE_SLAB);
        trapdoorWide(consumer, ModBlocks.polished_andesite_trapdoor, Blocks.POLISHED_ANDESITE_SLAB);
        trapdoorWide(consumer, ModBlocks.oak_log_trapdoor, ModBlocks.oak_log_slab);
        trapdoorWide(consumer, ModBlocks.spruce_log_trapdoor, ModBlocks.spruce_log_slab);
        trapdoorWide(consumer, ModBlocks.birch_log_trapdoor, ModBlocks.birch_log_slab);
        trapdoorWide(consumer, ModBlocks.jungle_log_trapdoor, ModBlocks.jungle_log_slab);
        trapdoorWide(consumer, ModBlocks.acacia_log_trapdoor, ModBlocks.acacia_log_slab);
        trapdoorWide(consumer, ModBlocks.cherry_log_trapdoor, ModBlocks.cherry_log_slab);
        trapdoorWide(consumer, ModBlocks.dark_oak_log_trapdoor, ModBlocks.dark_oak_log_slab);
        trapdoorWide(consumer, ModBlocks.mangrove_log_trapdoor, ModBlocks.mangrove_log_slab);
        trapdoorWide(consumer, ModBlocks.bamboo_block_trapdoor, ModBlocks.bamboo_block_slab);
        trapdoorWide(consumer, ModBlocks.crimson_stem_trapdoor, ModBlocks.crimson_stem_slab);
        trapdoorWide(consumer, ModBlocks.warped_stem_trapdoor, ModBlocks.warped_stem_slab);
        trapdoorWide(consumer, ModBlocks.blackstone_trapdoor, Blocks.BLACKSTONE_SLAB);
        trapdoorWide(consumer, ModBlocks.polished_blackstone_trapdoor, Blocks.POLISHED_BLACKSTONE_SLAB);
        trapdoorWide(consumer, ModBlocks.stone_trapdoor, Blocks.STONE_SLAB);
        trapdoorWide(consumer, ModBlocks.smooth_stone_trapdoor, Blocks.SMOOTH_STONE_SLAB);
        trapdoorWide(consumer, ModBlocks.cobblestone_trapdoor, Blocks.COBBLESTONE_SLAB);
        trapdoorWide(consumer, ModBlocks.mossy_cobblestone_trapdoor, Blocks.MOSSY_COBBLESTONE_SLAB);
        trapdoorWide(consumer, ModBlocks.sandstone_trapdoor, Blocks.SANDSTONE_SLAB);
        trapdoorWide(consumer, ModBlocks.smooth_sandstone_trapdoor, Blocks.SMOOTH_SANDSTONE_SLAB);
        trapdoorWide(consumer, ModBlocks.red_sandstone_trapdoor, Blocks.RED_SANDSTONE_SLAB);
        trapdoorWide(consumer, ModBlocks.smooth_red_sandstone_trapdoor, Blocks.SMOOTH_RED_SANDSTONE_SLAB);
        trapdoorWide(consumer, ModBlocks.stone_brick_trapdoor, Blocks.STONE_BRICK_SLAB);
        trapdoorWide(consumer, ModBlocks.cracked_stone_brick_trapdoor, ModBlocks.cracked_stone_brick_slab);
        trapdoorWide(consumer, ModBlocks.mossy_stone_brick_trapdoor, Blocks.MOSSY_STONE_BRICK_SLAB);
        trapdoorWide(consumer, ModBlocks.prismarine_trapdoor, Items.PRISMARINE_SHARD);
        trapdoorWide(consumer, ModBlocks.prismarine_brick_trapdoor, Blocks.PRISMARINE_BRICK_SLAB);
        trapdoorWide(consumer, ModBlocks.dark_prismarine_trapdoor, Blocks.DARK_PRISMARINE_SLAB);
        trapdoorWide(consumer, ModBlocks.purpur_trapdoor, Blocks.PURPUR_SLAB);
        trapdoorWide(consumer, ModBlocks.tuff_trapdoor, ModBlocks.tuff_slab);

        fencegate(consumer, ModBlocks.granite_fence_gate, Blocks.GRANITE, Blocks.GRANITE_SLAB);
        fencegate(consumer, ModBlocks.polished_granite_fence_gate, Blocks.POLISHED_GRANITE, Blocks.POLISHED_GRANITE_SLAB);
        fencegate(consumer, ModBlocks.diorite_fence_gate, Blocks.DIORITE, Blocks.DIORITE_SLAB);
        fencegate(consumer, ModBlocks.polished_diorite_fence_gate, Blocks.POLISHED_DIORITE, Blocks.POLISHED_DIORITE_SLAB);
        fencegate(consumer, ModBlocks.andesite_fence_gate, Blocks.ANDESITE, Blocks.ANDESITE_SLAB);
        fencegate(consumer, ModBlocks.polished_andesite_fence_gate, Blocks.POLISHED_ANDESITE, Blocks.POLISHED_ANDESITE_SLAB);
        fencegate(consumer, ModBlocks.oak_log_fence_gate, Blocks.OAK_LOG, Items.STICK);
        fencegate(consumer, ModBlocks.spruce_log_fence_gate, Blocks.SPRUCE_LOG, Items.STICK);
        fencegate(consumer, ModBlocks.birch_log_fence_gate, Blocks.BIRCH_LOG, Items.STICK);
        fencegate(consumer, ModBlocks.jungle_log_fence_gate, Blocks.JUNGLE_LOG, Items.STICK);
        fencegate(consumer, ModBlocks.acacia_log_fence_gate, Blocks.ACACIA_LOG, Items.STICK);
        fencegate(consumer, ModBlocks.cherry_log_fence_gate, Blocks.CHERRY_LOG, Items.STICK);
        fencegate(consumer, ModBlocks.dark_oak_log_fence_gate, Blocks.DARK_OAK_LOG, Items.STICK);
        fencegate(consumer, ModBlocks.mangrove_log_fence_gate, Blocks.MANGROVE_LOG, Items.STICK);
        fencegate(consumer, ModBlocks.bamboo_block_fence_gate, Blocks.BAMBOO_BLOCK, Blocks.BAMBOO);
        fencegate(consumer, ModBlocks.crimson_stem_fence_gate, Blocks.CRIMSON_STEM, Items.STICK);
        fencegate(consumer, ModBlocks.warped_stem_fence_gate, Blocks.WARPED_STEM, Items.STICK);
        fencegate(consumer, ModBlocks.blackstone_fence_gate, Blocks.BLACKSTONE, Blocks.BLACKSTONE_SLAB);
        fencegate(consumer, ModBlocks.polished_blackstone_fence_gate, Blocks.POLISHED_BLACKSTONE, Blocks.POLISHED_BLACKSTONE_SLAB);
        fencegate(consumer, ModBlocks.stone_fence_gate, Blocks.STONE, Blocks.STONE_SLAB);
        fencegate(consumer, ModBlocks.smooth_stone_fence_gate, Blocks.SMOOTH_STONE, Blocks.SMOOTH_STONE_SLAB);
        fencegate(consumer, ModBlocks.cobblestone_fence_gate, Blocks.COBBLESTONE, Blocks.COBBLESTONE_SLAB);
        fencegate(consumer, ModBlocks.mossy_cobblestone_fence_gate, Blocks.MOSSY_COBBLESTONE, Blocks.MOSSY_COBBLESTONE_SLAB);
        fencegate(consumer, ModBlocks.sandstone_fence_gate, Blocks.SANDSTONE, Blocks.SANDSTONE_SLAB);
        fencegate(consumer, ModBlocks.smooth_sandstone_fence_gate, Blocks.SMOOTH_SANDSTONE, Blocks.SMOOTH_SANDSTONE_SLAB);
        fencegate(consumer, ModBlocks.red_sandstone_fence_gate, Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE_SLAB);
        fencegate(consumer, ModBlocks.smooth_red_sandstone_fence_gate, Blocks.SMOOTH_RED_SANDSTONE, Blocks.SMOOTH_RED_SANDSTONE_SLAB);
        fencegate(consumer, ModBlocks.stone_brick_fence_gate, Blocks.STONE_BRICKS, Blocks.STONE_BRICK_SLAB);
        fencegate(consumer, ModBlocks.cracked_stone_brick_fence_gate, Blocks.CRACKED_STONE_BRICKS, ModBlocks.cracked_stone_brick_slab);
        fencegate(consumer, ModBlocks.mossy_stone_brick_fence_gate, Blocks.MOSSY_STONE_BRICKS, Blocks.MOSSY_STONE_BRICK_SLAB);
        fencegate(consumer, ModBlocks.prismarine_fence_gate, Blocks.PRISMARINE, Items.PRISMARINE_SHARD);
        fencegate(consumer, ModBlocks.prismarine_brick_fence_gate, Blocks.PRISMARINE_BRICKS, Items.PRISMARINE_SHARD);
        fencegate(consumer, ModBlocks.dark_prismarine_fence_gate, Blocks.DARK_PRISMARINE, Items.PRISMARINE_SHARD);
        fencegate(consumer, ModBlocks.purpur_fence_gate, Blocks.PURPUR_BLOCK, Blocks.PURPUR_SLAB);
        fencegate(consumer, ModBlocks.tuff_fence_gate, Blocks.TUFF, ModBlocks.tuff_slab);

        door(consumer, ModBlocks.granite_door, Blocks.GRANITE_SLAB);
        door(consumer, ModBlocks.polished_granite_door, Blocks.POLISHED_GRANITE_SLAB);
        door(consumer, ModBlocks.diorite_door, Blocks.DIORITE_SLAB);
        door(consumer, ModBlocks.polished_diorite_door, Blocks.POLISHED_DIORITE_SLAB);
        door(consumer, ModBlocks.andesite_door, Blocks.ANDESITE_SLAB);
        door(consumer, ModBlocks.polished_andesite_door, Blocks.POLISHED_ANDESITE_SLAB);
        door(consumer, ModBlocks.oak_log_door, Blocks.OAK_LOG);
        door(consumer, ModBlocks.spruce_log_door, Blocks.SPRUCE_LOG);
        door(consumer, ModBlocks.birch_log_door, Blocks.BIRCH_LOG);
        door(consumer, ModBlocks.jungle_log_door, Blocks.JUNGLE_LOG);
        door(consumer, ModBlocks.acacia_log_door, Blocks.ACACIA_LOG);
        door(consumer, ModBlocks.cherry_log_door, Blocks.CHERRY_LOG);
        door(consumer, ModBlocks.dark_oak_log_door, Blocks.DARK_OAK_LOG);
        door(consumer, ModBlocks.mangrove_log_door, Blocks.MANGROVE_LOG);
        door(consumer, ModBlocks.bamboo_block_door, Blocks.BAMBOO_BLOCK);
        door(consumer, ModBlocks.crimson_stem_door, Blocks.CRIMSON_STEM);
        door(consumer, ModBlocks.warped_stem_door, Blocks.WARPED_STEM);
        door(consumer, ModBlocks.blackstone_door, Blocks.BLACKSTONE_SLAB);
        door(consumer, ModBlocks.polished_blackstone_door, Blocks.POLISHED_BLACKSTONE_SLAB);
        door(consumer, ModBlocks.stone_door, Blocks.STONE_SLAB);
        door(consumer, ModBlocks.smooth_stone_door, Blocks.SMOOTH_STONE_SLAB);
        door(consumer, ModBlocks.cobblestone_door, Blocks.COBBLESTONE_SLAB);
        door(consumer, ModBlocks.mossy_cobblestone_door, Blocks.MOSSY_COBBLESTONE_SLAB);
        door(consumer, ModBlocks.sandstone_door, Blocks.SANDSTONE_SLAB);
        door(consumer, ModBlocks.smooth_sandstone_door, Blocks.SMOOTH_SANDSTONE_SLAB);
        door(consumer, ModBlocks.red_sandstone_door, Blocks.RED_SANDSTONE_SLAB);
        door(consumer, ModBlocks.smooth_red_sandstone_door, Blocks.SMOOTH_RED_SANDSTONE_SLAB);
        door(consumer, ModBlocks.stone_brick_door, Blocks.STONE_BRICK_SLAB);
        door(consumer, ModBlocks.cracked_stone_brick_door, ModBlocks.cracked_stone_brick_slab);
        door(consumer, ModBlocks.mossy_stone_brick_door, Blocks.MOSSY_STONE_BRICK_SLAB);
        door(consumer, ModBlocks.prismarine_door, Items.PRISMARINE_SHARD);
        door(consumer, ModBlocks.prismarine_brick_door, Blocks.PRISMARINE_BRICK_SLAB);
        door(consumer, ModBlocks.dark_prismarine_door, Blocks.DARK_PRISMARINE_SLAB);
        door(consumer, ModBlocks.purpur_door, Blocks.PURPUR_SLAB);
        door(consumer, ModBlocks.tuff_door, ModBlocks.tuff_slab);

        pole(consumer, ModBlocks.oak_pole, Blocks.OAK_SLAB);
        pole(consumer, ModBlocks.spruce_pole, Blocks.SPRUCE_SLAB);
        pole(consumer, ModBlocks.birch_pole, Blocks.BIRCH_SLAB);
        pole(consumer, ModBlocks.jungle_pole, Blocks.JUNGLE_SLAB);
        pole(consumer, ModBlocks.acacia_pole, Blocks.ACACIA_SLAB);
        pole(consumer, ModBlocks.cherry_pole, Blocks.CHERRY_SLAB);
        pole(consumer, ModBlocks.dark_oak_pole, Blocks.DARK_OAK_SLAB);
        pole(consumer, ModBlocks.mangrove_pole, Blocks.MANGROVE_SLAB);
        pole(consumer, ModBlocks.bamboo_pole, Blocks.BAMBOO_SLAB);
        pole(consumer, ModBlocks.crimson_pole, Blocks.CRIMSON_SLAB);
        pole(consumer, ModBlocks.warped_pole, Blocks.WARPED_SLAB);
        pole(consumer, ModBlocks.granite_pole, Blocks.GRANITE_SLAB);
        pole(consumer, ModBlocks.polished_granite_pole, Blocks.POLISHED_GRANITE_SLAB);
        pole(consumer, ModBlocks.diorite_pole, Blocks.DIORITE_SLAB);
        pole(consumer, ModBlocks.polished_diorite_pole, Blocks.POLISHED_DIORITE_SLAB);
        pole(consumer, ModBlocks.andesite_pole, Blocks.ANDESITE_SLAB);
        pole(consumer, ModBlocks.polished_andesite_pole, Blocks.POLISHED_ANDESITE_SLAB);
        pole(consumer, ModBlocks.oak_log_pole, ModBlocks.oak_log_slab);
        pole(consumer, ModBlocks.spruce_log_pole, ModBlocks.spruce_log_slab);
        pole(consumer, ModBlocks.birch_log_pole, ModBlocks.birch_log_slab);
        pole(consumer, ModBlocks.jungle_log_pole, ModBlocks.jungle_log_slab);
        pole(consumer, ModBlocks.acacia_log_pole, ModBlocks.acacia_log_slab);
        pole(consumer, ModBlocks.cherry_log_pole, ModBlocks.cherry_log_slab);
        pole(consumer, ModBlocks.dark_oak_log_pole, ModBlocks.dark_oak_log_slab);
        pole(consumer, ModBlocks.mangrove_log_pole, ModBlocks.mangrove_log_slab);
        pole(consumer, ModBlocks.bamboo_block_pole, ModBlocks.bamboo_block_slab);
        pole(consumer, ModBlocks.crimson_stem_pole, ModBlocks.crimson_stem_slab);
        pole(consumer, ModBlocks.warped_stem_pole, ModBlocks.warped_stem_slab);
        pole(consumer, ModBlocks.blackstone_pole, Blocks.BLACKSTONE_SLAB);
        pole(consumer, ModBlocks.polished_blackstone_pole, Blocks.POLISHED_BLACKSTONE_SLAB);
        pole(consumer, ModBlocks.stone_pole, Blocks.STONE_SLAB);
        pole(consumer, ModBlocks.smooth_stone_pole, Blocks.SMOOTH_STONE_SLAB);
        pole(consumer, ModBlocks.cobblestone_pole, Blocks.COBBLESTONE_SLAB);
        pole(consumer, ModBlocks.mossy_cobblestone_pole, Blocks.MOSSY_COBBLESTONE_SLAB);
        pole(consumer, ModBlocks.sandstone_pole, Blocks.SANDSTONE_SLAB);
        pole(consumer, ModBlocks.smooth_sandstone_pole, Blocks.SMOOTH_SANDSTONE_SLAB);
        pole(consumer, ModBlocks.red_sandstone_pole, Blocks.RED_SANDSTONE_SLAB);
        pole(consumer, ModBlocks.smooth_red_sandstone_pole, Blocks.SMOOTH_RED_SANDSTONE_SLAB);
        pole(consumer, ModBlocks.stone_brick_pole, Blocks.STONE_BRICK_SLAB);
        pole(consumer, ModBlocks.cracked_stone_brick_pole, ModBlocks.cracked_stone_brick_slab);
        pole(consumer, ModBlocks.mossy_stone_brick_pole, Blocks.MOSSY_STONE_BRICK_SLAB);
        pole(consumer, ModBlocks.prismarine_pole, Items.PRISMARINE_SHARD);
        pole(consumer, ModBlocks.prismarine_brick_pole, Blocks.PRISMARINE_BRICK_SLAB);
        pole(consumer, ModBlocks.dark_prismarine_pole, Blocks.DARK_PRISMARINE_SLAB);
        pole(consumer, ModBlocks.purpur_pole, Blocks.PURPUR_SLAB);
        pole(consumer, ModBlocks.tuff_pole, ModBlocks.tuff_slab);

        beam(consumer, ModBlocks.oak_beam, Blocks.OAK_SLAB);
        beam(consumer, ModBlocks.spruce_beam, Blocks.SPRUCE_SLAB);
        beam(consumer, ModBlocks.birch_beam, Blocks.BIRCH_SLAB);
        beam(consumer, ModBlocks.jungle_beam, Blocks.JUNGLE_SLAB);
        beam(consumer, ModBlocks.acacia_beam, Blocks.ACACIA_SLAB);
        beam(consumer, ModBlocks.cherry_beam, Blocks.CHERRY_SLAB);
        beam(consumer, ModBlocks.dark_oak_beam, Blocks.DARK_OAK_SLAB);
        beam(consumer, ModBlocks.mangrove_beam, Blocks.MANGROVE_SLAB);
        beam(consumer, ModBlocks.bamboo_beam, Blocks.BAMBOO_SLAB);
        beam(consumer, ModBlocks.crimson_beam, Blocks.CRIMSON_SLAB);
        beam(consumer, ModBlocks.warped_beam, Blocks.WARPED_SLAB);
        beam(consumer, ModBlocks.granite_beam, Blocks.GRANITE_SLAB);
        beam(consumer, ModBlocks.polished_granite_beam, Blocks.POLISHED_GRANITE_SLAB);
        beam(consumer, ModBlocks.diorite_beam, Blocks.DIORITE_SLAB);
        beam(consumer, ModBlocks.polished_diorite_beam, Blocks.POLISHED_DIORITE_SLAB);
        beam(consumer, ModBlocks.andesite_beam, Blocks.ANDESITE_SLAB);
        beam(consumer, ModBlocks.polished_andesite_beam, Blocks.POLISHED_ANDESITE_SLAB);
        beam(consumer, ModBlocks.oak_log_beam, ModBlocks.oak_log_slab);
        beam(consumer, ModBlocks.spruce_log_beam, ModBlocks.spruce_log_slab);
        beam(consumer, ModBlocks.birch_log_beam, ModBlocks.birch_log_slab);
        beam(consumer, ModBlocks.jungle_log_beam, ModBlocks.jungle_log_slab);
        beam(consumer, ModBlocks.acacia_log_beam, ModBlocks.acacia_log_slab);
        beam(consumer, ModBlocks.cherry_log_beam, ModBlocks.cherry_log_slab);
        beam(consumer, ModBlocks.dark_oak_log_beam, ModBlocks.dark_oak_log_slab);
        beam(consumer, ModBlocks.mangrove_log_beam, ModBlocks.mangrove_log_slab);
        beam(consumer, ModBlocks.bamboo_block_beam, ModBlocks.bamboo_block_slab);
        beam(consumer, ModBlocks.crimson_stem_beam, ModBlocks.crimson_stem_slab);
        beam(consumer, ModBlocks.warped_stem_beam, ModBlocks.warped_stem_slab);
        beam(consumer, ModBlocks.blackstone_beam, Blocks.BLACKSTONE_SLAB);
        beam(consumer, ModBlocks.polished_blackstone_beam, Blocks.POLISHED_BLACKSTONE_SLAB);
        beam(consumer, ModBlocks.stone_beam, Blocks.STONE_SLAB);
        beam(consumer, ModBlocks.smooth_stone_beam, Blocks.SMOOTH_STONE_SLAB);
        beam(consumer, ModBlocks.cobblestone_beam, Blocks.COBBLESTONE_SLAB);
        beam(consumer, ModBlocks.mossy_cobblestone_beam, Blocks.MOSSY_COBBLESTONE_SLAB);
        beam(consumer, ModBlocks.sandstone_beam, Blocks.SANDSTONE_SLAB);
        beam(consumer, ModBlocks.smooth_sandstone_beam, Blocks.SMOOTH_SANDSTONE_SLAB);
        beam(consumer, ModBlocks.red_sandstone_beam, Blocks.RED_SANDSTONE_SLAB);
        beam(consumer, ModBlocks.smooth_red_sandstone_beam, Blocks.SMOOTH_RED_SANDSTONE_SLAB);
        beam(consumer, ModBlocks.stone_brick_beam, Blocks.STONE_BRICK_SLAB);
        beam(consumer, ModBlocks.cracked_stone_brick_beam, ModBlocks.cracked_stone_brick_slab);
        beam(consumer, ModBlocks.mossy_stone_brick_beam, Blocks.MOSSY_STONE_BRICK_SLAB);
        beam(consumer, ModBlocks.prismarine_beam, Items.PRISMARINE_SHARD);
        beam(consumer, ModBlocks.prismarine_brick_beam, Blocks.PRISMARINE_BRICK_SLAB);
        beam(consumer, ModBlocks.dark_prismarine_beam, Blocks.DARK_PRISMARINE_SLAB);
        beam(consumer, ModBlocks.purpur_beam, Blocks.PURPUR_SLAB);
        beam(consumer, ModBlocks.tuff_beam, ModBlocks.tuff_slab);

        convertPoleBeam(consumer, ModBlocks.oak_pole, ModBlocks.oak_beam);
        convertPoleBeam(consumer, ModBlocks.spruce_pole, ModBlocks.spruce_beam);
        convertPoleBeam(consumer, ModBlocks.birch_pole, ModBlocks.birch_beam);
        convertPoleBeam(consumer, ModBlocks.jungle_pole, ModBlocks.jungle_beam);
        convertPoleBeam(consumer, ModBlocks.acacia_pole, ModBlocks.acacia_beam);
        convertPoleBeam(consumer, ModBlocks.cherry_pole, ModBlocks.cherry_beam);
        convertPoleBeam(consumer, ModBlocks.dark_oak_pole, ModBlocks.dark_oak_beam);
        convertPoleBeam(consumer, ModBlocks.mangrove_pole, ModBlocks.mangrove_beam);
        convertPoleBeam(consumer, ModBlocks.bamboo_pole, ModBlocks.bamboo_beam);
        convertPoleBeam(consumer, ModBlocks.crimson_pole, ModBlocks.crimson_beam);
        convertPoleBeam(consumer, ModBlocks.warped_pole, ModBlocks.warped_beam);
        convertPoleBeam(consumer, ModBlocks.granite_pole, ModBlocks.granite_beam);
        convertPoleBeam(consumer, ModBlocks.polished_granite_pole, ModBlocks.polished_granite_beam);
        convertPoleBeam(consumer, ModBlocks.diorite_pole, ModBlocks.diorite_beam);
        convertPoleBeam(consumer, ModBlocks.polished_diorite_pole, ModBlocks.polished_diorite_beam);
        convertPoleBeam(consumer, ModBlocks.andesite_pole, ModBlocks.andesite_beam);
        convertPoleBeam(consumer, ModBlocks.polished_andesite_pole, ModBlocks.polished_andesite_beam);
        convertPoleBeam(consumer, ModBlocks.oak_log_pole, ModBlocks.oak_log_beam);
        convertPoleBeam(consumer, ModBlocks.spruce_log_pole, ModBlocks.spruce_log_beam);
        convertPoleBeam(consumer, ModBlocks.birch_log_pole, ModBlocks.birch_log_beam);
        convertPoleBeam(consumer, ModBlocks.jungle_log_pole, ModBlocks.jungle_log_beam);
        convertPoleBeam(consumer, ModBlocks.acacia_log_pole, ModBlocks.acacia_log_beam);
        convertPoleBeam(consumer, ModBlocks.cherry_log_pole, ModBlocks.cherry_log_beam);
        convertPoleBeam(consumer, ModBlocks.dark_oak_log_pole, ModBlocks.dark_oak_log_beam);
        convertPoleBeam(consumer, ModBlocks.mangrove_log_pole, ModBlocks.mangrove_log_beam);
        convertPoleBeam(consumer, ModBlocks.bamboo_block_pole, ModBlocks.bamboo_block_beam);
        convertPoleBeam(consumer, ModBlocks.crimson_stem_pole, ModBlocks.crimson_stem_beam);
        convertPoleBeam(consumer, ModBlocks.warped_stem_pole, ModBlocks.warped_stem_beam);
        convertPoleBeam(consumer, ModBlocks.blackstone_pole, ModBlocks.blackstone_beam);
        convertPoleBeam(consumer, ModBlocks.polished_blackstone_pole, ModBlocks.polished_blackstone_beam);
        convertPoleBeam(consumer, ModBlocks.stone_pole, ModBlocks.stone_beam);
        convertPoleBeam(consumer, ModBlocks.smooth_stone_pole, ModBlocks.smooth_stone_beam);
        convertPoleBeam(consumer, ModBlocks.cobblestone_pole, ModBlocks.cobblestone_beam);
        convertPoleBeam(consumer, ModBlocks.mossy_cobblestone_pole, ModBlocks.mossy_cobblestone_beam);
        convertPoleBeam(consumer, ModBlocks.sandstone_pole, ModBlocks.sandstone_beam);
        convertPoleBeam(consumer, ModBlocks.smooth_sandstone_pole, ModBlocks.smooth_sandstone_beam);
        convertPoleBeam(consumer, ModBlocks.red_sandstone_pole, ModBlocks.red_sandstone_beam);
        convertPoleBeam(consumer, ModBlocks.smooth_red_sandstone_pole, ModBlocks.smooth_red_sandstone_beam);
        convertPoleBeam(consumer, ModBlocks.stone_brick_pole, ModBlocks.stone_brick_beam);
        convertPoleBeam(consumer, ModBlocks.cracked_stone_brick_pole, ModBlocks.cracked_stone_brick_beam);
        convertPoleBeam(consumer, ModBlocks.mossy_stone_brick_pole, ModBlocks.mossy_stone_brick_beam);
        convertPoleBeam(consumer, ModBlocks.prismarine_pole, ModBlocks.prismarine_beam);
        convertPoleBeam(consumer, ModBlocks.prismarine_brick_pole, ModBlocks.prismarine_brick_beam);
        convertPoleBeam(consumer, ModBlocks.dark_prismarine_pole, ModBlocks.dark_prismarine_beam);
        convertPoleBeam(consumer, ModBlocks.purpur_pole, ModBlocks.purpur_beam);
        convertPoleBeam(consumer, ModBlocks.tuff_pole, ModBlocks.tuff_beam);

		wallOverride(consumer, ModBlocks.oak_wall, Blocks.OAK_PLANKS);
		wallOverride(consumer, ModBlocks.spruce_wall, Blocks.SPRUCE_PLANKS);
		wallOverride(consumer, ModBlocks.birch_wall, Blocks.BIRCH_PLANKS);
		wallOverride(consumer, ModBlocks.jungle_wall, Blocks.JUNGLE_PLANKS);
		wallOverride(consumer, ModBlocks.acacia_wall, Blocks.ACACIA_PLANKS);
		wallOverride(consumer, ModBlocks.cherry_wall, Blocks.CHERRY_PLANKS);
		wallOverride(consumer, ModBlocks.dark_oak_wall, Blocks.DARK_OAK_PLANKS);
		wallOverride(consumer, ModBlocks.mangrove_wall, Blocks.MANGROVE_PLANKS);
		wallOverride(consumer, ModBlocks.bamboo_wall, Blocks.BAMBOO_PLANKS);
		wallOverride(consumer, ModBlocks.crimson_wall, Blocks.CRIMSON_PLANKS);
		wallOverride(consumer, ModBlocks.warped_wall, Blocks.WARPED_PLANKS);
		wall(consumer, ModBlocks.polished_granite_wall, Blocks.POLISHED_GRANITE);
		wall(consumer, ModBlocks.polished_diorite_wall, Blocks.POLISHED_DIORITE);
		wall(consumer, ModBlocks.polished_andesite_wall, Blocks.POLISHED_ANDESITE);
		wall(consumer, ModBlocks.oak_log_wall, Blocks.OAK_LOG);
		wall(consumer, ModBlocks.spruce_log_wall, Blocks.SPRUCE_LOG);
		wall(consumer, ModBlocks.birch_log_wall, Blocks.BIRCH_LOG);
		wall(consumer, ModBlocks.jungle_log_wall, Blocks.JUNGLE_LOG);
		wall(consumer, ModBlocks.acacia_log_wall, Blocks.ACACIA_LOG);
		wall(consumer, ModBlocks.cherry_log_wall, Blocks.CHERRY_LOG);
		wall(consumer, ModBlocks.dark_oak_log_wall, Blocks.DARK_OAK_LOG);
		wall(consumer, ModBlocks.mangrove_log_wall, Blocks.MANGROVE_LOG);
		wall(consumer, ModBlocks.bamboo_block_wall, Blocks.BAMBOO_BLOCK);
		wall(consumer, ModBlocks.crimson_stem_wall, Blocks.CRIMSON_STEM);
		wall(consumer, ModBlocks.warped_stem_wall, Blocks.WARPED_STEM);
		wall(consumer, ModBlocks.stone_wall, Blocks.STONE);
		wall(consumer, ModBlocks.smooth_stone_wall, Blocks.SMOOTH_STONE);
		wall(consumer, ModBlocks.smooth_sandstone_wall, Blocks.SMOOTH_SANDSTONE);
		wall(consumer, ModBlocks.smooth_red_sandstone_wall, Blocks.SMOOTH_RED_SANDSTONE);
		wall(consumer, ModBlocks.cracked_stone_brick_wall, Blocks.CRACKED_STONE_BRICKS);
		wall(consumer, ModBlocks.prismarine_brick_wall, Blocks.PRISMARINE_BRICKS);
		wall(consumer, ModBlocks.dark_prismarine_wall, Blocks.DARK_PRISMARINE);
		wall(consumer, ModBlocks.purpur_wall, Blocks.PURPUR_BLOCK);
        wall(consumer, ModBlocks.tuff_wall, Blocks.TUFF);

        saddleDoor(consumer, ModBlocks.oak_saddle_door, Blocks.OAK_TRAPDOOR);
        saddleDoor(consumer, ModBlocks.spruce_saddle_door, Blocks.SPRUCE_TRAPDOOR);
        saddleDoor(consumer, ModBlocks.birch_saddle_door, Blocks.BIRCH_TRAPDOOR);
        saddleDoor(consumer, ModBlocks.jungle_saddle_door, Blocks.JUNGLE_TRAPDOOR);
        saddleDoor(consumer, ModBlocks.acacia_saddle_door, Blocks.ACACIA_TRAPDOOR);
        saddleDoor(consumer, ModBlocks.cherry_saddle_door, Blocks.CHERRY_TRAPDOOR);
        saddleDoor(consumer, ModBlocks.dark_oak_saddle_door, Blocks.DARK_OAK_TRAPDOOR);
        saddleDoor(consumer, ModBlocks.mangrove_saddle_door, Blocks.MANGROVE_TRAPDOOR);
        saddleDoor(consumer, ModBlocks.bamboo_saddle_door, Blocks.BAMBOO_TRAPDOOR);
        saddleDoor(consumer, ModBlocks.crimson_saddle_door, Blocks.CRIMSON_TRAPDOOR);
        saddleDoor(consumer, ModBlocks.warped_saddle_door, Blocks.WARPED_TRAPDOOR);
        saddleDoor(consumer, ModBlocks.granite_saddle_door, ModBlocks.granite_trapdoor);
        saddleDoor(consumer, ModBlocks.polished_granite_saddle_door, ModBlocks.polished_granite_trapdoor);
        saddleDoor(consumer, ModBlocks.diorite_saddle_door, ModBlocks.diorite_trapdoor);
        saddleDoor(consumer, ModBlocks.polished_diorite_saddle_door, ModBlocks.polished_diorite_trapdoor);
        saddleDoor(consumer, ModBlocks.andesite_saddle_door, ModBlocks.andesite_trapdoor);
        saddleDoor(consumer, ModBlocks.polished_andesite_saddle_door, ModBlocks.polished_andesite_trapdoor);
        saddleDoor(consumer, ModBlocks.oak_log_saddle_door, ModBlocks.oak_log_trapdoor);
        saddleDoor(consumer, ModBlocks.spruce_log_saddle_door, ModBlocks.spruce_log_trapdoor);
        saddleDoor(consumer, ModBlocks.birch_log_saddle_door, ModBlocks.birch_log_trapdoor);
        saddleDoor(consumer, ModBlocks.jungle_log_saddle_door, ModBlocks.jungle_log_trapdoor);
        saddleDoor(consumer, ModBlocks.acacia_log_saddle_door, ModBlocks.acacia_log_trapdoor);
        saddleDoor(consumer, ModBlocks.cherry_log_saddle_door, ModBlocks.cherry_log_trapdoor);
        saddleDoor(consumer, ModBlocks.dark_oak_log_saddle_door, ModBlocks.dark_oak_log_trapdoor);
        saddleDoor(consumer, ModBlocks.mangrove_log_saddle_door, ModBlocks.mangrove_log_trapdoor);
        saddleDoor(consumer, ModBlocks.bamboo_block_saddle_door, ModBlocks.bamboo_block_trapdoor);
        saddleDoor(consumer, ModBlocks.crimson_stem_saddle_door, ModBlocks.crimson_stem_trapdoor);
        saddleDoor(consumer, ModBlocks.warped_stem_saddle_door, ModBlocks.warped_stem_trapdoor);
        saddleDoor(consumer, ModBlocks.blackstone_saddle_door, ModBlocks.blackstone_trapdoor);
        saddleDoor(consumer, ModBlocks.polished_blackstone_saddle_door, ModBlocks.polished_blackstone_trapdoor);
        saddleDoor(consumer, ModBlocks.stone_saddle_door, ModBlocks.stone_trapdoor);
        saddleDoor(consumer, ModBlocks.smooth_stone_saddle_door, ModBlocks.smooth_stone_trapdoor);
        saddleDoor(consumer, ModBlocks.cobblestone_saddle_door, ModBlocks.cobblestone_trapdoor);
        saddleDoor(consumer, ModBlocks.mossy_cobblestone_saddle_door, ModBlocks.mossy_cobblestone_trapdoor);
        saddleDoor(consumer, ModBlocks.sandstone_saddle_door, ModBlocks.sandstone_trapdoor);
        saddleDoor(consumer, ModBlocks.smooth_sandstone_saddle_door, ModBlocks.smooth_sandstone_trapdoor);
        saddleDoor(consumer, ModBlocks.red_sandstone_saddle_door, ModBlocks.red_sandstone_trapdoor);
        saddleDoor(consumer, ModBlocks.smooth_red_sandstone_saddle_door, ModBlocks.smooth_red_sandstone_trapdoor);
        saddleDoor(consumer, ModBlocks.stone_brick_saddle_door, ModBlocks.stone_brick_trapdoor);
        saddleDoor(consumer, ModBlocks.cracked_stone_brick_saddle_door, ModBlocks.cracked_stone_brick_trapdoor);
        saddleDoor(consumer, ModBlocks.mossy_stone_brick_saddle_door, ModBlocks.mossy_stone_brick_trapdoor);
        saddleDoor(consumer, ModBlocks.prismarine_saddle_door, ModBlocks.prismarine_trapdoor);
        saddleDoor(consumer, ModBlocks.prismarine_brick_saddle_door, ModBlocks.prismarine_brick_trapdoor);
        saddleDoor(consumer, ModBlocks.dark_prismarine_saddle_door, ModBlocks.dark_prismarine_trapdoor);
        saddleDoor(consumer, ModBlocks.purpur_saddle_door, ModBlocks.purpur_trapdoor);
        saddleDoor(consumer, ModBlocks.tuff_saddle_door, ModBlocks.tuff_trapdoor);

        saddleDoorFromDoor(consumer, ModBlocks.oak_saddle_door, Blocks.OAK_TRAPDOOR);
        saddleDoorFromDoor(consumer, ModBlocks.spruce_saddle_door, Blocks.SPRUCE_TRAPDOOR);
        saddleDoorFromDoor(consumer, ModBlocks.birch_saddle_door, Blocks.BIRCH_TRAPDOOR);
        saddleDoorFromDoor(consumer, ModBlocks.jungle_saddle_door, Blocks.JUNGLE_TRAPDOOR);
        saddleDoorFromDoor(consumer, ModBlocks.acacia_saddle_door, Blocks.ACACIA_TRAPDOOR);
        saddleDoorFromDoor(consumer, ModBlocks.cherry_saddle_door, Blocks.CHERRY_TRAPDOOR);
        saddleDoorFromDoor(consumer, ModBlocks.dark_oak_saddle_door, Blocks.DARK_OAK_TRAPDOOR);
        saddleDoorFromDoor(consumer, ModBlocks.mangrove_saddle_door, Blocks.MANGROVE_TRAPDOOR);
        saddleDoorFromDoor(consumer, ModBlocks.bamboo_saddle_door, Blocks.BAMBOO_TRAPDOOR);
        saddleDoorFromDoor(consumer, ModBlocks.crimson_saddle_door, Blocks.CRIMSON_TRAPDOOR);
        saddleDoorFromDoor(consumer, ModBlocks.warped_saddle_door, Blocks.WARPED_TRAPDOOR);
        saddleDoorFromDoor(consumer, ModBlocks.granite_saddle_door, ModBlocks.granite_door);
        saddleDoorFromDoor(consumer, ModBlocks.polished_granite_saddle_door, ModBlocks.polished_granite_door);
        saddleDoorFromDoor(consumer, ModBlocks.diorite_saddle_door, ModBlocks.diorite_door);
        saddleDoorFromDoor(consumer, ModBlocks.polished_diorite_saddle_door, ModBlocks.polished_diorite_door);
        saddleDoorFromDoor(consumer, ModBlocks.andesite_saddle_door, ModBlocks.andesite_door);
        saddleDoorFromDoor(consumer, ModBlocks.polished_andesite_saddle_door, ModBlocks.polished_andesite_door);
        saddleDoorFromDoor(consumer, ModBlocks.oak_log_saddle_door, ModBlocks.oak_log_door);
        saddleDoorFromDoor(consumer, ModBlocks.spruce_log_saddle_door, ModBlocks.spruce_log_door);
        saddleDoorFromDoor(consumer, ModBlocks.birch_log_saddle_door, ModBlocks.birch_log_door);
        saddleDoorFromDoor(consumer, ModBlocks.jungle_log_saddle_door, ModBlocks.jungle_log_door);
        saddleDoorFromDoor(consumer, ModBlocks.acacia_log_saddle_door, ModBlocks.acacia_log_door);
        saddleDoorFromDoor(consumer, ModBlocks.cherry_log_saddle_door, ModBlocks.cherry_log_door);
        saddleDoorFromDoor(consumer, ModBlocks.dark_oak_log_saddle_door, ModBlocks.dark_oak_log_door);
        saddleDoorFromDoor(consumer, ModBlocks.mangrove_log_saddle_door, ModBlocks.mangrove_log_door);
        saddleDoorFromDoor(consumer, ModBlocks.bamboo_block_saddle_door, ModBlocks.bamboo_block_door);
        saddleDoorFromDoor(consumer, ModBlocks.crimson_stem_saddle_door, ModBlocks.crimson_stem_door);
        saddleDoorFromDoor(consumer, ModBlocks.warped_stem_saddle_door, ModBlocks.warped_stem_door);
        saddleDoorFromDoor(consumer, ModBlocks.blackstone_saddle_door, ModBlocks.blackstone_door);
        saddleDoorFromDoor(consumer, ModBlocks.polished_blackstone_saddle_door, ModBlocks.polished_blackstone_door);
        saddleDoorFromDoor(consumer, ModBlocks.stone_saddle_door, ModBlocks.stone_door);
        saddleDoorFromDoor(consumer, ModBlocks.smooth_stone_saddle_door, ModBlocks.smooth_stone_door);
        saddleDoorFromDoor(consumer, ModBlocks.cobblestone_saddle_door, ModBlocks.cobblestone_door);
        saddleDoorFromDoor(consumer, ModBlocks.mossy_cobblestone_saddle_door, ModBlocks.mossy_cobblestone_door);
        saddleDoorFromDoor(consumer, ModBlocks.sandstone_saddle_door, ModBlocks.sandstone_door);
        saddleDoorFromDoor(consumer, ModBlocks.smooth_sandstone_saddle_door, ModBlocks.smooth_sandstone_door);
        saddleDoorFromDoor(consumer, ModBlocks.red_sandstone_saddle_door, ModBlocks.red_sandstone_door);
        saddleDoorFromDoor(consumer, ModBlocks.smooth_red_sandstone_saddle_door, ModBlocks.smooth_red_sandstone_door);
        saddleDoorFromDoor(consumer, ModBlocks.stone_brick_saddle_door, ModBlocks.stone_brick_door);
        saddleDoorFromDoor(consumer, ModBlocks.cracked_stone_brick_saddle_door, ModBlocks.cracked_stone_brick_door);
        saddleDoorFromDoor(consumer, ModBlocks.mossy_stone_brick_saddle_door, ModBlocks.mossy_stone_brick_door);
        saddleDoorFromDoor(consumer, ModBlocks.prismarine_saddle_door, ModBlocks.prismarine_door);
        saddleDoorFromDoor(consumer, ModBlocks.prismarine_brick_saddle_door, ModBlocks.prismarine_brick_door);
        saddleDoorFromDoor(consumer, ModBlocks.dark_prismarine_saddle_door, ModBlocks.dark_prismarine_door);
        saddleDoorFromDoor(consumer, ModBlocks.purpur_saddle_door, ModBlocks.purpur_door);
        saddleDoorFromDoor(consumer, ModBlocks.tuff_saddle_door, ModBlocks.tuff_door);
    }
}
