package ua.step.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Задание: Написать программу, которая проверяет, все ли значения
 * элементов массива одинаковые. Вывести: Yes – если все оди-
 * наковы и No – если имеется хоть одно различие.
 * Размер массива задается и инициализируется в начале программы.
 */
public class Task03 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        final int len = scanner.nextInt();

        // TODO: Пишите код здесь
        final int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        long a = Arrays.stream(arr)
                .distinct()
                .count();

        if (a == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
}
