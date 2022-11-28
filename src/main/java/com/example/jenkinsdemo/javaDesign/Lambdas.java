package com.example.jenkinsdemo.javaDesign;

public class Lambdas {
  public static void main(String[] args) {

    Printable lambdaPrintable = (p, s) -> {
      System.out.println(p + " Meow " + s);
      return "Meow";
    };
    printThing(lambdaPrintable);
  }

  static void printThing(Printable thing) {
    thing.print("1","!");
  }
}
