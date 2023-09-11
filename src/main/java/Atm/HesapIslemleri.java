package Atm;

import java.util.Scanner;


public class HesapIslemleri extends Hesap {
    public void BakiyeSorgula() {
        System.out.println("Güncel Bakiyeniz : " + bakiye);
    }

    public void ParaYatirma() {
        System.out.println("Yatırmak istediğiniz miktarı giriniz : ");
        Scanner input = new Scanner(System.in);
        int yatirilacakPara = input.nextInt();
        bakiye = bakiye + yatirilacakPara;
        System.out.println(yatirilacakPara + " kadar para yatırdınız");
        System.out.println("Güncel Bakiye : " + bakiye);
    }

    public void ParaCekme() {
        System.out.println("Cekmek istediğiniz miktarı giriniz : ");
        Scanner input = new Scanner(System.in);
        int cekilecekPara = input.nextInt();
        if (cekilecekPara > bakiye) {
            System.out.println("Hesabınızda bu kadar para yoktur lütfen geçerli bir değer giriniz");

        } else {
            bakiye = bakiye - cekilecekPara;
            System.out.println(cekilecekPara + " kadar para çektiniz");
            System.out.println("Güncel Bakiye : " + bakiye);
        }
    }

    public void ParaGonderme() {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen IBAN giriniz(IBAN TR ile başlamalıdır) : ");
        String girilenIBAN = input.next();
        if (girilenIBAN.startsWith("TR") && girilenIBAN.length() == 26) {
            System.out.println("Göndermek istediğiniz miktarı giriniz : ");
            int gonderilecekPara = input.nextInt();
            if (gonderilecekPara > bakiye) {
                System.out.println("Hesabınızda bu kadar para yoktur lütfen geçerli bir değer giriniz");
            } else {
                bakiye = bakiye - gonderilecekPara;
                System.out.println(gonderilecekPara + " kadar para gönderdiniz");
                System.out.println("Güncel Bakiye : " + bakiye);
            }
        } else System.out.println("Yanlış formatta IBAN girdiniz");
    }

    public void SifreDegistirme() {
        Scanner input = new Scanner(System.in);
        System.out.println("Eski şifrenizi giriniz");
        String eskisifre = input.nextLine();
        if (eskisifre.equals(sifre)){
            System.out.println("Yeni Şifrenizi Belirleyiniz");
            String yeniSifre = input.nextLine();
            setSifre(yeniSifre);
        }else {
            System.out.println("Şifrenizi Yanlış Girdiniz");
        }
    }

}

