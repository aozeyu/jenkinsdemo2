package com.example.jenkinsdemo.javaDesign;

public class Cat implements Printable{
  public String name;
  public int age;
  public Cat() {
    
  }



  @Override
  public String print(String prefix, String suffix) {
    return prefix;
  }
}
