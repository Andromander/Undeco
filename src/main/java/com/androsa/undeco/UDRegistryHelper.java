package com.androsa.undeco;

import com.androsa.ornamental.builder.OrnamentBuilder;
import com.androsa.ornamental.registry.helper.MasterRegistryHelper;
import com.androsa.undeco.block.*;
import com.androsa.undeco.data.UDBlockTags;
import com.androsa.undeco.data.UDItemTags;
import com.google.common.collect.Lists;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class UDRegistryHelper extends MasterRegistryHelper {

    public UDRegistryHelper(DeferredRegister<Block> blockreg, DeferredRegister<Item> itemreg) {
        super(blockreg, itemreg);
    }

    @Override
    protected BlockBehaviour.Properties stairProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.stairProperties(builder);

        if (builder instanceof UDOrnamentBuilder undeco) {
            if (undeco.canIgnite) props.ignitedByLava();
        }

        return props;
    }

    @Override
    protected BlockBehaviour.Properties slabProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.slabProperties(builder);

        if (builder instanceof UDOrnamentBuilder undeco) {
            if (undeco.canIgnite) props.ignitedByLava();
        }

        return props;
    }

    @Override
    protected BlockBehaviour.Properties fenceProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.fenceProperties(builder);

        if (builder instanceof UDOrnamentBuilder undeco) {
            if (undeco.canIgnite) props.ignitedByLava();
        }

        return props;
    }

    @Override
    protected BlockBehaviour.Properties trapdoorProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.trapdoorProperties(builder);

        if (builder instanceof UDOrnamentBuilder undeco) {
            if (undeco.canIgnite) props.ignitedByLava();
        }

        return props;
    }

    @Override
    protected BlockBehaviour.Properties fencegateProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.fencegateProperties(builder);

        if (builder instanceof UDOrnamentBuilder undeco) {
            if (undeco.canIgnite) props.ignitedByLava();
        }

        return props;
    }

    @Override
    protected BlockBehaviour.Properties doorProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.doorProperties(builder);

        if (builder instanceof UDOrnamentBuilder undeco) {
            if (undeco.canIgnite) props.ignitedByLava();
        }

        return props;
    }

    @Override
    protected BlockBehaviour.Properties poleProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.poleProperties(builder);

        if (builder instanceof UDOrnamentBuilder undeco) {
            if (undeco.canIgnite) props.ignitedByLava();
        }

        return props;
    }

    @Override
    protected BlockBehaviour.Properties beamProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.beamProperties(builder);

        if (builder instanceof UDOrnamentBuilder undeco) {
            if (undeco.canIgnite) props.ignitedByLava();
        }

        return props;
    }

    @Override
    protected BlockBehaviour.Properties wallProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.wallProperties(builder);

        if (builder instanceof UDOrnamentBuilder undeco) {
            if (undeco.canIgnite) props.ignitedByLava();
        }

        return props;
    }

    @Override
    protected BlockBehaviour.Properties saddledoorProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.saddledoorProperties(builder);

        if (builder instanceof UDOrnamentBuilder undeco) {
            if (undeco.canIgnite) props.ignitedByLava();
        }

        return props;
    }

    @Override
    protected BlockBehaviour.Properties supportProperties(OrnamentBuilder builder) {
        BlockBehaviour.Properties props = super.saddledoorProperties(builder);

        if (builder instanceof UDOrnamentBuilder undeco) {
            if (undeco.canIgnite) props.ignitedByLava();
        }

        return props;
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

    public Supplier<UDOrnamentStair> stairs(UDOrnamentBuilder builder) {
        return this.stairs(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<UDOrnamentStair> stairs(UDOrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return super.stairs(builder, blocktags, itemtags, UDOrnamentStair::new);
    }

    public Supplier<UDOrnamentSlab> slab(UDOrnamentBuilder builder) {
        return this.slab(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<UDOrnamentSlab> slab(UDOrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return super.slab(builder, blocktags, itemtags, UDOrnamentSlab::new);
    }

    public Supplier<UDOrnamentFence> fence(UDOrnamentBuilder builder) {
        return this.fence(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<UDOrnamentFence> fence(UDOrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return super.fence(builder, blocktags, itemtags, UDOrnamentFence::new);
    }

    public Supplier<UDOrnamentTrapDoor> trapdoor(UDOrnamentBuilder builder) {
        return this.trapdoor(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<UDOrnamentTrapDoor> trapdoor(UDOrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return super.trapdoor(builder, blocktags, itemtags, UDOrnamentTrapDoor::new);
    }

    public Supplier<UDOrnamentFenceGate> fencegate(UDOrnamentBuilder builder) {
        return this.fencegate(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<UDOrnamentFenceGate> fencegate(UDOrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return super.fencegate(builder, blocktags, itemtags, UDOrnamentFenceGate::new);
    }

    public Supplier<UDOrnamentDoor> door(UDOrnamentBuilder builder) {
        return this.door(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<UDOrnamentDoor> door(UDOrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return super.door(builder, blocktags, itemtags, UDOrnamentDoor::new);
    }

    public Supplier<UDOrnamentPole> pole(UDOrnamentBuilder builder) {
        return this.pole(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<UDOrnamentPole> pole(UDOrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return super.pole(builder, blocktags, itemtags, UDOrnamentPole::new);
    }

    public Supplier<UDOrnamentBeam> beam(UDOrnamentBuilder builder) {
        return this.beam(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<UDOrnamentBeam> beam(UDOrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return super.beam(builder, blocktags, itemtags, UDOrnamentBeam::new);
    }

    public Supplier<UDOrnamentWall> wall(UDOrnamentBuilder builder) {
        return this.wall(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<UDOrnamentWall> wall(UDOrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return super.wall(builder, blocktags, itemtags, UDOrnamentWall::new);
    }

    public Supplier<UDOrnamentSaddleDoor> saddledoor(UDOrnamentBuilder builder) {
        return this.saddledoor(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<UDOrnamentSaddleDoor> saddledoor(UDOrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return super.saddledoor(builder, blocktags, itemtags, UDOrnamentSaddleDoor::new);
    }

    public Supplier<UDOrnamentSupport> support(UDOrnamentBuilder builder) {
        return this.support(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public Supplier<UDOrnamentSupport> support(UDOrnamentBuilder builder, ArrayList<List<Supplier<? extends Block>>> blocktags, ArrayList<List<Supplier<? extends Block>>> itemtags) {
        return super.support(builder, blocktags, itemtags, UDOrnamentSupport::new);
    }
}
