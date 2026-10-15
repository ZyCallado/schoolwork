public class Tv implements Device {

    @Override
    public String switchOn() {
        return "TV is switched-on!";
    }

    @Override
    public String switchOff() {
        return "TV is switched-off!";
    }

    @Override
    public String plusBtn() {
        return "Volume increased.";
    }

    @Override
    public String minusBtn() {
        return "Volume decreased.";
    }
}
