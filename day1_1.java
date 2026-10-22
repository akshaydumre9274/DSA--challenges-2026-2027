/* 
Problem: Find the Second Largest Number
Difficulty: ⭐ Easy
Problem Statement
Write a Java program that reads N integers from the user and prints the second largest distinct number in the array.

If there is no second largest distinct number, print:
No Second Largest

Sample Input 1
5
10 25 8 17 25

Sample Output 1
17

Explanation
The distinct numbers are:
10 25 8 17

The largest is 25, and the second largest is 17.
Sample Input 2
4
7 7 7 7

Sample Output 2
No Second Largest
*/

import java.util.*;

public class day1_1 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int N = sc.nextInt();

        int[] a = new int[N];

        System.out.println("Enter array elements:");

        for (int i = 0; i < N; i++) 
        {
            a[i] = sc.nextInt();
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) 
        {

            if (a[i] > max1) 
            {
                max2 = max1;
                max1 = a[i];
            }
            else if (a[i] > max2 && a[i] != max1) 
            {
                max2 = a[i];
            }
        }

        if (max2 == Integer.MIN_VALUE) 
        {
            System.out.println("No Second Largest");
        } 
        else 
        {
            System.out.println("Second Largest = " + max2);
        }

        sc.close();
    }
}