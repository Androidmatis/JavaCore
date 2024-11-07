// Подкласс может добавлять собственные параметры типов.
class Gen<T> {
    T ob;   // Объявить объект типа T.
    Gen(T o) {
        ob = o;
    }
    // Возвратить ob.
    T getOb() {
        return ob;
    }
}
// Подкласс Gen, определяет второй параметр типа по имени V.
class Gen2<T, V> extends Gen<T> {
    V ob2;
    Gen2(T o, V o2) {
        super(o);
        ob2 = o2;
    }
    V getOb2() {
        return ob2;
    }
}
// Создать объект типа Gen2.
class HierDemo {
    public static void main(String[] args) {
        // Создать объект Gen2 для String и Integer.
        Gen2<String, Integer> x = new Gen2<String, Integer>("Значение: ", 99);
        System.out.print(x.getOb());
        System.out.println(x.getOb2());
    }
}
