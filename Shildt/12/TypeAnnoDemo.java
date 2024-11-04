// Демонстрация использования нескольких аннотаций типов.
import java.lang.annotation.*;
import java.lang.reflect.*;

// Маркерная аннотация может применяться к типу.
@Target(ElementType.TYPE_USE)
@interface TypeAnno {}

// Вторая маркерная аннотация, которая может быть применена к типу.
@Target(ElementType.TYPE_USE)
@interface NotZeroLen {}

// Третья маркерная аннотация, которая может быть применена к типу.
@Target(ElementType.TYPE_USE)
@interface Unique {}

// Параметризованная аннотация, которая может быть применена к типу.
@Target(ElementType.TYPE_USE)
@interface MaxLen {
    int value();
}

// Аннотация, которая может быть применена к параметру типа.
@Target(ElementType.TYPE_PARAMETER)
@interface What {
    String description();
}

// Аннотация, которая может быть применена к объявлению поля.
@Target(ElementType.FIELD)
@interface EmptyOk {}


// Аннотация, которая может быть применена к объявлению метода.
@Target(ElementType.METHOD)
@interface Recommended {}

// Использовать аннотацию на параметре типа.
class TypeAnnoDemo<@What(description = "Обобщенный тип данных") T> {
    // Использовать аннотацию типа для конструктора.
    public @Unique TypeAnnoDemo() {}
    // Аннотировать тип (в этом случае String), не поле.
    @TypeAnno String str;
    // Аннотировать поле test.
    @EmptyOk String test;
    // Использовать аннотацию типа для аннотирования this (получателя).
    public int f(@TypeAnno TypeAnnoDemo<T> this, int x) {
        return 10;
    }
    // Аннотировать возвращаемый тип.
    public @TypeAnno Integer f2(int j, int k) {
        return j + k;
    }
    // Аннотировать объявление метода.
    public @Recommended Integer f3(String str) {
        return str.length() / 2;
    }
    // Использовать аннотацию типа с конструкцией throws.
    public void f4() throws @TypeAnno NullPointerException {
        // ...
    }
    // Аннотировать уровни массива.
    String @MaxLen(10) [] @NotZeroLen [] w;
    // Аннотировать тип элементов массива.
    @TypeAnno Integer[] vec;
    public static void myMeth(int i) {
        // Использовать аннотацию типа для аргумента типа.
        TypeAnnoDemo<@TypeAnno Integer> ob = new TypeAnnoDemo<@TypeAnno Integer>();
        // Использовать аннотацию типа для операции new.
        @Unique TypeAnnoDemo<Integer> ob2 = new @Unique TypeAnnoDemo<Integer>();
        Object x = Integer.valueOf(10);
        Integer y;
        // Использовать аннотацию типа для приведения.
        y = (@TypeAnno Integer) x;
    }

    public static void main(String[] args) {
        myMeth(10);
    }

    // Использовать аннотацию типа для конструкции наследования.
    class SomeClass extends @TypeAnno TypeAnnoDemo<Boolean> {}
}
