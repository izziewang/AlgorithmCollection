package com.izzie.simple;

import java.util.HashSet;
import java.util.Set;

public class HasCycle {
    /**
     * 给定一个链表，判断链表中是否有环。
     *
     * 进阶：
     * 你能否不使用额外空间解决此题
     */
public static boolean hasCycle1(ListNode head){
    Set<ListNode> set= new HashSet();
    ListNode point=head;
    while (point!=null){
        if(set.contains(point)){
            return  true;
        }
        set.add(point);
        point=point.next;

    }
    return false;
}
public static boolean hasCycle2(ListNode head){
    if (head==null) return false;
    if(head.next==null) return false;
    ListNode fast=head.next.next;
    ListNode slow=head.next;
    while (fast!=null){
        if(fast==slow){
            return true;
        }
        if(fast.next==null){
            return false;
        }
        fast=fast.next.next;
        slow=slow.next;
    }
    return false;

}
    public static boolean isCycle(ListNode head){
        ListNode nextNode=head;
        while (true){
            if(nextNode==null){
                return false;
            }else if(nextNode.next==head){
                return true;
            }
            nextNode=nextNode.next;
        }
    }

    public static void main(String[] args){
            //isCycle
            ListNode head=new ListNode(0,null);
            head.next=new ListNode(2,null);
            head.next.next=new ListNode(3,null);
             head.next.next.next=new ListNode(3,null);
            boolean iscycle=isCycle(head);
            System.out.println("iscycle "+iscycle);
            // hasCycle
            ListNode head1=new ListNode(0,null);
            head1.next=new ListNode(2,null);
            head1.next.next=new ListNode(3,null);
            head1.next.next.next=new ListNode(3,null);
            head1.next.next.next.next=head1.next.next;
            boolean has=hasCycle1(head1);

             System.out.println("has cycle1 "+has);
             boolean has2=hasCycle2(head1);
             System.out.println("has cycle2 "+has2);
             ListNode head2=null;
             boolean has3=hasCycle2(head2);
        System.out.println("has cycle2 "+has3);


    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(){
        val=0;
        next=null;
    }
    ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }
    public ListNode getNext(){
        return next;
    }
}
