package org.example;

public class Main {
    public  static void main(String[] args) {
    String[][] arr ={
            {"X","X","X","X","X"},
            {"O","X","X","X","X"},
            {"O","X","X","X","X"},
            {"X","X","X","X","X"},
            {"X","O","X","O","X"}
    };


    for(int i=0; i<arr.length;i++){
        for(int j=0; j<1; j++){
            if("X".equals(arr[i][j]) && "X".equals(arr[i][j+1]) && "X".equals(arr[i][j+2]) && "X".equals(arr[i][j+3])){
                System.out.println("Horitonzal pattern found");

            }else{
                continue;
            }

            }
        }

    for(int i=0; i< arr.length -3;i++){
        for(int j=0; j<arr[i].length; j++){
            if("X".equals(arr[i][j]) && "X".equals(arr[i+1][j]) && "X".equals(arr[i+2][j]) && "X".equals(arr[i+3][j])){
                System.out.println("Vertical pattern found");
            }else{
                continue;
            }
        }
    }

    for(int i =0; i< arr.length -3;i++){
        for(int j =0; j<arr[i].length -3;j++){
            if("X".equals(arr[i][j]) && "X".equals(arr[i+1][j+1]) && "X".equals(arr[i+2][j+2]) && "X".equals(arr[i+3][j+3]) ){
                System.out.println("BackIncline found");
            }else {
                continue;
            }
        }
    }
    for(int i=0; i< arr.length-3;i++){
        for(int j = arr[i].length-1; j >=3 ; j--){
            if("X".equals(arr[i][j]) && "X".equals(arr[i+1][j-1]) && "X".equals(arr[i+2][j-2]) && "X".equals(arr[i+3][j-3])){
                System.out.println("FrontIncline found");
            }else {
                continue;
            }
        }
    }


    }

}
