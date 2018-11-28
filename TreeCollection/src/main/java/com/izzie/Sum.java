package com.izzie;

import java.util.HashMap;
import java.util.Map;

public class Sum {

        public static int[] twoSum(int[] nums, int target) {
            int [] tags=new int[2];
            Map map=new HashMap();
            for(int i=0;i<nums.length;i++){
                map.put(i,nums[i]);
            }
            for(Object key:map.keySet()){
                int val1=Integer.parseInt(map.get(key).toString());
                int val2=target- val1;
                int tag1=Integer.parseInt(key.toString());
                if(map.containsValue(val2)){
                    for(Object key1:map.keySet()){
                        int val=Integer.parseInt(map.get(key1).toString());
                        int tag2=Integer.parseInt(key1.toString());
                        if(val==val2&&tag2!=tag1){
                            tags[1]=tag1;
                            tags[0]=tag2;
                        }
                    }

                }

            }
            return tags;

        }
    public static int[] twoSum1(int[] nums, int target) {
        int [] tags=new int[2];
        Map map=new HashMap();
        for(int i=0;i<nums.length;i++){
            int val=target-nums[i];
            if(map.containsKey(val)){
                tags[0]=Integer.parseInt(map.get(val).toString());
                tags[1]=i;
                break;
            }
            map.put(nums[i],i);
        }
        return tags;
    }

public static void main(String[] args){
   int[] nums = {2, 7, 11, 15};
   int[] tags=twoSum1(nums,9);
   for(int tag: tags){
       System.out.println(tag);
   }

    int[] nums1 = {3, 3};
    tags=twoSum1(nums1,6);
    for(int tag: tags){
        System.out.println(tag);
    }
}
}
