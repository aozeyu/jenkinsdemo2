package com.example.jenkinsdemo.javaDesign;

import lombok.var;

public class App {
    public static void main(String[] args) {
        var app = new App();
        app.run();
    }

    @Override
    public void run() {
        ActiveCreature creature;
        try {
            for (int i = 0;i < creatures;i++) {
                creature = new Orc(Orc.class.getSimpleName().toString() + i);
                creature.eat();
                creature.roam();
            }
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        Runtime.getRuntime().exit(1);
    }

}
