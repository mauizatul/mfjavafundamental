package com.juaracoding.mfjavafundamental.cobacoba.array;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Fadhil a.k.a. Mauizatul Fadhillah
Java Developer
Created on 1/13/2023 9:14 PM
@Last Modified 1/13/2023 9:14 PM
Version 1.0
*/

public class BinarySearchProsedural {
    public static void main(String[] args) {

        int keyword = 88;
        int [] val = {66,77,80,84,88,99,100,105,111,114,119};//DATA GANJIL
        int low  = 0;
        int high = val.length-1;
        int med  = 0;
        boolean status = false;

        while(low<=high)
        {
            med = (low+high)/2;
            //checking found or not
            if(keyword==val[med])
            {//data found
                System.out.println(keyword+" FOUNDED in position "+(med+1)+" and INDEX "+med);
                status=true;
                break;
            }
            else
            {
                //data not found
                //to split arr less or greater than key
                if(keyword>val[med])
                {
                    //found the data greater than median
                    low = med + 1;

                }
                else
                {
                    //if media greater than the keyword
                    high = med - 1;

                }
            }
        }//END OF WHILE PROCESS

        //IF DATA NOT FOUND
        if(!status)
        {
            System.out.println(keyword+" NOT FOUND !!");
        }
    }
}
