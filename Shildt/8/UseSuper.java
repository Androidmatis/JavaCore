// Использование super для преодоления сокрытия имен.
class A {
    int i;
}
// Создать подкласс путем расширения класса A.
class B extends A {
    int i;  // этот член i скрывает i в A
    B(int a, int b) {
        super.i = a;    // i и A
        i = b;          // i и B
    }
    void show() {
        System.out.println("i в суперклассе: " + super.i);
        System.out.println("i в подклассе: " + i);
    }
}
class UseSuper {
    public static void main(String[] args) {
        B subOb = new B(1, 2);
        subOb.show();
    }
}
