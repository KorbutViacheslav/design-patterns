package org.example.tasksInterview.sortedEmployee;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Відсортувати всі унікальні проєкти в методі uniqProjects()
// де вхідним параметром буде List<Employee> зі списками проєктів
public class DemoInterview {
    public static void main(String[] args) {
        List<Project> list = List.of(
                new Project("REST"),
                new Project("Java"),
                new Project("JavaScript"));
        Employee e1 = new Employee(2000, list);

        List<Project> list2 = List.of(
                new Project("Java"),
                new Project("JavaScript"),
                new Project("Go"),
                new Project("Piton")
        );
        Employee e2 = new Employee(2001, list2);

        List<Employee> employees = List.of(e1, e2);
        uniqProjects(employees).forEach(System.out::println);
    }

    public static Set<Project> uniqProjects(List<Employee> employees) {
        return employees.stream()
                .flatMap(employee -> employee.getProjects().stream())
                .collect(Collectors.toSet());
    }
}
