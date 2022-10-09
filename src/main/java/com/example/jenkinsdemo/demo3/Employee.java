package com.example.jenkinsdemo.demo3;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.function.Predicate;

@Data
@AllArgsConstructor
public class Employee {
    private Integer id;
    private Integer age;
    private String gender;
    private String firstNme;
    private String lastName;

    public static Predicate<Employee> ageGreaterThan70 = x -> x.getAge() > 70;
    public static Predicate<Employee> genderM = x -> x.getGender().equals("M");
}
