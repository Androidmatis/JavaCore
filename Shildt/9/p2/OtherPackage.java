package p2;

public class OtherPackage {
    OtherPackage() {
        p1.Protection p = new p1.Protection();
        System.out.println("Конструктор класса из другого пакета");

        // Только класс или пакет.
        //System.out.println("n = " + p.n);

        // Только класс.
        //System.out.println("n_pri = " + p.n_pri);

        // Только класс, подкласс или пакет.
        //System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
