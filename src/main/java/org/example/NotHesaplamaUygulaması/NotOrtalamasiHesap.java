package org.example.NotHesaplamaUygulaması;

import java.util.Scanner;

//Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan
// alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
public class NotOrtalamasiHesap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz:");
        int matNot = scanner.nextInt();
        System.out.println("Fizik notunuzu giriniz:");
        int fizNot = scanner.nextInt();
        System.out.println("Kimya notunuzu giriniz:");
        int kimNot = scanner.nextInt();
        System.out.println("Türkçe notunuzu giriniz:");
        int turkNot = scanner.nextInt();
        System.out.println("Tarih notunuzu giriniz:");
        int tarNot = scanner.nextInt();
        System.out.println("Müzik notunuzu giriniz:");
        int muzNot = scanner.nextInt();

        int toplamNot = matNot+fizNot+kimNot+turkNot+tarNot+muzNot;
        int dersSayisi = 6;
        double ortalama = toplamNot/dersSayisi;
        System.out.println("Ortalamanız:"+ ortalama);
        String ortalamaKontrol = (ortalama > 60)? "Sınıfı Geçtiniz": "Sınıfta Kaldınız";
        System.out.println(ortalamaKontrol);





    }


}
