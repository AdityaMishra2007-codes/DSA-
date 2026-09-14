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
        int sum=0;
        int carry=0;
        int t=0;
        ListNode ans=new ListNode();
        ListNode q=ans;
        while(l1!=null && l2!=null){
           t=l1.val+l2.val;
           sum=(t+carry)%10;
           carry=(t+carry)/10;
           ans.next=new ListNode(sum);
           ans=ans.next;
           l1=l1.next;
           l2=l2.next;
        }
        while(l1!=null){
            t=l1.val;
            sum=(t+carry)%10;
            carry=(t+carry)/10;
            ans.next=new ListNode(sum);
            ans=ans.next;
            l1=l1.next;
        }
          while(l2!=null){
            t=l2.val;
            sum=(t+carry)%10;
            carry=(t+carry)/10;
            ans.next=new ListNode(sum);
            ans=ans.next;
            l2=l2.next;
    }
    if(carry==1){
    ans.next=new ListNode(carry);
    }
    return q.next;
}
}//solved by adding each digit individually and keeping the track of carry while adding the last digit of sum+previous carry to the answer linked list .