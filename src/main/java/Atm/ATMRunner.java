package Atm;

import java.util.Scanner;

public class ATMRunner {
    /*
        ATM
        1) Kullaniciya giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
        2) Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
        3) Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,
        4) Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis.
        5) Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
        6) Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.
        7) Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
     */
    public static void main(String[] args) {
            if (SistemKontrol()) start();
    }

    public static boolean SistemKontrol() {
        boolean tekrarla;
        do {
            System.out.println("Kart numaranızı giriniz : ");
            Hesap hesap = new Hesap();
//            System.out.println(hesap.kartNumarasi);
//            System.out.println(hesap.sifre);
            Scanner input = new Scanner(System.in);
            String girilenKartNumarasi = input.nextLine();
            girilenKartNumarasi = girilenKartNumarasi.replaceAll("\\s", "");
//            System.out.println("girilenKartNumarasi = " + girilenKartNumarasi);
            System.out.println("Şifrenizi Giriniz : ");
            String girilenSifre = input.nextLine();
//            System.out.println("girilenSifre = " + girilenSifre);
            if (!girilenKartNumarasi.equals(hesap.kartNumarasi) || !girilenSifre.equals(hesap.sifre)) {
                tekrarla = true;
                System.out.println("Kart numaranızı veya Şifrenizi Yanlış Girdiniz !");
                System.out.println("Lütfen Tekrar Deneyiniz");
            } else tekrarla = false;
        } while (tekrarla);
        return true;
    }

    public static void start() {
        boolean tekrar = true;
        do {
            System.out.println("***ATM SİSTEMİNE HOŞGELDİNİZ***\n" +
                    "Lütfen İşlem Seçiniz : \n" +
                    "1) Bakiye Sorgulama\n" +
                    "2) Para Yatırma\n" +
                    "3) Para Çekme\n" +
                    "4) Para Gönderme\n" +
                    "5) Şifre Değiştirme\n" +
                    "6) Çıkış");
            Scanner input = new Scanner(System.in);
            char islem = input.next().charAt(0);
            HesapIslemleri hesapIslemleri = new HesapIslemleri();
            switch (islem) {
                case '1':
                    hesapIslemleri.BakiyeSorgula();
                    break;
                case '2':
                    hesapIslemleri.ParaYatirma();
                    break;
                case '3':
                    hesapIslemleri.ParaCekme();
                    break;
                case '4':
                    hesapIslemleri.ParaGonderme();
                    break;
                case '5':
                    hesapIslemleri.SifreDegistirme();
                    break;
                case '6':
                    System.out.println("Tekrar Görüşmek Üzere İyi Günler...");
                    tekrar = false;
                    break;
            }

        } while (tekrar);

    }


}