/* Создать переменную ссылку на интерфейс и организовать
    через нее доступ к стекам.
 */
class IFTest3 {
    public static void main(String[] args) {
        IntStack mystack;   // создать переменную ссылки на интерфес
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);
        mystack = ds;   // загрузить в стек с динамическим размером
        // Поместить несколько чисел в стеки.
        for (int i = 0; i < 12; i++) mystack.push(i);
        mystack = fs;   // загрузить в стек с фиксированным размером
        for (int i = 0; i < 8; i++) mystack.push(i);
        mystack = ds;
        System.out.println("Значения в стеке с динамическим размером:");
        for (int i = 0; i < 12; i++)
            System.out.println(mystack.pop());
        mystack = fs;
        System.out.println("Значения в стеке с фиксированным размером:");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack.pop());
    }
}
