package day15_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_VerilenListedeIstenmeyenHarfIcerenleriSilme {

    public static void main(String[] args) {

        // verilen String bir listeden
        // istenmeyen harfi iceren isimleri silip
        // son halini bize donduren bir method olusturun

        List<String> isimler = new ArrayList<>(Arrays.asList("Ali","Veli","Can","Kemal","Ayse","Cemre"));

        System.out.println(isimler); // [Ali, Veli, Can, Kemal, Ayse, Cemre]

        String istenmeyenHarf = "m";

        System.out.println(istenmeyenHarfIcerenleriTemizle(isimler, istenmeyenHarf));
        // [Ali, Veli, Can, Ayse]

        System.out.println(istenmeyenHarfIcerenleriTemizle(isimler, "a"));
        // [Ali, Veli, Ayse]

        System.out.println(istenmeyenHarfIcerenleriTemizle(isimler, "e"));
        // [Ali]


    }


    public static List<String> istenmeyenHarfIcerenleriTemizle(List<String> isimler , String istenmeyenHarf){

        for (int i = 0; i < isimler.size() ; i++) {

            if (isimler.get(i).contains(istenmeyenHarf)){

                isimler.remove(isimler.get(i));
                i--;
            }
        }

        return isimler;
    }
}
