package practice;


import java.util.Scanner;

public class PracticeClass {
    public static void main(String[] args) {
        System.out.println("Practice");
        Scanner sc= new Scanner(System.in);

        int a;
        int b;
        int c;
        int d;
        int e;
        double percentage;
        int total;

        System.out.println("Enter the mark for subject a:");
        a=sc.nextInt();
        System.out.println("Enter the mark for subject b:");
        b=sc.nextInt();
        System.out.println("Enter the mark for subject c:");
        c=sc.nextInt();
        System.out.println("Enter the mark for subject d:");
        d=sc.nextInt();
        System.out.println("Enter the mark for subject e:");
        e=sc.nextInt();
        total= a+b+c+d+e;
        System.out.println("The total mark is :"+total);

        percentage=(total/500.0)*100;
        System.out.println("the total percentage is : "+percentage);

        if (percentage>90){
            System.out.println("A Grade");
        } else if (percentage>80 && percentage<90) {
            System.out.println("B Grade");
        } else if (percentage>70 && percentage<80) {
            System.out.println("C Grade");
        } else if (percentage>60 && percentage<70) {
            System.out.println("D Grade");
        }
        else{
            System.out.println("F garde");
        }

    }
}
