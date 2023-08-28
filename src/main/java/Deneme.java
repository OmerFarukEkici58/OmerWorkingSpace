import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        for (int i = 0 ; i<20 ; i++) {
            int uretilenSayi = uretRakamlariFarkliSayi(4);
            System.out.println("uretilenSayi = " + uretilenSayi);
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
            if (i == 0 && rakamlar.get(i).equals(0)){Collections.shuffle(rakamlar); i--; continue;}
            uretilenSayi = uretilenSayi * 10 + rakamlar.get(i);
        }
        if (uretilenSayi > 999) basa0Geldi = false;
        return uretilenSayi;
    }
}
