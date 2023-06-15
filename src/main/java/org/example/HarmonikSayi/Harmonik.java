package org.example.HarmonikSayi;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hesaplanacak seri uzunluğunu giriniz :");
        int seriUzunluk = scanner.nextInt();
        double toplam = 0.0;
        int pay = 1;
        for(int i = 1 ;i<=seriUzunluk; i++){

            toplam += (double) pay / i ;
        }
        System.out.println("Harmonik serinin sonucu : "+toplam);

    }
}
