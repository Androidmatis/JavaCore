// Простой обобщенный класс.
// Здесь T - параметр типа, который будет заменен
// реальным типом при создании объекта типа Gen.
class Gen<T> {
    T ob;   // Объявить объект типа T.
    Gen(T o) {
        ob = o;
    }
    // Возвратить ob.
    T getOb() {
        return ob;
    }
    // Вывести тип T.
    void showType() {
        System.out.println("Типом T является " + ob.getClass().getName());
    }
}
// Демонстрация применения обобщенного класса.
class GenDemo {
    public static void main(String[] args) {
        // Создать объект Gen для объектов типа Integer.
        Gen<Integer> iOb;
        // Создать объект Gen<Integer> и присвоить ссылку на него
        // переменной iOb. Обратите внимание на использование автоупаковки
        // для инкапсуляции значения 88 внутри объекта Integer.
        iOb = new Gen<Integer>(88);
        // Вывести тип данных, используемых переменной iOb.
        iOb.showType();
        // Получить значение iOb. Обратите внимание,
        // что приведение не требуется.
        int v = iOb.getOb();
        System.out.println("значение: " + v);
        System.out.println();
        // Создать объект Gen для объектов типа String.
        Gen<String> strOb = new Gen<String >("Тест с обобщениями");
        // Вывести тип данных, используемых переменной strOb.
        strOb.showType();
        // Получить значение strOb. Снова обратите внимание,
        // что приведение не требуется.
        String str = strOb.getOb();
        System.out.println("значение: " + str);
    }
}
