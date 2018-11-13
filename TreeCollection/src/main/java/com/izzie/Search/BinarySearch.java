package com.izzie.Search;

public class BinarySearch {

    public static boolean binarySearch(int[] data, int key, int left, int right) {
        if(left>=right){
            return false;
        }
        int mid = (left + right) / 2;
        if (key == data[mid]) {
            return true;
        } else if (key < data[mid]) {
            right = mid;
        } else {
            left = mid;
        }
        return binarySearch(data, key, left, right);


    }
    public static int binarySearch1(int[]data,int key){
        int left=0;
        int right=data.length-1;
        int mid;
        while (left<=right){
            mid=(left+right)/2;
            if (key == data[mid]) {
                return key;
            } else if (key < data[mid]) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] data = {1, 3, 4, 9, 10, 12, 12, 14, 20, 21};
        boolean a = binarySearch(data, 9, 0, data.length - 1);
        boolean t = binarySearch(data, 12, 0, data.length - 1);
        boolean m = binarySearch(data, 0, 0, data.length - 1);
        System.out.println("check " + a);
        System.out.println("check " + t);
        System.out.println("check " + m);
        int a1=binarySearch1(data, 9);
        int t1=binarySearch1(data, 12);
        int m1=binarySearch1(data, 0);
        System.out.println("check " + a1);
        System.out.println("check " + t1);
        System.out.println("check " + m1);
    }
}
