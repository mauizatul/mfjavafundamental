package com.juaracoding.mfjavafundamental.testharian.praktikum_5;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Fadhil a.k.a. Mauizatul Fadhillah
Java Developer
Created on 2/6/2023 9:08 AM
@Last Modified 2/6/2023 9:08 AM
Version 1.0
*/

import java.util.Scanner;

public class Praktikum5 {
    public static void main(String[] args) {
        /*
            Soal Nomor 1 Praktikum 5 Java Fundamental
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int i,j;
        int intAngka = sc.nextInt();

        System.out.println("Output:");

        for(i=1; i<=intAngka; i++)
        {
            for(j=1; j<=intAngka-i; j++)
            {
                System.out.print(" ");
            }

            for(j=1; j<=i; j++)
            {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
