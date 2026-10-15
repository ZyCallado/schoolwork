public class Lights implements Device {

    @Override
    public String switchOn() {
        return "Lights turned on!";
    }

    @Override
    public String switchOff() {
        return "Lights turned off!";
    }

    @Override
    public String plusBtn() {
        return "Brightness increased.";
    }

    @Override
    public String minusBtn() {
        return "Brightness decreased.";
    }
}
