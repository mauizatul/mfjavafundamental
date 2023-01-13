package com.juaracoding.mfjavafundamental.cobacoba.array;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Fadhil a.k.a. Mauizatul Fadhillah
Java Developer
Created on 1/12/2023 9:49 PM
@Last Modified 1/12/2023 9:49 PM
Version 1.0
*/

import java.util.Scanner;

public class DeklarasiArray {

    public static void main(String[] args) {
        int a =0;

//        System.out.println(a);

//        int [] intArr = {6,4,9,8,10};
//        System.out.println("NILAI intArr index ke 2 "+intArr[2]);
//        System.out.println("Alamat Memory Deklarasi ke - 1 : "+intArr);
//
//        intArr = new int[10];
//        System.out.println("NILAI intArr index ke 2 "+intArr[2]);
//        System.out.println("Alamat Memory Deklarasi ke - 2 : "+intArr);

//        int [] intArr2 = new int[5];
//        intArr2 [0] = 6;
//        intArr2 [1] = 4;
//        intArr2 [2] = 9;
//        intArr2 [3] = 8;
//        intArr2 [4] = 10;

        String [][]cars = {
                {"Volvo", "BMW", "Ford", "Mazda"},
                {"HONDA","TOYOTA","DAIHATSU"}
        };


//        System.out.println("LENGTH 2 DIMENSI cars "+cars.length);
//        System.out.println("LENGTH 2 DIMENSI cars "+cars[0].length);
//        System.out.println("LENGTH 2 DIMENSI cars "+cars[1].length);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Masukkan Banyak nya Array :");
//        int loopArr = sc.nextInt();
//
//        int [] intArr = new int[loopArr];
//
//        for(int i=0;i<intArr.length;i++)
//        {
//            System.out.print("Masukkan Nilai Array Ke "+i+" : ");
//            intArr[i] = sc.nextInt();
//
//        }
//
//        for(int i=0;i<intArr.length;i++)
//        {
//            System.out.print(intArr[i]+",");
//        }

//        Padamu Negeri

        /* Sample Char Array Dari String*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Kata : " );
        String strInput = sc.nextLine();

        /*
        int intX = charYgTadi;
        if((intX>=65 && intX<=90) || (intX>=97 && intX<=122) || (intX>=48 && intX<=57)){
        true
        }

         */
        char chX = 'I';
        int intX = 0;
        int intJumlah =0;
        for (int i=0;i<strInput.length();i++)
        {
            chX =strInput.charAt(i);
            intX = chX;
            if(intX>=65 && intX<=97)
            {
                intJumlah=intJumlah+intX;
            }
            System.out.println("INDEX KE"+i+" ADALAH HURUF "+strInput.charAt(i));
        }

/*
DUA DIMENSI
 */
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Masukkan Banyak nya Baris :");
//        int loopArrBaris = sc.nextInt();
//        System.out.println("Masukkan Banyak nya Kolom :");
//        int loopArrKolom = sc.nextInt();
//
//        int [][] intArr = new int[loopArrBaris][loopArrKolom];
////        int [][] intArr = new int[2][2];
//
////        for(int i=0;i<loopArr;i++)
//        for(int i=0;i<intArr.length;i++)
//        {
//            for(int j=0;j<intArr[i].length;j++)
//            {
//                System.out.println("Masukkan Nilai Baris Ke "+i+" Kolom Ke "+j+" : ");
//                intArr[i][j] = sc.nextInt();
//            }
//        }
//
//        for(int i=0;i<intArr.length;i++)
//        {
//            for(int j=0;j<intArr[i].length;j++)
//            {
//                System.out.print(intArr[i][j]+",");
//            }
//            System.out.println();
//        }


//        for (int i=0;i<cars.length;i++)
//        {
//            for(int j=0;j<cars[i].length;j++)
//            {
////                System.out.print("ISI DARI INDEX KE ["+i+"]["+j+"] ADALAH "+cars[i][j]+" ,");
//                System.out.print(cars[i][j]+" ,");
//            }
//            System.out.println();
//        }

    }
}
