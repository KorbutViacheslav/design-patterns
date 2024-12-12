package org.example.tasksInterview;

import java.util.List;

public class DemoInterview {
    public static void main(String[] args) {
        List<Project> list = List.of(
                new Project("REST"),
                new Project("Java"),
                new Project("JavaScript"));
        Employee e1 = new Employee(2000, list);

        System.out.println("31:35 play with this position");
    }
}
