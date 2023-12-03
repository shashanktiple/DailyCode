package org.Arrays;

public class leftRotateArrbyOne {
    public int[] prob(int[] arr){
        int tem = arr[0];
        for(int i = 1; i< arr.length ; i++){
            arr[i-1] = arr[i];
            if(i == arr.length-1){
                arr[i]= tem;
            }
        }
        return arr;
    }
}
