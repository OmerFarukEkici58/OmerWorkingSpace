package KahveMakinesi;

import java.util.Scanner;

public class Runner {
    /*
  1. Basit bir Kahve makinesi oluşturun.    3 çeşit kahvemiz olsun.
  2. Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"
  3.Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
   Örn:
  Hangi Kahveyi İstersiniz?
  1.Türk kahvesi
  2.Filtre Kahve
  3.Espresso
        String hangiKahve oluşturun ve var olan kahvelerden birini yazınız.
         (örn: Türk Kahvesi,  ya da türk kahvesi.  --->  Büyük- küçük harf duyarlı olmaması için String methodu kullanın.)
                                                                                     todo 1. Koşul bölümü
        Eğer kahve Türk kahvesi ise, konsola = Türk kahvesi hazırlanıyor. yazsın.(Dümdüz Türk kahvesi yazmayın. String hangiKahve'yi çağırın!!)
        Eğer filtre kahve ise,   konsola = Filtre kahve hazırlanıyor.  yazsın.     (String hangiKahve'yi kullanın !)
        Eğer Espresso ise, konsola =  Espresso hazırlanıyor...   yazsın.  (String hangiKahve'yi kullanın !)
        Eğer yanlış harf girerseniz, konsola = Hatalı tuşlama yaptınız. yazsın. (Hatalı tuslamadan sonra kod calısmaya devam edecektir, o konuyu daha görmediniz bu yüzden bastan baslatın.)
                                                                                     todo ----------------------------------
        Sistem bize şu soruyu sorsun: "Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):    "   Konsolda aynen böyle  yazmalı. Parantez içi de konsolda olsun.
       String sut olusturun.
                                                                           todo 2.Koşul Bölümü
       eğer String sut,  evet   e eşitse,konsola, Süt ekleniyor... yazısı gelsin.         -- (Büyük küçük harf duyarlı olmaması için String methodu kullanın. Olması gereken ihtimaller: Evet, EVET, EvEt,EVEt vs.
      eğer String sut, hayır a eşit ise, konsola , Süt eklenmiyor  yazısı gelsin.
                                                                                    todo ----------------------------------
        Sistem bize "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) : " şeklinde bir soru sorsun. (Büyük küçük harf duyarlılıgı olmaması için string method kullanın.
        String seker oluşturunuz.
                                                                todo 3.Koşul Bölümü
        todo if(){
        Eğer String seker   Evet e eşitse ,  sistem bize "Kaç şeker olsun?" sorusunu sormalı. Sorunun altına int kacSeker  oluşturunuz.
        Şeker sayısını giriniz.
        Ve konsola   şunu yazdırınız örnek: 5 şeker ekleniyor.  (ipucu: Bu kodların heosi if bloğunun içerisinde olacak)
        todo }
        todo else{
    Eğer String şeker  hayır 'a eşitse, sistem bize "Şeker eklenmiyor" cevabını versin.
            ONEMLİ !! =   bir int girdisinden sonra String girdisi yapacaksak,araya boş bir nextLine koymamız gerekiyor. (String bosKod = sc.nextLine();    )  dummy kod ekleyiniz.
  Sistem bize "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) :   sorusunu sorsun. (büyük küçük harf duyarlılıgı olmamalı. yani kullanıcı büyük boy veya BüYüK Boy girdiginde kabul etmeli.
  String boyut oluşturun...
                                                   todo 4.Koşul Bölümü
        eğer String boyut Büyük boy' a eşitse =  Kahveniz büyük boy hazırlanıyor. (Büyük boy kısmını String boyut'u kullanarak yazalım= "Kahveniz" + boyut + "hazırlanıyor.")
        Eğer String boyut  Orta Boy'a eşitse = Kahveniz orta boy hazırlanıyor.. ("Kahveniz" + boyut + "hazırlanıyor.)
        Eğer String boyut  Küçük boy'a eşitse = Kahveniz küçük boy hazırlanıyor.    yazsın. ("Kahveniz" + boyut + "hazırlanıyor.)
                    //todo  SONUÇ BÖLÜMÜ
                    Siparişlerimizi verdik. Son hali görmek istiyoruz.
                    konsola şunu yazdırın örnek :
        Türk Kahvesi orta boy hazırdır. Afiyet olsun !!! (Türk kahvesi için String hangiKahveyi kullanın.     orta boy için de String boyut ' u kullanın.)
        todo Açıklama :
       Projeyi bilerek biraz zor hazırladık. Üzerinde fazla fazla kafa yormanız ve "grupça çalışmanız için" böyle düzenledik. Yapamayan arkadaşlar kesinlikle canlarını sıkmasın.
       Size çok zor gelebilir. Ancak adım adım ilerlerseniz, grup ile çözerseniz ve yazdığım notları tamamen uygularsanız halledebilirsiniz. Öğrenmediğiniz hiçbir şey yok. Sadece biraz karışık.
       Bir ödev çözümü günü yapacağız. Bunun haberini ilerleyen günlerde size vereceğim.
       Ancak arkadaşlarınızla beraber Voice Channel larda ödev üzerine tartışabilirsiniz.
       HERKESE KOLAY GELSİN !!
                 */
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        boolean kontrol = false;
        do {
            System.out.println("Hangi Kahveyi istersiniz?");
            System.out.println("1.Türk kahvesi\n" +
                    "2.Filtre Kahve\n" +
                    "3.Espresso");
            Scanner input = new Scanner(System.in);
            String hangiKahve = input.nextLine();
//            if (hangiKahve.equalsIgnoreCase("Türk Kahvesi")) {
//                System.out.println(hangiKahve + " hazırlanıyor");
//            } else if (hangiKahve.equalsIgnoreCase("Filtre Kahve")) {
//                System.out.println(hangiKahve + " hazırlanıyor");
//            } else if (hangiKahve.equalsIgnoreCase("Espresso")) {
//                System.out.println(hangiKahve + " hazırlanıyor");
//            } else break;
            hangiKahve = hangiKahve.toLowerCase();
            switch (hangiKahve) {
                case "türk kahvesi":
                    System.out.println(hangiKahve + " hazırlanıyor");
                    break;
                case "filtre kahves":
                    System.out.println(hangiKahve + " hazırlanıyor");
                    break;
                case "espresso":
                    System.out.println(hangiKahve + " hazırlanıyor");
                    break;
                default:
                    System.out.println("Hatalı Tuşlama Yaptınız");
                    kontrol = true;
                    break;
            }
            System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız): ");
            String sut = input.next();
            if (sut.equalsIgnoreCase("evet")) System.out.println("Süt Ekleniyor...");
            else if (sut.equalsIgnoreCase("hayır")) System.out.println("Süt Eklenmiyor");

            System.out.println("Şeker eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız): ");
            String seker = input.next();
            if (seker.equalsIgnoreCase("evet")) {
                System.out.println("Kaç Şeker istersiniz ?");
                int kacSeker = input.nextInt();
                System.out.println(kacSeker + " seker ekleniyor");
            }
            else if (seker.equalsIgnoreCase("hayır")) System.out.println("Şeker Eklenmiyor");
            String bosKod = input.nextLine();
            System.out.println("Hangi Boyutta Olsun");
            String boyut = input.nextLine();
            boyut = boyut.toLowerCase();
            switch (boyut) {
                case "büyük boy":
                    System.out.println("Kahveniz " + boyut + " hazırlanıyor");
                    break;
                case "orta boy":
                    System.out.println("Kahveniz " + boyut + " hazırlanıyor");
                    break;
                case "küçük boy":
                    System.out.println("Kahveniz " + boyut + " hazırlanıyor");
                    break;
            }

            System.out.println(hangiKahve + " "+ boyut + " hazırlanıyor");
        } while (kontrol);

    }
}
