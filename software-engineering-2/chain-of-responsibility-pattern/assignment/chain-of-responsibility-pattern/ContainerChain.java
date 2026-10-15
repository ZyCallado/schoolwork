public class ContainerChain implements WasteContainer {
    private WasteContainer nextContainer;

    public ContainerChain() {
        this.nextContainer = new LiquidWasteContainer();
        WasteContainer c2 = new SolidWasteContainer();
        WasteContainer c3 = new OrganicWasteContainer();
        WasteContainer c4 = new RecyclableWasteContainer();
        WasteContainer c5 = new HazardousWasteContainer();

        nextContainer.setNextContainer(c2);
        c2.setNextContainer(c3);
        c3.setNextContainer(c4);
        c4.setNextContainer(c5);
        c5.setNextContainer(nextContainer);
    }

    
    public void setNextContainer(WasteContainer nextContainer) {
        // Nothing
    }

    @Override
    public void collectWaste(Waste waste) {
        nextContainer.collectWaste(waste);
    }

    @Override
    public void dispose() {
        nextContainer.dispose();
    }
}