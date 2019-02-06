package projectEuler;

/*

 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 *  we get 3, 5, 6 and 9. The sum of these multiples is 23.

Sample Input 0

2
10
100

Sample Output 0
23
2318

For N=10, if we list all the natural numbers below 10 that are multiples of 3 or 5 , we get  3,5,6 and 9. The sum of these multiples is 23.
Similarly for N=100 , we get 2318.

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int num = in.nextInt();
            long sum=0;
                long a = 0, b = 0, d = 0;
                // Here a, b and d are the count of numbers divisible by 3, 5
                // and 15 respectively
                a = (num - 1) / 3;
                b = (num - 1) / 5;
                d = (num - 1) / 15;

                long sum3 = 3 * a * (a + 1) / 2;
                long sum5 = 5 * b * (b + 1) / 2;
                long sum15 = 15 * d * (d + 1) / 2;
                
                sum = sum3 + sum5 - sum15;
                
            System.out.println(sum);
        }
    }
}