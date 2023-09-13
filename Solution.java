package practice;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        System.out.print("Factors of " + number + " excluding 1 and the number itself: ");
        printFactors(number);
    }

    private static void printFactors(int number) {
        boolean isPrime = true;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                System.out.print(i + " ");
            }
        }

        if (isPrime) {
            System.out.println("-1");
        }
    }
}
