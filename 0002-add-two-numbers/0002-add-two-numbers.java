/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        return adding(l1,l2,0);
        
    }
    public static ListNode adding(ListNode l1,ListNode l2,int carry){
        
        if(l1==null && l2==null && carry==0)return null;
        
        int temp1=(l1==null)?0:l1.val;
        int temp2=(l2==null)?0:l2.val;
        
        int sum=temp1+temp2+carry;
        
        ListNode node=new ListNode(sum%10);
        
        if(l1!=null)l1=l1.next;
        if(l2!=null)l2=l2.next;
        
        node.next=adding(l1,l2,sum/10);
            
        return node;
        
    }
}