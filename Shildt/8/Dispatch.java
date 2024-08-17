// Динамическая диспечеризация методов.
class A {
    void callme() {
        System.out.println("Внутри метода callme() класса A");
    }
}
class B extends A {
    // Переопределение callme().
    void callme() {
        System.out.println("Внутри метода callme() класса B");
    }
}
class C extends A {
    // Переопределение callme().
    void callme() {
        System.out.println("Внутри метода callme() класса C");
    }
}
class Dispatch {
    public  static void main(String[] args) {
        A a = new A();      // объект типа A
        B b = new B();      // объект типа B
        C c = new C();      // объект типа C
        A r;                // получить ссылку типа A
        r = a;              // r ссылается на объект A
        r.callme();         // вызывается метод callme() из A
        r = b;              // r ссылается на объект B
        r.callme();         // вызывается метод callme() из B
        r = c;              // r ссылается на объект C
        r.callme();         // вызывается метод callme() из C
    }
}
