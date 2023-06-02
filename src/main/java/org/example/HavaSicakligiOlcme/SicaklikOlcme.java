package org.example.HavaSicakligiOlcme;

import java.util.Scanner;

public class SicaklikOlcme {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sıcaklığı giriniz :");
        int sicaklik = scanner.nextInt();

        if(sicaklik<5){
            System.out.println("Kayak yapmak için uygun bir hava...");
        } else if (sicaklik<15 && sicaklik>5) {
            System.out.println("Sinemaya gitmek için güzel bir hava");

        } else if (sicaklik>15 && sicaklik<25) {
            System.out.println("Pikniğe gitmelisin");

        }
        else {
            System.out.println("Yüzmeliiisin");
        }

    }
}
