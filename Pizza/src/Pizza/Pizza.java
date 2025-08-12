package Pizza;

public class Pizza {
    private int price;
    private boolean vegetarian = true;
    private int extraChessPrice = 100;
    private int extraToppingsPrice = 150;
    private int backPackPrice = 20;

    public Pizza(boolean vegetarian){
        this.vegetarian = vegetarian;
        this.price = vegetarian ? 400 : 300;
    }

    public int getPrice() {
        return price;
    }
    public void addExtraChess() {
        this.price += extraChessPrice;
    }
    public void addExtraToppings() {
        this.price += extraToppingsPrice;
    }
    public void addTakeAway() {
        this.price += backPackPrice;
    }
    public int getTotalBills() {
        return this.price;
    }
}
