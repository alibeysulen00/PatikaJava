package org.example.ManavKasaProgrami;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen almış olduğunuz ürünlerin KG değerlerini sırasıyla giriniz");
        System.out.println("Armut:");
        double armutKG = scanner.nextDouble();
        System.out.println("Elma:");
        double elmaKG = scanner.nextDouble();
        System.out.println("Domates:");
        double domatesKG = scanner.nextDouble();
        System.out.println("Muz:");
        double muzKG = scanner.nextDouble();
        System.out.println("Patlıcan:");
        double patlicanKG = scanner.nextDouble();

        double toplamTutar = (armutKG*armutFiyat)+(elmaKG*elmaFiyat)
                + (domatesKG*domatesFiyat)+(muzFiyat*muzKG)+(patlicanFiyat*patlicanKG);

        System.out.println("Toplam Ödeneck Tutar :"+toplamTutar);
    }
}
