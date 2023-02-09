package com.juaracoding.mfjavafundamental.testharian.praktikum_6;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Fadhil a.k.a. Mauizatul Fadhillah
Java Developer
Created on 2/9/2023 10:20 AM
@Last Modified 2/9/2023 10:20 AM
Version 1.0
*/

import java.util.ArrayList;
import java.util.Scanner;
public class Praktikum6 {

    static StringBuilder sBuild = new StringBuilder();
    public static void main(String[] args) {
        /*
            Soal Nomor 1 Praktikum 6 Java Fundamental
        */
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        String bef = "";
        String aft = "";

        System.out.println("Input:");
        boolean done = false;

        while (!done) {
            try {
                int input = scanner.nextInt();
                if (input < 0) {
                    done = true;
                } else {
                    numbers.add(input);
                }
            } catch (Exception e) {
                done = true;
            }
        }

        //ASC INT
        sBuild.setLength(0);
        //before
        System.out.print("Angka yang anda input adalah : ");
        for (int num:numbers)
        {
            bef = sBuild.append(num).append(",").toString();
        }

        System.out.println(bef.substring(0,bef.length()-1));

//        System.out.println(numbers.size());

        sBuild.setLength(0);
        //after
        System.out.print("Setelah diurutkan menjadi : ");
        for (int i = 0; i < numbers.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(j) < numbers.get(minIndex)) {
                    minIndex = j;
                }
            }
            int temp = numbers.get(minIndex);
            numbers.set(minIndex, numbers.get(i));
            numbers.set(i, temp);
        }

        for (int num:numbers)
        {
            aft = sBuild.append(num).append(",").toString();
        }

        System.out.print(aft.substring(0,aft.length()-1));

    }
}
