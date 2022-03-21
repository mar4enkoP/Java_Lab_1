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

    /**
     *Составить программу возведения натурального числа в квадрат, учитывая следующую закономерность:
     * 1^2 = 1
     * 2^2 = 1 + 3
     * 3^2 = 1 + 3 + 5
     * 4^2 = 1 + 3 + 5 + 7
     * …
     * n^2 = 1 + 3 + 5 + 7 + 9 + ... + 2n – 1
     */
    public static void Task61(){
    int n = 5;
    int num = 0;
    for (int i=1;i<=n;i++){
        num += 2*i-1;
    }
        System.out.println("Answer: " + num);
    }
    /**
     *
     */
    public static void Task86(){

    }
    /**
     *
     */
    public static void Task111(){

    }
    /**
     *
     */
    public static void Task136(){

    }


    public static void main(String[] args) {
       // Variant();
       // Task36();
        Task61();
        Task86();
        Task111();
        Task136();
    }

}
