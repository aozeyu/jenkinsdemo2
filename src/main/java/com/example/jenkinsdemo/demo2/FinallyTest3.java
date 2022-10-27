package com.example.jenkinsdemo.demo2;

public class FinallyTest3 {
    public static void main(String[] args) {
        FinallyTest3.method1();
        System.out.println("method1 执行完成");
    }
    //声明一个静态方法可以直接用类.方法名调用
    static void  method1() {
        try {
            System.out.println("method1 执行");
            return; // 即使这里return 还是会执行finally finally是必须执行的代码块
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("执行finally");
        }
    }
}
