package day34_mapsMethodlari;

import java.util.Map;
import java.util.TreeMap;

public class C07_TreeMapMethodlari {

    public static void main(String[] args) {

        /*
                Map<String,Integer> kullanimSayilariMap = new TreeMap<>();
                bu yazimda obje treemap objesi olmasina ragmen
                data turu Map secildigi icin
                BUTUN MAP'lerle ortak olan ozelliklerini kullanabiliriz

                Ama data turunu de TreeMap secince
                TreeMap'lere ozgu olan pekcok method'u da gorebiliriz

         */

        TreeMap<String,Integer> kullanimSayilariMap = new TreeMap<>();

        kullanimSayilariMap.put("H",40);
        kullanimSayilariMap.put("M",10);
        kullanimSayilariMap.put("T",25);
        kullanimSayilariMap.put("A",15);
        kullanimSayilariMap.put("L",21);

        System.out.println(kullanimSayilariMap); //  {A=15, H=40, L=21, M=10, T=25}

        // TreeMap elemanlarini index kullanmamasina ragmen sirali olarak tuttugu icin
        // bastaki, sondaki veya bir elemandan onceki veya sonraki gibi
        // siralamaya bagli bilgiler getirebilir

        System.out.println(kullanimSayilariMap.firstKey()); // A
        System.out.println(kullanimSayilariMap.firstEntry()); // A=15

        System.out.println(kullanimSayilariMap.lastKey()); // T
        System.out.println(kullanimSayilariMap.lastEntry()); // T=25

        // TreeMap'de bir elemandan oncekiler veya sonrakiler alinirken
        // Java'nin genel kurali olan
        // baslangic index'i inclusive(dahil), bitis index'i exclusive(haric) kuralina dikkat edilmelidir

        System.out.println(kullanimSayilariMap.tailMap("L")); // {L=21, M=10, T=25}
        System.out.println(kullanimSayilariMap.tailMap("M",false)); // {T=25}

        System.out.println(kullanimSayilariMap.headMap("M")); // {A=15, H=40, L=21}
        System.out.println(kullanimSayilariMap.headMap("M", true));
        // {A=15, H=40, L=21, M=10}

        // tailMap ve headMap'de olmayan bir key girilirse
        // o key olsaydi nerede olurdu bakip ona gore elemanlari dondurur

        //  {A=15, H=40, L=21, M=10, T=25}
        System.out.println(kullanimSayilariMap.tailMap("D")); // H=40, L=21, M=10, T=25
        System.out.println(kullanimSayilariMap.headMap("R")); // A=15, H=40, L=21, M=10


    }
}
