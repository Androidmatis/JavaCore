// Ситуация, в которой создается мостовый метод.
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
class Gen2 extends Gen<String> {
    Gen2(String o) {
        super(o);
    }
    // Переопределенная версия getOb(), специфичная для String.
    String getOb() {
        return ob;
    }
}
// Демонстрация ситуации, когда требуется мостовый метод.
class BridgeDemo {
    public static void main(String[] args) {
        // Создание объекта Gen2 для String.
        Gen2 strOb2 = new Gen2("Тест обобщений");
        System.out.println(strOb2.getOb());
    }
}
