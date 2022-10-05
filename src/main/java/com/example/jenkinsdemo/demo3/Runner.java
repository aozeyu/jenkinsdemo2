package com.example.jenkinsdemo.demo3;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Testing of findSimpleGene() method:");
        String noAtgCodon = "TAGAGTAG";
        String noTaaCodon = "ATGGTAGAT";
        String multipleOfThreeWithAtgAndTaa = "ATGTGGAATTAA";
        String notMultipleOfThreeWithAtgAndTaa = "ATGGTAAAATAGAGTAA";
        String random = "GTTAAATAGATGGAATAA";

        System.out.println(Part1.findSimpleGene(noAtgCodon));
        System.out.println(Part1.findSimpleGene(noTaaCodon));
        System.out.println(Part1.findSimpleGene(multipleOfThreeWithAtgAndTaa));
        System.out.println(Part1.findSimpleGene(notMultipleOfThreeWithAtgAndTaa));
        System.out.println(Part1.findSimpleGene(random));
    }
}
