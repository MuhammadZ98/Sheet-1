package com.company;

public class MySpecialArrayUtils {
    public static void reverse(int[] arr){
        for(int i = 0; i < arr.length / 2; i++){
            arr[i] = arr[i] + arr[arr.length - 1 - i];
            arr[arr.length - i] = arr[i] - arr[arr.length - i];
            arr[i] = arr[i] - arr[arr.length - i];
        }
    }
    public static int[] sumEvenOdd(int[] arr) {
        int[] sum = {0, 0};
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                sum[0] += arr[i];
            } else {
                sum[1] += arr[i];
            }
        }
        return sum;
    }
    public static double average(int[] arr){
        double avg = 0;
        for (int i = 0; i < arr.length; i++){
            avg += (double)arr[i] / (double)arr.length;
        }
        return avg;
    }
    public static void moveValue(int[] arr, int val) {
        int size = arr.length;
        for(int i = 0; i < size; i++) {
            if(arr[i] == val){
                for(int j = i; j < size - 1; j++){
                    arr[j] = arr[j + 1];
                }
                arr[size - 1] = val;
                size--;
            }
        }
    }
    public static void transpose(int[][] arr) { //this mothod will work only if the array is n*n size.
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                arr[i][j] = arr[i][j] + arr[j][i];
                arr[j][i] = arr[i][j] - arr[j][i];
                arr[i][j] = arr[i][j] - arr[j][i];
            }
        }
    }
}
