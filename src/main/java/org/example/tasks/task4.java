package org.example.tasks;

public class task4 {
    public static void main(String[] args) {
        int[][] nums={
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] % 2 == 0) {
                    evenSum += nums[i][j];
                } else {
                    oddSum += nums[i][j];
                }
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

    }
}
