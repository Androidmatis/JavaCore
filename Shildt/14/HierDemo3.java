// Использование операции instanceof с иерархией обобщенных классов.
class Gen<T> {
    T ob;
    Gen(T o) {
        ob = o;
    }
    // Возвратить ob.
    T getOb() {
        return ob;
    }
}
// Подкласс Gen.
class Gen2<T> extends Gen<T> {
    Gen2(T o) {
        super(o);
    }
}
// Демонстрация последствий идентификации типов во время
// выполнения для иерархии обобщенных классов.
class HierDemo3 {
    public static void main(String[] args) {
        // Создать объект Gen для Integer.
        Gen<Integer> iOb = new Gen<Integer>(88);
        // Создать объект Gen2 для Integer.
        Gen2<Integer> iOb2 = new Gen2<Integer>(99);
        // Создать объект Gen2 для String.
        Gen2<String> strOb2 = new Gen2<String>("Тест обобщений");
        // Выяснить, является ли iOb2 какой-то формой Gen2
        if (iOb2 instanceof Gen2<?>)
            System.out.println("iOb2 - экземпляр Gen2");
        // Выяснить, является ли iOb2 какой-то формой Gen
        if (iOb2 instanceof Gen<?>)
            System.out.println("iOb2 - экземпляр Gen");
        System.out.println();
        // Выяснить, является ли strOb2 какой-то формой Gen2
        if (strOb2 instanceof Gen2<?>)
            System.out.println("strOb2 - экземпляр Gen2");
        // Выяснить, является ли strOb2 какой-то формой Gen
        if (strOb2 instanceof Gen<?>)
            System.out.println("strOb2 - экземпляр Gen");
        System.out.println();
        // Выяснить, является ли iOb какой-то формой Gen2, что не так
        if (iOb instanceof Gen2<?>)
            System.out.println("iOb - экземпляр Gen2");
        // Выяснить, является ли iOb какой-то формой Gen, что так
        if (iOb instanceof Gen<?>)
            System.out.println("iOb - экземпляр Gen");

    }
}
