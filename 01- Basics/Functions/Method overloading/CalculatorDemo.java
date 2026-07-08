class Calculator {

    void add(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));
    }

    void add(double a, double b) {
        System.out.println("Sum of two double values: " + (a + b));
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        cal.add(10, 20);
        cal.add(10, 20, 30);
        cal.add(10.5, 20.7);
    }
}