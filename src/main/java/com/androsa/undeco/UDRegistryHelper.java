package com.androsa.undeco;

import com.androsa.ornamental.registry.helper.RegistryHelper;
import com.androsa.undeco.data.UDBlockTags;
import com.androsa.undeco.data.UDItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class UDRegistryHelper extends RegistryHelper {

    public UDRegistryHelper(DeferredRegister<Block> blockreg, DeferredRegister<Item> itemreg) {
        super(blockreg, itemreg);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> stairBlockTags() {
        return array(UDBlockTags.STAIRS);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> stairItemTags() {
        return array(UDItemTags.STAIRS);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> slabBlockTags() {
        return array(UDBlockTags.SLABS);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> slabItemTags() {
        return array(UDItemTags.SLABS);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> fenceBlockTags() {
        return array(UDBlockTags.FENCES);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> fenceItemTags() {
        return array(UDItemTags.FENCES);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> trapdoorBlockTags() {
        return array(UDBlockTags.TRAPDOORS);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> fencegateBlockTags() {
        return array(UDBlockTags.FENCE_GATES);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> fencegateItemTags() {
        return array(UDItemTags.FENCE_GATES);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> doorBlockTags() {
        return array(UDBlockTags.DOORS);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> doorItemTags() {
        return array(UDItemTags.DOORS);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> poleBlockTags() {
        return array(UDBlockTags.POLES);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> poleItemTags() {
        return array(UDItemTags.POLES);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> beamBlockTags() {
        return array(UDBlockTags.BEAMS);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> beamItemTags() {
        return array(UDItemTags.BEAMS);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> wallBlockTags() {
        return array(UDBlockTags.WALLS);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> wallItemTags() {
        return array(UDItemTags.WALLS);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> saddledoorBlockTags() {
        return array(UDBlockTags.SADDLE_DOORS);
    }

    @Override
    protected ArrayList<List<RegistryObject<? extends Block>>> saddledoorItemTags() {
        return array(UDItemTags.SADDLE_DOORS);
    }
}
