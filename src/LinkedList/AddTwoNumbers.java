package LinkedList;


  //Definition for singly-linked list.


import java.util.List;

public class AddTwoNumbers {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0,null);
        ListNode temp = head;
        while (l1!= null && l2!= null){
            int num1 = l1.val;
            int num2 = l2.val;
            if (num1 + num2 + temp.val > 9) {
                temp.val = (num1 + num2 + temp.val) - 10;
                temp.next = new ListNode(1,null);
            }
            else {
                temp.val = (num1 + num2 + temp.val);
                if (l1.next != null || l2.next != null)  {
                    temp.next = new ListNode(0,null);
                }

            }
            if (l1.next != null || l2.next != null)  {
                temp = temp.next;
            }
            l1 = l1.next;
            l2 = l2.next;


        }
        if (l1 != null) {
            while (l1 != null) {
                temp.val += l1.val;
                if (temp.val > 9){
                    temp.val = temp.val - 10;
                    temp.next = new ListNode(1,null);
                    temp = temp.next;
                }
                else if (l1.next != null) {
                    temp.next = new ListNode(0,null);
                    temp = temp.next;
                }
                l1 = l1.next;

            }
        }
        if (l2 != null) {
            while (l2 != null) {
                temp.val += l2.val;
                if (temp.val > 9){
                    temp.val = temp.val - 10;
                    temp.next = new ListNode(1,null);
                    temp = temp.next;
                }
                else if (l2.next != null) {
                    temp.next = new ListNode(0,null);
                    temp = temp.next;
                }
                l2 = l2.next;
            }
        }
        return head;
    }
}
