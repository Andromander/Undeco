package com.androsa.undeco.data;

import com.androsa.ornamental.blocks.OrnamentBeam;
import com.androsa.ornamental.blocks.OrnamentPole;
import com.androsa.ornamental.blocks.OrnamentSaddleDoor;
import com.androsa.ornamental.blocks.OrnamentSupport;
import com.androsa.ornamental.data.provider.OrnamentalBlockStateProvider;
import com.androsa.undeco.ModBlocks;
import com.androsa.undeco.UnusuallyDecorative;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

public class UDBlockstateGenerator extends OrnamentalBlockStateProvider {

    public UDBlockstateGenerator(PackOutput output, ExistingFileHelper helper) {
        super(output, UnusuallyDecorative.MODID, "minecraft", helper);
    }

    @Nonnull
    @Override
    public String getName() {
        return "Ornamental: Unusually Decorative Blockstates and Block Models";
    }

    @Override
    protected void registerStatesAndModels() {
        stairsColumn(ModBlocks.oak_log_stairs, "oak_log", "oak_log_top");
        stairsColumn(ModBlocks.spruce_log_stairs, "spruce_log", "spruce_log_top");
        stairsColumn(ModBlocks.birch_log_stairs, "birch_log", "birch_log_top");
        stairsColumn(ModBlocks.jungle_log_stairs, "jungle_log", "jungle_log_top");
        stairsColumn(ModBlocks.acacia_log_stairs, "acacia_log", "acacia_log_top");
        stairsColumn(ModBlocks.cherry_log_stairs, "cherry_log", "cherry_log_top");
        stairsColumn(ModBlocks.dark_oak_log_stairs, "dark_oak_log", "dark_oak_log_top");
        stairsColumn(ModBlocks.mangrove_log_stairs, "mangrove_log", "mangrove_log_top");
        stairsColumn(ModBlocks.bamboo_block_stairs, "bamboo_block", "bamboo_block_top");
        stairsColumn(ModBlocks.crimson_stem_stairs, "crimson_stem", "crimson_stem_top");
        stairsColumn(ModBlocks.warped_stem_stairs, "warped_stem", "warped_stem_top");
        stairsBasic(ModBlocks.smooth_stone_stairs, "smooth_stone");
        stairsBasic(ModBlocks.cracked_stone_brick_stairs, "cracked_stone_bricks");
        stairsBasic(ModBlocks.tuff_stairs, "tuff");

        slabColumn(ModBlocks.oak_log_slab, "oak_log", "oak_log", "oak_log_top");
        slabColumn(ModBlocks.spruce_log_slab, "spruce_log", "spruce_log", "spruce_log_top");
        slabColumn(ModBlocks.birch_log_slab, "birch_log", "birch_log", "birch_log_top");
        slabColumn(ModBlocks.jungle_log_slab, "jungle_log", "jungle_log", "jungle_log_top");
        slabColumn(ModBlocks.acacia_log_slab, "acacia_log", "acacia_log", "acacia_log_top");
        slabColumn(ModBlocks.cherry_log_slab, "cherry_log", "cherry_log", "cherry_log_top");
        slabColumn(ModBlocks.dark_oak_log_slab, "dark_oak_log", "dark_oak_log", "dark_oak_log_top");
        slabColumn(ModBlocks.mangrove_log_slab, "mangrove_log", "mangrove_log", "mangrove_log_top");
        slabColumn(ModBlocks.bamboo_block_slab, "bamboo_block", "bamboo_block", "bamboo_block_top");
        slabColumn(ModBlocks.crimson_stem_slab, "crimson_stem", "crimson_stem", "crimson_stem_top");
        slabColumn(ModBlocks.warped_stem_slab, "warped_stem", "warped_stem", "warped_stem_top");
        slabBasic(ModBlocks.cracked_stone_brick_slab, "cracked_stone_bricks");
        slabBasic(ModBlocks.tuff_slab, "tuff");

        fenceBasic(ModBlocks.granite_fence, "granite");
        fenceBasic(ModBlocks.polished_granite_fence, "polished_granite");
        fenceBasic(ModBlocks.diorite_fence, "diorite");
        fenceBasic(ModBlocks.polished_diorite_fence, "polished_diorite");
        fenceBasic(ModBlocks.andesite_fence, "andesite");
        fenceBasic(ModBlocks.polished_andesite_fence, "polished_andesite");
        fenceColumn(ModBlocks.oak_log_fence, "oak_log", "oak_log_top");
        fenceColumn(ModBlocks.spruce_log_fence, "spruce_log", "spruce_log_top");
        fenceColumn(ModBlocks.birch_log_fence, "birch_log", "birch_log_top");
        fenceColumn(ModBlocks.jungle_log_fence, "jungle_log", "jungle_log_top");
        fenceColumn(ModBlocks.acacia_log_fence, "acacia_log", "acacia_log_top");
        fenceColumn(ModBlocks.cherry_log_fence, "cherry_log", "cherry_log_top");
        fenceColumn(ModBlocks.dark_oak_log_fence, "dark_oak_log", "dark_oak_log_top");
        fenceColumn(ModBlocks.mangrove_log_fence, "mangrove_log", "mangrove_log_top");
        fenceColumn(ModBlocks.bamboo_block_fence, "bamboo_block", "bamboo_block_top");
        fenceColumn(ModBlocks.crimson_stem_fence, "crimson_stem", "crimson_stem_top");
        fenceColumn(ModBlocks.warped_stem_fence, "warped_stem", "warped_stem_top");
        fenceBasic(ModBlocks.blackstone_fence, "blackstone");
        fenceBasic(ModBlocks.polished_blackstone_fence, "polished_blackstone");
        fenceBasic(ModBlocks.stone_fence, "stone");
        fenceBasic(ModBlocks.smooth_stone_fence, "smooth_stone");
        fenceBasic(ModBlocks.cobblestone_fence, "cobblestone");
        fenceBasic(ModBlocks.mossy_cobblestone_fence, "mossy_cobblestone");
        fenceTopBottom(ModBlocks.sandstone_fence, "sandstone", "sandstone_top", "sandstone_bottom");
        fenceBasic(ModBlocks.smooth_sandstone_fence, "sandstone_top");
        fenceTopBottom(ModBlocks.red_sandstone_fence, "red_sandstone", "red_sandstone_top", "red_sandstone_bottom");
        fenceBasic(ModBlocks.smooth_red_sandstone_fence, "red_sandstone_top");
        fenceBasic(ModBlocks.stone_brick_fence, "stone_bricks");
        fenceBasic(ModBlocks.cracked_stone_brick_fence, "cracked_stone_bricks");
        fenceBasic(ModBlocks.mossy_stone_brick_fence, "mossy_stone_bricks");
        fenceBasic(ModBlocks.prismarine_fence, "prismarine");
        fenceBasic(ModBlocks.prismarine_brick_fence, "prismarine_bricks");
        fenceBasic(ModBlocks.dark_prismarine_fence, "dark_prismarine");
        fenceBasic(ModBlocks.purpur_fence, "purpur_block");
        fenceBasic(ModBlocks.tuff_fence, "tuff");

        trapdoorParent(ModBlocks.granite_trapdoor, "granite");
        trapdoorBasic(ModBlocks.polished_granite_trapdoor, "polished_granite");
        trapdoorParent(ModBlocks.diorite_trapdoor, "diorite");
        trapdoorBasic(ModBlocks.polished_diorite_trapdoor, "polished_diorite");
        trapdoorParent(ModBlocks.andesite_trapdoor, "andesite");
        trapdoorBasic(ModBlocks.polished_andesite_trapdoor, "polished_andesite");
        trapdoorParent(ModBlocks.oak_log_trapdoor, "oak_log");
        trapdoorParent(ModBlocks.spruce_log_trapdoor, "spruce_log");
        trapdoorParent(ModBlocks.birch_log_trapdoor, "birch_log");
        trapdoorParent(ModBlocks.jungle_log_trapdoor, "jungle_log");
        trapdoorParent(ModBlocks.acacia_log_trapdoor, "acacia_log");
        trapdoorParent(ModBlocks.cherry_log_trapdoor, "cherry_log");
        trapdoorParent(ModBlocks.dark_oak_log_trapdoor, "dark_oak_log");
        trapdoorParent(ModBlocks.mangrove_log_trapdoor, "mangrove_log");
        trapdoorParent(ModBlocks.bamboo_block_trapdoor, "bamboo_block");
        trapdoorParent(ModBlocks.crimson_stem_trapdoor, "crimson_stem");
        trapdoorParent(ModBlocks.warped_stem_trapdoor, "warped_stem");
        trapdoorParent(ModBlocks.blackstone_trapdoor, "blackstone");
        trapdoorBasic(ModBlocks.polished_blackstone_trapdoor, "polished_blackstone");
        trapdoorParent(ModBlocks.stone_trapdoor, "stone");
        trapdoorBasic(ModBlocks.smooth_stone_trapdoor, "smooth_stone");
        trapdoorParent(ModBlocks.cobblestone_trapdoor, "cobblestone");
        trapdoorParent(ModBlocks.mossy_cobblestone_trapdoor, "mossy_cobblestone");
        trapdoorParent(ModBlocks.sandstone_trapdoor, "sandstone_top");
        trapdoorBasic(ModBlocks.smooth_sandstone_trapdoor, "smooth_sandstone");
        trapdoorParent(ModBlocks.red_sandstone_trapdoor, "red_sandstone_top");
        trapdoorBasic(ModBlocks.smooth_red_sandstone_trapdoor, "smooth_red_sandstone");
        trapdoorParent(ModBlocks.stone_brick_trapdoor, "stone_bricks");
        trapdoorParent(ModBlocks.cracked_stone_brick_trapdoor, "cracked_stone_bricks");
        trapdoorParent(ModBlocks.mossy_stone_brick_trapdoor, "mossy_stone_bricks");
        trapdoorParent(ModBlocks.prismarine_trapdoor, "prismarine");
        trapdoorBasic(ModBlocks.prismarine_brick_trapdoor, "prismarine_brick");
        trapdoorBasic(ModBlocks.dark_prismarine_trapdoor, "dark_prismarine");
        trapdoorBasic(ModBlocks.purpur_trapdoor, "purpur");
        trapdoorBasic(ModBlocks.tuff_trapdoor, "tuff");

        fenceGateBasic(ModBlocks.granite_fence_gate, "granite");
        fenceGateBasic(ModBlocks.polished_granite_fence_gate, "polished_granite");
        fenceGateBasic(ModBlocks.diorite_fence_gate, "diorite");
        fenceGateBasic(ModBlocks.polished_diorite_fence_gate, "polished_diorite");
        fenceGateBasic(ModBlocks.andesite_fence_gate, "andesite");
        fenceGateBasic(ModBlocks.polished_andesite_fence_gate, "polished_andesite");
        fenceGateColumn(ModBlocks.oak_log_fence_gate, "oak_log", "oak_log_top");
        fenceGateColumn(ModBlocks.spruce_log_fence_gate, "spruce_log", "spruce_log_top");
        fenceGateColumn(ModBlocks.birch_log_fence_gate, "birch_log", "birch_log_top");
        fenceGateColumn(ModBlocks.jungle_log_fence_gate, "jungle_log", "jungle_log_top");
        fenceGateColumn(ModBlocks.acacia_log_fence_gate, "acacia_log", "acacia_log_top");
        fenceGateColumn(ModBlocks.cherry_log_fence_gate, "cherry_log", "cherry_log_top");
        fenceGateColumn(ModBlocks.dark_oak_log_fence_gate, "dark_oak_log", "dark_oak_log_top");
        fenceGateColumn(ModBlocks.mangrove_log_fence_gate, "mangrove_log", "mangrove_log_top");
        fenceGateColumn(ModBlocks.bamboo_block_fence_gate, "bamboo_block", "bamboo_block_top");
        fenceGateColumn(ModBlocks.crimson_stem_fence_gate, "crimson_stem", "crimson_stem_top");
        fenceGateColumn(ModBlocks.warped_stem_fence_gate, "warped_stem", "warped_stem_top");
        fenceGateBasic(ModBlocks.blackstone_fence_gate, "blackstone");
        fenceGateBasic(ModBlocks.polished_blackstone_fence_gate, "polished_blackstone");
        fenceGateBasic(ModBlocks.stone_fence_gate, "stone");
        fenceGateBasic(ModBlocks.smooth_stone_fence_gate, "smooth_stone");
        fenceGateBasic(ModBlocks.cobblestone_fence_gate, "cobblestone");
        fenceGateBasic(ModBlocks.mossy_cobblestone_fence_gate, "mossy_cobblestone");
        fenceGateTopBottom(ModBlocks.sandstone_fence_gate, "sandstone", "sandstone_top", "sandstone_bottom");
        fenceGateBasic(ModBlocks.smooth_sandstone_fence_gate, "sandstone_top");
        fenceGateTopBottom(ModBlocks.red_sandstone_fence_gate, "red_sandstone", "red_sandstone_top", "red_sandstone_bottom");
        fenceGateBasic(ModBlocks.smooth_red_sandstone_fence_gate, "red_sandstone_top");
        fenceGateBasic(ModBlocks.stone_brick_fence_gate, "stone_bricks");
        fenceGateBasic(ModBlocks.cracked_stone_brick_fence_gate, "cracked_stone_bricks");
        fenceGateBasic(ModBlocks.mossy_stone_brick_fence_gate, "mossy_stone_bricks");
        fenceGateBasic(ModBlocks.prismarine_fence_gate, "prismarine");
        fenceGateBasic(ModBlocks.prismarine_brick_fence_gate, "prismarine_bricks");
        fenceGateBasic(ModBlocks.dark_prismarine_fence_gate, "dark_prismarine");
        fenceGateBasic(ModBlocks.purpur_fence_gate, "purpur_block");
        fenceGateBasic(ModBlocks.tuff_fence_gate, "tuff");

        doorHidden(ModBlocks.granite_door, "granite");
        doorBasic(ModBlocks.polished_granite_door, "polished_granite");
        doorHidden(ModBlocks.diorite_door, "diorite");
        doorBasic(ModBlocks.polished_diorite_door, "polished_diorite");
        doorHidden(ModBlocks.andesite_door, "andesite");
        doorBasic(ModBlocks.polished_andesite_door, "polished_andesite");
        doorHidden(ModBlocks.oak_log_door, "oak_log");
        doorHidden(ModBlocks.spruce_log_door, "spruce_log");
        doorHidden(ModBlocks.birch_log_door, "birch_log");
        doorHidden(ModBlocks.jungle_log_door, "jungle_log");
        doorHidden(ModBlocks.acacia_log_door, "acacia_log");
        doorHidden(ModBlocks.cherry_log_door, "cherry_log");
        doorHidden(ModBlocks.dark_oak_log_door, "dark_oak_log");
        doorHidden(ModBlocks.mangrove_log_door, "mangrove_log");
        doorHidden(ModBlocks.bamboo_block_door, "bamboo_block");
        doorHidden(ModBlocks.crimson_stem_door, "crimson_stem");
        doorHidden(ModBlocks.warped_stem_door, "warped_stem");
        doorHidden(ModBlocks.blackstone_door, "blackstone");
        doorBasic(ModBlocks.polished_blackstone_door, "polished_blackstone");
        doorHidden(ModBlocks.stone_door, "stone");
        doorBasic(ModBlocks.smooth_stone_door, "smooth_stone");
        doorHidden(ModBlocks.cobblestone_door, "cobblestone");
        doorHidden(ModBlocks.mossy_cobblestone_door, "mossy_cobblestone");
        doorBlockTopBottom(ModBlocks.sandstone_door, "sandstone", "sandstone_top", "sandstone_bottom");
        doorBasic(ModBlocks.smooth_sandstone_door, "smooth_sandstone");
        doorBlockTopBottom(ModBlocks.red_sandstone_door, "red_sandstone", "red_sandstone_top", "red_sandstone_bottom");
        doorBasic(ModBlocks.smooth_red_sandstone_door, "smooth_red_sandstone");
        doorHidden(ModBlocks.stone_brick_door, "stone_bricks");
        doorHidden(ModBlocks.cracked_stone_brick_door, "cracked_stone_bricks");
        doorHidden(ModBlocks.mossy_stone_brick_door, "mossy_stone_bricks");
        doorHidden(ModBlocks.prismarine_door, "prismarine");
        doorBasic(ModBlocks.prismarine_brick_door, "prismarine_brick");
        doorBasic(ModBlocks.dark_prismarine_door, "dark_prismarine");
        doorBasic(ModBlocks.purpur_door, "purpur");
        doorBasic(ModBlocks.tuff_door, "tuff");

        poleBasic(ModBlocks.oak_pole, "oak_planks");
        poleBasic(ModBlocks.spruce_pole, "spruce_planks");
        poleBasic(ModBlocks.birch_pole, "birch_planks");
        poleBasic(ModBlocks.jungle_pole, "jungle_planks");
        poleBasic(ModBlocks.acacia_pole, "acacia_planks");
        poleBasic(ModBlocks.cherry_pole, "cherry_planks");
        poleBasic(ModBlocks.dark_oak_pole, "dark_oak_planks");
        poleBasic(ModBlocks.mangrove_pole, "mangrove_planks");
        poleBasic(ModBlocks.bamboo_pole, "bamboo_planks");
        poleBasic(ModBlocks.crimson_pole, "crimson_planks");
        poleBasic(ModBlocks.warped_pole, "warped_planks");
        poleBasic(ModBlocks.granite_pole, "granite");
        poleBasic(ModBlocks.polished_granite_pole, "polished_granite");
        poleBasic(ModBlocks.diorite_pole, "diorite");
        poleBasic(ModBlocks.polished_diorite_pole, "polished_diorite");
        poleBasic(ModBlocks.andesite_pole, "andesite");
        poleBasic(ModBlocks.polished_andesite_pole, "polished_andesite");
        poleColumn(ModBlocks.oak_log_pole, "oak_log", "oak_log", "oak_log_top");
        poleColumn(ModBlocks.spruce_log_pole, "spruce_log", "spruce_log", "spruce_log_top");
        poleColumn(ModBlocks.birch_log_pole, "birch_log", "birch_log", "birch_log_top");
        poleColumn(ModBlocks.jungle_log_pole, "jungle_log", "jungle_log", "jungle_log_top");
        poleColumn(ModBlocks.acacia_log_pole, "acacia_log", "acacia_log", "acacia_log_top");
        poleColumn(ModBlocks.cherry_log_pole, "cherry_log", "cherry_log", "cherry_log_top");
        poleColumn(ModBlocks.dark_oak_log_pole, "dark_oak_log", "dark_oak_log", "dark_oak_log_top");
        poleColumn(ModBlocks.mangrove_log_pole, "mangrove_log", "mangrove_log", "mangrove_log_top");
        poleColumn(ModBlocks.bamboo_block_pole, "bamboo_block", "bamboo_block", "bamboo_block_top");
        poleColumn(ModBlocks.crimson_stem_pole, "crimson_stem", "crimson_stem", "crimson_stem_top");
        poleColumn(ModBlocks.warped_stem_pole, "warped_stem", "warped_stem", "warped_stem_top");
        poleBasic(ModBlocks.blackstone_pole, "blackstone");
        poleBasic(ModBlocks.polished_blackstone_pole, "polished_blackstone");
        poleBasic(ModBlocks.stone_pole, "stone");
        poleBasic(ModBlocks.smooth_stone_pole, "smooth_stone");
        poleBasic(ModBlocks.cobblestone_pole, "cobblestone");
        poleBasic(ModBlocks.mossy_cobblestone_pole, "mossy_cobblestone");
        poleTopBottom(ModBlocks.sandstone_pole, "sandstone", "sandstone_top", "sandstone_bottom");
        poleBasic(ModBlocks.smooth_sandstone_pole, "smooth_sandstone", "sandstone_top", SOLID);
        poleTopBottom(ModBlocks.red_sandstone_pole, "red_sandstone", "red_sandstone_top", "red_sandstone_bottom");
        poleBasic(ModBlocks.smooth_red_sandstone_pole, "smooth_red_sandstone", "red_sandstone_top", SOLID);
        poleBasic(ModBlocks.stone_brick_pole, "stone_bricks");
        poleBasic(ModBlocks.cracked_stone_brick_pole, "cracked_stone_bricks");
        poleBasic(ModBlocks.mossy_stone_brick_pole, "mossy_stone_bricks");
        poleBasic(ModBlocks.prismarine_pole, "prismarine");
        poleBasic(ModBlocks.prismarine_brick_pole, "prismarine_bricks");
        poleBasic(ModBlocks.dark_prismarine_pole, "dark_prismarine");
        poleBasic(ModBlocks.purpur_pole, "purpur_block");
        poleBasic(ModBlocks.tuff_pole, "tuff");

        beamBasic(ModBlocks.oak_beam, "oak_planks");
        beamBasic(ModBlocks.spruce_beam, "spruce_planks");
        beamBasic(ModBlocks.birch_beam, "birch_planks");
        beamBasic(ModBlocks.jungle_beam, "jungle_planks");
        beamBasic(ModBlocks.acacia_beam, "acacia_planks");
        beamBasic(ModBlocks.cherry_beam, "cherry_planks");
        beamBasic(ModBlocks.dark_oak_beam, "dark_oak_planks");
        beamBasic(ModBlocks.mangrove_beam, "mangrove_planks");
        beamBasic(ModBlocks.bamboo_beam, "bamboo_planks");
        beamBasic(ModBlocks.crimson_beam, "crimson_planks");
        beamBasic(ModBlocks.warped_beam, "warped_planks");
        beamBasic(ModBlocks.granite_beam, "granite");
        beamBasic(ModBlocks.polished_granite_beam, "polished_granite");
        beamBasic(ModBlocks.diorite_beam, "diorite");
        beamBasic(ModBlocks.polished_diorite_beam, "polished_diorite");
        beamBasic(ModBlocks.andesite_beam, "andesite");
        beamBasic(ModBlocks.polished_andesite_beam, "polished_andesite");
        beamColumn(ModBlocks.oak_log_beam, "oak_log", "oak_log_top", "oak_log");
        beamColumn(ModBlocks.spruce_log_beam, "spruce_log", "spruce_log_top", "spruce_log");
        beamColumn(ModBlocks.birch_log_beam, "birch_log", "birch_log_top", "birch_log");
        beamColumn(ModBlocks.jungle_log_beam, "jungle_log", "jungle_log_top", "jungle_log");
        beamColumn(ModBlocks.acacia_log_beam, "acacia_log", "acacia_log_top", "acacia_log");
        beamColumn(ModBlocks.cherry_log_beam, "cherry_log", "cherry_log_top", "cherry_log");
        beamColumn(ModBlocks.dark_oak_log_beam, "dark_oak_log", "dark_oak_log_top", "dark_oak_log");
        beamColumn(ModBlocks.mangrove_log_beam, "mangrove_log", "mangrove_log_top", "mangrove_log");
        beamColumn(ModBlocks.bamboo_block_beam, "bamboo_block", "bamboo_block_top", "bamboo_block");
        beamColumn(ModBlocks.crimson_stem_beam, "crimson_stem", "crimson_stem_top", "crimson_stem");
        beamColumn(ModBlocks.warped_stem_beam, "warped_stem", "warped_stem_top", "warped_stem");
        beamBasic(ModBlocks.blackstone_beam, "blackstone");
        beamBasic(ModBlocks.polished_blackstone_beam, "polished_blackstone");
        beamBasic(ModBlocks.stone_beam, "stone");
        beamBasic(ModBlocks.smooth_stone_beam, "smooth_stone");
        beamBasic(ModBlocks.cobblestone_beam, "cobblestone");
        beamBasic(ModBlocks.mossy_cobblestone_beam, "mossy_cobblestone");
        beamTopBottom(ModBlocks.sandstone_beam, "sandstone");
        beamBasic(ModBlocks.smooth_sandstone_beam, "sandstone_top", "smooth_sandstone", SOLID);
        beamTopBottom(ModBlocks.red_sandstone_beam, "red_sandstone");
        beamBasic(ModBlocks.smooth_red_sandstone_beam, "red_sandstone_top", "smooth_red_sandstone", SOLID);
        beamBasic(ModBlocks.stone_brick_beam, "stone_bricks");
        beamBasic(ModBlocks.cracked_stone_brick_beam, "cracked_stone_bricks");
        beamBasic(ModBlocks.mossy_stone_brick_beam, "mossy_stone_bricks");
        beamBasic(ModBlocks.prismarine_beam, "prismarine");
        beamBasic(ModBlocks.prismarine_brick_beam, "prismarine_bricks");
        beamBasic(ModBlocks.dark_prismarine_beam, "dark_prismarine");
        beamBasic(ModBlocks.purpur_beam, "purpur_block");
        beamBasic(ModBlocks.tuff_beam, "tuff");

		wallBasic(ModBlocks.oak_wall, "oak_planks");
		wallBasic(ModBlocks.spruce_wall, "spruce_planks");
		wallBasic(ModBlocks.birch_wall, "birch_planks");
		wallBasic(ModBlocks.jungle_wall, "jungle_planks");
		wallBasic(ModBlocks.acacia_wall, "acacia_planks");
        wallBasic(ModBlocks.cherry_wall, "cherry_planks");
		wallBasic(ModBlocks.dark_oak_wall, "dark_oak_planks");
		wallBasic(ModBlocks.mangrove_wall, "mangrove_planks");
		wallBasic(ModBlocks.bamboo_wall, "bamboo_planks");
		wallBasic(ModBlocks.crimson_wall, "crimson_planks");
		wallBasic(ModBlocks.warped_wall, "warped_planks");
		wallBasic(ModBlocks.polished_granite_wall, "polished_granite");
		wallBasic(ModBlocks.polished_diorite_wall, "polished_diorite");
		wallBasic(ModBlocks.polished_andesite_wall, "polished_andesite");
		wallColumn(ModBlocks.oak_log_wall, "oak_log", "oak_log_top");
		wallColumn(ModBlocks.spruce_log_wall, "spruce_log", "spruce_log_top");
		wallColumn(ModBlocks.birch_log_wall, "birch_log", "birch_log_top");
		wallColumn(ModBlocks.jungle_log_wall, "jungle_log", "jungle_log_top");
		wallColumn(ModBlocks.acacia_log_wall, "acacia_log", "acacia_log_top");
		wallColumn(ModBlocks.cherry_log_wall, "cherry_log", "cherry_log_top");
		wallColumn(ModBlocks.dark_oak_log_wall, "dark_oak_log", "dark_oak_log_top");
		wallColumn(ModBlocks.mangrove_log_wall, "mangrove_log", "mangrove_log_top");
		wallColumn(ModBlocks.bamboo_block_wall, "bamboo_block", "bamboo_block_top");
		wallColumn(ModBlocks.crimson_stem_wall, "crimson_stem", "crimson_stem_top");
		wallColumn(ModBlocks.warped_stem_wall, "warped_stem", "warped_stem_top");
		wallBasic(ModBlocks.stone_wall, "stone");
		wallBasic(ModBlocks.smooth_stone_wall, "smooth_stone");
		wallBasic(ModBlocks.smooth_sandstone_wall, "sandstone_top");
		wallBasic(ModBlocks.smooth_red_sandstone_wall, "red_sandstone_top");
		wallBasic(ModBlocks.cracked_stone_brick_wall, "cracked_stone_bricks");
		wallBasic(ModBlocks.prismarine_brick_wall, "prismarine_bricks");
		wallBasic(ModBlocks.dark_prismarine_wall, "dark_prismarine");
		wallBasic(ModBlocks.purpur_wall, "purpur_block");
        wallBasic(ModBlocks.tuff_wall, "tuff");

        saddleDoorHidden(ModBlocks.oak_saddle_door, "oak_trapdoor");
        saddleDoorHidden(ModBlocks.spruce_saddle_door, "spruce_trapdoor");
        saddleDoorHidden(ModBlocks.birch_saddle_door, "birch_trapdoor");
        saddleDoorHidden(ModBlocks.jungle_saddle_door, "jungle_trapdoor");
        saddleDoorHidden(ModBlocks.acacia_saddle_door, "acacia_trapdoor");
        saddleDoorHidden(ModBlocks.cherry_saddle_door, "cherry_trapdoor");
        saddleDoorHidden(ModBlocks.dark_oak_saddle_door, "dark_oak_trapdoor");
        saddleDoorHidden(ModBlocks.mangrove_saddle_door, "mangrove_trapdoor");
        saddleDoorHidden(ModBlocks.bamboo_saddle_door, "bamboo_trapdoor");
        saddleDoorHidden(ModBlocks.crimson_saddle_door, "crimson_trapdoor");
        saddleDoorHidden(ModBlocks.warped_saddle_door, "warped_trapdoor");
        saddleDoorHidden(ModBlocks.granite_saddle_door, "granite");
        saddleDoorBasic(ModBlocks.polished_granite_saddle_door, "polished_granite");
        saddleDoorHidden(ModBlocks.diorite_saddle_door, "diorite");
        saddleDoorBasic(ModBlocks.polished_diorite_saddle_door, "polished_diorite");
        saddleDoorHidden(ModBlocks.andesite_saddle_door, "andesite");
        saddleDoorBasic(ModBlocks.polished_andesite_saddle_door, "polished_andesite");
        saddleDoorHidden(ModBlocks.oak_log_saddle_door, "oak_log");
        saddleDoorHidden(ModBlocks.spruce_log_saddle_door, "spruce_log");
        saddleDoorHidden(ModBlocks.birch_log_saddle_door, "birch_log");
        saddleDoorHidden(ModBlocks.jungle_log_saddle_door, "jungle_log");
        saddleDoorHidden(ModBlocks.acacia_log_saddle_door, "acacia_log");
        saddleDoorHidden(ModBlocks.cherry_log_saddle_door, "cherry_log");
        saddleDoorHidden(ModBlocks.dark_oak_log_saddle_door, "dark_oak_log");
        saddleDoorHidden(ModBlocks.mangrove_log_saddle_door, "mangrove_log");
        saddleDoorHidden(ModBlocks.bamboo_block_saddle_door, "bamboo_block");
        saddleDoorHidden(ModBlocks.crimson_stem_saddle_door, "crimson_stem");
        saddleDoorHidden(ModBlocks.warped_stem_saddle_door, "warped_stem");
        saddleDoorHidden(ModBlocks.blackstone_saddle_door, "blackstone");
        saddleDoorBasic(ModBlocks.polished_blackstone_saddle_door, "polished_blackstone");
        saddleDoorHidden(ModBlocks.stone_saddle_door, "stone");
        saddleDoorBasic(ModBlocks.smooth_stone_saddle_door, "smooth_stone");
        saddleDoorHidden(ModBlocks.cobblestone_saddle_door, "cobblestone");
        saddleDoorHidden(ModBlocks.mossy_cobblestone_saddle_door, "mossy_cobblestone");
        saddleDoorTopBottom(ModBlocks.sandstone_saddle_door, "sandstone", "sandstone_top", "sandstone_bottom");
        saddleDoorBasic(ModBlocks.smooth_sandstone_saddle_door, "smooth_sandstone");
        saddleDoorTopBottom(ModBlocks.red_sandstone_saddle_door, "red_sandstone", "red_sandstone_top", "red_sandstone_bottom");
        saddleDoorBasic(ModBlocks.smooth_red_sandstone_saddle_door, "smooth_red_sandstone");
        saddleDoorHidden(ModBlocks.stone_brick_saddle_door, "stone_bricks");
        saddleDoorHidden(ModBlocks.cracked_stone_brick_saddle_door, "cracked_stone_bricks");
        saddleDoorHidden(ModBlocks.mossy_stone_brick_saddle_door, "mossy_stone_bricks");
        saddleDoorHidden(ModBlocks.prismarine_saddle_door, "prismarine");
        saddleDoorBasic(ModBlocks.prismarine_brick_saddle_door, "prismarine_brick");
        saddleDoorBasic(ModBlocks.dark_prismarine_saddle_door, "dark_prismarine");
        saddleDoorBasic(ModBlocks.purpur_saddle_door, "purpur");
        saddleDoorBasic(ModBlocks.tuff_saddle_door, "tuff");

        supportBasic(ModBlocks.oak_support, "oak_planks");
        supportBasic(ModBlocks.spruce_support, "spruce_planks");
        supportBasic(ModBlocks.birch_support, "birch_planks");
        supportBasic(ModBlocks.jungle_support, "jungle_planks");
        supportBasic(ModBlocks.acacia_support, "acacia_planks");
        supportBasic(ModBlocks.cherry_support, "cherry_planks");
        supportBasic(ModBlocks.dark_oak_support, "dark_oak_planks");
        supportBasic(ModBlocks.mangrove_support, "mangrove_planks");
        supportBasic(ModBlocks.bamboo_support, "bamboo_planks");
        supportBasic(ModBlocks.crimson_support, "crimson_planks");
        supportBasic(ModBlocks.warped_support, "warped_planks");
        supportBasic(ModBlocks.granite_support, "granite");
        supportBasic(ModBlocks.polished_granite_support, "polished_granite");
        supportBasic(ModBlocks.diorite_support, "diorite");
        supportBasic(ModBlocks.polished_diorite_support, "polished_diorite");
        supportBasic(ModBlocks.andesite_support, "andesite");
        supportBasic(ModBlocks.polished_andesite_support, "polished_andesite");
        supportColumn(ModBlocks.oak_log_support, "oak_log", "oak_log_top");
        supportColumn(ModBlocks.spruce_log_support, "spruce_log", "spruce_log_top");
        supportColumn(ModBlocks.birch_log_support, "birch_log", "birch_log_top");
        supportColumn(ModBlocks.jungle_log_support, "jungle_log", "jungle_log_top");
        supportColumn(ModBlocks.acacia_log_support, "acacia_log", "acacia_log_top");
        supportColumn(ModBlocks.cherry_log_support, "cherry_log", "cherry_log_top");
        supportColumn(ModBlocks.dark_oak_log_support, "dark_oak_log", "dark_oak_log_top");
        supportColumn(ModBlocks.mangrove_log_support, "mangrove_log", "mangrove_log_top");
        supportColumn(ModBlocks.bamboo_block_support, "bamboo_block", "bamboo_block_top");
        supportColumn(ModBlocks.crimson_stem_support, "crimson_stem", "crimson_stem_top");
        supportColumn(ModBlocks.warped_stem_support, "warped_stem", "warped_stem_top");
        supportBasic(ModBlocks.blackstone_support, "blackstone");
        supportBasic(ModBlocks.polished_blackstone_support, "polished_blackstone");
        supportBasic(ModBlocks.stone_support, "stone");
        supportBasic(ModBlocks.smooth_stone_support, "smooth_stone");
        supportBasic(ModBlocks.cobblestone_support, "cobblestone");
        supportBasic(ModBlocks.mossy_cobblestone_support, "mossy_cobblestone");
        supportTopBottom(ModBlocks.sandstone_support, "sandstone", "sandstone_top", "sandstone_bottom");
        supportBasic(ModBlocks.smooth_sandstone_support, "sandstone_top");
        supportTopBottom(ModBlocks.red_sandstone_support, "red_sandstone", "red_sandstone_top", "red_sandstone_bottom");
        supportBasic(ModBlocks.smooth_red_sandstone_support, "red_sandstone_top");
        supportBasic(ModBlocks.stone_brick_support, "stone_bricks");
        supportBasic(ModBlocks.cracked_stone_brick_support, "cracked_stone_bricks");
        supportBasic(ModBlocks.mossy_stone_brick_support, "mossy_stone_bricks");
        supportBasic(ModBlocks.prismarine_support, "prismarine");
        supportBasic(ModBlocks.prismarine_brick_support, "prismarine_bricks");
        supportBasic(ModBlocks.dark_prismarine_support, "dark_prismarine");
        supportBasic(ModBlocks.purpur_support, "purpur_block");
        supportBasic(ModBlocks.tuff_support, "tuff");
    }

    public void fenceTopBottom(Supplier<? extends FenceBlock> block, String side, String top, String bottom) {
        fence(block, this.locParent(side), this.locParent(top), this.locParent(bottom), SOLID);
    }

    public void fenceGateTopBottom(Supplier<? extends FenceGateBlock> block, String side, String top, String bottom) {
        fenceGate(block, locParent(side), locParent(top), locParent(bottom), SOLID);
    }

    public void doorBlockTopBottom(Supplier<? extends DoorBlock> block, String side, String top, String bottom) {
        door(block, locParent(side), locParent(bottom), locParent(top), locParent(side), CUTOUT);
    }

    public void poleTopBottom(Supplier<? extends OrnamentPole> block, String side, String top, String bottom) {
        this.pole(block, locParent(side), locParent(top), locParent(bottom), locParent(side), SOLID);
    }

    public void beamTopBottom(Supplier<? extends OrnamentBeam> block, String name) {
        beam(block, locParent(name), locParent(name + "_top"), locParent(name + "_bottom"), locParent(name), SOLID);
    }

    public void saddleDoorTopBottom(Supplier<? extends OrnamentSaddleDoor> block, String side, String top, String bottom) {
        saddleDoor(block, locParent(side), locParent(bottom), locParent(top), CUTOUT);
    }

    public void supportTopBottom(Supplier<? extends OrnamentSupport> block, String side, String top, String bottom) {
        support(block, locParent(side), locParent(bottom), locParent(top), SOLID);
    }
}
