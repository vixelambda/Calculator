package calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator obj = new Calculator(10, 100);
        System.out.println(obj.getX() + " " + obj.getY());
        System.out.println("Введите 2 числа:");
        Scanner inp = new Scanner(System.in);
        double num1 = inp.nextDouble();
        double num2 = inp.nextDouble();
        obj.setX(num1);
        obj.setY(num2);
        System.out.println("Сумма чисел: " + obj.add());
        System.out.println("Разность чисел: " + obj.sub());
        System.out.println("Произведение чисел: " + obj.mult());
        System.out.println("Частное чисел: " + obj.div());
        System.out.println("Начисленный НДС: " + obj.add_nds());
        System.out.println("Выделенный НДС: " + obj.sub_nds());
    }
}