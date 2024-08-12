/*  В иерархии классов члены private остаются закрытыми
    по отношению к своему классу
    Эта программа содержит ошибку и не скомпилируется.
 */
// Создать суперкласс.
class A {
    int i;          // стандартный доступ
    private int j;  // закрытый по отношению к A
    void setij (int x, int y) {
        i = x;
        j = y;
    }
}
// Член j из класса A здесь недоступен.
class B extends A {
    int total;
    void sum() {
        total = i + j;  // Ошибка, член j здесь недоступен
    }
}
class Access {
    public static void main(String[] args) {
        B subOb = new B();
        subOb.setij(10, 12);
        subOb.sum();
        System.out.println("Сумма равна " + subOb.total);
    }
}
