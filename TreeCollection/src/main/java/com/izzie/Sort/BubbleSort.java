package com.izzie.Sort;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                int temp=arr[j];
                if(arr[j]>arr[j+1]){
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        return arr;

    }
    public static void main(String[] args){
        int[] arr={6,2,4,5,1};
        int[] data_new= bubbleSort(arr);
        for(int data:data_new){
        System.out.print(data+" ");
        }

    }
}
