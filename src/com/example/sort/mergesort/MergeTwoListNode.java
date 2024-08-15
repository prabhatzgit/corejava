package com.example.sort.mergesort;

import java.util.ArrayList;
import java.util.Collections;

public class MergeTwoListNode {

	public static void main(String[] args) {
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(4);

		ListNode list2 = new ListNode(1);
		list2.next = new ListNode(3);
		list2.next.next = new ListNode(4);

		mergeTwoList(list1, list2);
	}

	public static ListNode mergeTwoList(ListNode list1, ListNode list2) {
		ArrayList<Integer> list = new ArrayList<>();
		while (list1 != null) {
			list.add(list1.val);
			list1 = list1.next;
		}
		while (list2 != null) {
			list.add(list2.val);
			list2 = list2.next;
		}
		Collections.sort(list);

		// Creating a new list with sorted values
		ListNode temp = new ListNode(-1);
		ListNode head = temp;
		for (int value : list) {
			temp.next = new ListNode(value);
			temp = temp.next;
		}
		head = head.next;

		// Returning the resultant linked list
		return head;
	}

}