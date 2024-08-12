// В этой рпограмме используется наследование для расширения класса Box.
class Box {
    double width;
    double height;
    double depth;
    // Конструктор, применяемый для клонирования объекта.
    Box(Box ob) {   // передать объект конструктору
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
    // Конструктор для BoxWeight.
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}
public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;
        vol = weightbox.volume();
        System.out.println("Объем weightbox равен " + vol);
        System.out.println("Вес weightbox равен " + weightbox.weight);
        System.out.println();
        // Присвоить ссылку на BoxWeight ссылке на Box.
        plainbox = weightbox;
        vol = plainbox.volume();    // нормально, метод volume() определен в Box
        System.out.println("Объем plainbox равен " + vol);
        /*  Следующий оператор ошибочен, потому что член weight в plainbox
            не определен    */
        //System.out.println("Вес plainbox равен " + plainbox.weight);
    }
}
