public class MusicPlayer implements Device {

    @Override
    public String switchOn() {
        return "Playing music...";
    }

    @Override
    public String switchOff() {
        return "Music stopped.";
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
