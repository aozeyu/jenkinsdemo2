package com.example.jenkinsdemo.demo5;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ArrayListEnhancements {
    static List<String> names = Arrays.asList("Dave", "Jessie", "Alex", "Dan");
    static void listForEach() {
        for (String s: names) {
            System.out.println(s);
        }
        names.forEach((s) -> System.out.println(s));
        names.forEach(s -> System.out.println(s));
        List<String> strings = Arrays.asList("one","two","three","four");
        AtomicInteger count = new AtomicInteger();
        strings.forEach((name) -> {
            System.out.println("name: " + name);
            System.out.println(count.getAndIncrement());
        });
    }

    public static void main(String[] args) {
        listForEach();
    }
}
