package Lecture15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lecture15 {

    //Написать программу, которая будет приветствовать всех, кроме Даниила. т.е.
    // вы вводите имя, программа выдает “Привет, “ + введенное имя. До тех пор пока вы не ввели имя Даниил.
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        while (true) {
            String name = scanner.nextLine();
            if (name.equals("Даниил")) {
                break;
            }
            System.out.println("Привет, " + name);
        }
    }

    //2. Для каждого введенного в консоль числа проверять кратно ли оно 5 или нет.
    //Если кратно,то выводить в консоль – кратное 5. Ограничить ввод 20 числами. (условие) и фигурные скобки.
    //Пока условие равно  оператор %)
    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа: ");
        for (int i = 0; i < 20; i++) {
            int number = scanner.nextInt();
            if (number % 5 == 0) {
                System.out.println("Число " + number + " кратно 5");
            }
        }
    }

    //3. Сделать бота для выдачи кредита. Условие кредита – зарплата от 25000 в месяц и срок кредита до 1 года,
    // максимальная сумма выдачи 150.000 рублей. Или можете придумать своиусловия.
    // Главное собрать от юзера данные и обработать их. В итоге выдать – вам одобрен кредит или же вам отказано.
    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите зарплату: ");
        int salary = scanner.nextInt();
        System.out.println("Введите срок кредита: ");
        int term = scanner.nextInt();
        if (salary >= 25000 && term <= 1) {
            System.out.println("Вам одобрен кредит");
        } else {
            System.out.println("Вам отказано в кредите");
        }
    }

    //4. Пишем чатбота для устройства на работу. Вопросы придумайте сами и условия тоже.
    // Для примера вам нужно спросить кандидата о знаниях тех или иных технологий и опыте работы.
    // Если все подходит – вывести – вы приняты на работу, иначе – отказано.
    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вы знаете джаву? (да/нет): ");
        String technologies = scanner.nextLine();
        System.out.println("У вас есть опыт работы? (да/нет): ");
        String experience = scanner.nextLine();
        if (technologies.equals("Да") && experience.equals("Да")) {
            System.out.println("Вы приняты на работу");
        } else {
            System.out.println("Отказано");
        }
    }

    //В консоль вводят 10 чисел последовательно. Проверить что они являются арифметической последовательностью.
    // Выдать что это не последовательность сразу же, как только вводится неверное число.
    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 10 чисел: ");
        int[] numbers = new int[10];
        numbers[0] = scanner.nextInt();
        for (int i = 1; i < 10; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] - numbers[i - 1] != 1) {
                System.out.println("Не последовательность");
                break;
            }
        }
    }

    //6. Пишем полноценного бота который имеет какое-то количество комманд и может выдать какую-то информацию по ним.
    // На любой ввод который не подпадает под команды выдаем список возможных комманд с предложением – извините,
    // но такой команды нет. Вот список того, что вы можете узнать.
    // Добавить команду выхода и при ее вводе выйти из программы.
    public static void task6() {
        Map<String, String> commands = new HashMap<>();
        commands.put("Привет", "Привет, как дела?");
        commands.put("Как дела?", "Отлично, а у вас?");

        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println("Введите команду: ");
            input = scanner.nextLine();
            System.out.println(commands.getOrDefault(input, "Извините, но такой команды нет"));
            if (input.equals("Выйти")) {
                break;
            }
        }
    }
}
