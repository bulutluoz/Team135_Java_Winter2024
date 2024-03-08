package day34_mapsMethodlari;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C06_MapMethodlari {

    public static void main(String[] args) {

        Map<String,Integer> kullanimSayilariMap = new TreeMap<>();

        kullanimSayilariMap.put("H",40);
        kullanimSayilariMap.put("M",10);
        kullanimSayilariMap.put("T",25);
        kullanimSayilariMap.put("A",15);
        kullanimSayilariMap.put("L",21);

        kullanimSayilariMap.replace("H",30);

        System.out.println(kullanimSayilariMap); // {A=15, H=30, L=21, M=10, T=25}

        kullanimSayilariMap.put("A",20) ;

        // varolan key'ler icin replace ile put arasinda bir fark yoktur

        kullanimSayilariMap.put("X",14);

        System.out.println(kullanimSayilariMap); // {A=20, H=30, L=21, M=10, T=25, X=14}

        kullanimSayilariMap.replace("Y",20); // Y map'de olmadigi icin bir islem yapmaz

        System.out.println(kullanimSayilariMap); // {A=20, H=30, L=21, M=10, T=25, X=14}

        // asagidaki replace method'u sadece key'i degil eski degeri de kontrol eder
        // key yoksa veya eski deger verilen degere esit degilse islem yapmaz

        kullanimSayilariMap.replace("A",20,25);

        System.out.println(kullanimSayilariMap); // {A=25, H=30, L=21, M=10, T=25, X=14}

        kullanimSayilariMap.replace("H",40,70);

        System.out.println(kullanimSayilariMap); // {A=25, H=30, L=21, M=10, T=25, X=14}


        // Eger bir key'i arattigimizda bulamazsa belirlenen bir degeri getirmesini istersek

        kullanimSayilariMap.getOrDefault("A",0); //25

        System.out.println(kullanimSayilariMap.get("Y")); // null
        System.out.println(kullanimSayilariMap.getOrDefault("Y", 0)); // 0


        // silmek icin isterseniz sadece key, isterseniz key ve value girebilirsiniz
        // key-value girdigimizde ikisinin de verilen degerlere esit oldugunu kontrol eder, sonra siler
        kullanimSayilariMap.remove("A");
        System.out.println(kullanimSayilariMap); // {H=30, L=21, M=10, T=25, X=14}

        kullanimSayilariMap.remove("H",20);
        kullanimSayilariMap.remove("L",21);

        System.out.println(kullanimSayilariMap); // {H=30, M=10, T=25, X=14}



    }
}
