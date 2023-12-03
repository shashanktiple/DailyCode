package org.Arrays;

public class maxSubArrSum {
    public static void main(String[] args) {
//    int[] nums = {-5,1,-2,3,-1,2,-2};
        int[] nums = {-3,8,-2,4,-5,6};

    maxSubArrSum m = new maxSubArrSum();
        System.out.println(m.prob(nums));
    }

    public int prob(int[] nums){

        int maxCount =0;
        int count = nums[0];
        
        for(int i =1 ; i<nums.length; i++){
                count = Math.max((count +nums[i]), nums[i]);
                maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}
