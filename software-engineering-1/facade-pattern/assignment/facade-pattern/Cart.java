package facadepattern;

public class Cart implements HotelService {
    private int numberOfCarts;

    public void requestCart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
        System.out.println("Requesting " + numberOfCarts + " luggage cart(s).");
    }

    @Override
    public void provideService() {
        if(numberOfCarts > 0) {
            System.out.println("Successfully delivered " + numberOfCarts + " cart(s).");
        } else {
            System.out.println("No carts requested yet.");
        }
    }
}