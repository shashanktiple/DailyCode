package org.Arrays;

public class stockBuySell000 {
    public static void main(String[] args) {

        int[] arr ={7,1,5,3,6,4};
        stockBuySell000 s = new stockBuySell000();
        System.out.println(s.prob(arr));
    }
    public int prob(int[] arr){

        int min_price = arr[0];
        int maxprof = 0;

        for(int i=1;i<arr.length;i++){
            maxprof = Math.max(maxprof,arr[i]-min_price);
            min_price = Math.min(arr[i],min_price);
        }

        return maxprof;
    }
}
