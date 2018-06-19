package com.company;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 19.06.2018
 * Main2
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main2 {
    public static void main(String[] args) throws Exception {
        // Максимальное количество элементов в файле
        int N = 1119;
        // создаем массив
        int array[] = new int[N];
        // создаем сканнер, который считывает из файла
        Scanner scanner = new Scanner(new File("input.txt"));
        // завидим цикл от 0 до N
        for (int i = 0; i < N; i++) {
            // считываем элемент из файла и кидаем в массив
            array[i] = scanner.nextInt();
        }
        // создаем массив количеств
        // count[i] = x, означает что число i встречается x-раз
        int counts[] = new int[2001];
        // посчитали, сколько раз встречается то или иное число
        for (int i = 0; i < N; i++){
            counts[array[i] + 1000]++;
        }
        // выводим статистику
        for (int i = 0; i < 2001; i++){
            if (counts[i] != 0) {
                System.out.println((i - 1000) + " " + counts[i]);
            }
        }
        // ищем максимальный элемент массива counts - это будет
        // число, которое встречается чаще всего

        // сколько раз встретилось число
        int maxCount  = counts[0];
        // какое конкретно число встретилось
        int max = 0;
        for (int i = 0; i < 2001; i++){
            if (counts[i] > maxCount) {
                maxCount = counts[i];
                max = i - 1000;
            }
        }
        System.out.println(max + " " + maxCount);
    }
}
