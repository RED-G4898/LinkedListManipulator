package dev.redg.model;

/**
 * ListNode represents a node in a linked list. Each node holds an integer value and a reference to the next node.
 */
public class ListNode {
    private int val;
    private ListNode next;

    public ListNode(int val){
        this.val = val;
        this.next = null;
    }

    /**
     * Retrieves the value of the node.
     *
     * @return the value of the node
     */
    public int getVal() {
        return val;
    }

    /**
     * Retrieves the next node in the linked list.
     *
     * @return the next node in the linked list
     */
    public ListNode getNext() {
        return next;
    }

    /**
     * Sets the value of the current ListNode.
     *
     * @param val the new value to be set
     */
    public void setVal(int val) {
        this.val = val;
    }

    /**
     * Sets the next node in the linked list.
     *
     * @param next the next node in the linked list
     */
    public void setNext(ListNode next) {
        this.next = next;
    }
}
