public class MergeTwoLists {

    public static void main(String[] args) {
        ListNode b1 = new ListNode(4);
        ListNode a1 = new ListNode(2, b1);
        ListNode l1 = new ListNode(1, a1);

        ListNode b2 = new ListNode(4);
        ListNode a2 = new ListNode(3, b2);
        ListNode l2 = new ListNode(1, a2);

        ListNode listNode = mergeTwoLists(l1, l2);
        while (listNode.next != null){

            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }

        if (l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }else {
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}