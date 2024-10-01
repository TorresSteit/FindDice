import java.util.Arrays;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class DiceSumCalculator {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода пользователя
        Scanner scanner = new Scanner(System.in);

        int sides = 6; // Количество граней на каждом кубике

        while (true) {
            // Запрашиваем сумму, которую пользователь хочет получить
            System.out.print("Введите сумму, которую вы хотите получить с двух кубиков (или введите 0 для выхода): ");
            int targetSum = scanner.nextInt();

            // Если пользователь ввел 0, то программа завершает работу
            if (targetSum == 0) {
                System.out.println("Выход из программы.");
                break;
            }

            // Проверяем, что сумма находится в пределах допустимых значений
            if (targetSum < 2 || targetSum > 12) {
                System.out.println("Некорректная сумма. Сумма должна быть в диапазоне от 2 до 12.");
                continue; // Переходим к следующей итерации цикла
            }

            int count = 0; // Переменная для подсчета количества комбинаций

            System.out.println("Комбинации двух кубиков, которые дают сумму " + targetSum + ":");

            // Перебираем все возможные значения для двух кубиков
            for (int firstDice = 1; firstDice <= sides; firstDice++) {
                for (int secondDice = 1; secondDice <= sides; secondDice++) {
                    // Проверяем, равна ли сумма значений двух кубиков заданной пользователем сумме
                    if (firstDice + secondDice == targetSum) {
                        System.out.println("(" + firstDice + ", " + secondDice + ")");
                        count++; // Увеличиваем счетчик комбинаций
                    }
                }
            }

            // Выводим общее количество комбинаций
            System.out.println("Общее количество комбинаций с суммой " + targetSum + ": " + count);
        }

        // Закрываем объект Scanner
        scanner.close();
    }
}


