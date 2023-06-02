package org.example.TekSayiHesabi;

import java.util.Scanner;

public class TekSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi =0;
        int toplam = 0;
        while(sayi %2== 0){
            System.out.println("Lütfen sayı giriniz");

            sayi = scanner.nextInt();
            if(sayi%4==0){
                toplam += sayi;

            }
        }
        System.out.println(toplam);
    }
}
