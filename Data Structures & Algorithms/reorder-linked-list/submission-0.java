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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast =head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode dummyHead =reverseList(slow.next);
        slow.next=null;
        ListNode p1=head;
        ListNode p2=dummyHead;;
        while(p2!=null){
            ListNode temp2=p2.next;
            ListNode temp1 =p1.next;
             p1.next=p2;
             p2.next=temp1;
             p1=temp1;
             p2=temp2;
        }
        
        
    }
    public ListNode reverseList(ListNode head){

        ListNode temp =head;
        ListNode prev=null;

        while(temp!=null){
            ListNode nextNode =temp.next;
            temp.next=prev;
            prev=temp;
            temp=nextNode;
        }

        return prev;
    }
}
