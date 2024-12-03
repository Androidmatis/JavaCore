// Демонстрация работы потокового вывода на основе NIO.

import java.io.*;
import java.nio.file.*;

class NIOStreamWrite {
    public static void main(String[] args) {
        // Открыть файл и получить связанный с ним поток данных.
        try (OutputStream fout =
                new BufferedOutputStream(Files.newOutputStream(Path.of("test.txt"))))
        {
            // Записать несколько байтов в поток.
            for (int i = 0; i < 26; i++)
                fout.write((byte) ('A' + i));
        } catch (InvalidPathException e) {
            System.out.println("Ошибка пути: " + e);
            return;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
