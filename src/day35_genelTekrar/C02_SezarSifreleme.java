package day35_genelTekrar;

import java.util.Arrays;
import java.util.Scanner;

public class C02_SezarSifreleme {

    public static void main(String[] args) {


        // Kullanıcı tarafından girilen metni "Sezar Şifreleme Yöntemi" ne göre şifreleyiniz.
        // Düz metindeki her harfin,
        // alfabeden belirli bir sayı ileride konumlu olan bir harfle değiştirildiği
        // bir şifreleme türüdür.
        // Eger alfabenin sonuna gelinirse, basa donulecek
        // bosluk ve noktalama isaretleri ayni kalacak
        // ileri gidilecek sayi 4 olsun

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");

        String metin = scanner.nextLine(); // Muhammed soru sordu.

        String[] metinArr = metin.split("");
        // [M, u, h, a, m, m, e, d,  , s, o, r, u,  , s, o, r, d, u, .]

        for (int i = 0; i < metinArr.length ; i++) {

            if (Character.isLowerCase(metin.charAt(i))){ // kucuk harfler
                if (metin.charAt(i) <= 'v'){
                    metinArr[i] = (char)(metin.charAt(i)+4)+"" ;
                }else{
                    metinArr[i] = (char)(metin.charAt(i)+4-26)+"" ;
                }


            } else if (Character.isUpperCase(metin.charAt(i))) { // buyuk harfler
                if (metin.charAt(i) <= 'V'){
                    metinArr[i] = (char)(metin.charAt(i)+4)+"" ;
                }else{
                    metinArr[i] = (char)(metin.charAt(i)+4-26)+"" ;
                }


            }// buyuk harf veya kucuk harf olmayanlara bir sey yapilmayacak


        }

        String sifreliMetin = String.join("",metinArr);
        System.out.println(sifreliMetin);

    }
}
