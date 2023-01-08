package edu.brain.lesson_19;

import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        HashSet<User> userSet = new HashSet<>();

        User user1 = new User("Test", 50, "+380643423464");
        User user2 = new User("Test", 50, "+380643423464");
        User user3 = new User("Test", 57, "+380643423464");

        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);

        System.out.println(userSet);
    }
}
