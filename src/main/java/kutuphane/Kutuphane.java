package kutuphane;

import java.io.*;
import java.util.Scanner;

public class Kutuphane {
    /*
        - Bir kütüphane yönetimi uygulaması geliştiriyorsunuz.
        - Kullanıcılar, kütüphaneye yeni kitap ekleyebilmeli, kitapları sıralayabilmeli ve
        - kitapları kütüphaneden silebilmelidir.
        - Ayrıca, kullanıcılara kütüphaneyi tamamen sıfırlama seçeneği de sunmanız isteniyor.
        */
    public static void main(String[] args) throws IOException {
        //1. Adım Menü
        System.out.println("*** KÜTÜPHANE UYGULAMASINA HOŞ GELDİNİZ ***\n" +
                "Lütfen bir işlem seçiniz\n" +
                "1)Kitapları görüntüle\n" +
                "2)Kitap Ekle\n" +
                "3)Kitap Sil\n" +
                "4)Çıkış Yap\n");
        Scanner input = new Scanner(System.in);
        int secim = input.nextInt();
        switch (secim) {
            case 1://Kitapları Görüntüle
                FileReader dosyaOkuyucu = new FileReader("C:\\Users\\omer\\IdeaProjects\\OmerWorkingSpace\\src\\main\\java\\kutuphane\\Kitaplar.txt");
                BufferedReader satirOkuyucu = new BufferedReader(dosyaOkuyucu);
                String satir;
                while ((satir = satirOkuyucu.readLine()) != null) {
                    System.out.println(satir);
                }
                break;
            case 2://Kitap Ekle
                System.out.println("(Kitap İsmi , Yazar İsmi)Lütfen gösterilen şeklinde Kitap ve Yazar ekleyiniz");
                Scanner kitap = new Scanner(System.in);
                String kitapEkle = kitap.nextLine();
                FileWriter dosyaYazici = new FileWriter("C:\\Users\\omer\\IdeaProjects\\OmerWorkingSpace\\src\\main\\java\\kutuphane\\Kitaplar.txt");
                BufferedWriter tamponYazici = new BufferedWriter(dosyaYazici);
                tamponYazici.write(kitapEkle);
                tamponYazici.close();
                break;
            case 3://Kitap Sil
                break;
            case 4://Çıkış Yap
                break;

        }
    }
}
