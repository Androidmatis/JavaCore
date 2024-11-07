// Демонстрация определения простого обобщенного метода.
class GenMathDemo {
    // Выяснить, присутствует ли объект в массиве.
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++)
            if (x.equals(y[i])) return true;
        return false;
    }
    public static void main(String[] args) {
        // Использовать isIn() для объектов Integer.
        Integer[] nums = {1, 2, 3, 4, 5};
        if (isIn(2, nums))
            System.out.println("2 присутствует в nums");
        if (!isIn(7, nums))
            System.out.println("7 не присутствует в nums");
        System.out.println();
        // Использовать isIn() для объектов String.
        String[] strs = {"one", "two", "three", "four", "five"};
        if (isIn("two", strs))
            System.out.println("two присутствует в strs");
        if (!isIn("seven", strs))
            System.out.println("seven не присутствует в strs");
        // Не скомпилируется! Типы должны быть совместимыми.
        // if (isIn("two", nums))
        //     System.out.println("two присутствует в strs");
    }
}
