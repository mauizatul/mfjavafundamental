package com.juaracoding.mfjavafundamental.testharian.praktikum_2;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Fadhil a.k.a. Mauizatul Fadhillah
Java Developer
Created on 1/18/2023 7:04 PM
@Last Modified 1/19/2023 10:20 PM
Version 1.1
*/

import java.util.Scanner;

public class Praktikum2 {
    /*
	    Soal Nomor 1 Praktikum 2 Java Fundamental
    */

    public static void main(String[] args) {
        int angka = 0;
        int count = 0;
        double total = 0.0;
        double hasilAvg = 0.0;
        boolean isAngka = true;

        Scanner sn = new Scanner(System.in);
        System.out.println("Masukkan angka sepuasnya per baris :");
        do {
            try {
                angka = sn.nextInt();
                count++;
                total += angka;
            } catch(Exception e) {
                hasilAvg = total/count;
                System.out.println("Hasil Rata-rata adalah " + hasilAvg);
                isAngka = false;
            }
        }while(isAngka);

    }

}
