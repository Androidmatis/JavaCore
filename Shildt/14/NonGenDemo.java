// Класс NonGen функционально эквивалентен Gen,
// но не задействует обобщения.
class NonGen {
    Object ob;   // ob теперь имеет класс Object
    // Передать конструктору ссылку на объект типа Object.
    NonGen(Object o) {
        ob = o;
    }
    // Возвратить объект типа Object.
    Object getOb() {
        return ob;
    }
    // Вывести тип Object.
    void showType() {
        System.out.println("Типом ob является " + ob.getClass().getName());
    }
}
// Демонстрация применения необобщенного класса.
class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;
        // Создать экземпляр NonGen и сохранить в нем объект Integer.
        // Автоупаковка по-прежнему происходит.
        iOb = new NonGen(88);
        // Вывести тип данных, используемых переменной iOb.
        iOb.showType();
        // Получить значение iOb. На этот раз приведение обязательно.
        int v = (Integer) iOb.getOb();
        System.out.println("значение: " + v);
        System.out.println();
        // Создать еще один экземпляр NonGen и сохранить в нем объект String.
        NonGen strOb = new NonGen("Тест с обобщениями");
        // Вывести тип данных, используемых переменной strOb.
        strOb.showType();
        // Получить значение strOb.
        // Снова обратите внимание, что необходимо приведение.
        String str = (String) strOb.getOb();
        System.out.println("значение: " + str);
        // Следующий код скомпилируется, но он концептуально ошибочен!
        iOb = strOb;
        v = (Integer) iOb.getOb();  // Ошибка во время выполнения!
    }
}
