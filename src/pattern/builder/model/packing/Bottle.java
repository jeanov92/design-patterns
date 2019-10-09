package pattern.builder.model.packing;

import pattern.builder.interfaces.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Packaged in a bottle";
    }
}
