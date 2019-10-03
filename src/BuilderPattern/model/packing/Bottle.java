package BuilderPattern.model.packing;

import BuilderPattern.interfaces.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Packaged in a bottle";
    }
}
