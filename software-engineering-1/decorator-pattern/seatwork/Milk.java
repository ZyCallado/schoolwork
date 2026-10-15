public class Milk implements CoffeeDecorator {
    private Coffee wrappedCoffee;

    @Override
    public void setCoffee(Coffee coffee) {
        wrappedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return wrappedCoffee.getDescription() + ", Milk";
    }

    @Override
    public String getCost() {
        return wrappedCoffee.getCost() + " + ₱25.00";
    }
}