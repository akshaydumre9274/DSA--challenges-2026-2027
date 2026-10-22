/* 
Day 3 Challenge: Find the Missing Number
Easy
Arrays
Placement Practice

Problem statement
You are given an array containing N-1 distinct numbers from 1 to N. Find the missing number.
Example 1
Input
5
1 2 4 5


Output
3


Explanation: Numbers 1 to 5 should be present. Number 3 is missing.
Example 2
Input
7
1 2 3 4 6 7


Output
5


Your task
- Read N.
- Read N-1 array elements.
- Find and print the missing number.
- Try to solve it without sorting the array.

Hints (use only if needed)
1. Think about the sum of numbers from 1 to N.
2. Formula: \(\frac{N(N+1)}{2}\)
3. Subtract the sum of array elements from the expected sum.

Bonus challenge
Can you solve this in \(O(N)\) time and \(O(1)\) extra space?

*/

import java.util.Scanner;

public class day2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long sum = 0;

        for (int i = 0; i < n - 1; i++) {
            sum += sc.nextInt();
        }

        long total = (long) n * (n + 1) / 2;

        long missing = total - sum;

        System.out.println("missing: " + missing);

        sc.close();
    }
}


