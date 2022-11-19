package ua.step.homework;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Random;

/**
 * Задание: Заполнить массив на 10 элементов случайными числами
 * от -5 до +5. Посчитать количество повторяющихся значений.
 * Вывести на консоль только повторяющиеся элементы (больше одного повторения)
 * и количество повторений.
 * <p>
 * Пример:
 * 0 – 5 раз
 * 2 – 3 раза
 * 7 – 2 раза
 */
public class Task05 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest05
        final long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        final Random rnd = new Random(seed);

        // TODO: Пишите код здесь

        int[] arr = new int[10];
        arr = rnd.ints(arr.length, -5, 6).toArray();
        for (int i = -5; i < 6; i++) {
            int number = i;
            long count = Arrays.stream(arr).filter(e -> e == number).count();
            if (count > 1) {
                System.out.println(number + " - " + count + " раза");
            }
        }
    }
}
