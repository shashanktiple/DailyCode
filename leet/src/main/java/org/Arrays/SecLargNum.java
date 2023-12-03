package org.Arrays;

class SecLargNum{

//    public static int prob(int arr[]){
//        int max =0;
//        int n = -1;
//        for(int i = 0; i < arr.length; i++){
//            if (arr[i]>max){
//                max = arr[i];
//            }
//        }
//        for(int i = 0; i<arr.length;i++){
//            if(arr[i] == max){
//                continue;
//            }else if(arr[i]>n){
//                n = arr[i];
//            }
//        }
//        return n;
//    }

    //----------------------------------------------------
    public static int prob(int arr[]){

        int m =arr[0];
        int n=-1;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>m){
                n = m;
                m = arr[i];
            } else if(n<arr[i]){
                n = arr[i];
            }
        }
        return n;
    }
}
