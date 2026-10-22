/* Problem statement
Given an array of integers, move all zeros to the end of the array while maintaining the relative order of the non-zero elements.

Rule: Do not use another array. Try to solve it in place.
Example 1
Input
7
0 1 0 3 12 0 5


Output
1 3 12 5 0 0 0


Explanation: All non-zero elements remain in their original order, and all zeros move to the end.
Example 2
Input
5
1 2 3 4 5


Output
1 2 3 4 5


Your task
- Read N and the array elements.
- Move all zeros to the end.
- Print the modified array.
- Do not use sorting or another array.

Hints (only if needed)
1. Use a variable to track the position where the next non-zero element should go.
2. Traverse the array once.
3. Move non-zero elements forward, then fill the remaining positions with zeros.

Bonus challenge
Try solving it with \(O(N)\) time complexity and \(O(1)\) extra space.
*/

import java.util.*;

public class day1_2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        int pos = 0;

        for (int i = 0; i < n; i++) 
        {
            if (arr[i] != 0) {
                arr[pos] = arr[i];
                pos++;
            }
        }

        while (pos < n) 
        {
            arr[pos] = 0;
            pos++;
        }

        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " ");
        }

    sc.close();
}


}
