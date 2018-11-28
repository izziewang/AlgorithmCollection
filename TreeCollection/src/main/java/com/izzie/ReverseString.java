package com.izzie;

public class ReverseString {
    public static String reverseString(String s){
        char[] c=new char[s.length()];
        int j=0;
        for(int i=s.length()-1;i>=0;i--){

            c[j]=s.charAt(i);
            j++;
        }
        return new String(c);
    }
    public static void main(String[] args){
        String s="hello";

        String s1=reverseString(s);
        System.out.println(s1);
    }
}
