package facadepattern;

import java.util.Scanner;

public class HotelApp {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        System.out.print("[1]Request Valet\n[2]Request Housekeeping\n[3]Request Cart\n");
        System.out.print("\nChoose a service: ");
        int choice = input.nextInt();

        switch(choice) {
            case 1:
                System.out.print("Input plate number: ");
                String plateNumber = input.next();
                frontDesk.requestValet(plateNumber);
                break;

            case 2:
                System.out.print("Input room number: ");
                int roomNumber = input.nextInt();
                frontDesk.requestHouseKeeping(roomNumber);
                break;

            case 3:
                System.out.print("Input number of carts: ");
                int numberOfCarts = input.nextInt();
                frontDesk.requestCart(numberOfCarts);
                break;

            default:
                System.out.println("Invalid input.");
        }
    }
}