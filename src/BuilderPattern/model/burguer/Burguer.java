package BuilderPattern.model.burguer;

import BuilderPattern.interfaces.Item;
import BuilderPattern.interfaces.Packing;
import BuilderPattern.model.packing.Wrapper;

public abstract class Burguer  implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
