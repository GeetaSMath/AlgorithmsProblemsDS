package com.company;

public class BubbleSort {
    public void displayArray(int arr[], int n){
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void bubbleSort(int arr[], int n){
        for (int i=0; i<n; i++){
            for (int j=0; j<n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        BubbleSort Bsort = new BubbleSort();
        int arr[] = {48, 93, 28, 44, 1, 0, -1, 3};
        System.out.println("Before bubbleSort the array elements : ");
        Bsort.displayArray(arr, arr.length);
        Bsort.bubbleSort(arr, arr.length);
        System.out.println("After bubbleSort the array elements : ");
        Bsort.displayArray(arr, arr.length);
    }
}

