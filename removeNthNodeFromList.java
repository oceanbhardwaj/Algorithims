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
        ListNode ans=null;
        if(head==null)
            return head;
        int count=0;
        ListNode curr=head;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        if(count==n && count==1)
            return null;
        
        int c1=count-n;
        if(c1==0)
            return head.next;
        int c=0;
        curr=head;
        while(curr!=null && c<c1)
        {
            c++;
            if(c==c1){
                ans=curr.next.next;
                curr.next=ans;
                break;
            }
            curr=curr.next;
        }
        return head;
    }
}
----------------------------------------------------------------------------------
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
        ListNode ans=new ListNode(0);
          ans.next=head;
        ListNode res=ans;
     
        ListNode slow=ans;
        ListNode fast=ans;
        for(int i=0;i<n+1;i++){
            fast=fast.next;
        }
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
         slow.next=slow.next.next;
        return ans.next;
        
    }
}