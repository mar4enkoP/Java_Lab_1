package com;

import java.util.Scanner;

public class Main {
    /**
     * Task 000
     * Функция для вычесления номера заданий
     */
    public static void Variant() {
        int ans, N, K, G;
        N = 11;   // порядковый номер студента по журналу
        K = 0;    // порядковый номер выполняемой задачи
        G = 211 % 2;//остаток от деления номера группы на 2
        while (K != 5) {
            K++;
            ans = (24 + N + (K - 1) * 25) + G;
            System.out.println(K + ") = " + ans);
        }
    }

    /**
     * Task 1
     * Дано натуральное число n. Вычислить P = (1-(1/2^2))*(1-(1/3^2))*(1-(1/n^2))где n>2 .
     */
    public static void Task36() {
        float ans = 0;
        int n = 5;
        if (n > 2) {
            for (int i = 2; i <= n; i++) {
                ans += (1 - (1 / Math.pow(i, 2)));
                //System.out.println("=" + i + "  ans: "+ ans);
            }
            System.out.println("answer: " + ans);
        } else {
            System.out.println("Enter n>2");
        }
    }

    /**
     * Task 2
     * Составить программу возведения натурального числа в квадрат, учитывая следующую закономерность:
     * 1^2 = 1
     * 2^2 = 1 + 3
     * 3^2 = 1 + 3 + 5
     * 4^2 = 1 + 3 + 5 + 7
     * …
     * n^2 = 1 + 3 + 5 + 7 + 9 + ... + 2n – 1
     */
    public static void Task61() {
        int n = 5;
        int num = 0;
        for (int i = 1; i <= n; i++) {
            num += 2 * i - 1;
        }
        System.out.println("Answer: " + num);
    }

    /**
     * Task 3
     * Известно сопротивление каждого из элементов электрической цепи. Определить общее сопротивление цепи, если:
     * а) все элементы соединены последовательно;
     * б) все элементы соединены параллельно.
     */
    public static void Task86() {
        int R1, R2;
        float general;
        R1 = 4;
        R2 = 9;
        general = (R1 * R2) / (R1 + R2); //parallel
        System.out.println("parallel: " + general);
        general = R1 + R2;               //consistently
        System.out.println("consistently: " + general);
    }

    /**
     * Task 4
     * Составить программу-генератор простых чисел, в основу положить формулу 2х^2 + 29 при 0 ≤ х ≤ 28.
     */
    public static void Task111() {
        int x = 3;
        if (x < 0 || x > 28)
            System.out.println("Enter number in the limit 0 ≤ х ≤ 28.");
        else
            for (int i = 0; i <= x; ++i)
                System.out.println(2 * Math.pow(i, 2) + 29);
    }

    /**
     * Task 5
     * Какими цифрами следует заменить а и b, чтобы выполнялось уравнение (а + а) + 3(b + b) = аa + bb?
     */
    public static void Task136() {
        int a = 1, b = 1, i = 0;
        for (; a != 10; a++) {
            System.out.println("a: " + a + "\tb: " + b + "\n");
            b = 1;
            for (; b != 10; b++) {
                System.out.println("a: " + a + "\tb: " + b + "\n");
                if ((a + a) + 3 * (b + b) == a * a + b * b) {
                    System.out.println("---------\nAnswer\na: " + a + "\nb: " + b + "\n---------\n");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i != 5; i++) {
            System.out.print("\nEnter the task number: ");
            int Num = scanner.nextInt();
            switch (Num) {
                case 1:
                    System.out.println("\nTask 1");
                    Task36();
                    break;
                case 2:
                    System.out.println("\nTask 2");
                    Task61();
                    break;
                case 3:
                    System.out.println("\nTask 3");
                    Task86();
                    break;
                case 4:
                    System.out.println("\nTask 4");
                    Task111();
                    break;
                case 5:
                    System.out.println("\nTask 5");
                    Task136();
                    break;
                case 000:
                    System.out.println("\nVariant");
                    Variant();
                    break;
            }
        }
    }

}
