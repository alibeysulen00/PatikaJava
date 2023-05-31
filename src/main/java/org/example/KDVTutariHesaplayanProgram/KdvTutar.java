package org.example.KDVTutariHesaplayanProgram;

import java.util.Scanner;

public class KdvTutar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Tutarı giriniz: ");
        int fiyat = scanner.nextInt();
        double KDVliFiyat = 0.0;

        if(fiyat>0 && fiyat<=1000){

            KDVliFiyat = fiyat+(fiyat*18)/100;
            System.out.println("FİYAT: "+fiyat+"\n KDV li Fiyat:"+KDVliFiyat);
        }
        else if(fiyat>1000){
            KDVliFiyat = fiyat+(fiyat*8)/100;
            System.out.println("Fiyat:" +fiyat+ "\n KDV li fiyat:"+ KDVliFiyat);
        }

    }
}
