import java.lang.Override;

// Реализовать "расширяемый" стек.
class DynStack implements IntStack {
    private int[] stck;
    private int tos;
    // Разместить в памяти и инициализировать стек.
    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }
    // Поместить элемент в стек
    public void push(int item) {
        // Если стек полон, тогда создать стек большего размера.
        if (tos == stck.length - 1) { // использовать член length
            int[] temp = new int[stck.length * 2];  // удвоить размер
            for (int i = 0; i < stck.length; i++) temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        }
        else
            stck[++tos] = item;
    }
    // Извлечь элемент из стека.
    public int pop() {
        if (tos < 0) {
            System.out.println("Стек опустошен.");
            return 0;
        }
        else
            return stck[tos--];
    }
}

class IFTest2 {
    public static void main(String[] args) {
        DynStack mystack1 = new DynStack(5);
        DynStack mystack2 = new DynStack(8);
        // Поместить несколько чисел в стеки.
        for (int i = 0; i < 12; i++) mystack1.push(i);
        for (int i = 0; i < 20; i++) mystack2.push(i);
        // Извлечь эти числа из стеков.
        System.out.println("Стек в mystack1:");
        for (int i = 0; i < 12; i++)
            System.out.println(mystack1.pop());
        for (int i = 0; i < 20; i++)
            System.out.println(mystack2.pop());
    }
}
