package com.androsa.undeco.data;

import com.androsa.ornamental.data.provider.OrnamentalItemTagProvider;
import com.androsa.ornamental.registry.ModTags;
import com.androsa.undeco.UnusuallyDecorative;
import com.google.common.collect.Lists;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class UDItemTags extends OrnamentalItemTagProvider {

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
    public static final List<Supplier<? extends Block>> WOODEN_DOORS = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> WOODEN_FENCES = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> WOODEN_FENCE_GATES = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> WOODEN_SLABS = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> WOODEN_STAIRS = Lists.newArrayList();
    public static final List<Supplier<? extends Block>> WOODEN_TRAPDOORS = Lists.newArrayList();

    public UDItemTags(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(output, provider, UnusuallyDecorative.MODID, helper, blockTags);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        addToTag(ModTags.Items.BEAMS, BEAMS);
        addToTag(ItemTags.DOORS, DOORS);
        addToTag(ItemTags.FENCES, FENCES);
        addToTag(Tags.Items.FENCES, FENCES);
        addToTag(ItemTags.FENCE_GATES, FENCE_GATES);
        addToTag(Tags.Items.FENCE_GATES, FENCE_GATES);
        addToTag(ModTags.Items.SADDLE_DOORS, SADDLE_DOORS);
        addToTag(ModTags.Items.POLES, POLES);
        addToTag(ItemTags.SLABS, SLABS);
        addToTag(ItemTags.STAIRS, STAIRS);
        addToTag(ModTags.Items.SUPPORTS, SUPPORTS);
        addToTag(ItemTags.TRAPDOORS, TRAPDOORS);
        addToTag(ItemTags.WALLS, WALLS);
        addToTag(ItemTags.WOODEN_DOORS, WOODEN_DOORS);
        addToTag(ItemTags.WOODEN_FENCES, WOODEN_FENCES);
        addToTag(Tags.Items.FENCES_WOODEN, WOODEN_FENCES);
        addToTag(Tags.Items.FENCE_GATES_WOODEN, WOODEN_FENCE_GATES);
        addToTag(ItemTags.WOODEN_SLABS, WOODEN_SLABS);
        addToTag(ItemTags.WOODEN_STAIRS, WOODEN_STAIRS);
        addToTag(ItemTags.WOODEN_TRAPDOORS, WOODEN_TRAPDOORS);
    }
}
