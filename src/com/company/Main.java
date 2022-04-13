package com.company;

import java.io.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
       // FileWriter fw = new FileWriter("a.out.txt");
       // FileReader fr = new FileReader("a.in.txt");
       // Scanner sc = new Scanner(fr);

        int a = 19;
        int[] binaryArray = new int[15];

        String binaryString = Integer.toBinaryString(a);
        int binaryInt = Integer.parseInt(binaryString);
        System.out.println(binaryInt);
        int length = String.valueOf(binaryInt).length();

        int max = a;
        int i = length;
        int newBinaryInt = 0;
        while(binaryInt > 0){
            binaryArray[i] = binaryInt % 10;
            i--;
            binaryInt /= 10;
        }

        int x = length;
        int[] newBinaryArray = new int[15];
        int newDecimalInt = 0;
        String newBinaryString;
        //while(newBinaryInt != Integer.parseInt(binaryString)) {
            binaryArray[0] = binaryArray[length];
            System.arraycopy(binaryArray, 0, newBinaryArray, 0, length - 2);
            newBinaryArray[length - 1] = binaryArray[length - 1];
            for (int j = 0; j < length; j++) {
                newBinaryInt += newBinaryArray[j] * Math.pow(10, x);
                x--;
            }
            newBinaryInt /= 10; //костыль, удаляем ноль на конце
            System.arraycopy(newBinaryArray, 0, binaryArray, 0, length);
            newBinaryString = Integer.toBinaryString(newBinaryInt);
            //newDecimalInt = Integer.parseInt(newBinaryString);
            //if(newDecimalInt > max) max = newDecimalInt;
            //System.out.println(newDecimalInt);
            //System.out.println(newBinaryInt);
        //}
        //}
        for (int j = 0; j < length; j++) {
           System.out.print(binaryArray[j]);
        }
        //System.out.println(max);
    }
}
