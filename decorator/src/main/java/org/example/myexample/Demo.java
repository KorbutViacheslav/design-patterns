package org.example.myexample;

public class Demo {
    public static void main(String[] args) {
        Machine machine = new Truck(new Car("Volkswagen"));
        machine.run();
        System.out.println(machine.getName());
    }
}
