package Lecture11;

public class Lecture11 {
    //1. Метод получает 3 числа на вход и проверяет – существует ли такой треугольник или нет
    public static boolean task1(int sideA, int sideB, int sideC) {
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            return true;
        } else {
            return false;
        }
    }

    //2. Метод получает 4 числа на вход и отображает самое меньшее из них
    public static int task2(int a, int b, int c, int d) {
        return Math.min(Math.min(a, b), Math.min(c, d)); //     :)
    }

    //3. Метод получает на вход параметр булеан типа – сегодня выходной или нет, и сегодня праздник или нет.
    // И если нам надо на работу (в выходные и в праздники не надо) то у нас звонит будильник в 6 утра.
    // Можете усложнить еще так – если просто выходной , то будильник на 11 утра. Но если праздник и выходной совпали,
    // то не надо будильников как и в любой праздничный день.
    public static void task3(boolean isWeekend, boolean isHoliday) {
        if (isWeekend && isHoliday) {
            System.out.println("Не надо будильников");
        } else if (isWeekend) {
            System.out.println("Будильник на 11 утра");
        } else if (isHoliday) {
            System.out.println("Будильник на 12 утра");
        } else {
            System.out.println("Будильник на 6 утра");
        }
    }

    //4. Метод получает на вход 3 числа – значения углов.
    // Исходя из этого проверить его тип – равносторонний, прямоугольный, равнобедренный, тупоугольный, остроугольный.
    public static void task4(int angleA, int angleB, int angleC) {
        if (angleA == angleB && angleB == angleC) {
            System.out.println("Равносторонний");
        } else if (angleA == angleB || angleB == angleC || angleA == angleC) {
            System.out.println("Равнобедренный");
        } else if (angleA == 90 || angleB == 90 || angleC == 90) {
            System.out.println("Тупоугольный");
        } else {
            System.out.println("Остроугольный");
        }
    }

    //5. Получаем на вход число – возраст человека.
    // Если он старше 18, то даем доступ к контенту (просто вывести строку в консоль).
    // Но если число неадекватное (сами придумайте проверку возрасту), то выводим – вы бот.

    public static void task5(int age) {
        if (age > 18 && age < 100) {
            System.out.println("Доступ к контенту");
        } else {
            System.out.println("Вы бот");
        }
    }

    //6. Напишите метод, который исходя из входного параметра возраста определит куда ему идти сегодня утром
    // (детсад, школа, колледж, универ, работа, поликлиника (пенсионеры)). Рамки для возраста придумайте сами.
    // Если же входной параметр неадекватный – послать куда подальше.
    public static void task6(int age) {
        if (age > 0 && age < 6) {
            System.out.println("Детсад");
        } else if (age > 5 && age < 16) {
            System.out.println("Школа");
        } else if (age > 15 && age < 21) {
            System.out.println("Колледж");
        } else if (age > 20 && age < 31) {
            System.out.println("Универ");
        } else if (age > 30 && age < 41) {
            System.out.println("Работа");
        } else if (age > 40 && age < 100) {
            System.out.println("Поликлиника");
        } else {
            System.out.println("Куда подальше");
        }
    }

    //7. Метод, который не любит Антонов и Денисов. Получаем входной аргумент, если это Антон или Денис,
    // то выводим в консоль – добро пожаловать отсюда. Для всех други имен – добро пожаловать.
    // Можете использовать константу для куска строки.
    public static void task7(String name) {
        if (name.equals("Антон") || name.equals("Денис")) {
            System.out.println("Добро пожаловать отсюда");
        } else {
            System.out.println("Добро пожаловать");
        }
    }

    //8. Метод, который считает количество раз когда его вызвали (private static над методом и мейном),
    // Если его вызвали уже пятый раз и более – вывести в консоль – вы превысили лимит. Иначе же – вывести что-то другое.
    class Task8 {
        private static int count = 0;

        public static void task8() {
            count++;
            if (count > 4) {
                System.out.println("Вы превысили лимит");
            } else {
                System.out.println("Что-то другое");
            }
        }
    }


    //9. Проверяем состояние воды.
    // На вход получаем одно число и в зависимости от него выводим в консоль агрегатное состояние – лед,
    // вода или пар.
    public static void task9(int water) {
        if (water < 0) {
            System.out.println("Лед");
        } else if (water > 0 && water < 100) {
            System.out.println("Вода");
        } else {
            System.out.println("Пар");
        }
    }

    //11. Сравним строки. 2 строки на вход. Отдаем true только если обе строки не пустые и равны друг другу.
    public static boolean task11(String str1, String str2) {
        return !str1.isEmpty() && !str2.isEmpty() && str1.equals(str2);
    }

    //12. Проверяем строку на урл. Проверить, что строка начинается с ‘http://’.
    // Метод для проверки найдите сами – угадать можно число логически,
    // просто напишите точку после строки и среда разработки предложит методы. По аналогии с text.isEmpty().
    public static boolean task12(String str) {
        return str.startsWith("http://");
    }

    //13. Метод получает на вход 5 оценок по 5-бальной шкале.
    // Вывести строку типа – отличник, хорошист, троечник или двоечник исходя из среднего арифметического этих значений.
    // Без округлений.

    public static void task13(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        int average = sum / marks.length;
        if (average == 5) {
            System.out.println("Отличник");
        } else if (average == 4) {
            System.out.println("Хорошист");
        } else if (average == 3) {
            System.out.println("Троечник");
        } else {
            System.out.println("Двоечник");
        }
    }

    //14. Нет Иванам и Ивановым. Метод на вход получает имя и фамилию по отдельности.
    // Отказать человеку если его зовут Иван или же у него фамилия Иванов. А если это прям Иван Иванов,
    // то вывести строку – КОМБО!b, бинарными операторами &&, ||.
    // Теперь настало  Для всех других случаев вывести – Здравствуйте, имя фамилия.
    public static void task14(String name, String surname) {

        if (name.equals("Иван") && surname.equals("Иванов")) {
            System.out.println("Комбо!");
        } else if (name.equals("Иван") || surname.equals("Иванов")) {
            System.out.println("Вам отказано");
        } else {
            System.out.println("Здравствуйте, " + name + " " + surname);
        }
    }

    //15. Пишем метод модуля. Если входной аргмент числа больше нуля, то вернуть его же, если же меньше нуля,
    // то вернуть это число без знака минус (можно умножить на -1 например).
    // Если это ноль, то вывести в консоль строку – это ноль и вернуть ноль.
    public static int task15(int number) {
        if (number > 0) {
            return number;
        } else if (number < 0) {
            return -number;
        } else {
            System.out.println("Это ноль");
            return 0;
        }
    }

    //16. Прямоугольник или квадрат.
    // На входе 4 числа. Решить, это квадрат или прямоугольник или же простой четырехугольник.
    public static void task16(int a, int b, int c, int d) {
        if (a == b && b == c && c == d) {
            System.out.println("Это квадрат");
        } else if (a == b && b == c) {
            System.out.println("Это прямоугольник");
        } else {
            System.out.println("Это простой четырехугольник");
        }
    }

    //17. Метод аналога урока. На входе номер урока (1 – 100), и булеан – isUserPremium, метод отдает булеан.
    // Если юзер премиум, то можно выбрать любой урок и пройти его. Если же это первый урок,
    // то его может пройти любой юзер без разницы какого статуса. Если номер урока выходит за рамки,
    // то отдаем false, и до этого выдаем в консоль строку – номер невалидный.
    public static boolean task17(int number, boolean isUserPremium) {
        if (number > 0 && number <= 100) {
            return number == 1 || isUserPremium;
        } else {
            System.out.println("Номер невалидный");
            return false;
        }
    }

    // 18. Метод принимает 2 аргумента, номер игрока и ход строкой. Храним номер игрока в переменной вне метода.
    // Не даем игроку сделать ход если он вызывает метод 2 и более раз подряд. т.е. как в шашках – 1 ход за раз.
    class Task18 {
        private final int number;
        private int count;

        public Task18(int number) {
            this.number = number;
            this.count = 0;
        }

        public boolean move() {
            if (count == 0) {
                count++;
                System.out.println("Игрок " + number + " сделал ход");
                return true;
            } else {
                System.out.println("Игрок " + number + " не может сделать ход");
                return false;
            }
        }
    }

    //19. Предположим у первого игрока преимущество и он может делать 2 хода подряд,
    // тогда как второй игрок может делать лишь 1 ход. Написать метод,
    // который проверит кто его вызывает и выводить в консоль только те ходы которые разрешены тем или иным игроком.
    class Task19 {
        class Player {
            private final int number;
            private int count;
            private final int numberOfMoves;

            Player(int number, int numberOfMoves) {
                this.number = number;
                this.count = 0;
                this.numberOfMoves = numberOfMoves;
            }

            public boolean move() {
                if (count < numberOfMoves) {
                    count++;
                    System.out.println("Игрок " + number + " сделал ход");
                    return true;
                } else {
                    System.out.println("Игрок " + number + " не может сделать ход");
                    return false;
                }
            }

            //Main
            public void main(String[] args) {
                Player player1 = new Player(1, 2);
                Player player2 = new Player(2, 1);
                player1.move();
                player1.move();
                player2.move();
            }
        }
    }

}

