package calc;

public class Main {
    public static void main(String[] args) {
        Calculator obj = new Calculator(10, 100);
        System.out.println(obj.getX() + " " + obj.getY());
    }
}