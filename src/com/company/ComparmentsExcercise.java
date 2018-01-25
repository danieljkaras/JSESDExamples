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

        int b = z / y;

        int[] myArray = new int[b];
        int helpNo = 0;

        for (int i = 0; i < b; i++) {

            for (int j = i +b; j< ((1+i)*b); j++)

                helpNo = j;
                myArray[i] = helpNo + 1;

            System.out.println(myArray[i]);
        }


    }
}


