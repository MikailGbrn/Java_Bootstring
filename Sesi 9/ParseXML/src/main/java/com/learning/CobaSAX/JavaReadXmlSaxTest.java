package com.learning.CobaSAX;

import java.util.List;

public class JavaReadXmlSaxTest {
    public static void main(String[] args) {

        MyRunner runner = new MyRunner();
        List<User> lines = runner.parseUsers();

        lines.forEach(System.out::println);
    }
}
