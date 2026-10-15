public class Horse implements Animal {
    private Integer legs;
    private String sound;
    private String food;
    private String color;

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

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void makeSound() {
        System.out.println("Neigh");
    }

    @Override
    public String getType() {
        return "Horse";
    }
    public Animal clone() {
        Horse clonedHorse = new Horse();
        clonedHorse.setLegs(this.legs);
        clonedHorse.setSound(this.sound);
        clonedHorse.setFood(this.food);
        clonedHorse.setColor(this.color);
        return clonedHorse;
    }
}