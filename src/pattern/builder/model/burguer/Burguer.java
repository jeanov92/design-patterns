package pattern.builder.model.burguer;

import pattern.builder.interfaces.Item;
import pattern.builder.interfaces.Packing;
import pattern.builder.model.packing.Wrapper;

public abstract class Burguer  implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
