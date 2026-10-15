public class RestoApp {
    public static void main(String[] args) {
        
        MenuItem burger = new MenuItem("Classic Burger", 250.00);
        MenuItem fries  = new MenuItem("Large Fries", 85.00);
        MenuItem soda   = new MenuItem("Root Beer", 60.00);

        MenuCategory barkadaSoloMeal = new MenuCategory("Barkada Solo Meal");
        barkadaSoloMeal.add(burger);
        barkadaSoloMeal.add(fries);
        barkadaSoloMeal.add(soda);

        MenuItem vanillaSundae = new MenuItem("Vanilla Sundae", 45.00);

        MenuCategory mainMenu = new MenuCategory("Main Menu");
        mainMenu.add(barkadaSoloMeal);
        mainMenu.add(vanillaSundae);

        mainMenu.print();
        System.out.println();
        System.out.println("==============================");
        System.out.println("Total Menu Value: ₱" + mainMenu.getPrice());
    }
}