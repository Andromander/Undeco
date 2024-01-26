package com.androsa.undeco.data;

import com.androsa.ornamental.data.provider.OrnamentalRecipeProvider;
import com.androsa.undeco.ModBlocks;
import com.androsa.undeco.UnusuallyDecorative;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class UDRecipes extends OrnamentalRecipeProvider {

    public UDRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, provider, UnusuallyDecorative.MODID);
    }

    @Override
    protected void buildRecipes(RecipeOutput consumer) {
        autoRecipe(consumer, new AutoRecipeManager(Blocks.OAK_PLANKS, Blocks.OAK_SLAB, false,
                Optional.empty(),
                entry(() -> Blocks.OAK_SLAB, false),
                Optional.empty(),
                entry(() -> Blocks.OAK_TRAPDOOR, false), false,
                Optional.empty(),
                entry(() -> Blocks.OAK_DOOR, false),
                entry(ModBlocks.oak_pole, false),
                entry(ModBlocks.oak_beam, false),
                entry(ModBlocks.oak_wall, true),
                entry(ModBlocks.oak_saddle_door, false),
                entry(ModBlocks.oak_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_SLAB, false,
                Optional.empty(),
                entry(() -> Blocks.SPRUCE_SLAB, false),
                Optional.empty(),
                entry(() -> Blocks.SPRUCE_TRAPDOOR, false), false,
                Optional.empty(),
                entry(() -> Blocks.SPRUCE_DOOR, false),
                entry(ModBlocks.spruce_pole, false),
                entry(ModBlocks.spruce_beam, false),
                entry(ModBlocks.spruce_wall, true),
                entry(ModBlocks.spruce_saddle_door, false),
                entry(ModBlocks.spruce_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.BIRCH_PLANKS, Blocks.BIRCH_SLAB, false,
                Optional.empty(),
                entry(() -> Blocks.BIRCH_SLAB, false),
                Optional.empty(),
                entry(() -> Blocks.BIRCH_TRAPDOOR, false), false,
                Optional.empty(),
                entry(() -> Blocks.BIRCH_DOOR, false),
                entry(ModBlocks.birch_pole, false),
                entry(ModBlocks.birch_beam, false),
                entry(ModBlocks.birch_wall, true),
                entry(ModBlocks.birch_saddle_door, false),
                entry(ModBlocks.birch_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_SLAB, false,
                Optional.empty(),
                entry(() -> Blocks.JUNGLE_SLAB, false),
                Optional.empty(),
                entry(() -> Blocks.JUNGLE_TRAPDOOR, false), false,
                Optional.empty(),
                entry(() -> Blocks.JUNGLE_DOOR, false),
                entry(ModBlocks.jungle_pole, false),
                entry(ModBlocks.jungle_beam, false),
                entry(ModBlocks.jungle_wall, true),
                entry(ModBlocks.jungle_saddle_door, false),
                entry(ModBlocks.jungle_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.ACACIA_PLANKS, Blocks.ACACIA_SLAB, false,
                Optional.empty(),
                entry(() -> Blocks.ACACIA_SLAB, false),
                Optional.empty(),
                entry(() -> Blocks.ACACIA_TRAPDOOR, false), false,
                Optional.empty(),
                entry(() -> Blocks.ACACIA_DOOR, false),
                entry(ModBlocks.acacia_pole, false),
                entry(ModBlocks.acacia_beam, false),
                entry(ModBlocks.acacia_wall, true),
                entry(ModBlocks.acacia_saddle_door, false),
                entry(ModBlocks.acacia_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.CHERRY_PLANKS, Blocks.CHERRY_SLAB, false,
                Optional.empty(),
                entry(() -> Blocks.CHERRY_SLAB, false),
                Optional.empty(),
                entry(() -> Blocks.CHERRY_TRAPDOOR, false), false,
                Optional.empty(),
                entry(() -> Blocks.CHERRY_DOOR, false),
                entry(ModBlocks.cherry_pole, false),
                entry(ModBlocks.cherry_beam, false),
                entry(ModBlocks.cherry_wall, true),
                entry(ModBlocks.cherry_saddle_door, false),
                entry(ModBlocks.cherry_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_SLAB, false,
                Optional.empty(),
                entry(() -> Blocks.DARK_OAK_SLAB, false),
                Optional.empty(),
                entry(() -> Blocks.DARK_OAK_TRAPDOOR, false), false,
                Optional.empty(),
                entry(() -> Blocks.DARK_OAK_DOOR, false),
                entry(ModBlocks.dark_oak_pole, false),
                entry(ModBlocks.dark_oak_beam, false),
                entry(ModBlocks.dark_oak_wall, true),
                entry(ModBlocks.dark_oak_saddle_door, false),
                entry(ModBlocks.dark_oak_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.MANGROVE_PLANKS, Blocks.MANGROVE_SLAB, false,
                Optional.empty(),
                entry(() -> Blocks.MANGROVE_SLAB, false),
                Optional.empty(),
                entry(() -> Blocks.MANGROVE_TRAPDOOR, false), false,
                Optional.empty(),
                entry(() -> Blocks.MANGROVE_DOOR, false),
                entry(ModBlocks.mangrove_pole, false),
                entry(ModBlocks.mangrove_beam, false),
                entry(ModBlocks.mangrove_wall, true),
                entry(ModBlocks.mangrove_saddle_door, false),
                entry(ModBlocks.mangrove_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.BAMBOO_PLANKS, Blocks.BAMBOO_SLAB, false,
                Optional.empty(),
                entry(() -> Blocks.BAMBOO_SLAB, false),
                Optional.empty(),
                entry(() -> Blocks.BAMBOO_TRAPDOOR, false), false,
                Optional.empty(),
                entry(() -> Blocks.BAMBOO_DOOR, false),
                entry(ModBlocks.bamboo_pole, false),
                entry(ModBlocks.bamboo_beam, false),
                entry(ModBlocks.bamboo_wall, true),
                entry(ModBlocks.bamboo_saddle_door, false),
                entry(ModBlocks.bamboo_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_SLAB, false,
                Optional.empty(),
                entry(() -> Blocks.CRIMSON_SLAB, false),
                Optional.empty(),
                entry(() -> Blocks.CRIMSON_TRAPDOOR, false), false,
                Optional.empty(),
                entry(() -> Blocks.CRIMSON_DOOR, false),
                entry(ModBlocks.crimson_pole, false),
                entry(ModBlocks.crimson_beam, false),
                entry(ModBlocks.crimson_wall, true),
                entry(ModBlocks.crimson_saddle_door, false),
                entry(ModBlocks.crimson_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.WARPED_PLANKS, Blocks.WARPED_SLAB, false,
                Optional.empty(),
                entry(() -> Blocks.WARPED_SLAB, false),
                Optional.empty(),
                entry(() -> Blocks.WARPED_TRAPDOOR, false), false,
                Optional.empty(),
                entry(() -> Blocks.WARPED_SLAB, false),
                entry(ModBlocks.warped_pole, false),
                entry(ModBlocks.warped_beam, false),
                entry(ModBlocks.warped_wall, true),
                entry(ModBlocks.warped_saddle_door, false),
                entry(ModBlocks.warped_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.GRANITE, Blocks.GRANITE_SLAB, true,
                Optional.empty(),
                entry(() -> Blocks.GRANITE_SLAB, false),
                entry(ModBlocks.granite_fence, false),
                entry(ModBlocks.granite_trapdoor, false), true,
                entry(ModBlocks.granite_fence_gate, false),
                entry(ModBlocks.granite_door, false),
                entry(ModBlocks.granite_pole, false),
                entry(ModBlocks.granite_beam, false),
                Optional.empty(),
                entry(ModBlocks.granite_saddle_door, false),
                entry(ModBlocks.granite_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.POLISHED_GRANITE, Blocks.POLISHED_GRANITE_SLAB, true,
                Optional.empty(),
                entry(() -> Blocks.POLISHED_GRANITE_SLAB, false),
                entry(ModBlocks.polished_granite_fence, false),
                entry(ModBlocks.polished_granite_trapdoor, false), true,
                entry(ModBlocks.polished_granite_fence_gate, false),
                entry(ModBlocks.polished_granite_door, false),
                entry(ModBlocks.polished_granite_pole, false),
                entry(ModBlocks.polished_granite_beam, false),
                entry(ModBlocks.polished_granite_wall, false),
                entry(ModBlocks.polished_granite_saddle_door, false),
                entry(ModBlocks.polished_granite_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.DIORITE, Blocks.DIORITE_SLAB, true,
                Optional.empty(),
                entry(() -> Blocks.DIORITE_SLAB, false),
                entry(ModBlocks.diorite_fence, false),
                entry(ModBlocks.diorite_trapdoor, false), true,
                entry(ModBlocks.diorite_fence_gate, false),
                entry(ModBlocks.diorite_door, false),
                entry(ModBlocks.diorite_pole, false),
                entry(ModBlocks.diorite_beam, false),
                Optional.empty(),
                entry(ModBlocks.diorite_saddle_door, false),
                entry(ModBlocks.diorite_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.POLISHED_DIORITE, Blocks.POLISHED_DIORITE_SLAB, true,
                Optional.empty(),
                entry(() -> Blocks.POLISHED_DIORITE_SLAB, false),
                entry(ModBlocks.polished_diorite_fence, false),
                entry(ModBlocks.polished_diorite_trapdoor, false), true,
                entry(ModBlocks.polished_diorite_fence_gate, false),
                entry(ModBlocks.polished_diorite_door, false),
                entry(ModBlocks.polished_diorite_pole, false),
                entry(ModBlocks.polished_diorite_beam, false),
                entry(ModBlocks.polished_diorite_wall, false),
                entry(ModBlocks.polished_diorite_saddle_door, false),
                entry(ModBlocks.polished_diorite_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.ANDESITE, Blocks.ANDESITE_SLAB, true,
                Optional.empty(),
                entry(() -> Blocks.ANDESITE_SLAB, false),
                entry(ModBlocks.andesite_fence, false),
                entry(ModBlocks.andesite_trapdoor, false), true,
                entry(ModBlocks.andesite_fence_gate, false),
                entry(ModBlocks.andesite_door, false),
                entry(ModBlocks.andesite_pole, false),
                entry(ModBlocks.andesite_beam, false),
                Optional.empty(),
                entry(ModBlocks.andesite_saddle_door, false),
                entry(ModBlocks.andesite_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.POLISHED_ANDESITE, Blocks.POLISHED_ANDESITE_SLAB, true,
                Optional.empty(),
                entry(() -> Blocks.POLISHED_ANDESITE_SLAB, false),
                entry(ModBlocks.polished_andesite_fence, false),
                entry(ModBlocks.polished_andesite_trapdoor, false), true,
                entry(ModBlocks.polished_andesite_fence_gate, false),
                entry(ModBlocks.polished_andesite_door, false),
                entry(ModBlocks.polished_andesite_pole, false),
                entry(ModBlocks.polished_andesite_beam, false),
                entry(ModBlocks.polished_andesite_wall, false),
                entry(ModBlocks.polished_andesite_saddle_door, false),
                entry(ModBlocks.polished_andesite_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.OAK_LOG, ModBlocks.oak_log_slab.get(), false,
                entry(ModBlocks.oak_log_stairs, false),
                entry(ModBlocks.oak_log_slab, false),
                Optional.empty(),
                entry(ModBlocks.oak_log_trapdoor, false), true,
                Optional.empty(),
                entry(ModBlocks.oak_log_door, false),
                entry(ModBlocks.oak_log_pole, false),
                entry(ModBlocks.oak_log_beam, false),
                entry(ModBlocks.oak_log_wall, false),
                entry(ModBlocks.oak_log_saddle_door, false),
                entry(ModBlocks.oak_log_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.SPRUCE_LOG, ModBlocks.spruce_log_slab.get(), false,
                entry(ModBlocks.spruce_log_stairs, false),
                entry(ModBlocks.spruce_log_slab, false),
                Optional.empty(),
                entry(ModBlocks.spruce_log_trapdoor, false), true,
                Optional.empty(),
                entry(ModBlocks.spruce_log_door, false),
                entry(ModBlocks.spruce_log_pole, false),
                entry(ModBlocks.spruce_log_beam, false),
                entry(ModBlocks.spruce_log_wall, false),
                entry(ModBlocks.spruce_log_saddle_door, false),
                entry(ModBlocks.spruce_log_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.BIRCH_LOG, ModBlocks.birch_log_slab.get(), false,
                entry(ModBlocks.birch_log_stairs, false),
                entry(ModBlocks.birch_log_slab, false),
                Optional.empty(),
                entry(ModBlocks.birch_log_trapdoor, false), true,
                Optional.empty(),
                entry(ModBlocks.birch_log_door, false),
                entry(ModBlocks.birch_log_pole, false),
                entry(ModBlocks.birch_log_beam, false),
                entry(ModBlocks.birch_log_wall, false),
                entry(ModBlocks.birch_log_saddle_door, false),
                entry(ModBlocks.birch_log_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.JUNGLE_LOG, ModBlocks.jungle_log_slab.get(), false,
                entry(ModBlocks.jungle_log_stairs, false),
                entry(ModBlocks.jungle_log_slab, false),
                Optional.empty(),
                entry(ModBlocks.jungle_log_trapdoor, false), true,
                Optional.empty(),
                entry(ModBlocks.jungle_log_door, false),
                entry(ModBlocks.jungle_log_pole, false),
                entry(ModBlocks.jungle_log_beam, false),
                entry(ModBlocks.jungle_log_wall, false),
                entry(ModBlocks.jungle_log_saddle_door, false),
                entry(ModBlocks.jungle_log_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.ACACIA_LOG, ModBlocks.acacia_log_slab.get(), false,
                entry(ModBlocks.acacia_log_stairs, false),
                entry(ModBlocks.acacia_log_slab, false),
                Optional.empty(),
                entry(ModBlocks.acacia_log_trapdoor, false), true,
                Optional.empty(),
                entry(ModBlocks.acacia_log_door, false),
                entry(ModBlocks.acacia_log_pole, false),
                entry(ModBlocks.acacia_log_beam, false),
                entry(ModBlocks.acacia_log_wall, false),
                entry(ModBlocks.acacia_log_saddle_door, false),
                entry(ModBlocks.acacia_log_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.CHERRY_LOG, ModBlocks.cherry_log_slab.get(), false,
                entry(ModBlocks.cherry_log_stairs, false),
                entry(ModBlocks.cherry_log_slab, false),
                Optional.empty(),
                entry(ModBlocks.cherry_log_trapdoor, false), true,
                Optional.empty(),
                entry(ModBlocks.cherry_log_door, false),
                entry(ModBlocks.cherry_log_pole, false),
                entry(ModBlocks.cherry_log_beam, false),
                entry(ModBlocks.cherry_log_wall, false),
                entry(ModBlocks.cherry_log_saddle_door, false),
                entry(ModBlocks.cherry_log_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.DARK_OAK_LOG, ModBlocks.dark_oak_log_slab.get(), false,
                entry(ModBlocks.dark_oak_log_stairs, false),
                entry(ModBlocks.dark_oak_log_slab, false),
                Optional.empty(),
                entry(ModBlocks.dark_oak_log_trapdoor, false), true,
                Optional.empty(),
                entry(ModBlocks.dark_oak_log_door, false),
                entry(ModBlocks.dark_oak_log_pole, false),
                entry(ModBlocks.dark_oak_log_beam, false),
                entry(ModBlocks.dark_oak_log_wall, false),
                entry(ModBlocks.dark_oak_log_saddle_door, false),
                entry(ModBlocks.dark_oak_log_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.MANGROVE_LOG, ModBlocks.mangrove_log_slab.get(), false,
                entry(ModBlocks.mangrove_log_stairs, false),
                entry(ModBlocks.mangrove_log_slab, false),
                Optional.empty(),
                entry(ModBlocks.mangrove_log_trapdoor, false), true,
                Optional.empty(),
                entry(ModBlocks.mangrove_log_door, false),
                entry(ModBlocks.mangrove_log_pole, false),
                entry(ModBlocks.mangrove_log_beam, false),
                entry(ModBlocks.mangrove_log_wall, false),
                entry(ModBlocks.mangrove_log_saddle_door, false),
                entry(ModBlocks.mangrove_log_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.BAMBOO_BLOCK, ModBlocks.bamboo_block_slab.get(), false,
                entry(ModBlocks.bamboo_block_stairs, false),
                entry(ModBlocks.bamboo_block_slab, false),
                Optional.empty(),
                entry(ModBlocks.bamboo_block_trapdoor, false), true,
                Optional.empty(),
                entry(ModBlocks.bamboo_block_door, false),
                entry(ModBlocks.bamboo_block_pole, false),
                entry(ModBlocks.bamboo_block_beam, false),
                entry(ModBlocks.bamboo_block_wall, false),
                entry(ModBlocks.bamboo_block_saddle_door, false),
                entry(ModBlocks.bamboo_block_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.CRIMSON_STEM, ModBlocks.crimson_stem_slab.get(), false,
                entry(ModBlocks.crimson_stem_stairs, false),
                entry(ModBlocks.crimson_stem_slab, false),
                Optional.empty(),
                entry(ModBlocks.crimson_stem_trapdoor, false), true,
                Optional.empty(),
                entry(ModBlocks.crimson_stem_door, false),
                entry(ModBlocks.crimson_stem_pole, false),
                entry(ModBlocks.crimson_stem_beam, false),
                entry(ModBlocks.crimson_stem_wall, false),
                entry(ModBlocks.crimson_stem_saddle_door, false),
                entry(ModBlocks.crimson_stem_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.WARPED_STEM, ModBlocks.warped_stem_slab.get(), false,
                entry(ModBlocks.warped_stem_stairs, false),
                entry(ModBlocks.warped_stem_slab, false),
                Optional.empty(),
                entry(ModBlocks.warped_stem_trapdoor, false), true,
                Optional.empty(),
                entry(ModBlocks.warped_stem_door, false),
                entry(ModBlocks.warped_stem_pole, false),
                entry(ModBlocks.warped_stem_beam, false),
                entry(ModBlocks.warped_stem_wall, false),
                entry(ModBlocks.warped_stem_saddle_door, false),
                entry(ModBlocks.warped_stem_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.BLACKSTONE, Blocks.BLACKSTONE_SLAB, true,
                Optional.empty(),
                entry(() -> Blocks.BLACKSTONE_SLAB, false),
                entry(ModBlocks.blackstone_fence, false),
                entry(ModBlocks.blackstone_trapdoor, false), true,
                entry(ModBlocks.blackstone_fence_gate, false),
                entry(ModBlocks.blackstone_door, false),
                entry(ModBlocks.blackstone_pole, false),
                entry(ModBlocks.blackstone_beam, false),
                Optional.empty(),
                entry(ModBlocks.blackstone_saddle_door, false),
                entry(ModBlocks.blackstone_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.POLISHED_BLACKSTONE, Blocks.POLISHED_BLACKSTONE_SLAB, true,
                Optional.empty(),
                entry(() -> Blocks.POLISHED_BLACKSTONE_SLAB, false),
                entry(ModBlocks.polished_blackstone_fence, false),
                entry(ModBlocks.polished_blackstone_trapdoor, false), true,
                entry(ModBlocks.polished_blackstone_fence_gate, false),
                entry(ModBlocks.polished_blackstone_door, false),
                entry(ModBlocks.polished_blackstone_pole, false),
                entry(ModBlocks.polished_blackstone_beam, false),
                Optional.empty(),
                entry(ModBlocks.polished_blackstone_saddle_door, false),
                entry(ModBlocks.polished_blackstone_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.STONE, Blocks.STONE_SLAB, true,
                Optional.empty(),
                entry(() -> Blocks.STONE_SLAB, false),
                entry(ModBlocks.stone_fence, false),
                entry(ModBlocks.stone_trapdoor, false), true,
                entry(ModBlocks.stone_fence_gate, false),
                entry(ModBlocks.stone_door, false),
                entry(ModBlocks.stone_pole, false),
                entry(ModBlocks.stone_beam, false),
                entry(ModBlocks.stone_wall, false),
                entry(ModBlocks.stone_saddle_door, false),
                entry(ModBlocks.stone_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.SMOOTH_STONE, Blocks.SMOOTH_STONE_SLAB, true,
                entry(ModBlocks.smooth_stone_stairs, false),
                entry(() -> Blocks.SMOOTH_STONE_SLAB, false),
                entry(ModBlocks.smooth_stone_fence, false),
                entry(ModBlocks.smooth_stone_trapdoor, false), true,
                entry(ModBlocks.smooth_stone_fence_gate, false),
                entry(ModBlocks.smooth_stone_door, false),
                entry(ModBlocks.smooth_stone_pole, false),
                entry(ModBlocks.smooth_stone_beam, false),
                entry(ModBlocks.smooth_stone_wall, false),
                entry(ModBlocks.smooth_stone_saddle_door, false),
                entry(ModBlocks.smooth_stone_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.COBBLESTONE, Blocks.COBBLESTONE_SLAB, true,
                Optional.empty(),
                entry(() -> Blocks.COBBLESTONE_SLAB, false),
                entry(ModBlocks.cobblestone_fence, false),
                entry(ModBlocks.cobblestone_trapdoor, false), true,
                entry(ModBlocks.cobblestone_fence_gate, false),
                entry(ModBlocks.cobblestone_door, false),
                entry(ModBlocks.cobblestone_pole, false),
                entry(ModBlocks.cobblestone_beam, false),
                Optional.empty(),
                entry(ModBlocks.cobblestone_saddle_door, false),
                entry(ModBlocks.cobblestone_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.MOSSY_COBBLESTONE, Blocks.MOSSY_COBBLESTONE_SLAB, true,
                Optional.empty(),
                entry(() -> Blocks.MOSSY_COBBLESTONE_SLAB, false),
                entry(ModBlocks.mossy_cobblestone_fence, false),
                entry(ModBlocks.mossy_cobblestone_trapdoor, false), true,
                entry(ModBlocks.mossy_cobblestone_fence_gate, false),
                entry(ModBlocks.mossy_cobblestone_door, false),
                entry(ModBlocks.mossy_cobblestone_pole, false),
                entry(ModBlocks.mossy_cobblestone_beam, false),
                Optional.empty(),
                entry(ModBlocks.mossy_cobblestone_saddle_door, false),
                entry(ModBlocks.mossy_cobblestone_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.SANDSTONE, Blocks.SANDSTONE_SLAB, true,
                Optional.empty(),
                entry(() -> Blocks.SANDSTONE_SLAB, false),
                entry(ModBlocks.sandstone_fence, false),
                entry(ModBlocks.sandstone_trapdoor, false), true,
                entry(ModBlocks.sandstone_fence_gate, false),
                entry(ModBlocks.sandstone_door, false),
                entry(ModBlocks.sandstone_pole, false),
                entry(ModBlocks.sandstone_beam, false),
                Optional.empty(),
                entry(ModBlocks.sandstone_saddle_door, false),
                entry(ModBlocks.sandstone_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.SMOOTH_SANDSTONE, Blocks.SMOOTH_SANDSTONE_SLAB, true,
                Optional.empty(),
                entry(() -> Blocks.SMOOTH_SANDSTONE_SLAB, false),
                entry(ModBlocks.smooth_sandstone_fence, false),
                entry(ModBlocks.smooth_sandstone_trapdoor, false), true,
                entry(ModBlocks.smooth_sandstone_fence_gate, false),
                entry(ModBlocks.smooth_sandstone_door, false),
                entry(ModBlocks.smooth_sandstone_pole, false),
                entry(ModBlocks.smooth_sandstone_beam, false),
                entry(ModBlocks.smooth_sandstone_wall, false),
                entry(ModBlocks.smooth_sandstone_saddle_door, false),
                entry(ModBlocks.smooth_sandstone_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.RED_SANDSTONE, Blocks.RED_SANDSTONE_SLAB, true,
                Optional.empty(),
                entry(() -> Blocks.RED_SANDSTONE_SLAB, false),
                entry(ModBlocks.red_sandstone_fence, false),
                entry(ModBlocks.red_sandstone_trapdoor, false), true,
                entry(ModBlocks.red_sandstone_fence_gate, false),
                entry(ModBlocks.red_sandstone_door, false),
                entry(ModBlocks.red_sandstone_pole, false),
                entry(ModBlocks.red_sandstone_beam, false),
                Optional.empty(),
                entry(ModBlocks.red_sandstone_saddle_door, false),
                entry(ModBlocks.red_sandstone_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.SMOOTH_RED_SANDSTONE, Blocks.SMOOTH_RED_SANDSTONE_SLAB, true,
                Optional.empty(),
                entry(() -> Blocks.SMOOTH_RED_SANDSTONE_SLAB, false),
                entry(ModBlocks.smooth_red_sandstone_fence, false),
                entry(ModBlocks.smooth_red_sandstone_trapdoor, false), true,
                entry(ModBlocks.smooth_red_sandstone_fence_gate, false),
                entry(ModBlocks.smooth_red_sandstone_door, false),
                entry(ModBlocks.smooth_red_sandstone_pole, false),
                entry(ModBlocks.smooth_red_sandstone_beam, false),
                entry(ModBlocks.smooth_red_sandstone_wall, false),
                entry(ModBlocks.smooth_red_sandstone_saddle_door, false),
                entry(ModBlocks.smooth_red_sandstone_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.STONE_BRICKS, Blocks.STONE_BRICK_SLAB, true,
                Optional.empty(),
                entry(() -> Blocks.STONE_BRICK_SLAB, false),
                entry(ModBlocks.stone_brick_fence, false),
                entry(ModBlocks.stone_brick_trapdoor, false), true,
                entry(ModBlocks.stone_brick_fence_gate, false),
                entry(ModBlocks.stone_brick_door, false),
                entry(ModBlocks.stone_brick_pole, false),
                entry(ModBlocks.stone_brick_beam, false),
                Optional.empty(),
                entry(ModBlocks.stone_brick_saddle_door, false),
                entry(ModBlocks.stone_brick_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.CRACKED_STONE_BRICKS, ModBlocks.cracked_stone_brick_slab.get(), true,
                entry(ModBlocks.cracked_stone_brick_stairs, false),
                entry(ModBlocks.cracked_stone_brick_slab, false),
                entry(ModBlocks.cracked_stone_brick_fence, false),
                entry(ModBlocks.cracked_stone_brick_trapdoor, false), true,
                entry(ModBlocks.cracked_stone_brick_fence_gate, false),
                entry(ModBlocks.cracked_stone_brick_door, false),
                entry(ModBlocks.cracked_stone_brick_pole, false),
                entry(ModBlocks.cracked_stone_brick_beam, false),
                entry(ModBlocks.cracked_stone_brick_wall, false),
                entry(ModBlocks.cracked_stone_brick_saddle_door, false),
                entry(ModBlocks.cracked_stone_brick_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.MOSSY_STONE_BRICKS, Blocks.MOSSY_STONE_BRICK_SLAB, true,
                Optional.empty(),
                entry(() -> Blocks.MOSSY_STONE_BRICK_SLAB, false),
                entry(ModBlocks.mossy_stone_brick_fence, false),
                entry(ModBlocks.mossy_stone_brick_trapdoor, false), true,
                entry(ModBlocks.mossy_stone_brick_fence_gate, false),
                entry(ModBlocks.mossy_stone_brick_door, false),
                entry(ModBlocks.mossy_stone_brick_pole, false),
                entry(ModBlocks.mossy_stone_brick_beam, false),
                Optional.empty(),
                entry(ModBlocks.mossy_stone_brick_saddle_door, false),
                entry(ModBlocks.mossy_stone_brick_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.PRISMARINE, Items.PRISMARINE_SHARD, true,
                Optional.empty(),
                entry(() -> Blocks.PRISMARINE_SLAB, false),
                entry(ModBlocks.prismarine_fence, false),
                entry(ModBlocks.prismarine_trapdoor, false), true,
                entry(ModBlocks.prismarine_fence_gate, false),
                entry(ModBlocks.prismarine_door, false),
                entry(ModBlocks.prismarine_pole, false),
                entry(ModBlocks.prismarine_beam, false),
                Optional.empty(),
                entry(ModBlocks.prismarine_saddle_door, false),
                entry(ModBlocks.prismarine_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICK_SLAB, true,
                Optional.empty(),
                entry(() -> Blocks.PRISMARINE_BRICK_SLAB, false),
                Optional.empty(),
                entry(ModBlocks.prismarine_brick_trapdoor, false), true,
                Optional.empty(),
                entry(ModBlocks.prismarine_brick_door, false),
                entry(ModBlocks.prismarine_brick_pole, false),
                entry(ModBlocks.prismarine_brick_beam, false),
                entry(ModBlocks.prismarine_brick_wall, false),
                entry(ModBlocks.prismarine_brick_saddle_door, false),
                entry(ModBlocks.prismarine_brick_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.DARK_PRISMARINE, Blocks.DARK_PRISMARINE_SLAB, true,
                Optional.empty(),
                entry(() -> Blocks.DARK_PRISMARINE_SLAB, false),
                Optional.empty(),
                entry(ModBlocks.dark_prismarine_trapdoor, false), true,
                Optional.empty(),
                entry(ModBlocks.dark_prismarine_door, false),
                entry(ModBlocks.dark_prismarine_pole, false),
                entry(ModBlocks.dark_prismarine_beam, false),
                entry(ModBlocks.dark_prismarine_wall, false),
                entry(ModBlocks.dark_prismarine_saddle_door, false),
                entry(ModBlocks.dark_prismarine_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.PURPUR_BLOCK, Blocks.PURPUR_SLAB, true,
                Optional.empty(),
                entry(() -> Blocks.PURPUR_SLAB, false),
                entry(ModBlocks.purpur_fence, false),
                entry(ModBlocks.purpur_trapdoor, false), true,
                entry(ModBlocks.purpur_fence_gate, false),
                entry(ModBlocks.purpur_door, false),
                entry(ModBlocks.purpur_pole, false),
                entry(ModBlocks.purpur_beam, false),
                entry(ModBlocks.purpur_wall, false),
                entry(ModBlocks.purpur_saddle_door, false),
                entry(ModBlocks.purpur_support, false)));
        autoRecipe(consumer, new AutoRecipeManager(Blocks.TUFF, ModBlocks.tuff_slab.get(), true,
                entry(ModBlocks.tuff_stairs, false),
                entry(ModBlocks.tuff_slab, false),
                entry(ModBlocks.tuff_fence, false),
                entry(ModBlocks.tuff_trapdoor, false), true,
                entry(ModBlocks.tuff_fence_gate, false),
                entry(ModBlocks.tuff_door, false),
                entry(ModBlocks.tuff_pole, false),
                entry(ModBlocks.tuff_beam, false),
                entry(ModBlocks.tuff_wall, false),
                entry(ModBlocks.tuff_saddle_door, false),
                entry(ModBlocks.tuff_support, false)));

        fence(consumer, ModBlocks.oak_log_fence, Blocks.OAK_LOG, Items.STICK, false);
        fencegate(consumer, ModBlocks.oak_log_fence_gate, Blocks.OAK_LOG, Items.STICK, false);
        fence(consumer, ModBlocks.spruce_log_fence, Blocks.SPRUCE_LOG, Items.STICK, false);
        fencegate(consumer, ModBlocks.spruce_log_fence_gate, Blocks.SPRUCE_LOG, Items.STICK, false);
        fence(consumer, ModBlocks.birch_log_fence, Blocks.BIRCH_LOG, Items.STICK, false);
        fencegate(consumer, ModBlocks.birch_log_fence_gate, Blocks.BIRCH_LOG, Items.STICK, false);
        fence(consumer, ModBlocks.jungle_log_fence, Blocks.JUNGLE_LOG, Items.STICK, false);
        fencegate(consumer, ModBlocks.jungle_log_fence_gate, Blocks.JUNGLE_LOG, Items.STICK, false);
        fence(consumer, ModBlocks.acacia_log_fence, Blocks.ACACIA_LOG, Items.STICK, false);
        fencegate(consumer, ModBlocks.acacia_log_fence_gate, Blocks.ACACIA_LOG, Items.STICK, false);
        fence(consumer, ModBlocks.cherry_log_fence, Blocks.CHERRY_LOG, Items.STICK, false);
        fencegate(consumer, ModBlocks.cherry_log_fence_gate, Blocks.CHERRY_LOG, Items.STICK, false);
        fence(consumer, ModBlocks.dark_oak_log_fence, Blocks.DARK_OAK_LOG, Items.STICK, false);
        fencegate(consumer, ModBlocks.dark_oak_log_fence_gate, Blocks.DARK_OAK_LOG, Items.STICK, false);
        fence(consumer, ModBlocks.mangrove_log_fence, Blocks.MANGROVE_LOG, Items.STICK, false);
        fencegate(consumer, ModBlocks.mangrove_log_fence_gate, Blocks.MANGROVE_LOG, Items.STICK, false);
        fence(consumer, ModBlocks.bamboo_block_fence, Blocks.BAMBOO_BLOCK, Items.BAMBOO, false);
        fencegate(consumer, ModBlocks.bamboo_block_fence_gate, Blocks.BAMBOO_BLOCK, Items.BAMBOO, false);
        fence(consumer, ModBlocks.crimson_stem_fence, Blocks.CRIMSON_STEM, Items.STICK, false);
        fencegate(consumer, ModBlocks.crimson_stem_fence_gate, Blocks.CRIMSON_STEM, Items.STICK, false);
        fence(consumer, ModBlocks.warped_stem_fence, Blocks.WARPED_STEM, Items.STICK, false);
        fencegate(consumer, ModBlocks.warped_stem_fence_gate, Blocks.WARPED_STEM, Items.STICK, false);
        fence(consumer, ModBlocks.prismarine_brick_fence, Blocks.PRISMARINE_BRICKS, Items.PRISMARINE_SHARD, false);
        fencegate(consumer, ModBlocks.prismarine_brick_fence_gate, Blocks.PRISMARINE_BRICKS, Items.PRISMARINE_SHARD, false);
        fence(consumer, ModBlocks.dark_prismarine_fence, Blocks.DARK_PRISMARINE, Items.PRISMARINE_SHARD, false);
        fencegate(consumer, ModBlocks.dark_prismarine_fence_gate, Blocks.DARK_PRISMARINE, Items.PRISMARINE_SHARD, false);
    }
}
