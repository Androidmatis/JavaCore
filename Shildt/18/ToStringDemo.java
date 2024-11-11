// Переопределение метода toString() для класса Box.
class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    public String toString() {
        return "Размеры коробки: " + width + " на " +
                depth + " на " + height + ".";
    }
}
class ToStringDemo {
    public static void main(String[] args) {
        Box b = new Box(10, 12, 14);
        String s = "Коробка b: " + b;   // конкатенация с объектом Box
        System.out.println(b);  // преобразование Box в строку
        System.out.println(s);
    }
}
