package main.java.org.example2;

public class Main {
    public static void main(String[] args) {

        threadName1 thread1 = new threadName1("thread1");
        threadName2 thread2 = new threadName2("thread2");

        thread1.start();
        thread2.start();

    }
}