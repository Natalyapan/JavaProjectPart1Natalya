package org.example.tasks;

public class task8 {
    public static void main(String[] args) {
        int[] nums={5,2,4,3,9,6,7,1,8,10};

        int max=nums[0];
        int min=nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max) {
                max = nums[i];
            }
            if (nums[i]<min) {
                min = nums[i];
            }
        }

        System.out.println("Minimum number is: "+min);
        System.out.println("Maximum number is: "+max);

    }
}


