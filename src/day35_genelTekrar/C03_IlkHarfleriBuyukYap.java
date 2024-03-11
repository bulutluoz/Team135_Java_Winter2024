package day35_genelTekrar;

import java.util.Scanner;

public class C03_IlkHarfleriBuyukYap {

    public static void main(String[] args) {
        // Kullanıcıdan bir cümle alın
        // Ardından cümlenim içinde geçen her kelimenin
        // ilk harfini büyük yapın ve sonra  kelimeleri terse çevirin
        // yeni halini ayri yeniMetin olarak kaydedin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();
        // rasit bu soruyu sordu

        // kelimeleri ayri ayri ele alabilmek icin
        // " " ile split yapalim

        String[] metinArr = metin.split(" "); // [rasit, bu, soruyu, sordu]

        for (int i = 0; i < metinArr.length; i++) {

            String kelime = metinArr[i];

            kelime = kelime.substring(0,1).toUpperCase()+
                     kelime.substring(1).toLowerCase();

            StringBuilder tersKelime = (new StringBuilder(kelime)).reverse();

            metinArr[i] = tersKelime.toString();
        }

        // loop bittiginde array'de tum kelimeler istenen formata gelmis olur

        String yeniMetin = String.join(" ",metinArr);


        System.out.println(yeniMetin);


    }
}
