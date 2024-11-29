public class Main {
    public static void main(String[] args) {

        System.out.println("Задача№1");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Целые числа " + i);
        }

        System.out.println("Задача№2");

        for (int x = 10; x > 0; x--) {
            System.out.println("Целые числа " + x);
        }

        System.out.println("Задача№3");

        for (int a = 0; a <= 17; a = a + 2) {
            System.out.println("Целые числа " + a);
        }

        System.out.println("Задача№4");

        for (int b = 10; b >= -10; b--) {
            System.out.println("Целые числа " + b);
        }

        System.out.println("Задача№5");

        for (int c = 1904; c <= 2096; c = c + 4) {
            System.out.println("Високосный год " + c);
        }

        System.out.println("Задача№6");

        for (int f = 7; f <= 98; f = f + 7) {
            System.out.println(f);
        }

        System.out.println("Задача№7");

        for (int g = 1; g <= 512; g = g * 2) {
            System.out.println(g);
        }

        System.out.println("Задача№8");

        int investments = 29000;
        int monthlyInvestments = 0;
        for (int z = 1; z < 12; z++) {
            monthlyInvestments = monthlyInvestments + investments;
            System.out.println("Месяц " + z + " сумма накоплений равна " + monthlyInvestments + " рублей");
        }
        System.out.println(monthlyInvestments);

        System.out.println("Задача№9");

        int investments1 = 29000;
        int monthlyInvestments1 = 0;
        for (int z = 1; z <= 12; z++) {
            monthlyInvestments1 = monthlyInvestments1 + monthlyInvestments1 / 100;
            monthlyInvestments1 = monthlyInvestments1 + investments1;
            System.out.println("Месяц " + z + " сумма накоплений равна " + monthlyInvestments1 + " рублей");
        }
        System.out.println(monthlyInvestments1);

        System.out.println("Задача№10");

        for (int q = 2; q <= 2; q++) {
            for (int j = 1; j <= 10; j++){
                System.out.println(q + " x " + j + " = " + q*j);
            }
        }
    }
}