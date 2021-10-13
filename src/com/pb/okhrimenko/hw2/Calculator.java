package com.pb.okhrimenko.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;
        System.out.println("Введите значение operand1");
        operand1 = scan.nextInt();
        System.out.println("Введите значение operand2");
        operand2 = scan.nextInt();
        System.out.println("Введите знак арифметической операции (*/+-)");
        sign = scan.next();
        switch (sign) {
            case "*":
                System.out.println("результат выполнения арифметической операции умножение= " + (operand1*operand2));
                break;
                    case "/":
                        if (operand2!=0)
                        System.out.println("результат выполнения арифметической операции деление= " + (operand1/operand2));
                        else System.out.println("Ошибка! Деление на 0");
                        break;
                    case "+":
                        System.out.println("результат выполнения арифметической операции сложение= " + (operand1+operand2));
                        break;
                    case "-":
                        System.out.println("результат выполнения арифметической операции вычитание= " + (operand1-operand2));
                        break;

            default:
                System.out.println("Неверный арифметический знак операции (*/+-)");
        }

    }
}
