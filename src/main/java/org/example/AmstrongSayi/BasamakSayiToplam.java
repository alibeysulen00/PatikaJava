package org.example.AmstrongSayi;

import java.util.Scanner;

public class BasamakSayiToplam {

    public static void main(String[] args) {
        int basamakToplam = 0;
        int basamak = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Basamak toplamını bulmak istediğiniz sayıyı giriniz :");
        int sayi = scanner.nextInt();
        int tempSayi = sayi;


        tempSayi = sayi;

        while (tempSayi != 0){
            basamak = tempSayi % 10;
            tempSayi /=10;


                basamakToplam += basamak;

        }

        System.out.println(basamakToplam);


    }
}
