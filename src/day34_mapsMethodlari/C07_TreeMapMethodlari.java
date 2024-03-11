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


        // headMap() bastan, verilen key'e kadar olan map'i
        // tailMap() verilen elemandan sona kadar olan map'i verir
        System.out.println(kullanimSayilariMap.tailMap("L")); // {L=21, M=10, T=25}
        System.out.println(kullanimSayilariMap.tailMap("M",false)); // {T=25}

        System.out.println(kullanimSayilariMap.headMap("M")); // {A=15, H=40, L=21}
        System.out.println(kullanimSayilariMap.headMap("M", true));
        // {A=15, H=40, L=21, M=10}

        // tailMap ve headMap'de olmayan bir key girilirse
        // o key olsaydi nerede olurdu bakip ona gore elemanlari dondurur


        System.out.println(kullanimSayilariMap.tailMap("D")); // H=40, L=21, M=10, T=25
        System.out.println(kullanimSayilariMap.headMap("R")); // A=15, H=40, L=21, M=10


        // higher > , ceiling >=
        System.out.println(kullanimSayilariMap.higherKey("H")); // L    >
        System.out.println(kullanimSayilariMap.ceilingKey("H")); // H    >=

        System.out.println(kullanimSayilariMap.higherKey("D")); // H  >
        System.out.println(kullanimSayilariMap.ceilingKey("D")); // H >=

        System.out.println(kullanimSayilariMap.higherEntry("M")); // T=25
        System.out.println(kullanimSayilariMap.ceilingEntry("M")); // M=10

        System.out.println(kullanimSayilariMap.higherEntry("K")); // L = 21
        System.out.println(kullanimSayilariMap.ceilingEntry("K")); // L = 21

        //  {A=15, H=40, L=21, M=10, T=25}

        // lower < , floor <=
        System.out.println(kullanimSayilariMap.lowerKey("M")); // L
        System.out.println(kullanimSayilariMap.floorKey("M")); // M

        System.out.println(kullanimSayilariMap.lowerKey("S")); // M
        System.out.println(kullanimSayilariMap.floorKey("S")); // M


        // subMap verilen elemanlar arasindaki elemanlari verir
        // isterseniz sinirlarin dahil olup olmayacagini belirleyebiliriz
        System.out.println(kullanimSayilariMap.subMap("H", "M")); // {H=40, L=21}

        System.out.println(kullanimSayilariMap.subMap("H", true, "M", true));
        // {H=40, L=21, M=10}

        System.out.println(kullanimSayilariMap.subMap("H", false, "M", false));
        // {L=21}

        // descendingMap() siralamayi tersine cevirir
        // TreeMap elemanlari dogal sirali ascending tuttugu icin
        // descendingMap() ile tersine cevirdigimiz map'i TreeMap olarak kaydedemeyiz

        System.out.println(kullanimSayilariMap.descendingMap()); // {T=25, M=10, L=21, H=40, A=15}

        // kullanimSayilariMap = kullanimSayilariMap.descendingMap();

        System.out.println(kullanimSayilariMap.pollFirstEntry()); // A=15

        System.out.println(kullanimSayilariMap); // {H=40, L=21, M=10, T=25}

    }
}
