package BuilderPattern.model.packing;

import BuilderPattern.interfaces.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Packed in a wrapper";
    }
}
