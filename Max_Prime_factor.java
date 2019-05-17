/* 
 * What is the largest prime factor of a given number ?
 * The prime factors of 13195 are 5,7,23 and 29.

 * What is the largest prime factor of a given number ?

 * Sample Input
 * 2
 * 10
 * 17

 * Sample Output
 * 5
 * 17

*/
package projectEuler;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Max_Prime_factor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		List<Long> results = new ArrayList<Long>();
		
		// Lets start
		for (int a0 = 0; a0 < t; a0++) {
			long num = in.nextLong();

			List<Long> primeList = new ArrayList<Long>();

			// Find factors
			Set<Long> factors = new HashSet<Long>();
			for (Long i = 1l; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					// If divisors are equal, print only one
					if (num / i == i)
						factors.add(i);

					else // Otherwise print both
						factors.add(i);
					factors.add(num / i);

				}
			}

			// Find Prime factors
			for (Long factor : factors) {
				// System.out.println(factor);
				boolean flag = true;
				for (int j = 2; j <= Math.sqrt(factor); j++) {
					if (factor % j == 0) {
						flag = false;
						break;
					}
				}
				if (flag) {
					primeList.add(factor);
				}
			}
			results.add(primeList.stream().max(Comparator.comparing(Long::valueOf)).get());
		}

		
		// Print maximum Prime factor
		for (Long i : results) {
			System.out.println(i);
		}
		
	}
}
