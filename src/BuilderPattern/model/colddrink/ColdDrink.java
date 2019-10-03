package BuilderPattern.model.colddrink;

import BuilderPattern.interfaces.Item;
import BuilderPattern.interfaces.Packing;
import BuilderPattern.model.packing.Bottle;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
