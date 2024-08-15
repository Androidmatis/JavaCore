// Демонстрация выполнения конструкторов.
// Создать суперкласс.
class A {
    A() {
        System.out.println("Внутри конструктора A.");
    }
}
// Создать подкласс путем расширения класса A.
class B extends A {
    B() {
        System.out.println("Внутри конструктора B.");
    }
}
// Создать еще один подкласс путем расширения B.
class C extends B {
    C() {
        System.out.println("Внутри конструктора C.");
    }
}
class CallingCons {
    public static void main(String[] args) {
        C c = new C();
    }
}
