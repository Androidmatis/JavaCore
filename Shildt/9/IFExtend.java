// Один интерфейс может расширять другой.
interface A {
    void meth1();
    void meth2();
}
// Интерфейс B теперь включает meth1() и meth2() - он добавляет meth3().
interface B extends A {
    void meth3();
}
// Этот класс должен реализовать все методы интерфейсов A и B.
class MyClass implements B {

    public void meth1() {
        System.out.println("Реализация meth1().");
    }

    public void meth2() {
        System.out.println("Реализация meth2().");
    }

    public void meth3() {
        System.out.println("Реализация meth3().");
    }
}
class IFExtend {
    public static void main(String[] args) {
        MyClass ob = new MyClass();
        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
