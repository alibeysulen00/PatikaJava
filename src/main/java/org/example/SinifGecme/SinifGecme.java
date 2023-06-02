package org.example.SinifGecme;

import java.util.ArrayList;
import java.util.Scanner;

public class SinifGecme {

    public static void main(String[] args) {
        ArrayList<Integer> notlar = new ArrayList<>();
        String[] dersler = {"Matematik","Fizik","Türkçe","Kimya","Müzik"};
        Scanner scanner = new Scanner(System.in);
        int puan = 0;
        for(int i = 0; i<dersler.length; i++){
            System.out.println(dersler[i]+" Notunuzu giriniz");
            puan = scanner.nextInt();
            if(puan>=0 && puan<=100){
                notlar.add(puan);

            }
            else{
                System.out.println("Geçersiz not girdiniz");

            }
        }
        double ortalama = 0.0;
        for(int j = 0; j< notlar.size(); j++){
            ortalama += notlar.get(j);
        }
        ortalama = ortalama/5;
        if(ortalama<55){
            System.out.println("Ortalamanız :"+ortalama+" KALDINIZ");
        }
        else {
            System.out.println("Ortalamanız :"+ortalama+" GEÇTİNİZ");
        }


    }
}
