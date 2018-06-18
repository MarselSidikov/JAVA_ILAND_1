package com.company;

import java.util.Random;
import java.util.Scanner;

// ВАША ПРОГРАММА
public class Main {
    // ВХОДНАЯ ТОЧКА ПРОГРАММЫ - ОТСЮДА
    // НАЧИНАЕТСЯ ЗАПУСК ПРОГРАММЫ
    public static void main(String[] args) {
        // СОЗДАЛИ random - генератор случайных чисел
        Random random = new Random();
        // СОЗДАЛИ scanner - считыватель с клавиатуры
        Scanner scanner = new Scanner(System.in);
        // создали переменную userNumber
        // которая содержит только целые числа
        int userNumber;
        // кладем значение с клавиатуры в эту переменную
        userNumber = scanner.nextInt();
        // создали перменную number
        // и вот сюда положили случайное число
        // от 0 до 99
        int number = random.nextInt(100);
        // цикл
        // пока(истина)
        while (true) {
            // сраваниваем загаданное
            // компьютером число
            // с нашим числом и делаем выводы
            if (userNumber < number) {
                System.out.println("Загаданное число больше!");
            } else if (userNumber > number) {
                System.out.println("Загаданное число меньше!");
            } else {
                // если пользователь отгадал число
                System.out.println("Победа!");
                System.out.println("Введите 1, " +
                        "если хотите начать заново.");
                // считываем значение с клавиатуры - 1 если хочет
                // продолжить играть
                int command = scanner.nextInt();
                // если хочет продолжить играть
                if (command == 1) {
                    // генерируем новое случайное число
                    number = random.nextInt(100);
                    // считываем новое число от пользователя
                    userNumber = scanner.nextInt();
                    // продолжаем цикл
                    continue;
                } else {
                    // если не захотел играть - закрываем программу
                    System.exit(0);
                }
            }
            // на каждом шаге цикла считываем новое число
            userNumber = scanner.nextInt();
        }
    }
}
