package practice;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        int a;
        long Factorial=1;
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value Num:");
        num= sc.nextInt();
        for (a=1; a<=num; a++){
            Factorial= Factorial*a;

        }
        System.out.println("The factorial value is:" +Factorial);
    }
}
