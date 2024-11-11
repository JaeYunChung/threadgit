package main.java.org.example2;

public class threadName2 extends Thread {
    printSecondName secondName = new printSecondName();
    public threadName2(String name){super(name);}
    @Override
    public void run(){
        secondName.printName();
    }
}
