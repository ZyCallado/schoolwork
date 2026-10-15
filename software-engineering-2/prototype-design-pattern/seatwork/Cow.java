public class Cow implements Animal {
    private Integer legs;
    private String sound;
    private String food;

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

    @Override
    public void makeSound() {
        System.out.println("Moo");
    }

    @Override
    public String getType() {
        return "Cow";
    }

    public Animal clone() {
        Cow clonedCow = new Cow();
        clonedCow.setLegs(this.legs);
        clonedCow.setSound(this.sound);
        clonedCow.setFood(this.food);
        return clonedCow;
    }
}