package org.Arrays;

public class trappingRainWater2 {
    public static void main(String[] args) {

        int arr[]= {0,1,0,2,1,0,1,3,2,1,2,1};
        trappingRainWater2  t = new trappingRainWater2();
        System.out.println(t.prob(arr));

    }
    public  int prob(int[] arr){
        int count=0;
        int fst = arr[0];

        for(int j = 1; j < arr.length; j++){
            if(arr[j]>= fst){
            int minn = Math.min(arr[j], fst);

            for(int x = fst+1; x< j; x++){
                if(fst < minn){
                    count += minn - arr[x];
                }
            }
            }
        }
        return count;
    }
}
