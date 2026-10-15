public class CoffeeTest {
    public static void main(String[] args) {
        
        //make coffee
        Coffee blackCoffee = new BlackCoffee();
        System.out.println("Description: " + blackCoffee.getDescription());
        System.out.println("Cost: " + blackCoffee.getCost());

        //add milk
        Milk milk = new Milk();
        milk.setCoffee(blackCoffee);
        System.out.println("Description: " + milk.getDescription());
        System.out.println("Cost: " + milk.getCost());

        //add caramel syrup
        CaramelSyrup caramelSyrup = new CaramelSyrup();
        caramelSyrup.setCoffee(milk);
        System.out.println("Description: " + caramelSyrup.getDescription());
        System.out.println("Cost: " + caramelSyrup.getCost());
    }
}