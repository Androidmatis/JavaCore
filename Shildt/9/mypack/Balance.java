package mypack;

/* Теперь класс Balance, его конструктор и метод show() стали открытыми.
    Это означает, что они могут использоваться в коде классов,
    не являющихся подклассами, вне их пакета.
*/

public class Balance {
    String name;
    double bal;
    public Balance(String n, double b) {
        name = n;
        bal = b;
    }
    public void show() {
        if (bal < 0)
            System.out.print("--> ");
        System.out.println(name + ": $" + bal);
    }
}
