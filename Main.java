package com.company;


public class Main {
    public static void main(String[] args) {
        System.out.println("Start!!");

        AnimalThread rabbit = new AnimalThread("Rabbit", 5);
        rabbit.start();

        AnimalThread turtle = new AnimalThread("Turtle", 5);
        turtle.start();
    }
}

class AnimalThread extends Thread{
    String animalName;
    int counter;

    AnimalThread(String name, int priority){
        animalName = name;
        this.setPriority(priority);
    }

    public void run(){
        for(int i = 0; i <= 1000; i += 100){
            this.counter = i;
            if(animalName.equals("Rabbit") && i == 700){
                this.setPriority(1);
            }
                System.out.println(animalName + " " + i);
        }
    }
}

