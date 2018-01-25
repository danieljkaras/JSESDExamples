package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class IntegerToBinary {

    Scanner source = new Scanner(System.in);


    public int getKeyboardNumber() {


        System.out.println("Please tell me your integer number:");
        int myNumber = source.nextInt();

        return myNumber;
    }


    public void myBiteNo() {


        int theNo = getKeyboardNumber();

        String number = "";
        int rest = 0;
        while (theNo > 1) {
            rest = theNo % 2;
            theNo = theNo / 2;
            number = number + rest + "";


            //System.out.println(number);
        }

        number = number + "1";
        //System.out.println(number);

        StringBuilder myIntToByte = new StringBuilder(number);
        String rightString = myIntToByte.reverse().toString();

        System.out.println("This is your conversion int to byte: " + rightString);

    }


}
