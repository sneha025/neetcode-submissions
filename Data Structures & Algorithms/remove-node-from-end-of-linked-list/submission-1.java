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
    public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode reverseHead=reverseList(head);
            ListNode prev=null;
            ListNode temp = reverseHead;
            int count=1;
            while(temp!=null){
                if(count==n){
                    if(prev==null){
                        ListNode nextnode =temp.next;
                            temp.next=null;
                            return reverseList(nextnode);
                    }else{
                    ListNode nextNode = temp.next;  
                    temp.next=null;
                    prev.next=nextNode;
                    return reverseList(reverseHead);
                    }
                    
                }else{
                    prev=temp;
                    temp=temp.next;
                    count++;
                }
            }
            return reverseList(prev);
    }

    public ListNode reverseList(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode nextNode=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nextNode;
        }
        return prev;
    }
}
