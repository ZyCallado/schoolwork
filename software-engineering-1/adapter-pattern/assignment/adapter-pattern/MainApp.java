public class MainApp {
    public static void main(String[] args) {
        // Adaptees
        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();

        //Adapters
        PowerOutlet laptopOutlet = new LaptopAdapter(laptop);
        PowerOutlet refrigeratorOutlet = new RefrigeratorAdapter(refrigerator);
        PowerOutlet smartphoneOutlet = new SmartphoneAdapter(smartphoneCharger);

        laptopOutlet.plugIn();
        refrigeratorOutlet.plugIn();
        smartphoneOutlet.plugIn();
    }
}
