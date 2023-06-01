package org.example.TaksimetreProgrami;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        int acilisUcret = 10;
        double odenecekUcret = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gitmiş olduğunuz mesafeyi KM cinsinden yazınız :");
        int kilometre = scanner.nextInt();
        odenecekUcret = (kilometre*2.20)+acilisUcret;

       if(odenecekUcret<20){
           odenecekUcret =20;
           System.out.println("Ödenecek ücret = "+odenecekUcret);
       }
       else{

           System.out.println("Ödeneck ücret :"+odenecekUcret);
       }




    }
}
