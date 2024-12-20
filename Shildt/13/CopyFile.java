/*  Версия CopyFile, в которой используется оператор try с ресурсами.
    Здесь демонстрируется управление двумя ресурсами (в данном случае
    файлами) с помощью одного оператора try.
 */
import java.io.*;

class CopyFile {
    public static void main(String[] args) {
        int i;
        // Удостовериться, что были указаны оба файла.
        if (args.length != 2) {
            System.out.println("Использование: CopyFile исходный-файл целевой-файл");
            return;
        }
        // Открыть и управлять двумя файлами посредством оператора try.
        try (FileInputStream fin = new FileInputStream(args[0]);
            FileOutputStream fout = new FileOutputStream(args[1])) {
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
