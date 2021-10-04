package calc;

public class Calculator {
    private double x, y;

    public Calculator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double add() {
        return x + y;
    }

    public double sub() {
        return x - y;
    }

    public double mult() {
        return x * y;
    }

    public double div() {
        return x / y;
    }
}