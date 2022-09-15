public class Main {
    public static void main(String[] args) {
        // Домашка №1
        System.out.println("Домашка 1");

        // Задача №1
        System.out.println("Задача 1");
        int cash = 29000;
        int total = 0;
        for (int i = 0; total < 2_459_000; i++) {
            total = total + cash;
            total = total + total / 100;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }

        // Задача №2
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(" ");
        for (int i1 = 10; i1 >= 1; i1--) {
            System.out.print(i1 + " ");
        }

        // Задача №3
        System.out.println(" ");
        System.out.println("Задача 3");
        int all = 12_000_000;
        int bornFree = 12;
        int deathFree = 8;
        int p = bornFree - deathFree;
        for (int i1 = 0; i1 <= 10; i1++) {
            if (bornFree > 7) bornFree = bornFree--;
            if (deathFree > 6) deathFree = deathFree--;
            all = all + all * p / 1000;
        }
        {
            System.out.println(all);
        }


        // Домашка №2
        System.out.println("Домашка 2");

        // Задача №1
        System.out.println("Задача 1");
        int cash1 = 15000;
        int cash2 = 0;
        for (int i2 = 0; cash2 < 12_000_000; i2++) {
            cash2 = cash2 + cash1;
            cash2 = cash2 + cash2 / 700;
            System.out.println("Месяц " + i2 + " сумма накоплений равна " + cash2 + " рублей");
        }

        // Задача №2
        System.out.println("Задача 2");
        int cash3 = 15000;
        int cash4 = 0;
        for (int i2 = 6; cash4 < 12_000_000; i2 = i2 + 6) {
            cash4 = cash4 + cash3;
            cash4 = cash4 + cash4 / 700;
            System.out.println("Месяц " + i2 + " сумма накоплений равна " + cash4 + " рублей");
        }

        // Задача №3
        System.out.println("Задача 3");
        int money = 15000;
        int money0 = 0;
        for (int n = 0; n <= 12 * 9; n = n + 6) {
            money0 = money0 + money;
            money0 = money0 + money0 / 700;
            System.out.println("Месяц " + n + " сумма накоплений равна " + money0 + " рублей");
        }

        // Задача №4
        System.out.println("Задача 4");
        for (int Friday = 5; Friday <= 31; Friday++) {
            if (Friday % 7 == 0) {
                System.out.println("Сегодня пятница, " + Friday + "-ое число, нужно подготовить отчет");
            }
        }

        // Домашка №3
        System.out.println("Домашка 3");

        // Задача №1
        System.out.println("Задача 1");
        for (int year = 1896; year < 2122; year = year + 79) {
            System.out.println("Комета пролетала рядом с Землей в " + year + " году" + " ");
        }


        // Задача №2
        System.out.println("Задача 2");
        for (int i5 = 2; i5 <= 2; i5 ++) {
            for (int t = 1; t <= 10; t++){
                System.out.println (i5 + " * " + t + " = " + i5*t);
            }
            System.out.println();
        }


        }
    }




