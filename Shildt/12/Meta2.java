// Отображение всех аннотаций для класса и метода.
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}
@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

@What(description = "Аннотация класса")
@MyAnno(str = "Meta2", val = 99)
class Meta2 {
    @What(description = "Аннотация метода")
    @MyAnno(str = "Testing", val = 100)
    public static void myMeth() {
        Meta2 ob = new Meta2();
        try {
            Annotation[] annos = ob.getClass().getAnnotations();
            // Отобразить все аннотации для Meta2.
            System.out.println("Все аннотации для класса Meta2:");
            for (Annotation a : annos)
                System.out.println(a);
            System.out.println();
            // Отобразить все аннотации для myMeth.
            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();
            System.out.println("Все аннотации для метадо myMeth:");
            for (Annotation a : annos)
                System.out.println(a);
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
