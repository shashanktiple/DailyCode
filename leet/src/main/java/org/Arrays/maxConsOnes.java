package org.Arrays;

public class maxConsOnes {
    public static void main(String[] args) {
    int[] arr = {0,1,1,0,1,0};
//        int[] arr = {1,1,1,1};

    maxConsOnes m = new maxConsOnes();
        System.out.println(m.prob(arr));
    }

    public int prob(int[] arr){
        int mxcount= 0;
        int count = 0;

        for(int i =0; i< arr.length; i++){
            if(arr[i] == 1){
                count += 1;
                if(i == arr.length-1){
                    if(mxcount < count){
                        mxcount = count;
                    }
                }
            }
           else{
                if(mxcount > count){
                    count = 0;
                }else{
                    mxcount = count;
                    count = 0;
                }
            }

        }

        return mxcount;
    }
}
