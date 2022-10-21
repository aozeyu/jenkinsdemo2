package com.example.jenkinsdemo.adapter;

public class Client {
    public static void main(String[] args) {
        Target adapter = new Adapter();
        adapter.request();
        Target adapter2 = new Adapter2(new Adatee());
        adapter2.request();
    }
}
