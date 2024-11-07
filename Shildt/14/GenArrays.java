// Обобщения и массивы.
class Gen<T extends Number> {
    T ob;
    T[] vals;   // нормально
    Gen(T o, T[] nums) {
        // Этот оператор недопустим.
        // vals = new T[10];   // невозможно создать массив элементов типа T
        // Но следующий оператор законен.
        vals = nums;    // присваивать ссылку на существующий массив разрешено
    }
}
class GenArrays {
    public static void main(String[] args) {
        Integer[] n = {1, 2, 3, 4, 5};
        Gen<Integer> iOb = new Gen<Integer>(50, n);
        // Невозможно создать массив обобщенных ссылок для конкретного типа.
        // Gen<Integer>[] gens = new Gen<Integer>(50, n);  // Ошибка!
        // Все нормально.
        Gen<?>[] gens = new Gen<?>[10];
    }
}
