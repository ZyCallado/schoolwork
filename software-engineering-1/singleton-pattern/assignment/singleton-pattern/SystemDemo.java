package singletonpattern;

public class SystemDemo {
    public static void main(String[] args) {
        HelpDeskStation desk1 = new HelpDeskStation("Desk 1");
        HelpDeskStation desk2 = new HelpDeskStation("Desk 2");
        HelpDeskStation desk3 = new HelpDeskStation("Desk 3");

        //sample scenario
        desk1.serveNextPerson();
        desk2.serveNextPerson();
        desk3.serveNextPerson();
        desk1.resetNum(800);
        desk1.serveNextPerson();
        desk2.serveNextPerson();
        desk3.serveNextPerson();
    }
}