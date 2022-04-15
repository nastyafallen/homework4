package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println("Итерация цикла " + i);
        }


        // Задание 1
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();

        for (a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }

        System.out.println();

        // Задание 2
        int friday = 2;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            friday = friday + 7;
        }

        System.out.println();

        // Задание 3
        for (int comet = 0; comet <= 2122; comet = comet + 79) {
            if (comet >= 1822 && comet <= 2122) {
                System.out.println(comet + " - В этом году пролетит комета!");
            }
        }
    }
}

