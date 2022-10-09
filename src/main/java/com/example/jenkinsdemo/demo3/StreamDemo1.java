package com.example.jenkinsdemo.demo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<String> players = Arrays.asList("kobe","james","curry","clilla");
        List<String> sorted = players.stream().filter(x -> x.startsWith("c")).map(String::toUpperCase).sorted().collect(Collectors.toList());
        System.out.println(sorted);
        sorted.forEach(System.out::println);
    }
}
