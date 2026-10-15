public class AirCon implements Device {

    @Override
    public String switchOn() {
        return "Air conditioner turned on!";
    }

    @Override
    public String switchOff() {
        return "Air conditioner turned off!";
    }

    @Override
    public String plusBtn() {
        return "Temperature increased.";
    }

    @Override
    public String minusBtn() {
        return "Temperature decreased.";
    }
}
