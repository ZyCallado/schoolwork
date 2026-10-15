package singletonpattern;

public class HelpDeskStation {
    private String deskName;
    private QueueSystem queueSystem;

    public HelpDeskStation(String deskName) {
        this.deskName = deskName;
        this.queueSystem = QueueSystem.getInstance();
    }

    public void serveNextPerson() {
        queueSystem.getNextNum();
        System.out.println(this.deskName + " is currently serving number: " + queueSystem.getCurrNum());
    }

    public void resetNum(int newNum) {
        queueSystem.resetNum(newNum);
        System.out.println("Queue reset to number: " + queueSystem.getCurrNum());
        System.out.println(this.deskName + " is currently serving number: " + queueSystem.getCurrNum());
    }
}