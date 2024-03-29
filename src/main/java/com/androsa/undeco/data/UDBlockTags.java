package com.androsa.undeco.data;

import com.androsa.ornamental.data.provider.OrnamentalBlockTagProvider;
import com.androsa.ornamental.registry.ModTags;
import com.androsa.undeco.UnusuallyDecorative;
import com.google.common.collect.Lists;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class UDBlockTags extends OrnamentalBlockTagProvider {

    public static final List<Supplier<? extends Block>> BEAMS = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> DOORS = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> FENCES = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> FENCE_GATES = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> POLES = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> SADDLE_DOORS = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> SLABS = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> STAIRS = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> SUPPORTS = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> TRAPDOORS = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> WALLS = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> WOODEN_DOOR = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> WOODEN_FENCE = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> WOODEN_SLAB = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> WOODEN_STAIRS = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> WOODEN_TRAPDOOR = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> WOODEN_FENCE_GATE = Lists.newArrayList();

    public static final List<Supplier<? extends Block>> AXE_TOOL = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> PICKAXE_TOOL = Lists.newArrayList();

    public UDBlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, ExistingFileHelper helper) {
        super(output, provider, UnusuallyDecorative.MODID, helper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        addToTag(ModTags.Blocks.BEAMS, BEAMS);
        addToTag(BlockTags.DOORS, DOORS);
        addToTag(BlockTags.FENCES, FENCES);
        addToTag(Tags.Blocks.FENCES, FENCES);
        addToTag(BlockTags.FENCE_GATES, FENCE_GATES);
        addToTag(Tags.Blocks.FENCE_GATES, FENCE_GATES);
        addToTag(ModTags.Blocks.POLES, POLES);
        addToTag(ModTags.Blocks.SADDLE_DOORS, SADDLE_DOORS);
        addToTag(BlockTags.SLABS, SLABS);
        addToTag(BlockTags.STAIRS, STAIRS);
        addToTag(ModTags.Blocks.SUPPORTS, SUPPORTS);
        addToTag(BlockTags.TRAPDOORS, TRAPDOORS);
        addToTag(BlockTags.WALLS, WALLS);
        addToTag(BlockTags.WOODEN_DOORS, WOODEN_DOOR);
        addToTag(BlockTags.WOODEN_FENCES, WOODEN_FENCE);
        addToTag(Tags.Blocks.FENCES_WOODEN, WOODEN_FENCE);
        addToTag(BlockTags.WOODEN_SLABS, WOODEN_SLAB);
        addToTag(BlockTags.WOODEN_STAIRS, WOODEN_STAIRS);
        addToTag(BlockTags.WOODEN_TRAPDOORS, WOODEN_TRAPDOOR);
        addToTag(Tags.Blocks.FENCE_GATES_WOODEN, WOODEN_FENCE_GATE);

        addToTag(BlockTags.MINEABLE_WITH_AXE, AXE_TOOL);
        addToTag(BlockTags.MINEABLE_WITH_PICKAXE, PICKAXE_TOOL);
    }
}
