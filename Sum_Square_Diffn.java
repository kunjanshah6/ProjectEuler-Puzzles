/*
 * The sum of the squares of the first ten natural numbers is,

1^2 + 2^2 + ... + 10^2 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)^2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

*/
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (Long a0 = 0l; a0 < t; a0++) {
            Long n = in.nextLong();
            printLogic(n);
        }
    }

    private static void printLogic(Long num) {
        // Sum of Squares of first N natural numbers
        Long sumOfSqaure = 0l;
        for (Long i = 1l; i <= num; i++) {
            sumOfSqaure += i * i;
        }
        // Sqare of sum
        Long sum = (num * (num + 1)) / 2;
        Long squareOfSum = sum * sum;
        System.out.println((squareOfSum - sumOfSqaure));

    }
}
