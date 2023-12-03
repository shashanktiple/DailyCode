package org.example;

public class p4 {
    public static void main(String[] args) {
        int[] arr={3,5,4,2,5,8,6,1};
        int minIndex = -1;
        int tem=0;

        System.out.println("before sort");
        for(int num: arr){
            System.out.print(num+" ");
        }


        for(int i=0 ; i<arr.length-1;i++){
            minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            tem = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = tem;
            }


        System.out.println("before sort");
        for(int num: arr){
        System.out.print(num+" ");
    }
    }
}
