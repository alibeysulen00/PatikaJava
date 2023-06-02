package org.example.SayiSiralama;

import java.util.Arrays;
import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz? ");
        int n = scanner.nextInt();

        int[] sayilar = new int[n];

        System.out.println(n + " adet sayıyı girin:");

        for (int i = 0; i < n; i++) {
            sayilar[i] = scanner.nextInt();
        }

        Arrays.sort(sayilar);

        System.out.println("Sıralanmış sayılar:");

        for (int sayi : sayilar) {
            System.out.print(sayi + " ");
        }
    }
}