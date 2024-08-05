// Этот класс реализует стек целых чисел, который может хранить 10 значений
class Stack {
    int[] stck = new int[10];
    int tos;
    // Инициализировать верхушку стека.
    Stack() {
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

class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();
        // Поместить несколько чисел в стеки.
        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);
        // Извлечь эти числа из стеков.
        System.out.println("Стек в mystack1:");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());
        System.out.println("Стек в mystack2:");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack2.pop());
    }
}