// Пример обобщенного интерфейса.
// Интерфейс для нахождения минимального и максимального значений.
interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}
// Реализовать интерфейс MinMax.
class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;
    MyClass(T[] o) {
        vals = o;
    }
    // Возвратить минимальное значение в vals.
    public T min() {
        T v = vals[0];
        for (int i = 1; i < vals.length; i++)
            if (vals[i].compareTo(v) < 0)
                v = vals[i];
        return v;
    }
    // Возвратить максимальное значение в vals.
    public T max() {
        T v = vals[0];
        for (int i = 1; i < vals.length; i++)
            if (vals[i].compareTo(v) > 0)
                v = vals[i];
        return v;
    }
}
class GenIFDemo {
    public static void main(String[] args) {
        Integer[] inums = {3, 6 ,2, 8, 6};
        Character[] chs = {'b', 'r', 'p', 'w'};
        MyClass<Integer> iob = new MyClass<Integer>(inums);
        MyClass<Character> cob = new MyClass<Character>(chs);
        System.out.println("Максимальное значение в inums: " + iob.max());
        System.out.println("Минимальное значение в inums: " + iob.min());
        System.out.println("Максимальное значение в chs: " + cob.max());
        System.out.println("Минимальное значение в chs: " + cob.min());
    }
}
