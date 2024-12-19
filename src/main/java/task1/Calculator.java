package task1;

public class Calculator {
    // Метод для сложения двух чисел
    public static <T extends Number, U extends Number> double sum(T a, U b) {
        return a.doubleValue() + b.doubleValue();
    }

    // Метод для умножения двух чисел
    public static <T extends Number, U extends Number> double multiply(T a, U b) {
        return a.doubleValue() * b.doubleValue();
    }

    // Метод для деления двух чисел
    public static <T extends Number, U extends Number> double divide(T a, U b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }
        return a.doubleValue() / b.doubleValue();
    }

    // Метод для вычитания двух чисел
    public static <T extends Number, U extends Number> double subtract(T a, U b) {
        return a.doubleValue() - b.doubleValue();
    }
}