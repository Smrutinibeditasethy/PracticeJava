package practice;

import java.util.Scanner;

public class Secondclass {
    public static void main(String[] args) {
        int[] array= new int[13];
        array[0]=5;
        array[1]=3;
        array[2]=5;
        array[3]=2;
        array[4]=5;
        array[5]=43;
        array[6]=7;
        array[7]=77;
        array[8]=99;
        array[9]=101;
        array[10]=9;
        array[11]=45;
        array[12]=50;

        int num;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value =");
        num= sc.nextInt();
        int count=0;
        for (int i=0; i<array.length; i++){
            if (array[i]==num){
                System.out.println(array[i]+ " is present in " +i);
                count= count+1;
            }
        }
        if (count==0){
            System.out.println("The value is not found");
        }


    }
}
