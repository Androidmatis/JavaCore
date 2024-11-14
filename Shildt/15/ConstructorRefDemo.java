// Демонстрация использования ссылки на конструктор.
// MyFunc - функциональный интерфейс, метод которого
// возвращает ссылку на конструктор MyClass.
interface MyFunc {
    MyClass func(int n);
}
class MyClass {
    private int val;
    // Конструктор принимающий аргумент.
    MyClass(int v) {
        val = v;
    }
    // Стандартный конструктор.
    MyClass() {
        val = 0;
    }
    int getVal() {
        return val;
    }
}
class ConstructorRefDemo {
    public static void main(String[] args) {
        // Создать ссылку на конструктор MyClass.
        // Поскольку метод func() в MyFunc принимает аргумент, new ссылается
        // на параметризованный конструктор MyClass, а не на стандартный.
        MyFunc myClassCons = MyClass::new;
        // Создать экземпляр MyClass через эту ссылку на конструктор.
        MyClass mc = myClassCons.func(100);
        // Использовать только что созданный экземпляр MyClass.
        System.out.println("val в mc равно " + mc.getVal());
    }
}
