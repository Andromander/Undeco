package com.androsa.undeco;

import com.androsa.ornamental.blocks.*;
import com.androsa.ornamental.builder.OrnamentBuilder;
import com.androsa.ornamental.registry.helper.MasterRegistryHelper;
import com.androsa.undeco.block.*;
import com.androsa.undeco.data.UDBlockTags;
import com.androsa.undeco.data.UDItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.apache.commons.compress.utils.Lists;

import java.util.ArrayList;
import java.util.List;

public class UDRegistryHelper extends MasterRegistryHelper {

    public UDRegistryHelper(DeferredRegister<Block> blockreg, DeferredRegister<Item> itemreg) {
        super(blockreg, itemreg);
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

    public RegistryObject<UDOrnamentStair> stairs(UDOrnamentBuilder builder) {
        return this.stairs(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public RegistryObject<UDOrnamentStair> stairs(UDOrnamentBuilder builder, ArrayList<List<RegistryObject<? extends Block>>> blocktags, ArrayList<List<RegistryObject<? extends Block>>> itemtags) {
        return super.stairs(builder, blocktags, itemtags, UDOrnamentStair::new);
    }

    public RegistryObject<UDOrnamentSlab> slab(UDOrnamentBuilder builder) {
        return this.slab(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public RegistryObject<UDOrnamentSlab> slab(UDOrnamentBuilder builder, ArrayList<List<RegistryObject<? extends Block>>> blocktags, ArrayList<List<RegistryObject<? extends Block>>> itemtags) {
        return super.slab(builder, blocktags, itemtags, UDOrnamentSlab::new);
    }

    public RegistryObject<UDOrnamentFence> fence(UDOrnamentBuilder builder) {
        return this.fence(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public RegistryObject<UDOrnamentFence> fence(UDOrnamentBuilder builder, ArrayList<List<RegistryObject<? extends Block>>> blocktags, ArrayList<List<RegistryObject<? extends Block>>> itemtags) {
        return super.fence(builder, blocktags, itemtags, UDOrnamentFence::new);
    }

    public RegistryObject<UDOrnamentTrapDoor> trapdoor(UDOrnamentBuilder builder) {
        return this.trapdoor(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public RegistryObject<UDOrnamentTrapDoor> trapdoor(UDOrnamentBuilder builder, ArrayList<List<RegistryObject<? extends Block>>> blocktags, ArrayList<List<RegistryObject<? extends Block>>> itemtags) {
        return super.trapdoor(builder, blocktags, itemtags, UDOrnamentTrapDoor::new);
    }

    public RegistryObject<UDOrnamentFenceGate> fencegate(UDOrnamentBuilder builder) {
        return this.fencegate(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public RegistryObject<UDOrnamentFenceGate> fencegate(UDOrnamentBuilder builder, ArrayList<List<RegistryObject<? extends Block>>> blocktags, ArrayList<List<RegistryObject<? extends Block>>> itemtags) {
        return super.fencegate(builder, blocktags, itemtags, UDOrnamentFenceGate::new);
    }

    public RegistryObject<UDOrnamentDoor> door(UDOrnamentBuilder builder) {
        return this.door(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public RegistryObject<UDOrnamentDoor> door(UDOrnamentBuilder builder, ArrayList<List<RegistryObject<? extends Block>>> blocktags, ArrayList<List<RegistryObject<? extends Block>>> itemtags) {
        return super.door(builder, blocktags, itemtags, UDOrnamentDoor::new);
    }

    public RegistryObject<UDOrnamentPole> pole(UDOrnamentBuilder builder) {
        return this.pole(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public RegistryObject<UDOrnamentPole> pole(UDOrnamentBuilder builder, ArrayList<List<RegistryObject<? extends Block>>> blocktags, ArrayList<List<RegistryObject<? extends Block>>> itemtags) {
        return super.pole(builder, blocktags, itemtags, UDOrnamentPole::new);
    }

    public RegistryObject<UDOrnamentBeam> beam(UDOrnamentBuilder builder) {
        return this.beam(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public RegistryObject<UDOrnamentBeam> beam(UDOrnamentBuilder builder, ArrayList<List<RegistryObject<? extends Block>>> blocktags, ArrayList<List<RegistryObject<? extends Block>>> itemtags) {
        return super.beam(builder, blocktags, itemtags, UDOrnamentBeam::new);
    }

    public RegistryObject<UDOrnamentWall> wall(UDOrnamentBuilder builder) {
        return this.wall(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public RegistryObject<UDOrnamentWall> wall(UDOrnamentBuilder builder, ArrayList<List<RegistryObject<? extends Block>>> blocktags, ArrayList<List<RegistryObject<? extends Block>>> itemtags) {
        return super.wall(builder, blocktags, itemtags, UDOrnamentWall::new);
    }

    public RegistryObject<UDOrnamentSaddleDoor> saddledoor(UDOrnamentBuilder builder) {
        return this.saddledoor(builder, Lists.newArrayList(), Lists.newArrayList());
    }

    public RegistryObject<UDOrnamentSaddleDoor> saddledoor(UDOrnamentBuilder builder, ArrayList<List<RegistryObject<? extends Block>>> blocktags, ArrayList<List<RegistryObject<? extends Block>>> itemtags) {
        return super.saddledoor(builder, blocktags, itemtags, UDOrnamentSaddleDoor::new);
    }
}
