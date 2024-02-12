package day21_localDateTime_varargs;

import java.time.LocalDateTime;

public class C03_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); // 2024-02-12T09:41:28.007815

        // bu bilgiden istedigimiz bolumleri, istedigimiz formatta yazdirabilir miyiz ?
        // once istedigimiz formati Java'ya gostermeliyiz

        // 12/02/2024


        // 12 Feb 2024


        // 12/2/24


        // 12 February 2024 09:41


        // 12/02/24 9:41 AM


    }
}
