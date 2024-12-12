package org.example.tasksInterview.userSorted;

import java.util.Comparator;
import java.util.List;

public class DemoUserSorted {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User(18),
                new User(12),
                new User(16),
                new User(23)
        );
        users.stream().sorted(Comparator.comparingInt(User::getAge)).forEach(System.out::println);
    }
}
