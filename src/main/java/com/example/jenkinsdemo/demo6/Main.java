package com.example.jenkinsdemo.demo6;

import lombok.var;

import java.util.HashMap;

/**
 * @author yaozeyu
 */
public class Main {
  public static void main(String[] args) {
    var hashMap = new HashMap<Integer,String>();
    hashMap.put(23,"HP");
    hashMap.put(12,"Dell");
    hashMap.put(10,"Apple");
    hashMap.put(34,"Asus");
    var keySet = hashMap.keySet();
//    for (var k : keySet
//         ) {
//      System.out.println(k);
//    }

//    hashMap.values().forEach(System.out::println);
    keySet.stream().reduce(Integer::sum).ifPresent(System.out::println);
  }
}
