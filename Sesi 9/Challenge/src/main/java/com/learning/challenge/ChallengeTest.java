package com.learning.challenge;

import java.util.List;

public class ChallengeTest {
    public static void main(String[] args) {

        Runner runner = new Runner();
        List<User> lines = runner.parseUsers();

        lines.forEach(System.out::println);
    }
}
