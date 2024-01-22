package dev.redg.util;

import dev.redg.model.LinkedList;
import dev.redg.model.ListNode;

import java.util.HashSet;

/**
 * Utility class for LinkedList operations.
 */
public class LinkedListUtil {
    /**
     * Reverses the given linked list by adding nodes at the front from the original list.
     *
     * @param list the linked list to be reversed
     * @return the reversed linked list
     */
    public static LinkedList getReversedLinkedList(LinkedList list) {
        LinkedList reversedList = new LinkedList(new int[0]);
        ListNode currentNode = list.getHead();
        // Traverse across the nodes to invert them loop by loop.
        while(currentNode != null){
            ListNode newNode = new ListNode(currentNode.getVal());
            newNode.setNext(reversedList.getHead());
            reversedList.setHead(newNode);
            currentNode = currentNode.getNext();
        }
        return reversedList;
    }

    /**
     * Returns the middle element of a linked list by dividing the size (rightIndex) of the linkedList by 2.
     *
     * @param list the linked list
     * @return the middle element
     */
    public static ListNode getMidElement(LinkedList list){
        ListNode currentNode = list.getHead();
        int rightIndex = 0;
        int midIndex = 0;

        // Measuring the array by adding 1 to rightIndex everytime the next node pointer is not null.
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
            rightIndex++;
        }

        currentNode = list.getHead();

        // Determining the middle element by dividing the size by 2
        midIndex = rightIndex / 2;

        // Traversing the list to the middle element
        for (int i = 0; i < midIndex; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    /**
     * Removes duplicate nodes from a linked list by saving seen values inside a HashSet tu prevent redundancy and then
     * comparing elements from the original list and the HashSet to decide if the element is going to be added to a new
     * list.
     *
     * @param list the linked list from which duplicate nodes need to be removed
     * @return a new linked list with no duplicate nodes
     */
    public static LinkedList removeDuplicates(LinkedList list){
        HashSet<Integer> seenNodeValues = new HashSet<>();
        LinkedList noDuplicatesList = new LinkedList(new int[0]);
        ListNode currentNode = list.getHead();
        ListNode lastNode = null;
        while (currentNode != null) {

            // Validate if the number has not been seen before
            if (!seenNodeValues.contains(currentNode.getVal())) {

                seenNodeValues.add(currentNode.getVal());

                // Create new node with current value.
                ListNode newNode = new ListNode(currentNode.getVal());

                // Validate last node content to decide if append a new node or set its head.
                if (lastNode == null) {
                    noDuplicatesList.setHead(newNode);
                } else {
                    lastNode.setNext(newNode);
                }
                lastNode = newNode;
            }

            // Move to next node in the original list.
            currentNode = currentNode.getNext();
        }
        return noDuplicatesList;
    }
}
