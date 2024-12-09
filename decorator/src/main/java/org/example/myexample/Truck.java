package org.example.myexample;

public class Truck extends DecoratorMachine {


    public Truck(Machine machine) {
        super(machine);
    }

    @Override
    public void run() {
        super.run();
        System.out.println("The truck is ready for loading");
    }

    @Override
    public String getName() {
        return super.getName()+"-Truck";
    }

}