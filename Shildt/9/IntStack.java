interface IntStack {
    void push(int item);    // сохранить элемент
    int pop();              // извлечь элемент
    // Поскольку метод clear() имеет стандартную реализацию, его не нужно
    // реализовывать в существующем классе, использующем IntStack.
    default void clear() {
        System.out.println("Метод clear() не реализован.");
    }
    // Стандартный метод, возвращающий массив, который
    // содержит верхние n элементов в стеке.
    default int[] popNElements(int n) {
        // Возвратить запрошенные элементы.
        return getElements(n);
    }
    // Стандартный метод, возвращающий массив, который содержит
    // следущие n элементов в стеке после пропуска skip элементов.
    default int[] skipAndPopNElements(int skip, int n) {
        // Пропустить указанное количество элементов.
        getElements(skip);
        // Возвратить запрошенные элементы.
        return getElements(n);
    }

    // Закртый метод, который возвращает массив, содержащий
    // верхние n элементов в стеке.
    private int[] getElements(int n) {
        int[] elements = new int[n];
        for (int i = 0; i < n;i++) elements[i] = pop();
        return elements;
    }
}
