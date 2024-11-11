package main.java.org.example;

public class threadName1 extends Thread {
    printThreadName object;

    public threadName1(String name, printThreadName object){
        super(name);
        this.object = object;
    };
    public void run(){
        object.printThread1Name();
    }
}
