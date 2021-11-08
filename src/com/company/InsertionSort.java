package com.company;

public class InsertionSort {
    public void displayArray(int arr[], int n){
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void insertionSort(int arr[], int n){
        for (int i=1; i<n; i++){
            int temp = arr[i];
            for (int j=i; j>0; j--){
                if (arr[j-1] > temp){
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        InsertionSort InSort = new InsertionSort();
        int arr[] = {48, 93, 28, 44, 1, 0, -1, 3};
        System.out.println("Before insertionSort the array elements : ");
        InSort.displayArray(arr, arr.length);
        InSort.insertionSort(arr, arr.length);
        System.out.println("After insertionSort the array elements : ");
        InSort.displayArray(arr, arr.length);


    }
}

