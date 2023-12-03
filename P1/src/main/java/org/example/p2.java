package org.example;

import java.sql.SQLOutput;

public class p2 {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8};
        int target = 6;
        int result= linearsearch(arr, target);
        int result2 = binarysearch(arr,8);
        int result3 = recbinarysearch( arr, target, 0, arr.length-1);


        if (result==-1){
            System.out.println("Element not found");
        }else {
            System.out.println("Element found at index:"+result);
        }

    }

    public static int linearsearch(int[] arr, int tar){
        int element=0;
        for(int i=0; i < arr.length; i++){
            if(tar == arr[i]){
                element= i;
                break;
            }
            else {
                element = -1;
            }
        }
        return element;
    }

    public static int binarysearch(int[] arr, int tar){

        int l=0;
        int r=arr.length-1;

        while (l<=r){
            int mid = (l+r)/2;

            if (tar == arr[mid]){
                return mid;
            }else if(tar < arr[mid]){
                r = mid-1;
            }else{
                l = mid +1;
            }
        }
        return -1;
    }


    public static int recbinarysearch(int[] arr, int tar, int l, int r){


        if (l<=r){
            int mid = (l+r)/2;

            if (tar == arr[mid]){
                return mid;
            }else if(tar < arr[mid]){
                return recbinarysearch(arr, tar, l, mid-1);
            }else{
                return recbinarysearch(arr, tar, mid+1, r);
            }
        }

        return -1;
    }



}
