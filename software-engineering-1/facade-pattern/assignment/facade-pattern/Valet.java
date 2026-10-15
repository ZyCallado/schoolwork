package facadepattern;

public class Valet implements HotelService {
    private String plateNumber;

    public void pickUpVehicle(String plateNumber) {
        this.plateNumber = plateNumber;
        System.out.println("Picking up vehicle with plate number " + plateNumber);
    }

    @Override
    public void provideService() {
        if(plateNumber != null) {
            System.out.println("Valet completed vehicle service for plate number " + plateNumber);
        } else {
            System.out.println("No vehicle currently assigned to valet.");
        }
    }
}