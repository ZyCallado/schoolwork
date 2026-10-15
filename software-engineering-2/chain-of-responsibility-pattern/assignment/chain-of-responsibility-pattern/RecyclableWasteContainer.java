public class RecyclableWasteContainer implements WasteContainer {
    private WasteContainer nextContainer;
    private int capacity = 150;
    private int currentAmount = 0;

    @Override
    public void setNextContainer(WasteContainer nextContainer) {
        this.nextContainer = nextContainer;
    }

    @Override
    public void collectWaste(Waste waste) {
        if (waste.getType().equalsIgnoreCase("recyclable")) {
            if (currentAmount + waste.getAmount() > capacity) {
                dispose();
            }

            System.out.println("Collecting " + waste.getType() + " waste...");
            currentAmount += waste.getAmount();
            System.out.println("Waste collected.");
            if (currentAmount >= capacity) {
                dispose();
            }
        } else {
            nextContainer.collectWaste(waste);
        }
    }

    @Override
    public void dispose() {
        System.out.println("Disposing recyclable waste...");
        currentAmount = 0;
        System.out.println("Waste disposed successfully.");
    }
}