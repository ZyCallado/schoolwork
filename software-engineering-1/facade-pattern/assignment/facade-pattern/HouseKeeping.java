package facadepattern;

public class HouseKeeping implements HotelService {
    private int roomNumber;

    public void cleanRoom(int roomNumber) {
        this.roomNumber = roomNumber;
        System.out.println("Housekeeping is cleaning room number " + roomNumber);
    }

    @Override
    public void provideService() {
        if(roomNumber > 0) {
            System.out.println("Housekeeping is finished cleaning room " + roomNumber);
        } else {
            System.out.println("No room assigned for cleaning yet.");
        }
    }
}