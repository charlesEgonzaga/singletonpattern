package singletonpattern;

public class pagibig {
   
        public static void main(String[] args) {
    
System.out.println("\nGood Day Customers! Welcome to Pag-ibig Insurance!\nPlease Get your Number and patiently wait for your turn!");
            System.out.println();
     QueueManager queueManager = QueueManager.getInstance();
    
         HelpDesk helpDesk1 = new HelpDesk(queueManager);
  HelpDesk helpDesk2 = new HelpDesk(queueManager);
    
         
            helpDesk1.serveCustomer(); // Queue number 1
     helpDesk2.serveCustomer(); // Queue number 2
    
             helpDesk1.resetQueueNumber(10);
    
            helpDesk1.serveCustomer(); // Queue number 10
            helpDesk2.serveCustomer(); // Queue number 11
        }
    }

