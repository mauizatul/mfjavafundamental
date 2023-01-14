package com.juaracoding.mfjavafundamental.testharian.praktikum_1;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Fadhil a.k.a. Mauizatul Fadhillah
Java Developer
Created on 1/14/2023 9:03 AM
@Last Modified 1/14/2023 9:03 AM
Version 1.0
*/

import java.util.Scanner;

public class Praktikum1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Kata : " );
        String strInput = sc.nextLine();

        char chX = 'I';
        int intX = 0;
        int intJumlah = 0;
        for (int i=0;i<strInput.length();i++)
        {
            chX =strInput.charAt(i);
            intX = chX;
            if((intX>=65 && intX<=90) || (intX>=32 && intX<=64))
            {
                intJumlah=intJumlah+intX;
            }
        }
        System.out.println(intJumlah);
    }
}
