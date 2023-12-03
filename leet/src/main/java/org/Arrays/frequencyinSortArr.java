package org.Arrays;

public class frequencyinSortArr {
    public static void main(String[] args) {

//        int[] arr = {10, 10, 10, 25, 30, 30};
        int[] arr = {30,30,10,55,55,66};
        frequencyinSortArr f = new frequencyinSortArr();
        f.prob(arr);
    }

    public void prob(int[] arr) {
        int element = arr[0];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                count += 1;
            } else {
                System.out.println(element + " " + count);
                element = arr[i];
                count = 1;
            }
            if (i == arr.length - 1) {
                System.out.println(element + " " + count);
            }
        }
    }
}
