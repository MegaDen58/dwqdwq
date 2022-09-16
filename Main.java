package com.company;


public class Main {
    public static void main(String[] args) {
        System.out.println("Start!!");

        MyThread myThread1 = new MyThread();
        myThread1.start();

        MyThread myThread2 = new MyThread();
        myThread2.start();

        MyThread myThread3 = new MyThread();
        myThread3.start();

        MyThread myThread4 = new MyThread();
        myThread4.start();

        MyThread myThread5 = new MyThread();
        myThread5.start();

        MyThread myThread6 = new MyThread();
        myThread6.start();

        MyThread myThread7 = new MyThread();
        myThread7.start();

        MyThread myThread8 = new MyThread();
        myThread8.start();

        MyThread myThread9 = new MyThread();
        myThread9.start();

        MyThread myThread10 = new MyThread();
        myThread10.start();
    }
}

class MyThread extends Thread{
    public void run(){
        for(int i = 0; i < 20; i++){
            System.out.println(getName());
        }
    }
}

