package ua.step.homework;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Задание: Заполнить массив на 30 элементов случайными числами
 * от -70 до +50.
 * Найти минимальный элемент и максимальный элементы и вывести их на консоль через пробел
 */
public class Task02 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - необходимо для тестирования @see ua.step.homework01.TaskTest02
        final long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        final Random rnd = new Random(seed);

        // TODO: Пишите код здесь

        int[] arr = rnd.ints(30, -70, 51)
                .toArray();
        System.out.print(Arrays.stream(arr).min().getAsInt() + " ");
        System.out.println(Arrays.stream(arr).max().getAsInt());


    }
}
