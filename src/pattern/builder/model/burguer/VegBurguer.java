package pattern.builder.model.burguer;

public class VegBurguer extends Burguer {
    @Override
    public String name() {
        return "Vegetarian burger";
    }

    @Override
    public float price() {
        return 4.50f;
    }
}
