package org.example.tasks;

public class task3 {
    public static void main(String[] args) {
        int[][] nums={
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };

        System.out.println("Even numbers in array:");

        for (int[] row:nums) {
            for (int n:row) {
                if (n%2==0) {
                    System.out.println(n);
                }
            }
        }

    }
}
