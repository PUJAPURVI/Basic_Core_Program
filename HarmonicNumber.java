package com.bridgelabzDay5;
import java.util.Scanner;
public class HarmonicNumber {

    public static void main(String args[]) {
        System.out.print("Enter the number .");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        double result = 0.0;
        for (int i=num; i>0; i--){
            result = result +(double)1/i;
            System.out.print(result + ",");

        }

    }
}
