package practice;

import java.util.Scanner;

public class Newpractice {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the positive value : ");
        a=sc.nextInt();
        System.out.println("The multiplication table ");
       for (int i=1; i<=20; i++){
            System.out.println(a*i);
        }
        }

    }
