package task2;

import java.util.Objects;

public class ArrayComparer {

    // Обобщенный метод для сравнения двух массивов
    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        // Проверка длины массивов
        if (array1.length != array2.length) {
            return false; // Массивы разной длины
        }

        // Сравнение элементов массивов
        for (int i = 0; i < array1.length; i++) {
            if (!Objects.equals(array1[i], array2[i])) {
                return false; // Найдено несовпадение
            }
        }

        return true; // Массивы равны
    }
}