package org.example;


class Pair<T1, T2> {
    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }
}

public class Main {

    // Обобщенный метод для обработки пары
    public static <T1, T2> String processPair(Pair<T1, T2> pair) {
        Object first = pair.getFirst();
        Object second = pair.getSecond();

        if (first instanceof Number && second instanceof Number) {
            // Если оба элемента - числа, возвращаем их сумму
            double sum = ((Number) first).doubleValue() + ((Number) second).doubleValue();
            return "Сумма пары: " + sum;
        } else if (first instanceof String && second instanceof String) {
            // Если оба элемента - строки, возвращаем их конкатенацию
            return "Конкатенация пары: " + first.toString() + second.toString();
        } else {
            return "Неподдерживаемые типы для операции.";
        }
    }

    public static void main(String[] args) {
        // Пример с числовыми значениями
        Pair<Integer, Integer> intPair = new Pair<>(3, 5);
        String sumResult = processPair(intPair);
        System.out.println(sumResult);

        // Пример со строковыми значениями
        Pair<String, String> stringPair = new Pair<>("Hello, ", "World!");
        String concatResult = processPair(stringPair);
        System.out.println(concatResult);
    }
}

