package org.example.HesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sonuc=0;
        System.out.println("Hesaplamak istediğiniz sayıları lütfen Giriniz");
        System.out.println("1.sayı :");
        int ilkSayi = scanner.nextInt();
        System.out.println("2.sayı :");
        int ikinciSayi = scanner.nextInt();
        System.out.println("Hesap Türünü Seçiniz");
        System.out.println("1-) Toplama \n 2-) Çıkarma \n 3-) Çarpma \n 4-) Bölme");
        int hesapTuru = scanner.nextInt();
        switch (hesapTuru){
            case 1:
              sonuc = ilkSayi+ikinciSayi;
              break;
            case 2:
                sonuc = ilkSayi-ikinciSayi;
                break;
            case 3:
                sonuc = ilkSayi*ikinciSayi;
                break;
            case 4:
                sonuc = ilkSayi/ikinciSayi;
            default:
                sonuc = 0;
        }
        System.out.println(sonuc);

    }
}
