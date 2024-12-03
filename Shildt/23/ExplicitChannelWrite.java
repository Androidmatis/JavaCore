import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

// Запись в файл с использованием системы NIO.
class ExplicitChannelWrite {
    public static void main(String[] args) {
        // Получить канал к файлу внутри блока try с ресурсами.
        try (FileChannel fChan = (FileChannel)
                Files.newByteChannel(Path.of("test.txt"),
                StandardOpenOption.WRITE, StandardOpenOption.CREATE))
        {
            // Выделить память под буфер.
            ByteBuffer mBuf = ByteBuffer.allocate(26);
            // Записать несколько байтов в буфер.
            for (int i = 0; i < 26; i++)
                mBuf.put((byte) ('A' + i));
            // Переустановить буфер, чтобы его можно было записать в файл.
            mBuf.rewind();
            // Записать буфер в выходной файл.
            fChan.write(mBuf);
        } catch (InvalidPathException e) {
            System.out.println("Ошибка пути: " + e);
            return;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
