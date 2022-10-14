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
    public ListNode deleteMiddle(ListNode head) {
        
        if(head==null || head.next==null)
            return null;
    
        int count =0;
        int mid=0;
        
        ListNode falsy=new ListNode(-1);
        falsy.next=head;
        
        ListNode start=head;
        
        ListNode temp=falsy;
        
        while(head!=null){
            count++;
            if(mid!=count/2){
              mid++;
              temp=temp.next;
            }
            head=head.next;
        }
        
        temp.next=temp.next.next;
        
        return start;
    }
    
    
}