package com.pb.okhrimenko.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        System.out.println("Введите целое число");
        operand1 = scan.nextInt();
        if (operand1>=0 && operand1<=14)
            System.out.println("введенное число попадает в промежуток [0-14]");
        else if (operand1>=15 && operand1<=35)
            System.out.println("введенное число попадает в промежуток [15-35]");
        else if (operand1>=36 && operand1<=50)
            System.out.println("введенное число попадает в промежуток [36-50]");
        else if (operand1>=51 && operand1<=100)
            System.out.println("введенное число попадает в промежуток [51-100]");
        else    System.out.println("Введенное число не попадает в один из имеющихся промежутков [0 -14] [15 - 35] [36 - 50] [51 - 100]");
    }
}