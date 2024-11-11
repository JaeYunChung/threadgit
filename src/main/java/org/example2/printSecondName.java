package main.java.org.example2;

public class printSecondName {
    public synchronized void printName() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName());
            notify();
            try {
                if(i != 100) wait();
            } catch (InterruptedException e) {
            }
        }
    }
}
