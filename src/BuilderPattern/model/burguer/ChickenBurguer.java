package BuilderPattern.model.burguer;

public class ChickenBurguer extends Burguer {
    @Override
    public String name() {
        return "Chicken burguer";
    }

    @Override
    public float price() {
        return 4.00f;
    }
}
