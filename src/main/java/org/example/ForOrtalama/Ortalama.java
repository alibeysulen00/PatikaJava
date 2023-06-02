package org.example.ForOrtalama;

import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("0 dan kaça kadar ki sayıları hesaplamak istiyorsunuz");
        int n = scanner.nextInt();
        double ortalama = 0.0;
        for(int i = 0 ;i<n;i++){
            if(i%3==0 && i%4==0){
                ortalama +=i;
            }
        }
        ortalama = ortalama / n;
        System.out.println(ortalama);
    }
}
