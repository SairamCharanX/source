package LeetCode;

import java.util.Arrays;

class RunningSum {
    public int[] runningSum(int[] nums) {
        int[] sumArray = new int[nums.length];
        Arrays.fill(sumArray,0);
        
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<=i;j++){
                sumArray[i] += nums[j];
            }
        }
        return sumArray;
    }
}
