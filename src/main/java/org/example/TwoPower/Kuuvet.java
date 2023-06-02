package org.example.TwoPower;

import java.util.Scanner;

public class Kuuvet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz :");

        int sayi = scanner.nextInt();
        for(int j = 4 ;j<6; j++) {


            for (int i = 0; i < sayi; i++) {
                System.out.println(Math.pow(j,i));

            }
        }
    }
}
