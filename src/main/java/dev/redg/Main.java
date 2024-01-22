/*
 * This code project corresponds to an interview technical assessment, the following are the requierements in order to
 * achieve this part of the assestment:
 * 1. Create a method to invert the order of the nodes.
 * 2. Write a method to find the middle node of the list.
 * 3. implement a method to delete duplicated node values as they appear.
 * 4. Write about optimization of code.
 */

package dev.redg;

import dev.redg.model.LinkedList;
import dev.redg.util.LinkedListUtil;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(new int[]{1, 9, 8, 5, 1, 6, 4, 4, 2, 7, 3});

        System.out.println("Original list: " + list);
        System.out.println("Reversed list: " + LinkedListUtil.getReversedLinkedList(list));
        System.out.println("Mid list value: " + LinkedListUtil.getMidElement(list).getVal());
        System.out.println("No redundancy list: " + LinkedListUtil.removeDuplicates(list));
    }
}

/*
 * Optimizations:
 * 1. I considered refactoring the getMidElement() and removeDuplicates() methods, but at the moment, I can't figure out
 * a way to do this.
 * a. Maybe a way to refactor the mentioned methods should be to divide the functionality of inserting new nodes to the
 * list.
 * 2. I think that some names, like getMidElement(), should be more concise and descriptive.
 * 3. I have made some code modifications to the proposed ListNode class to adhere to the encapsulation principle of
 * OOP.
 *
 * Notes:
 * 1. I tried to adhere closely to the test requirements, avoiding the addition of extra methods or modifications to the
 * proposed ListNode class. For example, I refrained from implementing methods related to list node insertions.
 *
 * 2. I decided not to perform NullPointerException validations, considering that the list's creation and instantiation
 * are handled in the code and no user input is involved, thus avoiding the implementation of unnecessary methods.
 */