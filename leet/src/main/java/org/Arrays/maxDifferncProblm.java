package org.Arrays;

public class maxDifferncProblm {
    public static void main(String[] args) {
        int[] arr = {2,3,10,6,4,8,1};
    maxDifferncProblm m = new maxDifferncProblm();
        System.out.println(m.prob(arr));
    }

    public int prob(int[] arr){
        int minn = arr[0];
        int maxn = -1;

        for(int i = 0 ; i < arr.length; i++){
            if(minn >= arr[i]){
                minn = arr[i];
                }
            else {
            if(maxn < arr[i]-minn){
                maxn = arr[i] - minn;
            }}
        }
        return maxn;
    }
}
