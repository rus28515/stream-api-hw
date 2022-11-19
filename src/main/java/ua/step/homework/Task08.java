package ua.step.homework;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/**
 * Задание: Заполнить массив размерности n случайными строчны-
 * ми (маленькими) латинскими буквами. Подсчитать, сколько раз встреча-
 * ется каждая буква. Вывести буквы, которые встречаются
 * больше 3 раз. n – задается с клавиатуры.
 * <p>
 * Пример вывода:
 * g - 4 раза
 * l - 4 раза
 * s - 5 раз
 * v - 5 раз
 * x - 5 раз
 */
public class Task08 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest08
        final long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        final Random rnd = new Random(seed);

        final Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        final int len = scanner.nextInt();

        int[] arr;
        // TODO: Пишите код здесь

        arr = rnd.ints(len, 'a', '{').toArray();

        for (char i = 'a'; i <= 'z'; i++) {
            int number = i;
            long count = Arrays.stream(arr).filter(e -> e == number).count();
            if (count == 3 || count == 4) {
                System.out.println((char) number + " - " + count + " раза");
            } else if (count > 4) {
                System.out.println((char) number + " - " + count + " раз");
            }
        }


    }
}
