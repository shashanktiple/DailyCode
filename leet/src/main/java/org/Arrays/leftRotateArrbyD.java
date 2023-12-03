package org.Arrays;

public class leftRotateArrbyD {

    public int[] prob(int[] arr, int d) {
        if (arr.length != 0 && d < arr.length) {
            int j = 0;
            while (j < d) {
                int tem = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    arr[i - 1] = arr[i];
                    if (i == arr.length-1) {
                        arr[i] = tem;
                    }
                }
                j++;
            }
        }
return arr;

    }
}