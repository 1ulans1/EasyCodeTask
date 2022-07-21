package Lecture14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Lecture14 {
    //1. Метод выводит все числа кратные 3 от нуля до какого-то числа (входной параметр)
    public static void task1(int number) {
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    //2. Метод выводит все числа кратные числу, которое передаем в аргументе
    public static void task2(int number) {
        for (int i = 0; i < 0x7fffffff; i++) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
    }

    //3. Вывести первые n). Мы  членов последовательности Фиббоначи (сами погуглите что это)
    public static void task3(int number) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < number; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }

    //4. Найти минимум и максимум в массиве и вывести разницу
    public static void task4(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);
        System.out.println("Разница: " + (max - min));
    }

    //5. Найти в массиве повторяющиеся элементы и их количество, т.е. для массива {5, 5, 5, 8, 8} будет 5: 3, 8:2
    public static void task5(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println(array[i] + ": " + count);
            }
            count = 0;
        }
    }

    //6. Вывести в обратном порядке члены массива (метод принимает аргументом массив)
    public static void task6(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    //7. Вывести индекс элемента массива который равен строке “this”, если их несколько, то this”, если их несколько, то через запятую
    public static void task7(String[] array) {
        boolean several = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("this")) {
                if (several) {
                    System.out.print(", ");
                }
                System.out.print(i);
                several = true;
            }
        }
    }

    //8. Метод принимает массив чисел на вход и отдает на выход массив тех же чисел, но заменив отрицательные положительными. Нули не трогать.
    public static int[] task8(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = -array[i];
            }
        }
        return array;
    }

    //9. Метод принимает массив на вход, и отдает новый массив, в котором каждый член это сумма этого числа и следующего. Последнее число останется таким какое есть.
    public static int[] task9(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                newArray[i] = array[i];
            } else {
                newArray[i] = array[i] + array[i + 1];
            }
        }

        return newArray;
    }

    //10. Метод принимает массив на вход и отдает новый массив где первым элементом является сумма первого и последнего. Для второго элемента сумма второго и предпоследнего.
    public static int[] task10(int[] array) {
        int[] newArray = new int[array.length / 2];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i] + array[array.length - 1 - i];
        }
        return newArray;
    }

    //11. Метод принимает на вход массив чисел и отдает на выход массив вдвое больше. Первый и второй элемент нового массива равны первому элементу первого массива. Третий и четвертый элементы равны второму элементу первого массива. Типа {1, 2, 3} → {1, 1, 2, 2, 3, 3}
    public static int[] task11(int[] array) {
        int[] newArray = new int[array.length * 2];
        for (int i = 0, j = 0; i < array.length; i++) {
            newArray[j++] = array[i];
            newArray[j++] = array[i];
        }
        return newArray;
    }

    //Метод принимает на вход массив чисел и отдает отфильтрованный – т.е. без дубликатов. т.е. {1, 1, 2, 3} → {1, 2, 3}
    public static int[] task12(int[] array) {
        int[] newArray = new int[array.length];
        int j = 0;
        for (int value : array) {
            boolean isUnique = true;
            for (int k = 0; k < j; k++) {
                if (value == newArray[k]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                newArray[j++] = value;
            }
        }
        return newArray;
    }

    //3. Метод принимает 2 массива чисел и выводит новый массив,
    // где каждый член массива это произведение членов соответственно. т.е. {1, 2, 3};{4, 5, 6} → {4, 10, 18}
    public static int[] task13(int[] array1, int[] array2) {
        int[] newArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i] * array2[i];
        }
        return newArray;
    }
}
