package com.androsa.undeco;

import com.androsa.ornamental.builder.OrnamentBuilder;
import com.androsa.undeco.data.UDBlockTags;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import java.util.List;

public class UDBuilders {

    public static final OrnamentBuilder OAK_PLANKS = createPlankOrnament("oak", Material.WOOD, MaterialColor.WOOD, Blocks.OAK_PLANKS, BlockSetType.OAK);
    public static final OrnamentBuilder SPRUCE_PLANKS = createPlankOrnament("spruce", Material.WOOD, MaterialColor.PODZOL, Blocks.SPRUCE_PLANKS, BlockSetType.SPRUCE);
    public static final OrnamentBuilder BIRCH_PLANKS = createPlankOrnament("birch", Material.WOOD, MaterialColor.SAND, Blocks.BIRCH_PLANKS, BlockSetType.BIRCH);
    public static final OrnamentBuilder JUNGLE_PLANKS = createPlankOrnament("jungle", Material.WOOD, MaterialColor.DIRT, Blocks.JUNGLE_PLANKS, BlockSetType.JUNGLE);
    public static final OrnamentBuilder ACACIA_PLANKS = createPlankOrnament("acacia", Material.WOOD, MaterialColor.COLOR_ORANGE, Blocks.ACACIA_PLANKS, BlockSetType.ACACIA);
    public static final OrnamentBuilder DARK_OAK_PLANKS = createPlankOrnament("dark_oak", Material.WOOD, MaterialColor.COLOR_BROWN, Blocks.DARK_OAK_PLANKS, BlockSetType.DARK_OAK);
    public static final OrnamentBuilder MANGROVE_PLANKS = createPlankOrnament("mangrove", Material.WOOD, MaterialColor.COLOR_RED, Blocks.MANGROVE_PLANKS, BlockSetType.MANGROVE);
    public static final OrnamentBuilder CRIMSON_PLANKS = createPlankOrnament("crimson", Material.NETHER_WOOD, MaterialColor.CRIMSON_STEM, Blocks.CRIMSON_PLANKS, BlockSetType.CRIMSON);
    public static final OrnamentBuilder WARPED_PLANKS = createPlankOrnament("warped", Material.NETHER_WOOD, MaterialColor.WARPED_STEM, Blocks.WARPED_PLANKS, BlockSetType.WARPED);
    public static final OrnamentBuilder GRANITE = createStoneOrnament("granite", MaterialColor.DIRT, Blocks.GRANITE);
    public static final OrnamentBuilder POLISHED_GRANITE = createStoneOrnament("polished_granite", MaterialColor.DIRT, Blocks.POLISHED_GRANITE);
    public static final OrnamentBuilder DIORITE = createStoneOrnament("diorite", MaterialColor.QUARTZ, Blocks.DIORITE);
    public static final OrnamentBuilder POLISHED_DIORITE = createStoneOrnament("polished_diorite", MaterialColor.QUARTZ, Blocks.POLISHED_DIORITE);
    public static final OrnamentBuilder ANDESITE = createStoneOrnament("andesite", MaterialColor.STONE, Blocks.ANDESITE);
    public static final OrnamentBuilder POLISHED_ANDESITE = createStoneOrnament("polished_andesite", MaterialColor.STONE, Blocks.POLISHED_ANDESITE);
    public static final OrnamentBuilder OAK_LOG = createLogOrnament("oak_log", MaterialColor.WOOD, Blocks.OAK_LOG);
    public static final OrnamentBuilder SPRUCE_LOG = createLogOrnament("spruce_log", MaterialColor.PODZOL, Blocks.SPRUCE_LOG);
    public static final OrnamentBuilder BIRCH_LOG = createLogOrnament("birch_log", MaterialColor.SAND, Blocks.BIRCH_LOG);
    public static final OrnamentBuilder JUNGLE_LOG = createLogOrnament("jungle_log", MaterialColor.DIRT, Blocks.JUNGLE_LOG);
    public static final OrnamentBuilder ACACIA_LOG = createLogOrnament("acacia_log", MaterialColor.COLOR_ORANGE, Blocks.ACACIA_LOG);
    public static final OrnamentBuilder DARK_OAK_LOG = createLogOrnament("dark_oak_log", MaterialColor.COLOR_BROWN, Blocks.DARK_OAK_LOG);
    public static final OrnamentBuilder MANGROVE_LOG = createLogOrnament("mangrove_log", MaterialColor.COLOR_RED, Blocks.MANGROVE_LOG);
    public static final OrnamentBuilder CRIMSON_STEM = createStemOrnament("crimson_stem", MaterialColor.CRIMSON_STEM, Blocks.CRIMSON_STEM);
    public static final OrnamentBuilder WARPED_STEM = createStemOrnament("warped_stem", MaterialColor.WARPED_STEM, Blocks.WARPED_STEM);
    public static final OrnamentBuilder BLACKSTONE = createStoneOrnament("blackstone", MaterialColor.COLOR_BLACK, Blocks.BLACKSTONE);
    public static final OrnamentBuilder POLISHED_BLACKSTONE = createStoneOrnament("polished_blackstone", MaterialColor.COLOR_BLACK, Blocks.POLISHED_BLACKSTONE, BlockSetType.POLISHED_BLACKSTONE);
    public static final OrnamentBuilder STONE = createStoneOrnament("stone", MaterialColor.STONE, Blocks.STONE, BlockSetType.STONE);
    public static final OrnamentBuilder SMOOTH_STONE = createStoneToughOrnament("smooth_stone", MaterialColor.STONE, Blocks.SMOOTH_STONE);
    public static final OrnamentBuilder COBBLESTONE = createStoneToughOrnament("cobblestone", MaterialColor.STONE, Blocks.COBBLESTONE);
    public static final OrnamentBuilder MOSSY_COBBLESTONE = createStoneToughOrnament("mossy_cobblestone", MaterialColor.STONE, Blocks.MOSSY_COBBLESTONE);
    public static final OrnamentBuilder SANDSTONE = createSandstoneOrnament("sandstone", MaterialColor.SAND, Blocks.SANDSTONE);
    public static final OrnamentBuilder SMOOTH_SANDSTONE = createSandstoneOrnament("smooth_sandstone", MaterialColor.SAND, Blocks.SMOOTH_STONE);
    public static final OrnamentBuilder RED_SANDSTONE = createSandstoneOrnament("red_sandstone", MaterialColor.COLOR_ORANGE, Blocks.RED_SANDSTONE);
    public static final OrnamentBuilder SMOOTH_RED_SANDSTONE = createSandstoneOrnament("smooth_red_sandstone", MaterialColor.COLOR_ORANGE, Blocks.SMOOTH_RED_SANDSTONE);
    public static final OrnamentBuilder STONE_BRICKS = createStoneOrnament("stone_brick", MaterialColor.STONE, Blocks.STONE_BRICKS);
    public static final OrnamentBuilder CRACKED_STONE_BRICKS = createStoneOrnament("cracked_stone_brick", MaterialColor.STONE, Blocks.CRACKED_STONE_BRICKS);
    public static final OrnamentBuilder MOSSY_STONE_BRICKS = createStoneOrnament("mossy_stone_brick", MaterialColor.STONE, Blocks.MOSSY_STONE_BRICKS);
    public static final OrnamentBuilder PRISMARINE = createStoneOrnament("prismarine", MaterialColor.COLOR_CYAN, Blocks.PRISMARINE);
    public static final OrnamentBuilder PRISMARINE_BRICKS = createStoneOrnament("prismarine_brick", MaterialColor.DIAMOND, Blocks.PRISMARINE_BRICKS);
    public static final OrnamentBuilder DARK_PRISMARINE = createStoneOrnament("dark_prismarine", MaterialColor.DIAMOND, Blocks.DARK_PRISMARINE);
    public static final OrnamentBuilder PURPUR = createStoneOrnament("purpur", MaterialColor.COLOR_MAGENTA, Blocks.PURPUR_BLOCK);
    public static final OrnamentBuilder TUFF = createStoneOrnament("tuff", MaterialColor.TERRACOTTA_GRAY, SoundType.TUFF, Blocks.TUFF);

    private static OrnamentBuilder createPlankOrnament(String name, Material material, MaterialColor color, Block base, BlockSetType type) {
        return new OrnamentBuilder(name)
                .properties(material, color)
                .hardnessAndResistance(2.0F, 3.0F)
                .stairBaseBlock(() -> base)
                .blockSetType(type)
                .burnTime(200, 300, 300, 150, 300, 300, 150, 150, 300, 100)
                .canOpen()
                .addBlockTags(List.of(UDBlockTags.AXE_TOOL));
    }

    private static OrnamentBuilder createStoneOrnament(String name, MaterialColor color, Block base) {
        return createStoneOrnament(name, color, SoundType.STONE, base);
    }

    private static OrnamentBuilder createStoneOrnament(String name, MaterialColor color, SoundType sound, Block base) {
        BlockSetType blockset = BlockSetType.register(new BlockSetType(name, sound, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN, SoundEvents.IRON_TRAPDOOR_CLOSE, SoundEvents.IRON_TRAPDOOR_OPEN, SoundEvents.STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.STONE_PRESSURE_PLATE_CLICK_ON, SoundEvents.STONE_BUTTON_CLICK_OFF, SoundEvents.STONE_BUTTON_CLICK_ON));
        return createStoneOrnament(name, color, base, blockset);
    }

    private static OrnamentBuilder createStoneOrnament(String name, MaterialColor color, Block base, BlockSetType type) {
        return new OrnamentBuilder(name)
                .properties(Material.STONE, color)
                .hardnessAndResistance(1.5F, 6.0F)
                .stairBaseBlock(() -> base)
                .blockSetType(type)
                .saddledoorSounds(SoundEvents.IRON_TRAPDOOR_OPEN, SoundEvents.IRON_TRAPDOOR_CLOSE)
                .addBlockTags(List.of(UDBlockTags.PICKAXE_TOOL));
    }

    private static OrnamentBuilder createStoneToughOrnament(String name, MaterialColor color, Block base) {
        return new OrnamentBuilder(name)
                .properties(Material.STONE, color)
                .hardnessAndResistance(2.0F, 6.0F)
                .stairBaseBlock(() -> base)
                .blockSetType(SoundType.STONE, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN, SoundEvents.IRON_TRAPDOOR_CLOSE, SoundEvents.IRON_TRAPDOOR_OPEN, SoundEvents.STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.STONE_PRESSURE_PLATE_CLICK_ON, SoundEvents.STONE_BUTTON_CLICK_OFF, SoundEvents.STONE_BUTTON_CLICK_ON)
                .saddledoorSounds(SoundEvents.IRON_TRAPDOOR_OPEN, SoundEvents.IRON_TRAPDOOR_CLOSE)
                .addBlockTags(List.of(UDBlockTags.PICKAXE_TOOL));
    }

    private static OrnamentBuilder createLogOrnament(String name, MaterialColor color, Block base) {
        return new OrnamentBuilder(name)
                .properties(Material.WOOD, color)
                .hardnessAndResistance(2.0F)
                .stairBaseBlock(() -> base)
                .blockSetType(SoundType.WOOD, SoundEvents.WOODEN_DOOR_CLOSE, SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_TRAPDOOR_CLOSE, SoundEvents.WOODEN_TRAPDOOR_OPEN, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON)
                .burnTime(200, 300, 300, 150, 300, 300, 150, 150, 300, 100)
                .canOpen()
                .addBlockTags(List.of(UDBlockTags.AXE_TOOL));
    }

    private static OrnamentBuilder createStemOrnament(String name, MaterialColor color, Block base) {
        return new OrnamentBuilder(name)
                .properties(Material.NETHER_WOOD, color)
                .hardnessAndResistance(2.0F)
                .stairBaseBlock(() -> base)
                .blockSetType(SoundType.STEM, SoundEvents.NETHER_WOOD_DOOR_CLOSE, SoundEvents.NETHER_WOOD_DOOR_OPEN, SoundEvents.NETHER_WOOD_TRAPDOOR_CLOSE, SoundEvents.NETHER_WOOD_TRAPDOOR_OPEN, SoundEvents.NETHER_WOOD_PRESSURE_PLATE_CLICK_OFF, SoundEvents.NETHER_WOOD_PRESSURE_PLATE_CLICK_ON, SoundEvents.NETHER_WOOD_BUTTON_CLICK_OFF, SoundEvents.NETHER_WOOD_BUTTON_CLICK_ON)
                .fencegateSounds(SoundEvents.NETHER_WOOD_FENCE_GATE_OPEN, SoundEvents.NETHER_WOOD_FENCE_GATE_CLOSE)
                .saddledoorSounds(SoundEvents.NETHER_WOOD_TRAPDOOR_OPEN, SoundEvents.NETHER_WOOD_TRAPDOOR_CLOSE)
                .burnTime(200, 300, 300, 150, 300, 300, 150, 150, 300, 100)
                .canOpen()
                .addBlockTags(List.of(UDBlockTags.AXE_TOOL));
    }

    private static OrnamentBuilder createSandstoneOrnament(String name, MaterialColor color, Block base) {
        return new OrnamentBuilder(name)
                .properties(Material.STONE, color)
                .hardnessAndResistance(0.8F)
                .stairBaseBlock(() -> base)
                .blockSetType(SoundType.STONE, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN, SoundEvents.IRON_TRAPDOOR_CLOSE, SoundEvents.IRON_TRAPDOOR_OPEN, SoundEvents.STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.STONE_PRESSURE_PLATE_CLICK_ON, SoundEvents.STONE_BUTTON_CLICK_OFF, SoundEvents.STONE_BUTTON_CLICK_ON)
                .saddledoorSounds(SoundEvents.IRON_TRAPDOOR_OPEN, SoundEvents.IRON_TRAPDOOR_CLOSE)
                .addBlockTags(List.of(UDBlockTags.PICKAXE_TOOL));
    }
}
