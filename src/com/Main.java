package com;

public class Main {
    /**
     * Функция для вычесления номера заданий
     */
    public static void Variant(){
        int ans,N,K,G;
        N=11;   // порядковый номер студента по журналу
        K=0;    // порядковый номер выполняемой задачи
        G=211%2;//остаток от деления номера группы на 2
        while (K!=5) {
            K++;
            ans = (24 + N + (K - 1) * 25) + G;
            System.out.println(K + ") = " + ans);
        }
    }
    /**
     * Дано натуральное число n. Вычислить P = (1-(1/2^2))*(1-(1/3^2))*(1-(1/n^2))где n>2 .
     */
    public static void Task36() {
        float ans = 0;
        int n = 5;
     if (n>2)
     {
         for (int i = 2; i <= n; i++)
         {
             ans += (1 - (1 / Math.pow(i, 2)));
             //System.out.println("=" + i + "  ans: "+ ans);
         }
         System.out.println("answer: " + ans);
     }
     else
     {
         System.out.println("Enter n>2");
     }
    }


    public static void main(String[] args) {
        //Variant();
        Task36();
    }

}
