package Easy;

import java.util.List;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
     ListNode(int x, ListNode next) {
         this.val = x;
         this.next = next;
     }
}

public class LinkedList {
    public void deleteNode(ListNode node) {
        ListNode temp = node;
        ListNode prev = node;
        while (temp.next != null) {
            temp.val = temp.next.val;
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode prev = temp;
        int total = 0;
        while (temp != null) {
            total += 1;
            temp = temp.next;
        }
        temp = head;
        n = total - n + 1;
        int i = 1;
        while (temp != null) {
            if (i == n) {
                if (prev == temp) {
                    head = temp.next;
                    break;
                }
                prev.next = temp.next;
                break;
            }
            else {
                prev = temp;
                temp = temp.next;
                i += 1;
            }
        }
        return head;
    }
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        if (head.next == null) return false;

        ListNode slowPointer = head;
        ListNode fastPointer = head;
        int i = 0;
        while (fastPointer != null) {
            if (i % 2 == 1) {
                slowPointer = slowPointer.next;
                if (slowPointer == fastPointer) return true;
            }
            fastPointer = fastPointer.next;
        }

        return false;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null)  return head;
        if (head.next == null) return head;
        ListNode prev = null;
        ListNode current = head;
        ListNode next = head.next;

        while (!(next == null)) {
            current.next = prev;
            ListNode temp = next;
            next = next.next;
            ListNode temp2 = current;
            current = temp;
            prev = temp2;
        }
        current.next = prev;
        return current;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode newHead = null;
        ListNode tempHead = newHead;
        ListNode prev = tempHead;
        int val;
        while (temp1 != null && temp2 != null) {

            if (temp1.val <= temp2.val) {
                val = temp1.val;
                temp1 = temp1.next;
            } else {
                val = temp2.val;
                temp2 = temp2.next;
            }
            tempHead = new ListNode(val);
            tempHead.next = null;
            if (prev != null) prev.next = tempHead;
            prev = tempHead;
            if (newHead == null) newHead = tempHead;
            tempHead = tempHead.next;
        }
        if (temp2 != null) temp1 = temp2;
        while (temp1 != null) {
            tempHead = new ListNode(temp1.val);
            tempHead.next = null;
            if (prev != null) prev.next = tempHead;
            prev = tempHead;
            if (newHead == null) newHead = tempHead;
            tempHead = tempHead.next;
            temp1 = temp1.next;
        }
        return newHead;
    }
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        if (head.next == null) return true;

        int total = 0;
        ListNode temp = head;
        while (temp != null) {
            total += 1;
            temp = temp.next;
        }
        ListNode reverseHead = head;
        for (int i = 0; i < total/2; i++) {
            reverseHead = reverseHead.next;
        }
        reverseHead = reverseList(reverseHead);
        while (reverseHead != null && head != null) {
            if (reverseHead.val != head.val) return false;
            reverseHead = reverseHead.next;
            head = head.next;
        }
        return true;


    }

    public static void main(String[] args) {
        ListNode _9 = new ListNode(1);
        _9.next = null;
        ListNode _1 = new ListNode(1);
        _1.next = null;
        ListNode _5 = new ListNode(2);
        _5.next = _1;
        ListNode _4 = new ListNode(2);
        _4.next = _5;
        ListNode _11 = new ListNode(1);
        _11.next = _4;

        LinkedList linkedList = new LinkedList();

        //linkedList.deleteNode(_5);

        //ListNode head = linkedList.removeNthFromEnd(_9,1);

        ListNode list1_4 = new ListNode(4,null);
        ListNode list1_3 = new ListNode(3,list1_4);
        ListNode list1_2 = new ListNode(2,list1_3);

        ListNode list2_5 = new ListNode(5,null);
        ListNode list2_2 = new ListNode(2,list2_5);
        ListNode list2_1 = new ListNode(1,list2_2);
        ListNode list2_0 = new ListNode(1,list2_1);

        /*
        ListNode head = linkedList.mergeTwoLists(list1_2, list2_0);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }*/

        boolean result = linkedList.isPalindrome(_11);
        System.out.println(result);
    }
}
