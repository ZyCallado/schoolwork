public class PlusButton implements Command {
    private Device device;

    public PlusButton(Device device) {
        this.device = device;
    }

    @Override
    public String execute() {
        return device.plusBtn();
    }
}
