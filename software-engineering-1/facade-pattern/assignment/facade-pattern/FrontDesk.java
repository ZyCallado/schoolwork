package facadepattern;

public class FrontDesk {
    private Valet valet;
    private HouseKeeping houseKeeping;
    private Cart cart;

    public FrontDesk() {
        valet = new Valet();
        houseKeeping = new HouseKeeping();
        cart = new Cart();
    }

    public void requestValet(String plateNumber) {
        valet.pickUpVehicle(plateNumber);
        valet.provideService();
    }

    public void requestHouseKeeping(int roomNumber) {
        houseKeeping.cleanRoom(roomNumber);
        houseKeeping.provideService();
    }

    public void requestCart(int numberOfCarts) {
        cart.requestCart(numberOfCarts);
        cart.provideService();
    }
}