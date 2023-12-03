package org.Arrays;
//when first and last element are not 0
// not optimal for all the test cases
public class trappingRainWater {
    public static void main(String[] args) {
    int[] arr = {3,5,2,3};

    trappingRainWater t = new trappingRainWater();
        System.out.println(t.prob(arr));
    }

    public int prob(int[] arr){
        int fst = arr[0];
        int lst = arr[arr.length-1];
        int minlvl = Math.min(fst, lst);
        int count=0;

        if((fst & lst) > 0){
            for(int i=1; i<arr.length-1; i++){
                if(arr[i]<minlvl){
                    count += minlvl - arr[i];
                }
            }

        }
        return count;
    }
}
