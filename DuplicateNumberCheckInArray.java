package SpecialClass;

import java.util.Scanner;

public class DuplicateNumberCheckInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int duplicateCount = 0;

        // Boolean array to mark visited elements
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue; // skip already counted
            }

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true; // mark as visited
                    count++;
                }
            }

            if (count > 1) {
                duplicateCount++;
            }
        }

        System.out.println("Number of duplicate elements: " + duplicateCount);
    }
}
