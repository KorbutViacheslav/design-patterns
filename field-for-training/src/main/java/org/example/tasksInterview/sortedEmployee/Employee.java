package org.example.tasksInterview.sortedEmployee;

import java.util.List;

public class Employee {
    Integer salary;
    List<Project> projects;

    public Employee(Integer salary, List<Project> projects) {
        this.salary = salary;
        this.projects = projects;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
