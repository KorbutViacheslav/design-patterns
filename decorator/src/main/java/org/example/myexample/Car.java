package org.example.myexample;

public class Car implements Machine {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Car is running");
    }

    @Override
    public String getName() {
        return name;
    }
}
