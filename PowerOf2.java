package com.bridgelabzDay5;
import java.util.Scanner;
public class PowerOf2 {
    public static void main(String[] args) {
        Scanner scanner = null;
    int number;
    try {
    scanner = new Scanner(System.in);
    System.out.print("Enter number:");
    number = scanner.nextInt();
    boolean PowerOfTwo = isPowerOfTwo(number);
    if (PowerOfTwo)
   System.out.println(number + " is power of 2");
    else
   System.out.println(number + " is not power of 2");
    } catch (Exception e) {
    e.printStackTrace();
    }
}
 public static boolean isPowerOfTwo(int number) {
    return (number > 0) && ((number & (number - 1)) == 0);
 }
}
