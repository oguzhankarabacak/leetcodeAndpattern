package LinkedList;


public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        if (head.next ==null) return head;
        ListNode oddEvenHead = new ListNode(0,null);
        ListNode tempHead = head;
        ListNode tempOddEvenHead = oddEvenHead;
        while (tempHead.next != null) {
            tempOddEvenHead.next = new ListNode(0,null);
            tempOddEvenHead = tempOddEvenHead.next;
            tempHead = tempHead.next;
        }
        tempHead = head;
        tempOddEvenHead = oddEvenHead;
        int counter = 0;
        while (tempHead != null) {
            if (counter % 2 == 0) {
                tempOddEvenHead.val = tempHead.val;
                tempOddEvenHead = tempOddEvenHead.next;
            }
            counter += 1;
            tempHead = tempHead.next;

        }
        counter = 0;
        tempHead = head;
        while (tempHead != null) {
            if (counter % 2 == 1) {
                tempOddEvenHead.val = tempHead.val;
                tempOddEvenHead = tempOddEvenHead.next;

            }
            counter += 1;
            tempHead = tempHead.next;

        }

        return oddEvenHead;
    }
}
