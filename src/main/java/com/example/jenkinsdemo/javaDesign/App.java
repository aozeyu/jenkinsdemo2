package com.example.jenkinsdemo.javaDesign;

import java.util.Optional;

public class App {
  public Integer findElement(Integer[] arr, int x) {
    //找数组中的元素
    for (Integer num : arr) {
      if (num == x) {
        return  x ;
      }
    }
    return null;
  }

  public static void main(String[] args) {
    Optional<Integer> numExists = Optional.of(5);
    Optional<Integer> numDoesNotExists = Optional.empty();
    if (numExists.isPresent()) {
      System.out.println(numExists.get());
    }
    if (numDoesNotExists.isPresent()) {
      System.out.println(numDoesNotExists.get());
    }
  }
}
