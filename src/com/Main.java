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

    private static void main(String[] args) {
         Variant();
    }

}
