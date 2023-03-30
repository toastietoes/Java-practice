package com.leetcode.datastructure;

public class RemoveDuplicate {

    public static void main(String[] args){
        RemoveDuplicate test = new RemoveDuplicate();
        int[] inputArrays = new int[]{1,1,2,2,3};
        test.removeDuplicates(inputArrays);
    }
    public int removeDuplicates(int[] nums){
        System.out.println("call removeDuplicates");

        int pointer = 0;
        for (int i=1; i < nums.length; i++) {
            if (nums[i] != nums[pointer] ) {
                int temp = nums[pointer + 1];
                nums[pointer + 1] = nums[i];
                nums[i] = temp;
                pointer++;
            }
        }
        System.out.println("p = " + pointer);
        for(int i =0; i<=pointer; i++){
            System.out.println(nums[i]);
        }
        return ++pointer;
    }
}
