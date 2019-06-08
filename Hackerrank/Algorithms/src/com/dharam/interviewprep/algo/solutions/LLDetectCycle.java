package com.dharam.interviewprep.algo.solutions;

public class LLDetectCycle {

	class Node {
		int data;
		Node next;
	}

	boolean hasCycle(Node head) {
		if (head == null)
			return false;
		Node p = head;
		Node q = p;
		while (p.next != null && q.next != null && q.next.next != null) {
			p = p.next;
			q = q.next.next;
			if (p == q)
				return true;
		}

		return false;
	}

}
