package Lecture10;

public class Lecture10 {

    //Если у вас это получилось, то попробуйте написать метод, который принимает 2 логичесих переменных isTodayFriday, aLotOfMoney, т.е. сегодня пятница и у вас много денег. Выведите в консоль следующее
    //если пятница и у вас много денег, то пойти в бар выпить пивка
    //если пятница, но денег немного, то попросить в долг у друга и пойти с ним попить пивка во всех остальных случаях (если не пятница и денег нет) пойти домой и поесть гречи

    public static void task1(boolean isTodayFriday, boolean aLotOfMoney) {
        if (isTodayFriday && aLotOfMoney) {
            System.out.println("Пойти в бар выпить пивка");
        } else if (isTodayFriday) {
            System.out.println("Попросить в долг у друга и пойти с ним попить пивка во всех остальных случаях");
        } else if (aLotOfMoney) {
            System.out.println("Подожду до пятницы");
        } else {
            System.out.println("Пойти домой и поесть гречи");
        }
    }

    //метод принимает 3 числа на вход : стоимость пива, стоимость виски и деньги в кармане если денег в кармане хватает на виски, то берем виски
    //если денег в кармане хватает только на пиво, то берем пиво
    //если денег в кармане хватает и на пиво и на виски, то берем и то и другое
    //но если у вас ветер в кармане – покидаем бар
    public static void task2(int beerPrice, int whiskeyPrice, int pocketMoney) {
        if (pocketMoney >= whiskeyPrice + beerPrice) {
            System.out.println("Берем пиво и виски");
        } else if (pocketMoney >= whiskeyPrice) {
            System.out.println("Берем виски");
        } else if (pocketMoney >= beerPrice) {
            System.out.println("Берем пиво");
        } else {
            System.out.println("Покидаем бар");
        }
    }
}
