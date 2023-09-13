package practice;

import java.util.Scanner;

public class Mypractice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the positive value: ");
        int a= sc.nextInt();

        int fact= 1;
        for (int i=1; i<=a; i++){
            fact *=i;
        }
        System.out.println("The factorial value is: " +fact);

    }
        }