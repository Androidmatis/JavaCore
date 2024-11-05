// Крошечный текстовый редактор.
import java.io.*;

class TinyEdit {
    public static void main(String[] args) throws IOException {
        // Создать объект BufferedReader, используя System.in.
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in, System.console().charset()));
        String[] str = new String[100];
        System.out.println("Вводите строки текста.");
        System.out.println("Для завершения введите stop.");
        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if (str[i].equals("stop")) break;
        }
        System.out.println("\nВот то, что вы ввели:");
        // Отобразить строки.
        for (int i = 0; i < 100; i++) {
            if (str[i].equals("stop")) break;
            System.out.println(str[i]);
        }
    }
}
