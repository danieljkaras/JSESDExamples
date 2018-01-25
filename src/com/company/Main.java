package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here


        //IntegerToBinary myInteger = new IntegerToBinary();

        //myInteger.myBiteNo();

        ComparmentsExcercise newCompare = new ComparmentsExcercise();

        int x = newCompare.myScanner();     // x = ilość liczb
        int y = newCompare.myScanner();     // y = ilość przedziałów; - 5
        int z = newCompare.myScanner();     // z = zakres liczb;  - 100

        newCompare.createIntArray(x,y,z);



    }
}
