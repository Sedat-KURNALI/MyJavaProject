package _001;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class A001 {
    /*
        Arkadaslar, slayt ta, Collections/Sets deki
        Soru 1 : Bir TreeSet ve HashSet’e random 100 sayi ekleyin, islem surelerini kiyaslayin

        Soru 2 : Ilk soruya 3.bir islem ekleyelim, set’i Hashset olarak olusturup elemanlari ekleyelim
        ve sonra TreeSet’e cevirip yazdiralim Long time=System.currentTimeMilis() method’unu kullanin
        sorularini cozen varsa paylasabilir mi??? (edited)
    */
    public static void main(String[] args) {
        Random rnd = new Random();
        Long time1 = System.currentTimeMillis();
        System.out.println("HashSetten once mili saniye degeri time1 = " + time1);
        HashSet<Integer> hash = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            hash.add(rnd.nextInt(98) + 1);
        }
        System.out.println("hash = " + hash);
        Long time2 = System.currentTimeMillis();
        System.out.println("HashSetten sonra mili saniye degeri time2 = " + time2);
        System.out.println(time2 - time1);

        System.out.println("-------------------------------------");

        Long time3 = System.currentTimeMillis();
        System.out.println("TreeSetten once mili saniye degeri time3 = " + time3);
        TreeSet<Integer> tree = new TreeSet<>();
        for (int i = 0; i < 100; i++) {
            tree.add(rnd.nextInt(98) + 1);
        }
        System.out.println("tree = " + tree);
        Long time4 = System.currentTimeMillis();
        System.out.println("TreeSetten sonra mili saniye degeri time4 = " + time4);
        System.out.println(time4 - time3);
    }
}
