package org.example.builder;

import org.example.builder.humanBuilder.Human;

public class Main {
    public static void main(String[] args) {
        //Human builder testing
        Human man = new Human.Builder().name("Marty").age(18).weight(70.5).build();
        System.out.println(man);



        System.out.println("Hello, this is training implementing builder pattern.");
    }
}
