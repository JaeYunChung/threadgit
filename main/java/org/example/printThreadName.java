package main.java.org.example;

public class printThreadName {
    public synchronized void printThread1Name() {
        for(int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName());
            notify();
            try {
                if(i != 100) wait();
            }catch (InterruptedException e){};
        }
    }
    public synchronized void printThread2Name() {
        for(int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName());
            notify();
            try {
                if(i != 100) wait();
            }catch (InterruptedException e) {}
        }
    }
}
