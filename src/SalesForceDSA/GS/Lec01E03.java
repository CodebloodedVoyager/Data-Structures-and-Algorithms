package SalesForceDSA.GS;

import java.util.Scanner;

public class Lec01E03 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

//        int marks = scn.nextInt();
//        double percentage = scn.nextDouble();
//        long phoneNo = scn.nextLong();
//        boolean isPass = scn.nextBoolean();
//
//        System.out.println(marks);
//        System.out.println(percentage);
//        System.out.println(phoneNo);
//        System.out.println(isPass);

        // Taking inputs, nextInt will stop at taking input once it'll come across either at a space or enter character.






        // ====================== If else loop & else if ladder  =====================

        // Write a program to find even?
//        int a = scn.nextInt();
//        if (a % 2 == 0) {
//            System.out.println("even");
//        }else{
//            System.out.println("odd");
//        }


        // Write a program to find Vovel and Consonent

        char alphabet = scn.nextLine().charAt(0);
        if (alphabet == 'a' || alphabet == 'e'|| alphabet == 'i'|| alphabet == 'o'|| alphabet == 'u') {
            System.out.println("Vovel");
        }else {
            System.out.println("Consonant");
        }












    }
}
