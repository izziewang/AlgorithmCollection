package com.izzie;

public class toLower {
    public static String toLowerCase(String str){
        char[] c=str.toCharArray();
        for(int i=0;i<c.length;i++){

            if(c[i]>='A' && c[i]<='Z'){
                c[i]=(char)(c[i]+32);
            }
        }
        return new String(c);
    }
    public static void main(String[] args){
        String s="Hello Izzie";
        String s1=toLowerCase(s);
        System.out.println(s1);
    }
}
