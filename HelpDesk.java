package singletonpattern;

public class HelpDesk {
    


  
    private QueueManager queueManager;

    public HelpDesk(QueueManager queueManager) {
        this.queueManager = queueManager;
    }

    public void serveCustomer() {
        int queueNumber = queueManager.generateQueueNumber();
        System.out.println("Now serving customer with queue number: " + queueNumber);
    }

    public void resetQueueNumber(int newQueueNumber) {
        queueManager.resetQueueNumber(newQueueNumber);
    }
}

