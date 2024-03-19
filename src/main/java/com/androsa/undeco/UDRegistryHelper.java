package com.androsa.undeco;

import com.androsa.ornamental.blocks.*;
import com.androsa.ornamental.builder.OrnamentBuilder;
import com.androsa.ornamental.registry.helper.MasterRegistryHelper;
import com.androsa.undeco.data.UDBlockTags;
import com.androsa.undeco.data.UDItemTags;
import com.google.common.collect.Lists;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class UDRegistryHelper extends MasterRegistryHelper {

    public UDRegistryHelper(DeferredRegister<Block> blockreg, DeferredRegister<Item> itemreg) {
        super(blockreg, itemreg);
    }

    @Override
    protected TagHelper stairTags() {
        return new TagHelper(
                array(UDBlockTags.STAIRS),
                array(UDItemTags.STAIRS));
    }

    @Override
    protected TagHelper slabTags() {
        return new TagHelper(
                array(UDBlockTags.SLABS),
                array(UDItemTags.SLABS));
    }

    @Override
    protected TagHelper fenceTags() {
        return new TagHelper(
                array(UDBlockTags.FENCES),
                array(UDItemTags.FENCES));
    }

    @Override
    protected TagHelper trapdoorTags() {
        return new TagHelper(
                array(UDBlockTags.TRAPDOORS),
                array(UDItemTags.TRAPDOORS));
    }

    @Override
    protected TagHelper fencegateTags() {
        return new TagHelper(
                array(UDBlockTags.FENCE_GATES),
                array(UDItemTags.FENCE_GATES));
    }

    @Override
    protected TagHelper doorTags() {
        return new TagHelper(
                array(UDBlockTags.DOORS),
                array(UDItemTags.DOORS));
    }

    @Override
    protected TagHelper poleTags() {
        return new TagHelper(
                array(UDBlockTags.POLES),
                array(UDItemTags.POLES));
    }

    @Override
    protected TagHelper beamTags() {
        return new TagHelper(
                array(UDBlockTags.BEAMS),
                array(UDItemTags.BEAMS));
    }

    @Override
    protected TagHelper wallTags() {
        return new TagHelper(
                array(UDBlockTags.WALLS),
                array(UDItemTags.WALLS));
    }

    @Override
    protected TagHelper saddledoorTags() {
        return new TagHelper(
                array(UDBlockTags.SADDLE_DOORS),
                array(UDItemTags.SADDLE_DOORS));
    }

    @Override
    protected TagHelper supportTags() {
        return new TagHelper(
                array(UDBlockTags.SUPPORTS),
                array(UDItemTags.SUPPORTS));
    }

    public Supplier<OrnamentStair> stairs(OrnamentBuilder builder) {
        return this.stairs(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<OrnamentStair> stairs(OrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return super.stairs(builder, blocktags, itemtags, OrnamentStair::new);
    }

    public Supplier<OrnamentSlab> slab(OrnamentBuilder builder) {
        return this.slab(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<OrnamentSlab> slab(OrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return super.slab(builder, blocktags, itemtags, OrnamentSlab::new);
    }

    public Supplier<OrnamentFence> fence(OrnamentBuilder builder) {
        return this.fence(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<OrnamentFence> fence(OrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return super.fence(builder, blocktags, itemtags, OrnamentFence::new);
    }

    public Supplier<OrnamentTrapDoor> trapdoor(OrnamentBuilder builder) {
        return this.trapdoor(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<OrnamentTrapDoor> trapdoor(OrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return super.trapdoor(builder, blocktags, itemtags, OrnamentTrapDoor::new);
    }

    public Supplier<OrnamentFenceGate> fencegate(OrnamentBuilder builder) {
        return this.fencegate(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<OrnamentFenceGate> fencegate(OrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return super.fencegate(builder, blocktags, itemtags, OrnamentFenceGate::new);
    }

    public Supplier<OrnamentDoor> door(OrnamentBuilder builder) {
        return this.door(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<OrnamentDoor> door(OrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return super.door(builder, blocktags, itemtags, OrnamentDoor::new);
    }

    public Supplier<OrnamentPole> pole(OrnamentBuilder builder) {
        return this.pole(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<OrnamentPole> pole(OrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return super.pole(builder, blocktags, itemtags, OrnamentPole::new);
    }

    public Supplier<OrnamentBeam> beam(OrnamentBuilder builder) {
        return this.beam(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<OrnamentBeam> beam(OrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return super.beam(builder, blocktags, itemtags, OrnamentBeam::new);
    }

    public Supplier<OrnamentWall> wall(OrnamentBuilder builder) {
        return this.wall(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<OrnamentWall> wall(OrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return super.wall(builder, blocktags, itemtags, OrnamentWall::new);
    }

    public Supplier<OrnamentSaddleDoor> saddledoor(OrnamentBuilder builder) {
        return this.saddledoor(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<OrnamentSaddleDoor> saddledoor(OrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return super.saddledoor(builder, blocktags, itemtags, OrnamentSaddleDoor::new);
    }

    public Supplier<OrnamentSupport> support(OrnamentBuilder builder) {
        return this.support(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<OrnamentSupport> support(OrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return super.support(builder, blocktags, itemtags, OrnamentSupport::new);
    }
}
