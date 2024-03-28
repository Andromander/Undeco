package com.androsa.undeco;

import com.androsa.ornamental.builder.BlockSetBuilder;
import com.androsa.ornamental.builder.OrnamentBuilder;
import com.androsa.undeco.data.UDBlockTags;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import java.util.ArrayList;
import java.util.List;

public class UDBuilders {

    public static final OrnamentBuilder OAK_PLANKS = createFirePlankOrnament("oak", MapColor.WOOD, Blocks.OAK_PLANKS, BlockSetType.OAK);
    public static final OrnamentBuilder SPRUCE_PLANKS = createFirePlankOrnament("spruce", MapColor.PODZOL, Blocks.SPRUCE_PLANKS, BlockSetType.SPRUCE);
    public static final OrnamentBuilder BIRCH_PLANKS = createFirePlankOrnament("birch", MapColor.SAND, Blocks.BIRCH_PLANKS, BlockSetType.BIRCH);
    public static final OrnamentBuilder JUNGLE_PLANKS = createFirePlankOrnament("jungle", MapColor.DIRT, Blocks.JUNGLE_PLANKS, BlockSetType.JUNGLE);
    public static final OrnamentBuilder ACACIA_PLANKS = createFirePlankOrnament("acacia", MapColor.COLOR_ORANGE, Blocks.ACACIA_PLANKS, BlockSetType.ACACIA);
    public static final OrnamentBuilder CHERRY_PLANKS = createFirePlankOrnament("cherry", MapColor.TERRACOTTA_WHITE, Blocks.CHERRY_PLANKS, BlockSetType.CHERRY);
    public static final OrnamentBuilder DARK_OAK_PLANKS = createFirePlankOrnament("dark_oak", MapColor.COLOR_BROWN, Blocks.DARK_OAK_PLANKS, BlockSetType.DARK_OAK);
    public static final OrnamentBuilder MANGROVE_PLANKS = createFirePlankOrnament("mangrove", MapColor.COLOR_RED, Blocks.MANGROVE_PLANKS, BlockSetType.MANGROVE);
    public static final OrnamentBuilder BAMBOO_PLANKS = createFirePlankOrnament("bamboo", MapColor.COLOR_YELLOW, Blocks.BAMBOO_PLANKS, BlockSetType.BAMBOO);
    public static final OrnamentBuilder CRIMSON_PLANKS = createPlankOrnament("crimson", MapColor.CRIMSON_STEM, Blocks.CRIMSON_PLANKS, BlockSetType.CRIMSON);
    public static final OrnamentBuilder WARPED_PLANKS = createPlankOrnament("warped", MapColor.WARPED_STEM, Blocks.WARPED_PLANKS, BlockSetType.WARPED);
    public static final OrnamentBuilder GRANITE = createStoneOrnament("granite", MapColor.DIRT, Blocks.GRANITE);
    public static final OrnamentBuilder POLISHED_GRANITE = createStoneOrnament("polished_granite", MapColor.DIRT, Blocks.POLISHED_GRANITE);
    public static final OrnamentBuilder DIORITE = createStoneOrnament("diorite", MapColor.QUARTZ, Blocks.DIORITE);
    public static final OrnamentBuilder POLISHED_DIORITE = createStoneOrnament("polished_diorite", MapColor.QUARTZ, Blocks.POLISHED_DIORITE);
    public static final OrnamentBuilder ANDESITE = createStoneOrnament("andesite", MapColor.STONE, Blocks.ANDESITE);
    public static final OrnamentBuilder POLISHED_ANDESITE = createStoneOrnament("polished_andesite", MapColor.STONE, Blocks.POLISHED_ANDESITE);
    public static final OrnamentBuilder OAK_LOG = createLogOrnament("oak_log", MapColor.WOOD, Blocks.OAK_LOG);
    public static final OrnamentBuilder SPRUCE_LOG = createLogOrnament("spruce_log", MapColor.PODZOL, Blocks.SPRUCE_LOG);
    public static final OrnamentBuilder BIRCH_LOG = createLogOrnament("birch_log", MapColor.SAND, Blocks.BIRCH_LOG);
    public static final OrnamentBuilder JUNGLE_LOG = createLogOrnament("jungle_log", MapColor.DIRT, Blocks.JUNGLE_LOG);
    public static final OrnamentBuilder ACACIA_LOG = createLogOrnament("acacia_log", MapColor.COLOR_ORANGE, Blocks.ACACIA_LOG);
    public static final OrnamentBuilder CHERRY_LOG = createLogOrnament("cherry_log", MapColor.TERRACOTTA_WHITE, SoundType.CHERRY_WOOD, Blocks.CHERRY_LOG);
    public static final OrnamentBuilder DARK_OAK_LOG = createLogOrnament("dark_oak_log", MapColor.COLOR_BROWN, Blocks.DARK_OAK_LOG);
    public static final OrnamentBuilder MANGROVE_LOG = createLogOrnament("mangrove_log", MapColor.COLOR_RED, Blocks.MANGROVE_LOG);
    public static final OrnamentBuilder BAMBOO_BLOCK = createLogOrnament("bamboo_block", MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD, Blocks.BAMBOO_BLOCK);
    public static final OrnamentBuilder CRIMSON_STEM = createStemOrnament("crimson_stem", MapColor.CRIMSON_STEM, Blocks.CRIMSON_STEM);
    public static final OrnamentBuilder WARPED_STEM = createStemOrnament("warped_stem", MapColor.WARPED_STEM, Blocks.WARPED_STEM);
    public static final OrnamentBuilder BLACKSTONE = createStoneOrnament("blackstone", MapColor.COLOR_BLACK, Blocks.BLACKSTONE);
    public static final OrnamentBuilder POLISHED_BLACKSTONE = createStoneOrnament("polished_blackstone", MapColor.COLOR_BLACK, Blocks.POLISHED_BLACKSTONE, BlockSetType.POLISHED_BLACKSTONE);
    public static final OrnamentBuilder STONE = createStoneOrnament("stone", MapColor.STONE, Blocks.STONE, BlockSetType.STONE);
    public static final OrnamentBuilder SMOOTH_STONE = createStoneToughOrnament("smooth_stone", MapColor.STONE, Blocks.SMOOTH_STONE);
    public static final OrnamentBuilder COBBLESTONE = createStoneToughOrnament("cobblestone", MapColor.STONE, Blocks.COBBLESTONE);
    public static final OrnamentBuilder MOSSY_COBBLESTONE = createStoneToughOrnament("mossy_cobblestone", MapColor.STONE, Blocks.MOSSY_COBBLESTONE);
    public static final OrnamentBuilder SANDSTONE = createSandstoneOrnament("sandstone", MapColor.SAND, Blocks.SANDSTONE);
    public static final OrnamentBuilder SMOOTH_SANDSTONE = createSandstoneOrnament("smooth_sandstone", MapColor.SAND, Blocks.SMOOTH_STONE);
    public static final OrnamentBuilder RED_SANDSTONE = createSandstoneOrnament("red_sandstone", MapColor.COLOR_ORANGE, Blocks.RED_SANDSTONE);
    public static final OrnamentBuilder SMOOTH_RED_SANDSTONE = createSandstoneOrnament("smooth_red_sandstone", MapColor.COLOR_ORANGE, Blocks.SMOOTH_RED_SANDSTONE);
    public static final OrnamentBuilder STONE_BRICKS = createStoneOrnament("stone_brick", MapColor.STONE, Blocks.STONE_BRICKS);
    public static final OrnamentBuilder CRACKED_STONE_BRICKS = createStoneOrnament("cracked_stone_brick", MapColor.STONE, Blocks.CRACKED_STONE_BRICKS);
    public static final OrnamentBuilder MOSSY_STONE_BRICKS = createStoneOrnament("mossy_stone_brick", MapColor.STONE, Blocks.MOSSY_STONE_BRICKS);
    public static final OrnamentBuilder PRISMARINE = createStoneOrnament("prismarine", MapColor.COLOR_CYAN, Blocks.PRISMARINE);
    public static final OrnamentBuilder PRISMARINE_BRICKS = createStoneOrnament("prismarine_brick", MapColor.DIAMOND, Blocks.PRISMARINE_BRICKS);
    public static final OrnamentBuilder DARK_PRISMARINE = createStoneOrnament("dark_prismarine", MapColor.DIAMOND, Blocks.DARK_PRISMARINE);
    public static final OrnamentBuilder PURPUR = createStoneOrnament("purpur", MapColor.COLOR_MAGENTA, Blocks.PURPUR_BLOCK);
    public static final OrnamentBuilder TUFF = createStoneOrnament("tuff", MapColor.TERRACOTTA_GRAY, SoundType.TUFF, Blocks.TUFF);
    public static final OrnamentBuilder DEEPSLATE = createDeepslateOrnament("deepslate", 3.0F, SoundType.DEEPSLATE, Blocks.DEEPSLATE);
    public static final OrnamentBuilder COBBLED_DEEPSLATE = createDeepslateOrnament("cobbled_deepslate", 3.5F, SoundType.DEEPSLATE, Blocks.COBBLED_DEEPSLATE);
    public static final OrnamentBuilder POLISHED_DEEPSLATE = createDeepslateOrnament("polished_deepslate", 3.5F, SoundType.POLISHED_DEEPSLATE, Blocks.POLISHED_DEEPSLATE);
    public static final OrnamentBuilder DEEPSLATE_TILE = createDeepslateOrnament("deepslate_tile", 3.5F, SoundType.DEEPSLATE_TILES, Blocks.DEEPSLATE_TILES);
    public static final OrnamentBuilder DEEPSLATE_BRICK = createDeepslateOrnament("deepslate_brick", 3.5F, SoundType.DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICKS);
    public static final OrnamentBuilder CRACKED_DEEPSLATE_BRICK = createDeepslateOrnament("cracked_deepslate_brick", 3.5F, SoundType.DEEPSLATE_BRICKS, Blocks.CRACKED_DEEPSLATE_BRICKS);
    public static final OrnamentBuilder CRACKED_DEEPSLATE_TILE = createDeepslateOrnament("cracked_deepslate_tile", 3.5F, SoundType.DEEPSLATE_TILES, Blocks.CRACKED_DEEPSLATE_TILES);

    private static OrnamentBuilder createFirePlankOrnament(String name, MapColor color, Block base, BlockSetType type) {
        return new OrnamentBuilder(name)
                .mapColor(color)
                .hardnessAndResistance(2.0F, 3.0F)
                .stairBaseBlock(() -> base)
                .blockSetType(type)
                .instrument(NoteBlockInstrument.BASS)
                .burnTime(200, 300, 300, 150, 300, 300, 150, 150, 300, 100)
                .addBlockTags(new ArrayList<>(List.of(UDBlockTags.AXE_TOOL)))
                .lavaIgnites()
                .flammable(20, 5);
    }

    private static OrnamentBuilder createPlankOrnament(String name, MapColor color, Block base, BlockSetType type) {
        return new OrnamentBuilder(name)
                .mapColor(color)
                .hardnessAndResistance(2.0F, 3.0F)
                .stairBaseBlock(() -> base)
                .blockSetType(type)
                .instrument(NoteBlockInstrument.BASS)
                .burnTime(200, 300, 300, 150, 300, 300, 150, 150, 300, 100)
                .addBlockTags(new ArrayList<>(List.of(UDBlockTags.AXE_TOOL)));
    }

    private static OrnamentBuilder createStoneOrnament(String name, MapColor color, Block base) {
        return createStoneOrnament(name, color, SoundType.STONE, base);
    }

    private static OrnamentBuilder createStoneOrnament(String name, MapColor color, SoundType sound, Block base) {
        BlockSetType blockset = new BlockSetBuilder(name)
                .soundType(sound)
                .doorSounds(SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)
                .trapdoorSounds(SoundEvents.IRON_TRAPDOOR_CLOSE, SoundEvents.IRON_TRAPDOOR_OPEN)
                .pressurePlateSounds(SoundEvents.STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.STONE_PRESSURE_PLATE_CLICK_ON)
                .buttonSounds(SoundEvents.STONE_BUTTON_CLICK_OFF, SoundEvents.STONE_BUTTON_CLICK_ON)
                .openByHand()
                .openByBreeze()
                .build();
        return createStoneOrnament(name, color, base, blockset);
    }

    private static OrnamentBuilder createStoneOrnament(String name, MapColor color, Block base, BlockSetType type) {
        return new OrnamentBuilder(name)
                .mapColor(color)
                .hardnessAndResistance(1.5F, 6.0F)
                .requiresTool()
                .stairBaseBlock(() -> base)
                .blockSetType(type)
                .saddledoorSounds(SoundEvents.IRON_TRAPDOOR_OPEN, SoundEvents.IRON_TRAPDOOR_CLOSE)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .addBlockTags(new ArrayList<>(List.of(UDBlockTags.PICKAXE_TOOL)));
    }

    private static OrnamentBuilder createStoneToughOrnament(String name, MapColor color, Block base) {
        return new OrnamentBuilder(name)
                .mapColor(color)
                .hardnessAndResistance(2.0F, 6.0F)
                .requiresTool()
                .stairBaseBlock(() -> base)
                .blockSetType(new BlockSetBuilder(name)
                        .openByHand()
                        .openByBreeze()
                        .pressureSensitivity(BlockSetType.PressurePlateSensitivity.MOBS)
                        .soundType(SoundType.STONE)
                        .trapdoorSounds(SoundEvents.IRON_TRAPDOOR_CLOSE, SoundEvents.IRON_TRAPDOOR_OPEN)
                        .doorSounds(SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)
                        .pressurePlateSounds(SoundEvents.STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.STONE_PRESSURE_PLATE_CLICK_ON)
                        .buttonSounds(SoundEvents.STONE_BUTTON_CLICK_OFF, SoundEvents.STONE_BUTTON_CLICK_ON)
                        .build())
                .saddledoorSounds(SoundEvents.IRON_TRAPDOOR_OPEN, SoundEvents.IRON_TRAPDOOR_CLOSE)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .addBlockTags(new ArrayList<>(List.of(UDBlockTags.PICKAXE_TOOL)));
    }

    private static OrnamentBuilder createDeepslateOrnament(String name, float hardness, SoundType sound, Block base) {
        return new OrnamentBuilder(name)
                .mapColor(MapColor.DEEPSLATE)
                .hardnessAndResistance(hardness, 6.0F)
                .requiresTool()
                .stairBaseBlock(() -> base)
                .blockSetType(new BlockSetBuilder(name)
                        .openByHand()
                        .openByBreeze()
                        .pressureSensitivity(BlockSetType.PressurePlateSensitivity.MOBS)
                        .soundType(sound)
                        .trapdoorSounds(SoundEvents.IRON_TRAPDOOR_CLOSE, SoundEvents.IRON_TRAPDOOR_OPEN)
                        .doorSounds(SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)
                        .pressurePlateSounds(SoundEvents.STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.STONE_PRESSURE_PLATE_CLICK_ON)
                        .buttonSounds(SoundEvents.STONE_BUTTON_CLICK_OFF, SoundEvents.STONE_BUTTON_CLICK_ON)
                        .build())
                .saddledoorSounds(SoundEvents.IRON_TRAPDOOR_OPEN, SoundEvents.IRON_TRAPDOOR_CLOSE)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .addBlockTags(new ArrayList<>(List.of(UDBlockTags.PICKAXE_TOOL)));
    }

    private static OrnamentBuilder createLogOrnament(String name, MapColor color, Block base) {
        return createLogOrnament(name, color, SoundType.WOOD, base);
    }

    private static OrnamentBuilder createLogOrnament(String name, MapColor color, SoundType sound, Block base) {
        return new OrnamentBuilder(name)
                .mapColor(color)
                .hardnessAndResistance(2.0F)
                .stairBaseBlock(() -> base)
                .blockSetType(new BlockSetBuilder(name)
                        .weakBlockSet()
                        .soundType(sound)
                        .build())
                .burnTime(225, 150, 225, 100, 225, 225, 75, 75, 225, 100, 225)
                .instrument(NoteBlockInstrument.BASS)
                .addBlockTags(new ArrayList<>(List.of(UDBlockTags.AXE_TOOL)))
                .lavaIgnites();
    }

    private static OrnamentBuilder createStemOrnament(String name, MapColor color, Block base) {
        return new OrnamentBuilder(name)
                .mapColor(color)
                .hardnessAndResistance(2.0F)
                .stairBaseBlock(() -> base)
                .blockSetType(new BlockSetBuilder(name)
                        .weakBlockSet()
                        .soundType(SoundType.STEM)
                        .doorSounds(SoundEvents.NETHER_WOOD_DOOR_CLOSE, SoundEvents.NETHER_WOOD_DOOR_OPEN)
                        .trapdoorSounds(SoundEvents.NETHER_WOOD_TRAPDOOR_CLOSE, SoundEvents.NETHER_WOOD_TRAPDOOR_OPEN)
                        .pressurePlateSounds(SoundEvents.NETHER_WOOD_PRESSURE_PLATE_CLICK_OFF, SoundEvents.NETHER_WOOD_PRESSURE_PLATE_CLICK_ON)
                        .buttonSounds(SoundEvents.NETHER_WOOD_BUTTON_CLICK_OFF, SoundEvents.NETHER_WOOD_BUTTON_CLICK_ON)
                        .build())
                .fencegateSounds(SoundEvents.NETHER_WOOD_FENCE_GATE_OPEN, SoundEvents.NETHER_WOOD_FENCE_GATE_CLOSE)
                .saddledoorSounds(SoundEvents.NETHER_WOOD_TRAPDOOR_OPEN, SoundEvents.NETHER_WOOD_TRAPDOOR_CLOSE)
                .burnTime(225, 150, 225, 100, 225, 225, 75, 75, 225, 100, 225)
                .instrument(NoteBlockInstrument.BASS)
                .addBlockTags(new ArrayList<>(List.of(UDBlockTags.AXE_TOOL)));
    }

    private static OrnamentBuilder createSandstoneOrnament(String name, MapColor color, Block base) {
        return new OrnamentBuilder(name)
                .mapColor(color)
                .hardnessAndResistance(0.8F)
                .requiresTool()
                .stairBaseBlock(() -> base)
                .blockSetType(new BlockSetBuilder(name)
                        .openByHand()
                        .openByBreeze()
                        .pressureSensitivity(BlockSetType.PressurePlateSensitivity.MOBS)
                        .soundType(SoundType.STONE)
                        .doorSounds(SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)
                        .trapdoorSounds(SoundEvents.IRON_TRAPDOOR_CLOSE, SoundEvents.IRON_TRAPDOOR_OPEN)
                        .pressurePlateSounds(SoundEvents.STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.STONE_PRESSURE_PLATE_CLICK_ON)
                        .buttonSounds(SoundEvents.STONE_BUTTON_CLICK_OFF, SoundEvents.STONE_BUTTON_CLICK_ON)
                        .build())
                .saddledoorSounds(SoundEvents.IRON_TRAPDOOR_OPEN, SoundEvents.IRON_TRAPDOOR_CLOSE)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .addBlockTags(new ArrayList<>(List.of(UDBlockTags.PICKAXE_TOOL)));
    }
}
