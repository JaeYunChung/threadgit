package main.java.org.example2;

public class printFirstName {
    public synchronized void printName() {
        for(int i = 0; i <= 100; i++) {
            try {
                if(i != 100) wait();
            } catch (InterruptedException e) {
            }
            System.out.println(Thread.currentThread().getName());
            notify();
        }
    }
}
