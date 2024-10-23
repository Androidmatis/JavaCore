package p1;

public class Derived extends Protection {
    Derived() {
        System.out.println("Конструктор производного класса");
        System.out.println("n = " + n);

        // Только класс.
        //System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
