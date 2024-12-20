import java.io.File;

// Демонстрация методов класса File.
class FileDemo {
    static void p(String s) {
        System.out.println(s);
    }
    public static void main(String[] args) {
        File f1 = new File("/home/andrey/IdeaProjects/JavaCore/Shildt/21/CurDemo.java");
        p("Имя файла: " + f1.getName());
        p("Путь: " + f1.getPath());
        p("Абсолютный путь: " + f1.getAbsolutePath());
        p("Родительский каталог: " + f1.getParent());
        p(f1.exists() ? "существует" : "не существует");
        p(f1.canWrite() ? "допускает запись" : "не допускает запись");
        p(f1.canRead() ? "допускает чтение" : "не допускает чтение");
        p(f1.isDirectory() ? "" : "не " + "является каталогом");
        p(f1.isFile() ? "является нормальным файлом" : "может быть именованным каналом");
        p(f1.isAbsolute() ? "является абсолютным" : "не является абсолютным");
        p("Файл изменялся последний раз: " + f1.lastModified());
        p("Размер файла: " + f1.length() + " байт(ов)");
    }
}
