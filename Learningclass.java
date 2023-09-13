package practice;

import java.util.Scanner;

public class Learningclass {
    public static void main(String[] args) {
      /*  int length;
        int breadth;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of length :");
        length= sc.nextInt();
        System.out.println("Enter the value of breadth :");
        breadth= sc.nextInt();

        if (length==breadth){
            System.out.println("This is a square");
        } else
            System.out.println("This is not a square"); */

        int first;
        int second;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first value:");
        first= sc.nextInt();
        System.out.println("Enter the second value:");
        second= sc.nextInt();
        if (first>second){
            System.out.println("The first value is greatest");
        } else
            System.out.println("The second value is greatest");
    }
}
