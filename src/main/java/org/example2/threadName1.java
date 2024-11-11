package main.java.org.example2;

public class threadName1 extends Thread {
    printFirstName firstName = new printFirstName();
    public threadName1(String name){super(name);}
    @Override
    public void run(){
        firstName.printName();
    }
}
