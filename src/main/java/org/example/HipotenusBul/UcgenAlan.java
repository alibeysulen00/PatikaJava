package org.example.HipotenusBul;

import java.util.Scanner;

public class UcgenAlan {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Üçgenin kenar uzunluklarını giriniz :");
        System.out.println("1.Kenar uzunluğu :");
        int aKenari = scanner.nextInt();
        System.out.println("2.Kenar uzunluğu :");
        int bKenari = scanner.nextInt();
        System.out.println("3.Kenar uzunluğu :");
        int cKenari = scanner.nextInt();
        int ucgenCevresi = (aKenari+bKenari+cKenari);
        System.out.println("Üçgenin çevresi :"+ucgenCevresi);
        int u = ucgenCevresi/2;
        double alan =u * ( u - aKenari ) * ( u - bKenari ) * ( u - cKenari ) ;
        alan = Math.abs(alan);
        alan = Math.sqrt(alan);
        System.out.println("Üçgenin alanı :"+alan);

    }
}
