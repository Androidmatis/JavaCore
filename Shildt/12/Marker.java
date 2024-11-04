import java.lang.annotation.*;
import java.lang.reflect.*;
// Маркерная аннотация.
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker {}

class Marker {
    // Аннотировать метод, используя маркерную аннотацию.
    // Обратите внимание, что скобки {} не требуются.
    @MyMarker
    public static void myMeth() {
        Marker ob = new Marker();
        try {
            Method m = ob.getClass().getMethod("myMeth");
            // Выяснить, присутствует ли аннотация.
            if (m.isAnnotationPresent(MyMarker.class))
                System.out.println("MyMarker присутствует.");
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден.");
        }
    }
    public static void main(String[] args) {
        myMeth();
    }
}
