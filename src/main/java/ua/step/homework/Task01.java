package ua.step.homework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Заполнить массив на 15 элементов числами Фибоначчи.
 * Вывести на консоль только элементы с четными индексами (начиная с 1).
 * <p>
 * Пример вывода:
 * 1 2 5 13 34 89 233 610
 */
public class Task01 {
    public static void main(String[] args) {
        // TODO: Пишите код здесь

        int n = 16;
        List list = Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
                .limit(n)
                .map(y -> y[0]).collect(Collectors.toList());
        int i = 0;
        for (Object o : list) {
            if ((i + 1) % 2 == 0) {
                System.out.print(o + " ");
            }
            i++;
        }


    }
}