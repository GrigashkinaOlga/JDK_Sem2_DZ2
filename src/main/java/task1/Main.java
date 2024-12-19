package task1;

public class Main {
    public static void main(String[] args) {
        // Примеры использования
        int x = 10;
        double y = 5.5;

        System.out.println("Сложение: " + Calculator.sum(x, y));
        System.out.println("Умножение: " + Calculator.multiply(x, y));
        System.out.println("Деление: " + Calculator.divide(x, y));
        System.out.println("Вычитание: " + Calculator.subtract(x, y));
    }
}
