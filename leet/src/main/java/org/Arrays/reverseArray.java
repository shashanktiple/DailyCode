package org.Arrays;

public class reverseArray {

    public int[] prob(int arr[]){

        int i =0 ;
        int j = arr.length-1;
        int tem;
        while(i <= j){
            tem = arr[j];
            arr[j]= arr[i];
            arr[i] = tem;
            i++;
            j--;
        }
        return arr;
    }
}
