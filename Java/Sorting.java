//------------------------- Sorting--------------------------------

import java.util.*;

public class Sorting {
    // public static void bubbleSort(int arr[]) {
    //     for (int turn = 0; turn < arr.length - 1; turn++) {
    //         for (int j = 0; j < arr.length - 1 - turn; j++) {
    //             if (arr[j] > arr[j + 1]) {
    //                 int temp = arr[j];
    //                 arr[j] = arr[j + 1];
    //                 arr[j + 1] = temp;

    //             }
    //         }
    //     }
    // }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // // --------------Selection Sort---------------
    // public static void selectionSort(int arr[]) {
    //     for (int i = 0; i < arr.length - 1; i++) {
    //         int minPos = i;
    //         for (int j = i + 1; j < arr.length; j++) {
    //             if (arr[minPos] > arr[j]) {
    //                 minPos = j;
    //             }
    //         }
    //         int temp = arr[minPos];
    //         arr[minPos] = arr[i];
    //         arr[i] = temp;
    //     }
    // }

    // // -------------Merge Sort------------ nlogn
    // public static void mergeSort(int arr[], int si, int ei) {
    //     if (si >= ei) {
    //         return;
    //     }
    //     int mid = (si + ei) / 2;
    //     mergeSort(arr, si, mid);
    //     mergeSort(arr, mid + 1, ei);
    //     merge(arr, si, mid, ei);
    // }

    // public static void merge(int arr[], int si, int mid, int ei) {
    //     int temp[] = new int[ei - si + 1];
    //     int i = si; // iterator for left part;
    //     int j = mid + 1; // iteratoe for right part
    //     int k = 0; // iterator for temp arr

    //     while (i <= mid && j <= ei) {
    //         if (arr[i] < arr[j]) {
    //             temp[k] = arr[i];
    //             i++;
    //         } else {
    //             temp[k] = arr[j];
    //             j++;
    //         }
    //         k++;
    //     }
    //     // left part
    //     while (i <= mid) {
    //         temp[k++] = arr[i++];
    //     }

    //     while (j <= ei) {
    //         temp[k++] = arr[j++];
    //     }

    //     for (k = 0, i = si; k < temp.length; k++, i++) {
    //         arr[i] = temp[k];
    //     }
    // }

// -----------------quick Sort------

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1);
        quickSort(arr, pIdx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // to make place for els smaller that pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }

    public static void main(String[] args) {
        int arr[] = { 7, 9, 2, 4, 9, 0, 1, 3, 5, 1, 4, 5, 8, 4, 2, 1, 4, 5, 6, 8, 9 };
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}