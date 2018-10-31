package com.izzie.Sort;

public class QuickSort {

   public static void quickSort(int[] arr,int left,int right){
       int i=left;int j=right;
       if(i>=j){
           return ;
       }
       //left有可能outofbound
       int key=arr[left];

       while (i<j){
           while (i<j&&key<=arr[j]){
               j--;
           }
           if(i<j) {
               arr[i] = arr[j];
           }
           while (i<j&&key>=arr[i]){
               i++;
           }
           if(i<j) {
               arr[j] = arr[i];
           }
       }
       arr[i]=key;

       quickSort(arr,left,i-1);
       quickSort(arr,i+1,right);
   }
   public static void quickSort2(int[] arr,int left,int right){
       int i=left;int j=right;
       int key=arr[i];
       while (i<j){
           while (i<j&&key<=arr[j]){
               j--;
           }
           if(i<j){
               arr[i]=arr[j];
           }
           while (i<j&&key>=arr[i]){
               i++;
           }
           if(i<j){
               arr[j]=arr[i];
           }
       }
       arr[i]=key;
       if(left<i) {quickSort2(arr,left,i-1);;}
       if(i<right){quickSort2(arr,i+1,right);}
   }
   public static void main(String[] args){
       System.out.println("sort1: ");
       int[] arr1={6,2,4,5,1};
       quickSort(arr1,0,arr1.length-1);
       for(int data:arr1){
           System.out.print(data+" ");
       }
       System.out.println("\nsort2: ");
       int[] arr2={6,2,4,5,1,4};
       quickSort(arr2,0,arr2.length-1);
       for(int data:arr2){
           System.out.print(data+" ");
       }
   }
}
