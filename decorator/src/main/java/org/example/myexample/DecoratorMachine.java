package org.example.myexample;

public class DecoratorMachine implements Machine {
    private Machine machine;

    public DecoratorMachine(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void run() {
        machine.run();
    }

    @Override
    public String getName() {
        return machine.getName();
    }
}
