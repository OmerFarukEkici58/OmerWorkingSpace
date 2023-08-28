package sayitahimnoyunu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SayiTahminOyunu {
    /*
    1)Kullanıcıyı Bilgilendir
    2)Bilgisayarın kurallara uygun rastgele sayı üretmesini sağla
    3)Uretilen Sayıyı basamaklara ayır
    4)Kullanıcıdan bir tahmin al
    5)Tahmini Basamaklara Ayır
    6)Tahmini kontrol et
    7)+ değerini hesapla
    8)- değerini hesapla
    9)Tekrarla
    */
    public static void main(String[] args) {
        //1.Adım
        System.out.println("***SAYI TAHMİN OYUNU***\n" +
                "\n" +
                "Nasıl Oynanır?\n" +
                "\n" +
                "*Dört basamaklı sayı tahmin oyunu.\n" +
                "*Oyun başında üretilen 4 basamaklı bir sayıyı tahmin ederek oynanır.\n" +
                "*Oluşturulan bu 4 basamaklı sayının her basamağı bir birinden farklıdır.\n" +
                "*Oyuncu da aynı kurallara tabi olarak bir tahmin yapar.\n" +
                "*Her tahmin sonunda oyuncuya 2 ipucu verilir. Bu ipuçlarının biri Doğru Yer diğeri ise Farklı Yer olarak isimlendirilmiştir.\n" +
                "*Doğru Yer: Tahmin edilen sayının içerisindeki rakamların kaç tanesinin tam olarak doğru yere yazıldığını gösterir.\n" +
                "*Farklı Yer: Kaç tane rakamın üretilen sayı içerisinde bulunduğunu gösterir. Yani tahmin edilen sayıda doğru rakamlar vardır ama yerleri yanlıştır.\n" +
                "*100 Puan ile başlarsınız her yanlış tahmin de 10 puan kaybedersiniz 0 puan da oyunu kaybedersiniz.\n" +
                "*İşte Bu Kadar! Hadi şimdi oynamaya başla ve sayıyı bulmaya çalış.\n");
        //2.Adım
        int uretilenSayi = uretRakamlariFarkliSayi(4);
        //3.Adım
        ArrayList<Integer> uretilenSayiBasamaklar = new ArrayList<>();
        uretilenSayiBasamaklar = basamklariAyir(uretilenSayi);
        int puan = 100;
        while (puan != 0) {
            System.out.println("Mevcut Puanınız : " + puan);
            boolean tahminKontrol = false;
            //4.Adım
            Scanner input = new Scanner(System.in);
            System.out.print("Lütfen Kurallara Uygun Bir Tahmin Giriniz : ");
            int tahmin = input.nextInt();
            //5.Adım
            ArrayList<Integer> tahminSayiBasamaklar = new ArrayList<>();
            tahminSayiBasamaklar = basamklariAyir(tahmin);
            //6.Adım
            if (tahmin < 10000 && tahmin > 999 && basamaklarFarkliMi(tahminSayiBasamaklar)) {
                tahminKontrol = true;
            }
            while (!tahminKontrol) {
                System.out.print("Lütfen Kurallara Uygun Bir Tahmin Giriniz : ");
                tahmin = input.nextInt();
                //5.Adım
                tahminSayiBasamaklar = basamklariAyir(tahmin);
                //6.Adım
                if (tahmin < 10000 && tahmin > 999 && basamaklarFarkliMi(tahminSayiBasamaklar)) {
                    tahminKontrol = true;
                }
            }
            ;
            //7.Adım
            int artidegeri = artiDegeriniHesapla(uretilenSayiBasamaklar, tahminSayiBasamaklar);
            System.out.println("Doğru Yer = " + artidegeri);
            //8.Adım
            int eksidegeri = eksiDegeriniHesapla(uretilenSayiBasamaklar, tahminSayiBasamaklar);
            System.out.println("Yanlış Yer = " + eksidegeri);
            puan -= 10;
            if (artidegeri == 4) {
                System.out.println("Kazandınız!");
                System.out.println("Tahmin Ettiğiniz Sayı : " + uretilenSayi);
                System.out.println("Puanınız : " + puan);
                break;
            }
        }
        if (puan == -0) {
            System.out.println("Kaybettiniz!");
            System.out.println("Tahmin Edemediğiniz Sayı : " + uretilenSayi);
        }
    }

    private static int uretRakamlariFarkliSayi(int basamakSayisi) {
        int uretilenSayi = 0;
        boolean basa0Geldi = true;
        ArrayList<Integer> rakamlar = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            rakamlar.add(i);
        }

        Collections.shuffle(rakamlar);
        uretilenSayi = 0;
        for (int i = 0; i < basamakSayisi; i++) {
            if (i == 0 && rakamlar.get(i).equals(0)) {
                Collections.shuffle(rakamlar);
                i--;
                continue;
            }
            uretilenSayi = uretilenSayi * 10 + rakamlar.get(i);
        }
        return uretilenSayi;
    }

    private static ArrayList<Integer> basamklariAyir(int sayi) {
        ArrayList<Integer> basamaklar = new ArrayList<>();
        while (sayi > 0) {
            int basamak = sayi % 10;
            basamaklar.add(0, basamak); // Basamakları başa eklemek için "add(0, basamak)" kullanılıyor.
            sayi /= 10;
        }
        return basamaklar;
    }

    private static boolean basamaklarFarkliMi(ArrayList<Integer> sayiBasamaklar) {
        boolean farkliMi = true;
        for (int i = 0; i < sayiBasamaklar.size() - 1; i++) {
            for (int k = 1; k < sayiBasamaklar.size() - 1; k++) {
                if (sayiBasamaklar.get(i).equals(sayiBasamaklar.get(k))) farkliMi = false;
                k++;
            }
            i++;
        }
        return farkliMi;
    }

    private static int artiDegeriniHesapla(ArrayList<Integer> uretilenSayiBasamaklar, ArrayList<Integer> tahminSayiBasamaklar) {
        int artiDegeri = 0;
        for (int i = 0; i < uretilenSayiBasamaklar.size(); i++) {
            if (uretilenSayiBasamaklar.get(i) == tahminSayiBasamaklar.get(i)) artiDegeri++;
        }
        return artiDegeri;
    }

    private static int eksiDegeriniHesapla(ArrayList<Integer> uretilenSayiBasamaklar, ArrayList<Integer> tahminSayiBasamaklar) {
        int eksiDegeri = 0;
        for (int i = 0; i < uretilenSayiBasamaklar.size(); i++) {
            for (int k = 0; k < tahminSayiBasamaklar.size(); k++) {
                if (i == k) continue;
                else if (uretilenSayiBasamaklar.get(i) == tahminSayiBasamaklar.get(k)) eksiDegeri++;
            }
        }
        return eksiDegeri;
    }
}
