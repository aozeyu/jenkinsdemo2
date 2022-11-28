package com.example.jenkinsdemo.javaDesign;

public class demo1 {

  public static void main(String[] args) {
    String name = "john";
    String antherName = "john";
    String thirdName = new String("john");
    System.out.println(name == antherName);
    System.out.println(name == thirdName);
  }
}
