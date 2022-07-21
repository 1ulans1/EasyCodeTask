package Lecture13;

public class Lecture13 {
    //1. Написать метод, который найдет минимум из любого количества чисел (аргумент массив).
    public static int task1(int[] numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    //2. Написать метод, который перемножит все числа в массиве
    public static int task2(int[] numbers) {
        int result = 1;
        for (int number : numbers) {
            result *= number;
        }
        return result;
    }

    //3. Написать метод, который посчитает количество отрицательных чисел в массиве
    public static int task3(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number < 0) {
                count++;
            }
        }
        return count;
    }

    //4. Написать метод, который принимает на вход число и массив. Вывести, сколько раз в этом масиве встречается это число которое передали в аргументе.
    public static void task4(int number, int[] numbers) {
        int count = 0;
        for (int number1 : numbers) {
            if (number1 == number) {
                count++;
            }
        }
        System.out.println("Число " + number + " встречается " + count + " раз");
    }

    //5. Написать метод, который принимает массив строк и проверяет сколько в них пустых строк.
    public static int task5(String[] strings) {
        int count = 0;
        for (String string : strings) {
            if (string.isEmpty()) {
                count++;
            }
        }
        return count;
    }
}

