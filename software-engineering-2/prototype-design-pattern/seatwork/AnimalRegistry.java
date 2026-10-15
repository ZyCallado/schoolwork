public class AnimalRegistry {
    private Sheep sheep;
    private Cow cow;
    private Horse horse;

    public AnimalRegistry() {
        this.sheep = new Sheep();
        this.cow = new Cow();
        this.horse = new Horse();
    }

    public Animal createSheep() {
        return sheep.clone();
    }

    public Animal createCow() {
        return cow.clone();
    }

    public Animal createHorse() {
        return horse.clone();
    }
}