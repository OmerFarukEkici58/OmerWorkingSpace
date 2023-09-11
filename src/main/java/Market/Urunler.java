package Market;

import java.util.ArrayList;
import java.util.List;

public class Urunler {
    public int kod;
    public String urunIsim;
    public double fiyat;

    public Urunler(int kod, String urunIsim, double fiyat) {
        this.kod = kod;
        this.urunIsim = urunIsim;
        this.fiyat = fiyat;
    }

    public Urunler() {
    }

    @Override
    public String toString() {
        return "Urunler{" +
                "kod=" + kod +
                ", urunIsim='" + urunIsim + '\'' +
                ", fiyat=" + fiyat +
                '}';
    }


    Urunler domates = new Urunler(0, "Domates ", 2.10);

    Urunler patates = new Urunler(1, "Patates ", 3.20);

    Urunler biber = new Urunler(2, "Biber   ", 1.50);

    Urunler sogan = new Urunler(3, "Soğan   ", 2.30);

    Urunler havuc = new Urunler(4, "Havuç   ", 3.10);

    Urunler elma = new Urunler(5, "Elma    ", 1.20);

    Urunler muz = new Urunler(6, "Muz     ", 1.90);

    Urunler cilek = new Urunler(7, "Çilek   ", 6.10);

    Urunler kavun = new Urunler(8, "Kavun   ", 4.30);

    Urunler uzum = new Urunler(9, "Üzüm    ", 2.70);

    Urunler limon = new Urunler(10, "Limon   ", 0.50);


    public List<Urunler> urunler = new ArrayList<>();

    public void ListeOlustur() {
        urunler.add(domates);
        urunler.add(patates);
        urunler.add(biber);
        urunler.add(sogan);
        urunler.add(havuc);
        urunler.add(elma);
        urunler.add(muz);
        urunler.add(cilek);
        urunler.add(kavun);
        urunler.add(uzum);
        urunler.add(limon);
    }

    public void ListeyiYazdir() {
        for (Urunler w : urunler) {
            System.out.println(w);
        }
    }

}
