package singletonpattern;

public class QueueManager {
    private static QueueManager instance;
    private int currentQueueNumber;

    private QueueManager() {
        
        currentQueueNumber = 1;
    }

    public static QueueManager getInstance() {
        if (instance == null) {
            instance = new QueueManager();
        }
        return instance;
    }

    public int generateQueueNumber() {
        return currentQueueNumber++;
    }

    public void resetQueueNumber(int newQueueNumber) {
        currentQueueNumber = newQueueNumber;
        System.out.println("Queue number reset to: " + newQueueNumber);
}
}
