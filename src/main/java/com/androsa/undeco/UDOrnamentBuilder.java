package com.androsa.undeco;

import com.androsa.ornamental.builder.OrnamentBuilder;

public class UDOrnamentBuilder extends OrnamentBuilder {

    public boolean canIgnite = false;
    public int flammability = -1;
    public int spreadChance = -1;

    public UDOrnamentBuilder(OrnamentBuilder builder) {
        super(builder);
    }


    public UDOrnamentBuilder lavaIgnites() {
        this.canIgnite = true;
        return this;
    }

    public UDOrnamentBuilder flammable(int flammability, int spread) {
        this.flammability = flammability;
        this.spreadChance = spread;
        return this;
    }
}
