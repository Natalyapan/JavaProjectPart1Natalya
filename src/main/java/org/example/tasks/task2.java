package org.example.tasks;

public class task2 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 25, 35, 50, 69};

        int sum=0;
        for (int i:nums) {
            sum+=i;
        }
        System.out.println("Sum of all stored elements in that array is: "+sum);

    }
}
