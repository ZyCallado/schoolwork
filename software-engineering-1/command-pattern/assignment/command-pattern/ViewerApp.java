import java.util.Scanner;
public class ViewerApp {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        //Devices
        Device airCon = new AirCon();
        Device lights = new Lights();
        Device musicPlayer = new MusicPlayer();
        Device tv = new Tv();

        CentralHub ch = new CentralHub();
        Command on = null, off = null, plus = null, minus = null;

        while(true) {
            System.out.println("[1] Air Conditioner\n[2] Lights\n[3] Music Player\n[4] TV\n[5] Close App");
            System.out.print("Choose device: ");
            int choice = input.nextInt();

            if(choice == 5) {
                System.out.println("Closing app...");
                break;
            }


            switch (choice) {
                case 1:
                    on = new PowerOn(airCon);
                    off = new PowerOff(airCon);
                    plus = new PlusButton(airCon);
                    minus = new MinusButton(airCon);
                    break;

                case 2:
                    on = new PowerOn(lights);
                    off = new PowerOff(lights);
                    plus = new PlusButton(lights);
                    minus = new MinusButton(lights);
                    break;

                case 3:
                    on = new PowerOn(musicPlayer);
                    off = new PowerOff(musicPlayer);
                    plus = new PlusButton(musicPlayer);
                    minus = new MinusButton(musicPlayer);
                    break;

                case 4:
                    on = new PowerOn(tv);
                    off = new PowerOff(tv);
                    plus = new PlusButton(tv);
                    minus = new MinusButton(tv);
                    break;

                default:
                    System.out.println("Sorry, but we currently only have 4 devices.");

            }

            while (choice <= 4) {
                System.out.println("[1] Power On\n[2] Power Off\n[3] Plus Button\n[4] Minus Button\n[5] Back");
                System.out.print("Choose a command: ");
                int choice1 = input.nextInt();

                if (choice1 == 5) break;

                switch (choice1) {
                    case 1:
                        ch.setCommand(on);
                        System.out.println(ch.clickButton());
                        break;

                    case 2:
                        ch.setCommand(off);
                        System.out.println(ch.clickButton());
                        break;

                    case 3:
                        ch.setCommand(plus);
                        System.out.println(ch.clickButton());
                        break;

                    case 4:
                        ch.setCommand(minus);
                        System.out.println(ch.clickButton());
                        break;

                    default:
                        System.out.println("Invalid command.");
                }
            }
        }
    }
}
