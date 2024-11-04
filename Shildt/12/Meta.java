import java.lang.annotation.*;
import java.lang.reflect.*;

// Объявление аннотации типа.
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

class Meta {
    // Аннотировать метод.
    @MyAnno(str = "Два параметра", val = 19)
    public static void myMeth(String str, int i) {
        Meta ob = new Meta();
        // Получить аннотацию для этого метода
        // и отобразить значение ее членов.
        try {
            Class<?> c = ob.getClass();
            // Здесь указываются типы параметров.
            Method m = c.getMethod("myMeth", String.class, int.class);
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден.");
        }
    }
    public static void main(String[] args) {
        myMeth("тест", 10);
    }
}
