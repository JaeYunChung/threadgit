package main.java.org.example;

public class Main {
    public static void main(String[] args) {
        printThreadName object = new printThreadName();
        threadName1 thread1 = new threadName1("thread1", object);
        threadName2 thread2 = new threadName2("thread2", object);
        thread1.start();
        thread2.start();
    }
}