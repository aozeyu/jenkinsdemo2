package com.example.jenkinsdemo.adapter;

//对象适配器
public class Adapter2 implements Target{
    //直接关联被适配类
    private Adatee adatee;
    // 可以通过构造函数传入具体需要适配的被适配类对象
    public Adapter2(Adatee adatee) {
        this.adatee = adatee;
    }
    @Override
    public void request() {
        System.out.println("我是适配器类 我能适配任何两孔插座 让它正常工作");
        this.adatee.specificRequest();
    }
}
