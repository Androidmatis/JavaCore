// Расширение класса BoxWeight с целью включения стоимости доставки.
// Начать с Box.
class Box {
    private double width;
    private double height;
    private double depth;
    // Конструктор, применяемый для клонирования объекта.
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    // Конструктор, используемый в случае указания всех размеров.
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // Конструктор, применяемый в случае, если размеры вообще не указаны.
    Box() {
        width = -1;     // использовать -1 для обозначения
        height = -1;    // неинициализированного
        depth = -1;     // объекта коробки
    }
    // Конструктор, используемый в случае создания объекта кубической коробки.
    Box(double len) {
        width = height = depth = len;
    }
    // Вычислить и возвратить объем.
    double volume() {
        return width * height * depth;
    }
}
// Здесь класс Box расширяется с целью включения члена weight.
class BoxWeight extends Box {
    double weight;  // вес коробки
    // Конструктор, применяемый для клонирования объекта.
    BoxWeight(BoxWeight ob) {   // передать объект конструктору
        super(ob);
        weight = ob.weight;
    }
    // Конструктор, используемый в случае указания всех размеров.
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); // вызвать конструктор суперкласса
        weight = m;
    }
    // Стандартный конструктор
    BoxWeight() {
        super();
        weight = -1;
    }
    // Конструктор, используемый в случае создания объекта кубической коробки.
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}
// Добавить стоимость доставки.
class Shipment extends BoxWeight {
    double cost;
    // Конструктор, применяемый для клонирования объекта.
    Shipment(Shipment ob) {   // передать объект конструктору
        super(ob);
        cost = ob.cost;
    }
    // Конструктор, используемый в случае указания всех размеров.
    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m); // вызвать конструктор суперкласса
        cost = c;
    }
    // Стандартный конструктор
    Shipment() {
        super();
        cost = -1;
    }
    // Конструктор, используемый в случае создания объекта кубической коробки.
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}
class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;
        vol = shipment1.volume();
        System.out.println("Объем shipment1 равен " + vol);
        System.out.println("Вес shipment1 равен " + shipment1.weight);
        System.out.println("Стоимость доставки: $" + shipment1.cost);
        System.out.println();
        vol = shipment2.volume();
        System.out.println("Объем shipment2 равен " + vol);
        System.out.println("Вес shipment2 равен " + shipment2.weight);
        System.out.println("Стоимость доставки: $" + shipment2.cost);
    }
}
