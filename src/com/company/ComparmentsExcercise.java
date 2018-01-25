package com.company;

import java.util.Scanner;

public class ComparmentsExcercise {

    public int myScanner() {

        Scanner source = new Scanner(System.in);
        System.out.println("Plese tell me your number: ");

        int returnNo = source.nextInt();

        return returnNo;
    }

    public void createIntArray(int x, int y, int z) {


        for (int i = 0; i < y; i++) {

            int[] myArray = new int[z / y];

            for (int j=0; j< z/y ; j++){

                myArray[j] = 1 + j;
                System.out.println(myArray[j]);
            }



        }


    }


}
