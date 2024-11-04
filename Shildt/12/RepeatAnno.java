// Демонстрация использования повторяющихся аннотаций.
import java.lang.annotation.*;
import java.lang.reflect.*;
// Сделать аннотацию MyAnno повторяющейся.
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnno {
    String str() default "Тест";
    int val() default 9000;
}

// Это контейнерная аннотация.
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
    MyAnno[] value();
}

class RepeatAnno {
    //Повторить аннотацию MyAnno для метода myMeth().
    @MyAnno(str = "Первая аннотация", val = -1)
    @MyAnno(str = "Вторая аннотация", val = 100)
    public static void myMeth(String str, int i) {
        RepeatAnno ob = new RepeatAnno();
        try {
            Class<?> c = ob.getClass();
            // Получить аннотацию для метода myMeth().
            Method m = c.getMethod("myMeth", String.class, int.class);
            // Отобразить повторяющиеся аннотации MyAnno.
            Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);
            Annotation[] annos = m.getAnnotationsByType(MyAnno.class);
            for (Annotation a : annos)
                System.out.println(a);
        }catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден.");
        }
    }
    public static void main(String[] args) {
        myMeth("тест", 10);
    }
}
