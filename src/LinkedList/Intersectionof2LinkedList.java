package LinkedList;

public class Intersectionof2LinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode head = null;
        ListNode tempB = headB;
        while (headA != null) {
            tempB = headB;
            while (tempB != null) {
                if (headA == tempB) {
                    return headA;
                }
                tempB = tempB.next;
            }
            headA = headA.next;

        }
        return head;
    }
}
