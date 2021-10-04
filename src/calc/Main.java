package calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите действие: \n" +
                "'+' - Сложение\n" +
                "'-' - Вычитание\n" +
                "'*' - Умножение\n" +
                "'/' - Деление\n" +
                "'1' - Начислить НДС\n" +
                "'2' - Выделить НДС\n" +
                "'3' - Расчет взносов на з/п");
        Scanner inp = new Scanner(System.in);
        String ch = inp.nextLine();
        boolean b = true;
        double num1 = 0, num2 = 0;
        while (b) {
            if (ch.equals("3")) {
                System.out.println("Введите размер заработной платы:");
                num1 = inp.nextDouble();
                b = false;
            }
            else if (ch.equals("1") || ch.equals("2")) {
                System.out.println("Введите сумму и ставку(%):");
                num1 = inp.nextDouble();
                num2 = inp.nextDouble();
                b = false;
            }
            else if (ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")) {
                System.out.println("Введите первое и второе число:");
                num1 = inp.nextDouble();
                num2 = inp.nextDouble();
                b = false;
            }
            else {
                System.out.println("Введена неправильная операция, повторите попытку");
                inp = new Scanner(System.in);
                ch = inp.nextLine();
            }
        }
        Calculator c1 = new Calculator(num1,num2);
        System.out.print("Результат: ");
        switch (ch) {
            case "+":
                System.out.println(c1.getX() + " + " + c1.getY() + " = " + c1.add());
                break;
            case "-":
                System.out.println(c1.getX() + " - " + c1.getY() + " = " + c1.sub());
                break;
            case "*":
                System.out.println(c1.getX() + " * " + c1.getY() + " = " + c1.mult());
                break;
            case "/":
                System.out.println(c1.getX() + " / " + c1.getY() + " = " + c1.div());
                break;
            case "1":
                System.out.println("НДС = " + c1.add_nds());
                System.out.println("Сумма вместе с налогом = " + (c1.getX() + c1.add_nds()));
                break;
            case "2":
                System.out.println("НДС = " + c1.sub_nds());
                System.out.println("Сумма без НДС = " + (c1.getX() - c1.sub_nds()));
                break;
            case "3":
                c1.setY(22);
                System.out.println("на ОПС = " + c1.add_nds());
                c1.setY(5.1);
                System.out.println("на ОМС = " + c1.add_nds());
                c1.setY(2.9);
                System.out.println("на ВНиМ = " + c1.add_nds());
                c1.setY(30);
                System.out.println("Общий взнос = " + c1.add_nds());
                break;
            default:
                System.out.println("Неправильная операция");
        }
    }
}