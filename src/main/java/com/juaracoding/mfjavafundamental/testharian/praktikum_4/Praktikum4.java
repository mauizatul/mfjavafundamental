package com.juaracoding.mfjavafundamental.testharian.praktikum_4;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Fadhil a.k.a. Mauizatul Fadhillah
Java Developer
Created on 2/2/2023 9:38 AM
@Last Modified 2/2/2023 9:38 AM
Version 1.0
*/

import java.util.Random;

public class Praktikum4 {
    /*
	    Soal Nomor 1 Praktikum 4 Java Fundamental
    */

    public static void main(String[] args) {
        StringBuilder strOutput = new StringBuilder();

        String strAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String strNumber = "0123456789";
        String [] strSymbol = {"_","."};
        String [] strEmailProvider = {"gmail","hotmail","yahoo","ymail"};
        String [] strDomain = {".com",".edu",".co.id",".gov",};

        String strRandom1 = "";
        String strTampungSymbol = "";
        String strRandom2 = "";
        String strTampungNumber = "";
        String add = "@";
        String strTampungEmail = "";
        String strTampungDomain = "";

        int intAlphabet = strAlphabet.length();
        int intNumber = strNumber.length();

        Random rand = new Random();

        // get random symbol
        strTampungSymbol += strSymbol[rand.nextInt(0,1)];

        // get random email and domain and each their length
        strTampungDomain += strDomain[rand.nextInt(0,4)];
        int intDomainLength = strTampungDomain.length();
        strTampungEmail += strEmailProvider[rand.nextInt(0,4)];
        int intEmailLength = strTampungEmail.length();

        // get additional length, maxlength and minlength
        int intAdditionalLength = intEmailLength+intDomainLength+4;
        int intMaxLength = 40-intAdditionalLength;
        int intMinLength = 25-intAdditionalLength;

        int intTotalLoop = rand.nextInt(intMinLength,intMaxLength);

        for(int i=0;i<intTotalLoop;i++){
            if(i%2==0){
                strRandom1 += strAlphabet.charAt(rand.nextInt(intAlphabet));
            } else {
                strRandom2 += strAlphabet.charAt(rand.nextInt(intAlphabet));
            }
        }

        for (int i=0;i<=1;i++){
            strTampungNumber += strNumber.charAt(rand.nextInt(intNumber));
        }

        strOutput.append(strRandom1)
                .append(strTampungSymbol)
                .append(strRandom2)
                .append(strTampungNumber)
                .append(add)
                .append(strTampungEmail)
                .append(strTampungDomain);

        System.out.println(strOutput);
        System.out.println(strOutput.length());

//        uymsdxqfzkwrql_syswuzcjdplpn96@yahoo.com
//        40

//        System.out.println(strRandom1);
//        System.out.println(strRandom1.length());
//        System.out.println(strRandom2);
//        System.out.println(strRandom2.length());

//        System.out.println(strTampungDomain);
//        System.out.println(intDomainLength);
//        System.out.println(strTampungEmail);
//        System.out.println(intEmailLength);
//
//        System.out.println(intAdditionalLength);
//        System.out.println(intMaxLength);
//        System.out.println(intMinLength);
    }
}
