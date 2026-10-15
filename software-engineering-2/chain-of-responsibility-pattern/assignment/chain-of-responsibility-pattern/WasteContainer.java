public interface WasteContainer {
    void setNextContainer(WasteContainer nextContainer);
    void collectWaste(Waste waste);
    void dispose();
}