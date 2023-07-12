package com.steven.threads;

public class ExampleThreadsExtends extends Thread {

    public ExampleThreadsExtends(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Hola");
    }
}
