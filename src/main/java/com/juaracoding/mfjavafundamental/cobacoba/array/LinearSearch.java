package com.juaracoding.mfjavafundamental.cobacoba.array;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Fadhil a.k.a. Mauizatul Fadhillah
Java Developer
Created on 1/13/2023 9:19 PM
@Last Modified 1/13/2023 9:19 PM
Version 1.0
*/

public class LinearSearch {
    public static void main(String[] args) {

        int[] intArr = {3,8,5,2,1,9,10};
        int intB = 1;
        boolean isFound = true;

        for(int i=0;i<intArr.length;i++)
        {
            if(intB==intArr[i])
            {
                System.out.println("Angka "+intB+" sudah ditemukan , pada index ke "+i);
                isFound = false;
                break;
            }
        }

        if(isFound)
        {
            System.out.println("Angka  "+intB+" yang anda cari tidak ditemukan !! ");
        }
    }
}
