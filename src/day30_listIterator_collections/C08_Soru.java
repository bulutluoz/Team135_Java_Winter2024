package day30_listIterator_collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C08_Soru {

    public static void main(String[] args) {

        // Soru : Kullanicidan deger alarak iki String liste olusturun.
        //        Kullanici deger girmeyi birakmak icin 0’a basmalidir.
        //	Iki liste olustuktan sonra asagidaki sekilde bir output hazirlayin
        //		liste1 : …….
        //		liste2 : …….
        //		ortak elementler : …….

        System.out.println("Ilk liste icin metin girisi : ");
        List<String> liste1 = listeOlustur();

        System.out.println("Ikinci liste icin metin girisi : ");
        List<String> liste2 = listeOlustur();

        System.out.println("Liste1 : " + liste1);
        System.out.println("Liste2 : " + liste2);

        liste1.retainAll(liste2);

        System.out.println("Ortak Elementler : " + liste1);

    }


    public static List<String>  listeOlustur(){

        List<String> isimList = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        String girilenMetin = "";

        while (!girilenMetin.equals("0")){
            System.out.println("Lutfen listeye eklemek icin metin giriniz... " +
                    "\nBitirmek icin 0'a basiniz");

            girilenMetin = scan.nextLine();

            if (!girilenMetin.equals("0")){
                isimList.add(girilenMetin);
            }
        }

        return isimList;
    }
}
