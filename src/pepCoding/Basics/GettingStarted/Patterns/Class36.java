package pepCoding.Basics.GettingStarted.Patterns;

import java.util.Scanner;

public class Class36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t"); // backward slash t : TAB
            }
            System.out.println();
        }
    }
}


/*
* Que: Print Pattern-1
*
*                          *
*                          * *
*                          * * *
*                          * * * *
*                          * * * * *
*
*
*
* Input Format:
* A number n
*
* Output Format:
*                          *
*                          * *
*                          * * *
*                          * * * *
*                          * * * * *
*
* Constraints:
* 1<=n<=100
*
* Sample input:
* 5
* Sample Output:
*                          *
*                          * *
*                          * * *
*                          * * * *
*                          * * * * *
*
*
* NOTES:
* 1. Think about the Abstraction in Software Enginrring
* --> Basically we're trusting the inner process, we're not giving emphasis on how it's working internally. We'll just focus
* on out current task, no matter what. (Basically Inner walo ko Vishwaas Karo, and Bahar walo par work karo)
* 2.
*
* */