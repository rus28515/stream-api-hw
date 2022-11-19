package ua.step.homework;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Задание: Заполнить массив размерности n случайными цифрами
 * от –2 до n. Если в массиве есть хотя бы одно отрицательное
 * значение меньше -1, заменить все отрицательные значение
 * в массиве на квадрат (в степени 2) этих значений. Вывести
 * исходный и результирующий массив на консоль.
 * <p>
 * Пример вывода:
 * Исходный массив [9, 10, -2, 4, 0, 5, 1, 8, -1, 3]
 * Результат [9, 10, 4, 4, 0, 5, 1, 8, 1, 3]
 */
public class Task09 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest09
        final long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        final Random rnd = new Random(seed);

        final Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        final int len = scanner.nextInt();
        int[] arr;
        // TODO: Пишите код здесь

//        int n = scanner.nextInt();

        arr = rnd.ints(len, -2, len + 1)
                .toArray();
        System.out.println("Исходный массив " + Arrays.toString(arr));

        arr = Arrays.stream(arr).map(e -> {
                    if (e < 0) {
                        e *= e;
                    }
                    return e;
                })
                .toArray();
        System.out.println("Результат " + Arrays.toString(arr));

    }
}
