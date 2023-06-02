package org.example.ArtikYil;

import java.util.ArrayList;
import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yıl Giriniz :");
        int yil = scanner.nextInt();

        if(yil % 100 ==0){
            if(yil % 400 == 0 && yil!=1700 && yil!=1800 && yil!=1900){
                System.out.println(yil+" bir artık yıldır");

            }
            else{
                System.out.println(yil+" bir artık yıl değildir !");
            }

        } else if (yil %4 ==0) {
            System.out.println(yil+" bir artık yıldır");

        }
        else{
            System.out.println(yil+" bir artık yıl değildir !");

        }

    }
}
