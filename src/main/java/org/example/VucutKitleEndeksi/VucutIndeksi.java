package org.example.VucutKitleEndeksi;

import java.util.Scanner;

public class VucutIndeksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz :");
        double boy = scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz :");
        double kilo = scanner.nextDouble();
        double indeks = kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz = "+indeks);
    }
}
