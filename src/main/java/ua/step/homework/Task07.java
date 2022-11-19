package ua.step.homework;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Задание: Заполнить массив размерности n случайными цифрами
 * от 3 до 13. Подсчитать, сколько раз встречается каждая циф-
 * ра. Вывести результат на экран. n – задается с клавиатуры
 * <p>
 * Пример вывода:
 * 3 - 2 раза
 * 5 - 3 раза
 * 8 - 1 раза
 * 9 - 3 раза
 * 11 - 1 раза
 */
public class Task07 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest07
        final long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        final Random rnd = new Random(seed);

        final Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        final int len = scanner.nextInt();

        int[] arr;
        // TODO: Пишите код здесь

        arr = rnd.ints(len, 3, 14).toArray();

        for (int i = 3; i < 14; i++) {
            int number = i;
            long count = Arrays.stream(arr).filter(value -> value == number).count();
            if (count > 0) {
                System.out.println(number + " - " + count + " раза");
            }
        }

    }
}
