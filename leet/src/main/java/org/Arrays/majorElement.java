package org.Arrays;

import org.w3c.dom.ls.LSOutput;

public class majorElement {
    public static void main(String[] args) {
      int[] nums = {8,3,4,8,8};
//      int[] nums = {3,1,4,7,7,5};
//        int[] nums = {20,30,40,50,50,50,50};

        majorElement m = new majorElement();
        System.out.println(m.prob(nums));
    }

    //Long Method
//    public int prob(int[] nums) {
//        int maxElement = 0;
//        int store = 0;
//        int check = (nums.length / 2);
//        for (int i = 0; i < nums.length; i++) {
//            maxElement = nums[i];
//            int count = 0;
//            for (int j = i; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    count += 1;
//                }
//                if (count > store) {
//                    store = count;
//                    maxElement = nums[i];
//                }
//            }
//
//        }
//        if (store > check) {
//            return maxElement;
//        }else {
//            return -1;
//        }
//    }


// short Method
    public int prob(int[] nums){
        int candidate = 0;
        int count = 0;
        for(int element : nums){
            if(count == 0){
                candidate = element;
            }
            if(element == candidate){
                ++count;
            }else {
                --count;
            }
        }
        return candidate;
    }


}
