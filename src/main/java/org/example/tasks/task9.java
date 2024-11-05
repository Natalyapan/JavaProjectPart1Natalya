package org.example.tasks;

public class task9 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10};

        int firstLargestNum=nums[0];
        int secondLargestNum=nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > firstLargestNum) {
                firstLargestNum=nums[i];
            }
            if (nums[i] > secondLargestNum && nums[i] != 10) {
                secondLargestNum=nums[i];
            }
        }

        System.out.println("First largest num is: "+firstLargestNum);
        System.out.println("Second largest num is: "+secondLargestNum);

    }
}



