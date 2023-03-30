package com.leetcode.datastructure;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args){
        RotateArray test = new RotateArray();
        int[] inputArrays = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        test.RotateArray(inputArrays, k);
        //[7,1,2,3,4,5,6]
        //[6,7,1,2,3,4,5]
        //[5,6,7,1,2,3,4]
        //[4,5,6,7,1,2,3]
    }
    public void RotateArray(int[] nums, int k) {

        int outputArray[] = new int[nums.length];
        int length = nums.length;
        k = k % length;
        outputArray = nums;
        for (int i=0; i < nums.length; i++){
            outputArray[i] = nums[(i+k)%length];
            //nums[i] = outputArray[(i+k)%length];
        }
 //       nums = outputArray;
        System.out.println(Arrays.toString(nums));
     //   System.out.println(outputArray);

//        int shiftArray[] = new int[length%k];
//        int sl = shiftArray.length;
//        for (int j=0; j<sl; j++) {
//            shiftArray[j]=nums[j];
//        }
//        for(int i=0; i < length-sl; i++) {
//            nums[i] = nums[(i+k)%length];
//        }
//        for (int j=0; j<sl; j++)  {
//            nums[length-sl+j]= shiftArray[j];
//        }
//        System.out.println(Arrays.toString(nums));
    }

}
