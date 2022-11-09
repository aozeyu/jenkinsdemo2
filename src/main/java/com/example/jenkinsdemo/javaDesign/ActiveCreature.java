package com.example.jenkinsdemo.javaDesign;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @author yaozeyu
 */
public abstract class ActiveCreature {
    private final Logger logger = LoggerFactory.getLogger(ActiveCreature.class);
    // 阻塞队列
    private BlockingQueue<Runnable> requests;
    private String name;
    private Thread thread;

    public ActiveCreature(String name ) {
        this.name = name;
        this.requests = new LinkedBlockingDeque<Runnable>();
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        requests.take().run();
                    }catch (InterruptedException e) {
                        logger.error(e.getMessage());
                    }
                }
            }
        });
        thread.start();
    }

    public void eat() throws InterruptedException {
        requests.put(new Runnable() {
            @Override
            public void run() {
                logger.info("{} is eating!",name());
                logger.info("{} has finished eating!",name());
            }
        });
    }


    public void roam() throws InterruptedException {
        requests.put(new Runnable() {
                         @Override
                         public void run() {
                             logger.info("{} has started to roam the wastelands.",name());
                         }
                     }
        );
    }
    public String name() {
        return this.name;
    }
}
