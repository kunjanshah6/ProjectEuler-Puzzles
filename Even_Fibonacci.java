package projectEuler;

/* 
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with and , the first
 * 1,2,3,5,8,13,.....
 * By considering the terms in the Fibonacci sequence whose values do not exceed, find the sum of the even-valued terms.

Input:
2
10
100

Output : 
10
44

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Even_Fibonacci  {

    public static void main(String[] args) {
    	
    	// Input Number of cases.
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
        	
        	// Take Each case
            long n = in.nextLong();
            
            // Generate Finonacci series and put into in List
            List<Long> fib = new ArrayList<Long>();
            long i=1;
            long j=2;
            
            // Add first two element in list.
            fib.add(i);
            fib.add(j);
            
            // Fibonacci logic
            while(i+j<n) {
                long sum = i+j;
                fib.add(sum);
                i = j;
                j = sum;
            }
            
            // Sum of even Numbers in series.
            long sum=0;
            for(Long l : fib) {
                if(l%2==0){
                    sum+=l;
                }
            }
            
            System.out.println(sum);
        }
    }
}