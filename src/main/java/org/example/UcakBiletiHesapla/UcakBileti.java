package org.example.UcakBiletiHesapla;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz :");
        int yas = scanner.nextInt();
        System.out.println("Mesafeyi KM cinsinden giriniz");
        int mesafe = scanner.nextInt();
        System.out.println("Yolculuk Tipini seçiniz ");
        System.out.println("1-) Tek Yön \n2-) Gidiş-Dönüş");
        int yolculukTipi = scanner.nextInt();
        double toplamTutar = mesafe*(0.10);

        double indirim = 0.0;
        if(yas<12){
            indirim = toplamTutar/2;
        } else if (yas>12 && yas<24) {
            indirim = (toplamTutar*10)/100;

        } else if (yas>65) {
            indirim = (toplamTutar*30)/100;

        }


        switch (yolculukTipi){
            case 1:

                System.out.println("Toplam tutarınız :" +toplamTutar);
                System.out.println("İndirim tutarı : "+indirim);
                System.out.println("Ödenecek Tutar :" +(toplamTutar-indirim));

                break;

            case 2:
                indirim += (toplamTutar*20)/100;
                System.out.println("Toplam tutarınız :"+(toplamTutar)*2);
                System.out.println("İndirim tutarı :"+indirim);
                System.out.println("Ödenecek tutar :"+(toplamTutar-indirim));
                break;

            default:
                System.out.println("Hatalı Veri Girdiniz");

        }

    }
}
