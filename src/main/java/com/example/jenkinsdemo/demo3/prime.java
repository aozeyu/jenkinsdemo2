package com.example.jenkinsdemo.demo3;

import java.util.Scanner;

public class prime {
    public static boolean isprime(int n)
    {
        if(n<2)
            return false;
        int count=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
                count++;
        }
        if(count==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int a,b,count=0,i;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        for (i = a; i <=b; i++) {
            if (isprime(i)){
                count ++;
            }
        }
        System.out.println(count);
    }
}
