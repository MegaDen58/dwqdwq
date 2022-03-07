package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.print("Введите модуль: ");
        int module = in.nextInt();
        System.out.println("Веберите действие (+ или *)");
        String arithmeticOperation = in.next();
        switch (arithmeticOperation){
            case("+"):
                sumModule(a, b, module);
                break;
            case("*"):
                multiplicationModule(a, b, module);
                break;
        }

    }
    public static void sumModule(int a, int b, int module){
        if(a + b < module){
            int sum = a + b;
            System.out.printf("Сумма %d и %d по модулю %d = %d", a, b, module, sum);
        }
        else{
            int sum = a + b;
            int result = sum % module;
            System.out.printf("Сумма %d и %d по модулю %d = %d", a, b, module, result);
        }
    }
    public static void multiplicationModule(int a, int b, int module){
        if(a * b < module){
            int multiplication = a * b;
            System.out.printf("Произведение %d на %d по модулю %d = %d", a, b, module, multiplication);
        }
        else{
            int multiplication = a * b;
            int result = multiplication % module;
            System.out.printf("Произведение %d на %d по модулю %d = %d", a, b, module, result);
        }
    }
}
