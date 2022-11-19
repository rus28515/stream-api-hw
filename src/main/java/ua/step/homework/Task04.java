package ua.step.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Задание: написать программу, которая проверяет, все ли значения
 * элементов массива различные (не повторяются). Вывести:
 * Yes – если все различные и No – если имеется хоть одно по-
 * вторение.
 * <p>
 * Размер массива задается и инициализируется в начале программы.
 */
public class Task04 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        final int len = scanner.nextInt();

        // TODO: Пишите код здесь
        Random rnd = new Random();
        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
//        System.out.println(Arrays.toString(arr));

        long size = Arrays.stream(arr)
                .distinct()
                .count();

        if (size == arr.length) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
