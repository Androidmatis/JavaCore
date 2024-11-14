// Демонстрация использования ссылки на метод экземпляра.
// Функциональный интерфейс для операций над строками.
interface StringFunc {
    String func(String n);
}
// В этом классе определен метод экземпляра по имени strReverse().
class MyStringOps {
    String strReverse(String str) {
        String result = "";
        int i;
        for (i = str.length() - 1; i >= 0; i--)
            result += str.charAt(i);
        return result;
    }
}
class MethodRefDemo2 {
    // Первый параметр этого метода имеет тиа функционального интерфейса.
    // Таким образом, ему можно передать любой экземпляр реализации
    // интерфейса StringFunc, включая ссылку на метод.
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }
    public static void main(String[] args) {
        String inStr = "Lambda add power to Java";
        String outStr;
        // Создать объект MyStringOps.
        MyStringOps strOps = new MyStringOps();
        // Передать в stringOp() ссылку на статический метод strReverse().
        outStr = stringOp(strOps::strReverse, inStr);
        System.out.println("Исходная строка: " + inStr);
        System.out.println("Строка с противоположным порядком следования " +
                "символов: " + outStr);
    }
}
