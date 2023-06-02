package org.example.KullaniciGiris;
import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisteme Giriş yapmak için lütfen Kullanıcı adı ve şifrenizi giriniz :");
        System.out.println("Kullanıcı Adı :");
        String kullaniciAdi = scanner.nextLine();
        System.out.println("Şifre :");
        String sifre = scanner.nextLine();
        //Kullanıcı adının "patika" şifrenin de "java123" olduğunu varsayalım
        if(kullaniciAdi.equals("patika") && sifre.equals("java123")){
            System.out.println("Giriş Başarılı");
        }
        else{
            if(kullaniciAdi.equals("patika")){
                System.out.println("Hatalı şifre girdiniz. Şİfrenizi sıfırlamak ister misiniz :");
                System.out.println("Şifreyi sıfırlamak için 1 tekrar denemek için 0 yazınız");
                int sifirlamaKontrol = scanner.nextInt();
                    if(sifirlamaKontrol==1) {
                        System.out.println("Yeni şifrenizi giriniz :");

                          String  yeniSifre = scanner.next();
                            if (yeniSifre.equals("java123") || yeniSifre.equals(sifre)) {
                                System.out.println("Eski şifrenizi girdiniz lütfen tekrar deneyiniz");
                            } else {
                                System.out.println("Şifre oluşturuldu");
                            }
                    } else if (sifirlamaKontrol==0) {
                        System.out.println("şifrenizi tekrar giriniz");
                        String sifreDeneme=scanner.next();
                        if(sifreDeneme.equals("java123")){
                            System.out.println("Başarılı");
                        }
                        else{
                            System.out.println("Lütfen şifrenizi sıfırlayınız");
                        }
                    }
                }

            else{
                System.out.println("Kullanıcı adını yanlış girdiniz lütfen daha sonra tekrar deneyiniz");
            }

        }


    }
}
