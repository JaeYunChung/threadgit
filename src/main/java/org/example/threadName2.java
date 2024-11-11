package main.java.org.example;

public class threadName2 extends Thread {

    printThreadName object;

    public threadName2(String name, printThreadName object) {
        super(name);
        this.object = object;
    }

    @Override
    public void run() {
        {
            object.printThread2Name();
        }
    }
}
