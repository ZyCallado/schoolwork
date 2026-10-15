public class Sheep implements Animal {
    private Integer legs;
    private String sound;
    private String food;
    private String name;

    public void setLegs(Integer legs) {
        this.legs = legs;
    }

    public Integer getLegs() {
        return legs;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void makeSound() {
        System.out.println("Baa");
    }

    @Override
    public String getType() {
        return "Sheep";
    }

    public Animal clone() {
        Sheep clonedSheep = new Sheep();
        clonedSheep.setLegs(this.legs);
        clonedSheep.setSound(this.sound);
        clonedSheep.setFood(this.food);
        clonedSheep.setName(this.name);
        return clonedSheep;
    }
}