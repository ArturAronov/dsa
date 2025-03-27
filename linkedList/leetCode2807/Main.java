package linkedList.leetCode2807;

public class Main {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode currentNode = head;
        ListNode nextNode = head.next;

        if(currentNode == null || nextNode == null) return head;

        Integer currentVal = currentNode.val;
        Integer nextVal = nextNode.val;
        Integer divisor = currentVal < nextVal ? currentVal : nextVal;

        while(divisor > 0) {
            if(currentVal % divisor == 0 && nextVal % divisor == 0) break;
            else divisor--;  
        }

        ListNode divisorNode = new ListNode(divisor, nextNode);
        head.next = divisorNode;

        insertGreatestCommonDivisors(nextNode);

        return head;
    }

    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Main main = new Main();
        
        // Test case: 18 -> 6 -> 10 -> 3
        ListNode head = new ListNode(18);
        head.next = new ListNode(6);
        head.next.next = new ListNode(10);
        head.next.next.next = new ListNode(3);

        System.out.println("Original list:");
        main.printList(head); 

        ListNode result = main.insertGreatestCommonDivisors(head); 
        
        System.out.println("After inserting GCDs:");
        main.printList(result); 
    }
}