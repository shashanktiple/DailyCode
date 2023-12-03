package org.Arrays;



public class leaderInArray {
    public static void main(String[] args) {
    int[] arr = {7,10,4,3,6,5,2};
        leaderInArray p = new leaderInArray();
        p.prob1(arr);
        System.out.println("---------");
        for(int i : p.prob2(arr)){
            System.out.print(i+" ");
        }
    }

    public int[] prob1(int[] arr){

        int curLead = arr[arr.length-1];
        System.out.print(curLead+" ");
        for(int i=arr.length -2; i>=0; i--){
            if(arr[i] >curLead){
                curLead = arr[i];
                System.out.print(curLead+" " );
            }
        }
        return arr;
    }


        public int[] prob2(int[] arr){
            int[] b = new int[arr.length];
            int a=0;

            for(int i = 0; i<arr.length; i++){
                if(i == arr.length-1){
                    b[a] = arr[i];
                }
                for(int j = i+1; j< arr.length; j++){
                    if(arr[i]<=arr[j]){
                        break;
                    }
                    if(j == arr.length-1 || i == arr.length-1){
                        b[a] = arr[i];
                        a++;
                    }
                }
            }
            return b;
        }


}
