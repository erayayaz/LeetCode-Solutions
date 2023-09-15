package org.example;

public class Main {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;


        ListNode node12 = new ListNode(5);
        ListNode node22 = new ListNode(6);
        ListNode node32 = new ListNode(4);
        node12.next = node22;
        node22.next = node32;
        System.out.println(addTwoNumbers(node1, node12));

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dum = new ListNode();
        ListNode temp=dum;
        int carry=0;

        while(l1!=null || l2!=null || carry==1){
            int sum=0;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;
            ListNode node=new ListNode(sum % 10);
            temp.next=node;
            temp=temp.next;

        }
        return dum.next;
    }
}