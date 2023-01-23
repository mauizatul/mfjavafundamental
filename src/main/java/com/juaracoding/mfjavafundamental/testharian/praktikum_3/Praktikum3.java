package com.juaracoding.mfjavafundamental.testharian.praktikum_3;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Fadhil a.k.a. Mauizatul Fadhillah
Java Developer
Created on 1/23/2023 10:27 AM
@Last Modified 1/23/2023 10:27 AM
Version 1.0
*/

import java.util.Scanner;

public class Praktikum3 {
    /*
	    Soal Nomor 1 Praktikum 3 Java Fundamental
    */

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Masukkan jumlah detik: ");

        int tampungDetik = sn.nextInt();
        int detik = tampungDetik % 60;
        int menit = tampungDetik / 60;

        System.out.println(tampungDetik + " detik sama dengan " + menit + " menit " + detik + " detik.");
    }
}
