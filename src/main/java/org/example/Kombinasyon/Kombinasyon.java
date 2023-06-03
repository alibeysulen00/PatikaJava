package org.example.Kombinasyon;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kombinasyon hesaplaması için C(N,R) şeklinde iki değer giriniz:\nN değeri :");
        int n = scanner.nextInt();
        System.out.println("R değeri :");
        int r = scanner.nextInt();
        double kombinasyonSonucu = 0.0;
        long rFakt = 1;
        long nFakt = 1;
        long nkFakt =1;
        for(int i = n; i<=n; i--) {
            if (i == 0) {
                break;
            } else {
                nFakt = nFakt * i;

            }
        }
        for(int j = r; j<=r; j--){
            if(j==0){
                break;
            }
            else{
                rFakt = rFakt*j;
            }
        }
        for(int k = n-r; k<=n-r; k--){
            if(k==0){
                break;
            }
            else{
                nkFakt = nkFakt*k;
            }
        }

        kombinasyonSonucu = (nFakt)/(rFakt*(nkFakt));

        System.out.println("Kombinasyon sonucu = "+kombinasyonSonucu);


    }
}
