package calisma;

import java.util.Scanner;

public class Q2 {
    static Scanner input = new Scanner(System.in);
    public static void erkekEmeklilik(int yas) {
        if(yas>60){
            System.out.println("Emekli olabilirsin");
        }else
            System.out.println("emekli olamasin");

        System.out.println("Tekrar sorgulama yapmak icin herhangi bir tusa basiniz");
        input.next();
        Q1.emeklilik();

    }


    public static void kadinEmeklilik(int yas) {

        if(yas>55){
            System.out.println("Emekli olabilirsin");
        }else
            System.out.println("emekli olamasin");

        System.out.println("Tekrar sorgulama yapmak icin herhangi bir tusa basiniz");
        input.next();
        Q1.emeklilik();


    }

}



































