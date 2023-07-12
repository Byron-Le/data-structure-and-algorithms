package com.byron.algorithm.sort;

import java.util.Arrays;

public class testMain {
    public static void main(String[] args) {
        int[] array1 ={8,91,32,1211,43,22,121,323,11};
        int[] array2 ={17,43,9,8};
//      quickSort(array2,0,array2.length-1);
//        int[] helper = copy(array2);
//        mergeSort(array2, helper, 0, array2.length - 1);
        InsertionSort(array2);
        System.out.println(Arrays.toString(array2));
    }
    public static void InsertionSort(int[] a){
        for (int i=1;i<a.length;i++){
            int cur = a[i];
            int insertIndex = i-1;
            while (insertIndex >= 0 && a[insertIndex] > cur){
                a[insertIndex+1] = a[insertIndex];
                insertIndex--;
            }
            a[insertIndex+1] = cur;
        }
    }

//    public static void quickSort(int[] a,int l, int r){
//        if(l>=r) return;
//        int partitionIndex = partition(a,l,r);
//        quickSort(a,l,partitionIndex-1);
//        quickSort(a,partitionIndex+1,r);
//    }
//    //import array,l,r
//    public static int partition(int[] a,int l, int r){
//        //defined pivot
//        int pivot = a[r];
//        int leftIndex = l;
//        int rightIndex = r-1;
//        while (true){
//            while (leftIndex < rightIndex && a[leftIndex] <= pivot){
//                leftIndex++;
//            }
//            while (rightIndex >= leftIndex && a[rightIndex] > pivot){
//                rightIndex--;
//            }
//            if (leftIndex > rightIndex) break;
//            swap(a,leftIndex,rightIndex);
//        }
//        swap(a,leftIndex,r);
//        return leftIndex;
//    }
//
//    public static void swap(int[] a, int l, int r){
//        int temp = a[l];
//        a[l] = a[r];
//        a[r] = temp;
//    }


    public static void mergeSort(int[] array, int[] helper, int left, int right) {
        //递归结束条件
        if(right - left < 1) return;
        int mid = left + (right - left) / 2;
        mergeSort(array, helper, left, mid);
        mergeSort(array, helper, mid + 1, right);
        merge(array, helper, left, mid, right);
    }
    public static void merge(int[] array, int[] helper, int left, int mid, int right) {
        for(int i = left; i <= right; i++) {
            helper[i] = array[i];
        }
        int leftStart = left;
        int rightStart = mid + 1;
        for (int i = left; i <= right; i++) {
            if (leftStart > mid) {
                array[i] = helper[rightStart++];
            } else if (rightStart > right) {
                array[i] = helper[leftStart++];
            } else if (helper[leftStart] < helper[rightStart]) {
                array[i] = helper[leftStart++];
            } else {
                array[i] = helper[rightStart++];
            }
        }
    }
    public static int[] copy(int[] array) {
        int[] newArray = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
}
