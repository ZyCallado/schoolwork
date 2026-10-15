public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal sheep1 = registry.createSheep();
        ((Sheep) sheep1).setName("Dolly");

        Animal cow1 = registry.createCow();
        ((Cow) cow1).setSound("Moo");

        Animal horse1 = registry.createHorse();
        ((Horse) horse1).setColor("Brown");

        System.out.println(sheep1.getType() + " name is " + ((Sheep) sheep1).getName());
        System.out.println(cow1.getType() + " makes sound " + ((Cow) cow1).getSound());
        System.out.println(horse1.getType() + " is colored " + ((Horse) horse1).getColor());

        System.out.println("\nCloning animals...\n");

        Animal sheep2 = registry.createSheep();
        ((Sheep) sheep2).setName("Shaun");
        System.out.println(sheep2.getType() + " name is " + ((Sheep) sheep2).getName());

        Animal cow2 = registry.createCow();
        ((Cow) cow2).setSound("Moo Moo");
        System.out.println(cow2.getType() + " makes sound " + ((Cow) cow2).getSound());
        
        Animal horse2 = registry.createHorse();
        ((Horse) horse2).setColor("Black");
        System.out.println(horse2.getType() + " is colored " + ((Horse) horse2).getColor());
    }
}