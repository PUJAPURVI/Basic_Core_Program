package com.bridgelabzDay5;
import java.util.Scanner;
public class PrimeFactor {
    public static void main(String args[]) {
        int i, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();

        for (i = 2; i < n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n > 2)
            System.out.println(n);
    }
}



