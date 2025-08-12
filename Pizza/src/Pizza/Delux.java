package Pizza;

public class Delux extends Pizza {
    public Delux(boolean vegetarian) {
        super(vegetarian);
        super.addExtraToppings();
        super.addExtraChess();
    }

    @Override
    public void addExtraChess() {
    }
    @Override
    public void addExtraToppings() {

    }
}
