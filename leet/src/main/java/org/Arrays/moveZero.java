package org.Arrays;

//public class moveZero {
//    public int[] prob(int[] arr){
//
//        int j =0;
//        int tem;
//        for(int i=0; i<arr.length - 1; i++){
//            if(arr[i] == 0){
//                j = i+1;
//                if(arr[j] != 0){
//                    tem = arr[j];
//                    arr[j]= arr[i];
//                    arr[i] = tem;
//                }
//            }
//        }
//
//        return arr;
//    }
//
//}


public class moveZero {
    public int[] prob(int[] arr){
        int j =-1;
        for(int i=0; i<arr.length; i++){
        if(arr[i] == 0){
            if(j == -1){
                j = i;
            }
        }else if(j != -1){
           arr[j] = arr[i];
           arr[i] = 0;
           j++;
        }
        }
        return arr;
    }

}