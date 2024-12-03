import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

// Запись в сопоставленный файл.
class MappedChannelWrite {
    public static void main(String[] args) {
        // Получить канал к файлу внутри блока try с ресурсами.
        try (FileChannel fChan = (FileChannel)
                Files.newByteChannel(Path.of("test.txt"),
                StandardOpenOption.WRITE, StandardOpenOption.READ,
                        StandardOpenOption.CREATE))
        {
            // Сопоставить файл с буфером.
            MappedByteBuffer mBuf =
                    fChan.map(FileChannel.MapMode.READ_WRITE, 0, 26);
            // Записать несколько байтов в буфер.
            for (int i = 0; i < 26; i++)
                mBuf.put((byte) ('a' + i));
        } catch (InvalidPathException e) {
            System.out.println("Ошибка пути: " + e);
            return;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
