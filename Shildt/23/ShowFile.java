/* Отображение содержимого текстового файла с применением потокового
    ввода-вывода на основе NIO.
    Для использования программы укажите имя файла, который хотите посмотреть.
    Например, чтобы увидеть содержимое файла по имени test.txt,
    введите следующую строку:
    java ShowFile test.txt
 */

import java.io.*;
import java.nio.file.*;

class ShowFile {
    public static void main(String[] args) {
        int i;
        // Удостовериться, что имя файла было указано.
        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя-файла");
            return;
        }
        // Открыть файл и получить связанный с ним поток.
        try (InputStream fin = Files.newInputStream(Path.of(args[0])))
        {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (InvalidPathException e) {
            System.out.println("Ошибка пути: " + e);
            return;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
