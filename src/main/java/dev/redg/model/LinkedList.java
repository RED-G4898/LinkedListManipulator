package dev.redg.model;

/**
 * LinkedList represents a self implementation of linked list data structure in order to prove knowledge as part of
 * an interview test.
 */
public class LinkedList {
    private ListNode head;

    /**
     * Constructs a LinkedList object with the given array of elements.
     *
     * @param elements an array of integers representing the elements to be added to the linked list
     */
    public LinkedList(int[] elements){
        head = null;
        for (int i = elements.length - 1; i >= 0; i--) {
            ListNode newNode = new ListNode(elements[i]);
            newNode.setNext(head);
            head = newNode;
        }
    }

    /**
     * Retrieves the head node of the linked list.
     *
     * @return the head node of the linked list
     */
    public ListNode getHead() {
        return head;
    }

    /**
     * Sets the head of the linked list to the specified ListNode.
     *
     * @param head the new head ListNode to be set
     */
    public void setHead(ListNode head) {
        this.head = head;
    }

    /**
     * Returns a string representation of the linked list.
     *
     * @return a string representation of the linked list
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode temp = head;
        while (temp != null) {
            sb.append(temp.getVal());
            temp = temp.getNext();
            if (temp != null) {
                sb.append(" | ");
            }
        }
        return "| " + sb.toString() + " |";
    }
}
