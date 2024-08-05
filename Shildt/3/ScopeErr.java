// Эта программа не скомпилируется
class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        {                   // Создать новую область видимости
            int bar = 2;    // ошибка на этапе компиляции - переменная bar
                            // уже определена
        }
    }
}
