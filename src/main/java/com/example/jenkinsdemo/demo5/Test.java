package com.example.jenkinsdemo.demo5;

public class Test {
    public static void main(String[] args) {
        // 直接 + 比使用StringBuilder 慢  String '+' 操作，由于发生了转换为 StringBuilder 的过程，
        stringBuilderTest();
        stringTest();

    }
    public static void stringTest() {
        String result = "";
        long start = System.currentTimeMillis(); //开始时间
        for (int i = 0; i < 100000; i++) {
            result += "test";
        }
        long end = System.currentTimeMillis(); // 结束时间
        System.out.println("String exec time: " + (end - start));
    }

    public static void stringBuilderTest() {
        StringBuilder result = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            result.append("test");
        }
        long end = System.currentTimeMillis();
        System.out.println("String Builder exec time:" + (end - start));

    }
}
