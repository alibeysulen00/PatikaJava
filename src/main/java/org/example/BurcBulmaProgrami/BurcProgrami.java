package org.example.BurcBulmaProgrami;

import java.util.Scanner;

public class BurcProgrami {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Doğum gününüzün ayını girin (1-12 arasında): ");
            int ay = scanner.nextInt();

            System.out.print("Doğum gününüzün gününü girin: ");
            int gun = scanner.nextInt();

            String burc = "";

            if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 19)) {
                burc = "Koç";
            } else if ((ay == 4 && gun >= 20) || (ay == 5 && gun <= 20)) {
                burc = "Boğa";
            } else if ((ay == 5 && gun >= 21) || (ay == 6 && gun <= 20)) {
                burc = "İkizler";
            } else if ((ay == 6 && gun >= 21) || (ay == 7 && gun <= 22)) {
                burc = "Yengeç";
            } else if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 22)) {
                burc = "Aslan";
            } else if ((ay == 8 && gun >= 23) || (ay == 9 && gun <= 22)) {
                burc = "Başak";
            } else if ((ay == 9 && gun >= 23) || (ay == 10 && gun <= 22)) {
                burc = "Terazi";
            } else if ((ay == 10 && gun >= 23) || (ay == 11 && gun <= 21)) {
                burc = "Akrep";
            } else if ((ay == 11 && gun >= 22) || (ay == 12 && gun <= 21)) {
                burc = "Yay";
            } else if ((ay == 12 && gun >= 22) || (ay == 1 && gun <= 19)) {
                burc = "Oğlak";
            } else if ((ay == 1 && gun >= 20) || (ay == 2 && gun <= 18)) {
                burc = "Kova";
            } else if ((ay == 2 && gun >= 19) || (ay == 3 && gun <= 20)) {
                burc = "Balık";
            } else {
                System.out.println("Geçersiz tarih!");
                return;
            }

            System.out.println("Burcunuz: " + burc);
        }
    }
