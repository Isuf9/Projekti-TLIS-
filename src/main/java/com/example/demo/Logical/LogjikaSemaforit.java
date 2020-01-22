package com.example.demo.Logical;

public class LogjikaSemaforit implements KonfigurimiSemaforit{

    public void run(){
        System.out.println("Semafori eshte aktiv");
    }
    public void start() throws InterruptedException {

        while(true)  {
            redK();
            yellow();
            green();
        }
    }
    @Override
    public void redK() throws InterruptedException {
        System.out.println("Semafori: Kuq");
        for (int i=35; i>=0; i--){
            System.out.print(i);
            Thread.sleep(1000);
            System.out.print("\b\b");
        }
    }

    @Override
    public void yellow() throws InterruptedException {
        System.out.println("Semafori: Verdhe");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i);
            Thread.sleep(1000);
            System.out.print("\b\b");
        }
    }

    @Override
    public void green() throws InterruptedException {
        System.out.println("Semafori: Gjelbert");
        for (int i=35; i>=0; i--){
            System.out.print(i);
            Thread.sleep(1000);
            System.out.print("\b\b");
        }
    }
}