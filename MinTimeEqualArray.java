// given an integer arr given size n, in one second you can increase the value of one element by one.
// Find the min time in seconds to make all the elements of array are equal
// arr={2,4,1,3}
// output: 6 sec

//OBSERVATION
// - to minimise the time, make all elements equal to the max elements in the array

//PSEUDOCODE
// - find max element in array
// - for every element calculate how much it needs to be increase to reach the maximum
// - sum all those differences


import java.util.*;

public class MinTimeEqualArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

      
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int time = 0;
        for (int i = 0; i < n; i++) {
            time += (max - arr[i]);
        }

        System.out.println("Minimum time in seconds = " + time);

        sc.close();
    }
}
