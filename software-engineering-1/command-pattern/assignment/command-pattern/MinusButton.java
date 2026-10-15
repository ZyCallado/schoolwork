public class MinusButton implements Command {
    private Device device;

    public MinusButton(Device device) {
        this.device = device;
    }

    @Override
    public String execute() {
        return device.minusBtn();
    }
}
