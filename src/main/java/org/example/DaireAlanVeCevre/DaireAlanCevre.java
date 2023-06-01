package org.example.DaireAlanVeCevre;

import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi =3.14;
        System.out.println("Yarıçap değerini giriniz : ");
        int yaricap = scanner.nextInt();
        System.out.println( "Merkez açısının ölçüsü :");
        int merkezaci = scanner.nextInt();

        double sonuc = (pi*(yaricap*yaricap)*merkezaci)/360;
        System.out.println(sonuc);

    }
}
