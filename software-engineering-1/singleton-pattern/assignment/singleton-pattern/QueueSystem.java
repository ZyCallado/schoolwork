package singletonpattern;

public class QueueSystem {
    private static QueueSystem instance;
    private int currNum = 0;

    private QueueSystem() {

    }

    public static synchronized QueueSystem getInstance() {
        if(instance == null) {
            instance = new QueueSystem();
        }
        return instance;
    }

    public synchronized int getNextNum() {
        return ++currNum;
    }

    public synchronized int getCurrNum() {
        return currNum;
    }

    public synchronized void resetNum(int newNum) {
        currNum = newNum;
    }
}