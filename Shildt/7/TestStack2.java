// Усовершенствованный класс Stack, в котором
// используется член length в типе массива.
class Stack {
    private int[] stck;
    private int tos;
    // Разместить и инициализировать стек.
    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }
    // Поместить элемент в стек.
    void push(int item) {
        if (tos == 9)
            System.out.println("Стек полон.");
        else
            stck[++tos] = item;
    }
    // Извлечь элемент из стека.
    int pop() {
        if (tos < 0) {
            System.out.println("Стек опустошен.");
            return 0;
        }
        else
            return stck[tos--];
    }
}

class TestStack2 {
    public static void main(String[] args) {
        Stack mystack1 = new Stack(5);
        Stack mystack2 = new Stack(8);
        // Поместить несколько чисел в стеки.
        for (int i = 0; i < 5; i++) mystack1.push(i);
        for (int i = 0; i < 8; i++) mystack2.push(i);
        // Извлечь эти числа из стеков.
        System.out.println("Стек в mystack1:");
        for (int i = 0; i < 5; i++)
            System.out.println(mystack1.pop());
        System.out.println("Стек в mystack2:");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack2.pop());
    }
}