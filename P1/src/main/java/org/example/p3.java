package org.example;

public class p3 {
    public static void main(String[] args) {
        int[] arr={3,5,4,2,5,8,6,1};
        int tem=0;

        System.out.println("before sort");
        for(int num: arr){
            System.out.print(num+" ");
        }

            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr.length-1; j++){
                    if(arr[j] > arr[j+1]){
                        tem = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = tem;
                    }
                }
            }

        System.out.println("after sort sort");
            for(int num: arr){
                System.out.print(num+" ");
            }

    }
}
