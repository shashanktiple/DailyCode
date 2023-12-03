package org.Arrays;

public class sortArray {
    public static int[] sort(int arr[]){

        for(int i=0; i<arr.length-1;i++){
            for(int j =i+1; j<arr.length; j++){
                if(arr[j]<arr[i]){
                    int tem = arr[j];
                    arr[j] = arr[i] ;
                    arr[i] = tem;
                }
            }
        }
        return arr;
    }
}
