package practice;

import java.util.Scanner;

public class Fourquestion {
    public static void main(String[] args) {
        int[] array= {5,3,5,2,5,99,7,77,99,101,9,45,50};
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value= ");
        a= sc.nextInt();
        int i;
        int count=0;
        for (i=0; i< array.length; i++){
            if (array[i]==a){
                count++;
            }
        }
        System.out.println("Total number of times the value is present= " +count);
        if (count==0){
            System.out.println("The value is not present");
        }
    }
}
