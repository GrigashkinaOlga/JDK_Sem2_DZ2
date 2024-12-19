package task2;

public class Main {
    public static void main(String[] args) {
        // Примеры использования
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {1, 2, 3};
        Integer[] array3 = {1, 2, 4};

        System.out.println(ArrayComparer.compareArrays(array1, array2)); // true
        System.out.println(ArrayComparer.compareArrays(array1, array3)); // false

        String[] stringArray1 = {"a", "b", "c"};
        String[] stringArray2 = {"a", "b", "c"};
        String[] stringArray3 = {"a", "b", "d"};

        System.out.println(ArrayComparer.compareArrays(stringArray1, stringArray2)); // true
        System.out.println(ArrayComparer.compareArrays(stringArray1, stringArray3)); // false
    }
}

