package day22_stringBuilder_accessModifier_encapsulation;

public class C05_RaporClass {

    private int satisTutari ;
    private int toplamSatisTutari;

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        toplamSatisTutari += satisTutari;
    }

    public int getToplamSatisTutari() {
        return toplamSatisTutari;
    }



    /*
        Istenen gorev
        1- satisTutari variable'ina baska class'lardan deger atanabilsin
           ama daha once atanan degerler yazdirilamasin

        2- toplamSatisTutari baska class'lardan yazdirilabilsin
           ama deger atamasi yapilamasin

        Access modifier ile
        erisme (read) ve deger atama(write) yetkileri birbirinden AYRILAMAZ

        Java'da erisim ve atama yetkilerini ayirmaniz gerektiginde
        Encapsulation kullanilir
        Encapsulation'a data hiding de denir ama
        asil amac normal erisimi engelleyip
        istenen yetkiyi kullandirabilmektir

        Bu islem 2 adimda yapilir
        1- Access modifier ile erisimi engelleyelim
           variable'lari private yapalim

        2- Sinirli erisim icin getter ve setter method'lari olusturalim
           - deger atanabilsin ama gorulemesin (write only)
             istediklerimize setter
           - deger atanamasin ama gorulebilsin (read only)
             istediklerimize getter method'lari olusturalim
     */
}
