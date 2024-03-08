package day34_mapsMethodlari;

import java.util.Map;
import java.util.TreeMap;

public class C04_ComputeMethodlari {

    public static void main(String[] args) {

        Map<String,Integer> kullanimSayilariMap = new TreeMap<>();

        kullanimSayilariMap.put("H",40);
        kullanimSayilariMap.put("M",10);
        kullanimSayilariMap.put("T",25);
        kullanimSayilariMap.put("A",15);
        kullanimSayilariMap.put("L",21);

        System.out.println(kullanimSayilariMap); // {A=15, H=40, L=21, M=10, T=25}

        // A'nin value'sunu 10 artirin

        int eskiDeger= kullanimSayilariMap.get("A");
        kullanimSayilariMap.put("A",eskiDeger+10);

        System.out.println(kullanimSayilariMap); // {A=25, H=40, L=21, M=10, T=25}

        // T'nin value'sunu 7 artirin

        kullanimSayilariMap.put("T" , kullanimSayilariMap.get("T")+7);

        System.out.println(kullanimSayilariMap); // {A=25, H=40, L=21, M=10, T=32}

        // H'nin degerini 2 katina cikarin

        kullanimSayilariMap.compute("H",(k,v)-> v*2);

        System.out.println(kullanimSayilariMap); // {A=25, H=80, L=21, M=10, T=32}

        // M'nin degerini 2 katinin 3 eksigi yapin

        kullanimSayilariMap.compute("M", (k,v) -> 2*v-3);

        System.out.println(kullanimSayilariMap); // {A=25, H=80, L=21, M=17, T=32}


        // Eger map'de varsa H harfinin Degerini 5 azaltin

        if (kullanimSayilariMap.containsKey("H")){
            kullanimSayilariMap.compute("H", (k,v)-> v-5);
        }

        System.out.println(kullanimSayilariMap); // {A=25, H=75, L=21, M=17, T=32}

        // Eger map'de varsa T'nin degerini 5 artirin

        kullanimSayilariMap.computeIfPresent("T", (k,v)-> v+5);

        System.out.println(kullanimSayilariMap); // {A=25, H=75, L=21, M=17, T=37}

        // Eger map'de varsa B'nin degerini 20 artirin

        kullanimSayilariMap.computeIfPresent("B", (k,v)-> v+20);

        System.out.println(kullanimSayilariMap); // {A=25, H=75, L=21, M=17, T=37}

        // Eger map'de X yoksa degeri 10 olarak ekleyin
        // bu method putIfAbsent() ile ayni gorevi yapar

        // kullanimSayilariMap.putIfAbsent("X", 10);

        kullanimSayilariMap.computeIfAbsent("X", v->10);

        System.out.println(kullanimSayilariMap); // {A=25, H=75, L=21, M=17, T=37, X=10}


        // Eger map'de A yoksa degeri 20 olarak ekleyin

        // kullanimSayilariMap.putIfAbsent("A",20);

        kullanimSayilariMap.computeIfAbsent("A", v->20);
        System.out.println(kullanimSayilariMap); // {A=25, H=75, L=21, M=17, T=37, X=10}

    }
}
