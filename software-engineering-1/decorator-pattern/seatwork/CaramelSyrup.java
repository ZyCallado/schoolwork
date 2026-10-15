public class CaramelSyrup implements CoffeeDecorator {
    private Coffee wrappedCoffee;

    @Override
    public void setCoffee(Coffee coffee) {
        wrappedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return wrappedCoffee.getDescription() + ", Caramel Syrup";
    }

    @Override
    public String getCost() {
        return wrappedCoffee.getCost() + " + ₱40.00";
    }
}