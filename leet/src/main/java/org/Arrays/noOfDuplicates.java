package org.Arrays;

public class noOfDuplicates {

    public int prob(int arr[]){
        int j =1;
        for(int i = 1; i<arr.length;i++){
            if(arr[i] != arr[i-1]){
                arr[j]= arr[i];
                j++;
            }

        }
        return j;
    }
}
