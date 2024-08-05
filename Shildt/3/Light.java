// Рассчитать расстояние, проходимое светом,
// с применением переменных типа long.
class Light {
    public static void main(String[] args) {
        int lightSpeed;
        long days;
        long seconds;
        long distance;
        // Приблизительная скорость света в милях в секунду.
        lightSpeed = 186000;
        days = 1000;                        // указать количество дней
        seconds = days * 24 * 60 * 60;      // преобразовать в секунды
        distance = lightSpeed * seconds;    // рассчитать расстояние
        // Вывести примерное расстояние в милях, проходимое светом
        // за указанное количество дней.
        System.out.print("За " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.print(distance + " миль.");
    }
}
