// Необобщенный класс может быть суперклассом обобщенного подкласса.
// Необобщенный класс.
class NonGen {
    int num;
    NonGen(int i) {
        num = i;
    }
    int getNum() {
        return num;
    }
}
// Обобщенный подкласс.
class Gen<T> extends NonGen {
    T ob;   // Объявить объект типа T.
    // Передать конструктору ссылку на объект типа T.
    Gen(T o, int i) {
        super(i);
        ob = o;
    }
    // Возвратить ob.
    T getOb() {
        return ob;
    }
}
// Создать объект типа Gen.
class HierDemo2 {
    public static void main(String[] args) {
        // Создать объект Gen для String.
        Gen<String> w = new Gen<String>("Добро пожаловать", 47);
        System.out.print(w.getOb() + " ");
        System.out.println(w.getNum());
    }
}
