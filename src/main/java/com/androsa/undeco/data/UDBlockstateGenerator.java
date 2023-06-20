package com.androsa.undeco.data;

import com.androsa.ornamental.blocks.OrnamentBeam;
import com.androsa.ornamental.blocks.OrnamentPole;
import com.androsa.ornamental.blocks.OrnamentSaddleDoor;
import com.androsa.ornamental.data.provider.OrnamentalBlockStateProvider;
import com.androsa.undeco.ModBlocks;
import com.androsa.undeco.UnusuallyDecorative;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nonnull;

public class UDBlockstateGenerator extends OrnamentalBlockStateProvider {

    public UDBlockstateGenerator(PackOutput output, ExistingFileHelper helper) {
        super(output, UnusuallyDecorative.MODID, helper);
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

        trapdoorVanilla(ModBlocks.granite_trapdoor, "granite");
        trapdoorBasic(ModBlocks.polished_granite_trapdoor, "polished_granite");
        trapdoorVanilla(ModBlocks.diorite_trapdoor, "diorite");
        trapdoorBasic(ModBlocks.polished_diorite_trapdoor, "polished_diorite");
        trapdoorVanilla(ModBlocks.andesite_trapdoor, "andesite");
        trapdoorBasic(ModBlocks.polished_andesite_trapdoor, "polished_andesite");
        trapdoorVanilla(ModBlocks.oak_log_trapdoor, "oak_log");
        trapdoorVanilla(ModBlocks.spruce_log_trapdoor, "spruce_log");
        trapdoorVanilla(ModBlocks.birch_log_trapdoor, "birch_log");
        trapdoorVanilla(ModBlocks.jungle_log_trapdoor, "jungle_log");
        trapdoorVanilla(ModBlocks.acacia_log_trapdoor, "acacia_log");
        trapdoorVanilla(ModBlocks.cherry_log_trapdoor, "cherry_log");
        trapdoorVanilla(ModBlocks.dark_oak_log_trapdoor, "dark_oak_log");
        trapdoorVanilla(ModBlocks.mangrove_log_trapdoor, "mangrove_log");
        trapdoorVanilla(ModBlocks.crimson_stem_trapdoor, "crimson_stem");
        trapdoorVanilla(ModBlocks.warped_stem_trapdoor, "warped_stem");
        trapdoorVanilla(ModBlocks.blackstone_trapdoor, "blackstone");
        trapdoorBasic(ModBlocks.polished_blackstone_trapdoor, "polished_blackstone");
        trapdoorVanilla(ModBlocks.stone_trapdoor, "stone");
        trapdoorBasic(ModBlocks.smooth_stone_trapdoor, "smooth_stone");
        trapdoorVanilla(ModBlocks.cobblestone_trapdoor, "cobblestone");
        trapdoorVanilla(ModBlocks.mossy_cobblestone_trapdoor, "mossy_cobblestone");
        trapdoorVanilla(ModBlocks.sandstone_trapdoor, "sandstone_top");
        trapdoorBasic(ModBlocks.smooth_sandstone_trapdoor, "smooth_sandstone");
        trapdoorVanilla(ModBlocks.red_sandstone_trapdoor, "red_sandstone_top");
        trapdoorBasic(ModBlocks.smooth_red_sandstone_trapdoor, "smooth_red_sandstone");
        trapdoorVanilla(ModBlocks.stone_brick_trapdoor, "stone_bricks");
        trapdoorVanilla(ModBlocks.cracked_stone_brick_trapdoor, "cracked_stone_bricks");
        trapdoorVanilla(ModBlocks.mossy_stone_brick_trapdoor, "mossy_stone_bricks");
        trapdoorVanilla(ModBlocks.prismarine_trapdoor, "prismarine");
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

        doorBasicVanilla(ModBlocks.granite_door, "granite");
        doorBasic(ModBlocks.polished_granite_door, "polished_granite");
        doorBasicVanilla(ModBlocks.diorite_door, "diorite");
        doorBasic(ModBlocks.polished_diorite_door, "polished_diorite");
        doorBasicVanilla(ModBlocks.andesite_door, "andesite");
        doorBasic(ModBlocks.polished_andesite_door, "polished_andesite");
        doorBasicVanilla(ModBlocks.oak_log_door, "oak_log");
        doorBasicVanilla(ModBlocks.spruce_log_door, "spruce_log");
        doorBasicVanilla(ModBlocks.birch_log_door, "birch_log");
        doorBasicVanilla(ModBlocks.jungle_log_door, "jungle_log");
        doorBasicVanilla(ModBlocks.acacia_log_door, "acacia_log");
        doorBasicVanilla(ModBlocks.cherry_log_door, "cherry_log");
        doorBasicVanilla(ModBlocks.dark_oak_log_door, "dark_oak_log");
        doorBasicVanilla(ModBlocks.mangrove_log_door, "mangrove_log");
        doorBasicVanilla(ModBlocks.crimson_stem_door, "crimson_stem");
        doorBasicVanilla(ModBlocks.warped_stem_door, "warped_stem");
        doorBasicVanilla(ModBlocks.blackstone_door, "blackstone");
        doorBasic(ModBlocks.polished_blackstone_door, "polished_blackstone");
        doorBasicVanilla(ModBlocks.stone_door, "stone");
        doorBasic(ModBlocks.smooth_stone_door, "smooth_stone");
        doorBasicVanilla(ModBlocks.cobblestone_door, "cobblestone");
        doorBasicVanilla(ModBlocks.mossy_cobblestone_door, "mossy_cobblestone");
        doorBlockTopBottom(ModBlocks.sandstone_door, "sandstone", "sandstone_top", "sandstone_bottom");
        doorBasic(ModBlocks.smooth_sandstone_door, "smooth_sandstone");
        doorBlockTopBottom(ModBlocks.red_sandstone_door, "red_sandstone", "red_sandstone_top", "red_sandstone_bottom");
        doorBasic(ModBlocks.smooth_red_sandstone_door, "smooth_red_sandstone");
        doorBasicVanilla(ModBlocks.stone_brick_door, "stone_bricks");
        doorBasicVanilla(ModBlocks.cracked_stone_brick_door, "cracked_stone_bricks");
        doorBasicVanilla(ModBlocks.mossy_stone_brick_door, "mossy_stone_bricks");
        doorBasicVanilla(ModBlocks.prismarine_door, "prismarine");
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
        poleLog(ModBlocks.oak_log_pole, "oak_log");
        poleLog(ModBlocks.spruce_log_pole, "spruce_log");
        poleLog(ModBlocks.birch_log_pole, "birch_log");
        poleLog(ModBlocks.jungle_log_pole, "jungle_log");
        poleLog(ModBlocks.acacia_log_pole, "acacia_log");
        poleLog(ModBlocks.cherry_log_pole, "cherry_log");
        poleLog(ModBlocks.dark_oak_log_pole, "dark_oak_log");
        poleLog(ModBlocks.mangrove_log_pole, "mangrove_log");
        poleLog(ModBlocks.crimson_stem_pole, "crimson_stem");
        poleLog(ModBlocks.warped_stem_pole, "warped_stem");
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
        beamLog(ModBlocks.oak_log_beam, "oak_log");
        beamLog(ModBlocks.spruce_log_beam, "spruce_log");
        beamLog(ModBlocks.birch_log_beam, "birch_log");
        beamLog(ModBlocks.jungle_log_beam, "jungle_log");
        beamLog(ModBlocks.acacia_log_beam, "acacia_log");
        beamLog(ModBlocks.cherry_log_beam, "cherry_log");
        beamLog(ModBlocks.dark_oak_log_beam, "dark_oak_log");
        beamLog(ModBlocks.mangrove_log_beam, "mangrove_log");
        beamLog(ModBlocks.crimson_stem_beam, "crimson_stem");
        beamLog(ModBlocks.warped_stem_beam, "warped_stem");
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

        saddleDoorVanilla(ModBlocks.oak_saddle_door, "oak_trapdoor");
        saddleDoorVanilla(ModBlocks.spruce_saddle_door, "spruce_trapdoor");
        saddleDoorVanilla(ModBlocks.birch_saddle_door, "birch_trapdoor");
        saddleDoorVanilla(ModBlocks.jungle_saddle_door, "jungle_trapdoor");
        saddleDoorVanilla(ModBlocks.acacia_saddle_door, "acacia_trapdoor");
        saddleDoorVanilla(ModBlocks.cherry_saddle_door, "cherry_trapdoor");
        saddleDoorVanilla(ModBlocks.dark_oak_saddle_door, "dark_oak_trapdoor");
        saddleDoorVanilla(ModBlocks.mangrove_saddle_door, "mangrove_trapdoor");
        saddleDoorVanilla(ModBlocks.bamboo_saddle_door, "bamboo_trapdoor");
        saddleDoorVanilla(ModBlocks.crimson_saddle_door, "crimson_trapdoor");
        saddleDoorVanilla(ModBlocks.warped_saddle_door, "warped_trapdoor");
        saddleDoorVanilla(ModBlocks.granite_saddle_door, "granite");
        saddleDoorBasic(ModBlocks.polished_granite_saddle_door, "polished_granite");
        saddleDoorVanilla(ModBlocks.diorite_saddle_door, "diorite");
        saddleDoorBasic(ModBlocks.polished_diorite_saddle_door, "polished_diorite");
        saddleDoorVanilla(ModBlocks.andesite_saddle_door, "andesite");
        saddleDoorBasic(ModBlocks.polished_andesite_saddle_door, "polished_andesite");
        saddleDoorVanilla(ModBlocks.oak_log_saddle_door, "oak_log");
        saddleDoorVanilla(ModBlocks.spruce_log_saddle_door, "spruce_log");
        saddleDoorVanilla(ModBlocks.birch_log_saddle_door, "birch_log");
        saddleDoorVanilla(ModBlocks.jungle_log_saddle_door, "jungle_log");
        saddleDoorVanilla(ModBlocks.acacia_log_saddle_door, "acacia_log");
        saddleDoorVanilla(ModBlocks.cherry_log_saddle_door, "cherry_log");
        saddleDoorVanilla(ModBlocks.dark_oak_log_saddle_door, "dark_oak_log");
        saddleDoorVanilla(ModBlocks.mangrove_log_saddle_door, "mangrove_log");
        saddleDoorVanilla(ModBlocks.crimson_stem_saddle_door, "crimson_stem");
        saddleDoorVanilla(ModBlocks.warped_stem_saddle_door, "warped_stem");
        saddleDoorVanilla(ModBlocks.blackstone_saddle_door, "blackstone");
        saddleDoorBasic(ModBlocks.polished_blackstone_saddle_door, "polished_blackstone");
        saddleDoorVanilla(ModBlocks.stone_saddle_door, "stone");
        saddleDoorBasic(ModBlocks.smooth_stone_saddle_door, "smooth_stone");
        saddleDoorVanilla(ModBlocks.cobblestone_saddle_door, "cobblestone");
        saddleDoorVanilla(ModBlocks.mossy_cobblestone_saddle_door, "mossy_cobblestone");
        saddleDoorTopBottom(ModBlocks.sandstone_saddle_door, "sandstone", "sandstone_top", "sandstone_bottom");
        saddleDoorBasic(ModBlocks.smooth_sandstone_saddle_door, "smooth_sandstone");
        saddleDoorTopBottom(ModBlocks.red_sandstone_saddle_door, "red_sandstone", "red_sandstone_top", "red_sandstone_bottom");
        saddleDoorBasic(ModBlocks.smooth_red_sandstone_saddle_door, "smooth_red_sandstone");
        saddleDoorVanilla(ModBlocks.stone_brick_saddle_door, "stone_bricks");
        saddleDoorVanilla(ModBlocks.cracked_stone_brick_saddle_door, "cracked_stone_bricks");
        saddleDoorVanilla(ModBlocks.mossy_stone_brick_saddle_door, "mossy_stone_bricks");
        saddleDoorVanilla(ModBlocks.prismarine_saddle_door, "prismarine");
        saddleDoorBasic(ModBlocks.prismarine_brick_saddle_door, "prismarine_brick");
        saddleDoorBasic(ModBlocks.dark_prismarine_saddle_door, "dark_prismarine");
        saddleDoorBasic(ModBlocks.purpur_saddle_door, "purpur");
        saddleDoorBasic(ModBlocks.tuff_saddle_door, "tuff");
    }

    public void fenceTopBottom(RegistryObject<? extends FenceBlock> block, String side, String top, String bottom) {
        fence(block, this.locVanilla(side), this.locVanilla(top), this.locVanilla(bottom), SOLID);
    }

    public void fenceGateTopBottom(RegistryObject<? extends FenceGateBlock> block, String side, String top, String bottom) {
        fenceGate(block, locVanilla(side), locVanilla(top), locVanilla(bottom), SOLID);
    }

    public void doorBlockTopBottom(RegistryObject<? extends DoorBlock> block, String side, String top, String bottom) {
        door(block, locVanilla(side), locVanilla(bottom), locVanilla(top), locVanilla(side), CUTOUT);
    }

    public void poleLog(RegistryObject<? extends OrnamentPole> block, String name) {
        this.poleColumn(block, name, name, name + "_top");
    }

    public void poleTopBottom(RegistryObject<? extends OrnamentPole> block, String side, String top, String bottom) {
        this.pole(block, locVanilla(side), locVanilla(top), locVanilla(bottom), locVanilla(side), SOLID);
    }

    public void beamLog(RegistryObject<? extends OrnamentBeam> block, String name) {
        beamColumn(block, name, name + "_top", name);
    }

    public void beamTopBottom(RegistryObject<? extends OrnamentBeam> block, String name) {
        beam(block, locVanilla(name), locVanilla(name + "_top"), locVanilla(name + "_bottom"), locVanilla(name), SOLID);
    }

    public void saddleDoorTopBottom(RegistryObject<? extends OrnamentSaddleDoor> block, String side, String top, String bottom) {
        saddleDoor(block, locVanilla(side), locVanilla(bottom), locVanilla(top), CUTOUT);
    }
}
