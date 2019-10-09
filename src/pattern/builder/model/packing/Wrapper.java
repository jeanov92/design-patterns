package pattern.builder.model.packing;

import pattern.builder.interfaces.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Packed in a wrapper";
    }
}
