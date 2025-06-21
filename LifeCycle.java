class MyThread extends Thread {
    public void run() {
        System.out.println(getName() + " - Running");
        try {
            System.out.println(getName() + " - Sleeping");
            Thread.sleep(2000);  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " - Finished");
    }
}
public class LifeCycle {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        System.out.println("Thread State: " + t1.getState());
        t1.start(); 
        System.out.println("Thread State after start(): " + t1.getState()); 
        try {
            Thread.sleep(1000); 
            System.out.println("Thread State during sleep: " + t1.getState()); 

            t1.join(); 
            System.out.println("The thread completed its all tasks");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread State after completion: " + t1.getState()); 
    }
}
