package com.androsa.undeco.block;

import com.androsa.ornamental.blocks.OrnamentWall;
import com.androsa.undeco.UDOrnamentBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;

public class UDOrnamentWall extends OrnamentWall {

    private final UDOrnamentBuilder undeco;

    public UDOrnamentWall(UDOrnamentBuilder builder, Properties props) {
        super(builder, props);
        this.undeco = builder;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        if (undeco.spreadChance == -1) {
            return super.getFlammability(state, level, pos, direction);
        }
        return undeco.spreadChance;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        if (undeco.flammability == -1) {
            return super.getFireSpreadSpeed(state, level, pos, direction);
        }
        return undeco.flammability;
    }
}
