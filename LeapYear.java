package com.bridgelabzDay5;
import java.util.Scanner;
public class LeapYear {
    public static void main(String args[]) {
        int x;
        System.out.print("Enter any Year ");
        Scanner r=new Scanner(System.in);
        x=r.nextInt();

        if (x%100==0 && x%400==0 || x%100!=0 &&x%4==0)
        {
            System.out.print("Leap Year");
        }
        else
        {
            System.out.print("Not Leap Year");
        }

    }
}
