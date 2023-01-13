package com.juaracoding.mfjavafundamental.cobacoba.variouslogic;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Fadhil a.k.a. Mauizatul Fadhillah
Java Developer
Created on 1/11/2023 8:27 PM
@Last Modified 1/11/2023 8:27 PM
Version 1.0
*/

import java.util.Scanner;
public class Palindrom {
    //Masam - masaM
    //Kakak - kakaK
    //Kakek - kekaK

    //0->4
    //1->3
    //2->2
    //3->1
    //4->0
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan kata palindrom yang ingin diproses : ");
        String strText = scn.nextLine();//Input text palindrom
        System.out.println("Length Inputan -> " + strText.length());
        String poli = "";
        StringBuilder strBuilder = new StringBuilder();
        String strTest = "";

        System.out.println(strText.length());
        //Kakak - kakaK <-- INPUTAN
        strBuilder.setLength(0);//Hapus seluruh isi strBuilder
        for (int i = strText.length(); i > 0; i--) {
            System.out.println(strText.substring(i - 1, i) + " i = " + i);
            strTest = strText.substring(i - 1, i);
			/*
			i = 5, strTest = k , strBuilder = k -> poli = k
			i = 4 , strTest = a , strBuilder = ka -> poli = ka
			i = 3 , strTest = k , strBuilder =  kak -> poli = kak
			i = 2 , strTest = a , strBuilder = kaka -> poli = kaka
			i = 1 , strTest = K , strBuilder = kakaK -> poli = kakaK
			 */
            poli = strBuilder.append(strTest).toString();
        }
        /*
         * 0-K
         * 1-a
         * 2-k
         * 3-a
         * 4-k
         *
         * 1-K
         * 2-a
         * 3-k
         * 4-a
         * 5-k
         */
        //Kakak - kakaK
        //0-1-2-3-4 - 4-3-2-1-0
        //TEST = TEST
        //JERUK = JERUK
        //KAKAK = KAKAK
        strBuilder.setLength(0);//Hapus seluruh isi strBuilder
        if (strText.equalsIgnoreCase(poli)) {
            System.out.println("==== " + strText + " adalah Palindrome =====");
        } else {
            System.out.println("==== " + strText + " bukan Palindrome =====");
        }
    }
}
