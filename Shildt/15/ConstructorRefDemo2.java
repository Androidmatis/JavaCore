// Демонстрация использования ссылки на конструктор обобщенного класса.
// Теперь MyFunc - обобщенный функциональный интерфейс.
interface MyFunc<T> {
    MyClass<T> func(T n);
}
class MyClass<T> {
    private T val;
    // Конструктор принимающий аргумент.
    MyClass(T v) {
        val = v;
    }
    // Стандартный конструктор.
    MyClass() {
        val = null;
    }
    T getVal() {
        return val;
    }
}
class ConstructorRefDemo2 {
    public static void main(String[] args) {
        // Создать ссылку на конструктор MyClass<T>.
        MyFunc<Integer> myClassCons = MyClass<Integer>::new;
        // Создать экземпляр MyClass<T> через эту ссылку на конструктор.
        MyClass<Integer> mc = myClassCons.func(100);
        // Использовать только что созданный экземпляр MyClass<T>.
        System.out.println("val в mc равно " + mc.getVal());
    }
}
