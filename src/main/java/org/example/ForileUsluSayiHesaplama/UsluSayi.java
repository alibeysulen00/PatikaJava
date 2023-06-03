package org.example.ForileUsluSayiHesaplama;

import java.util.Scanner;

public class UsluSayi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Üslü sayı hesaplama Programı için taban ve üs değerleri giriniz :");
        System.out.println("Taban sayı :");
        int taban = scanner.nextInt();
        System.out.println("Üs sayı :");
        int us  =scanner.nextInt();
        int sonuc = 1;
        for(int i = 0; i<us; i++){
            sonuc *= taban;
        }
        System.out.println("üs alma işlemi başarıyla gerçekleşti. \nSonuc: "+sonuc);
    }
}
