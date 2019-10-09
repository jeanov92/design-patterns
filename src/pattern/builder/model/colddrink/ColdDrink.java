package pattern.builder.model.colddrink;

import pattern.builder.interfaces.Item;
import pattern.builder.interfaces.Packing;
import pattern.builder.model.packing.Bottle;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
