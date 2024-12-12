package org.example.tasksInterview.userSorted;

public class User implements Comparable<User> {
    Integer age;

    public User(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        return this.age - o.age;
    }
}
