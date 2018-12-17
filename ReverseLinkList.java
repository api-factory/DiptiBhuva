package com.example;

class ReverseLinkList { 

	static Node head; 

	static class Node { 

		int data; 
		Node next; 

		Node(int d) { 
			data = d; 
			next = null; 
		} 
	} 

	
	Node reverseLL(Node curr, Node prev) { 

		
		if (curr.next == null) { 
			head = curr; 
			curr.next = prev; 
			return null; 
		} 

	
		Node next1 = curr.next; 		
		curr.next = prev; 
		reverseLL(next1, curr); 
		return head; 
	} 

	
	void printLinkedList(Node node) { 
		while (node != null) { 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
	} 

	public static void main(String[] args) { 
		ReverseLinkList list = new ReverseLinkList(); 
		list.head = new Node(111); 
		list.head.next = new Node(222); 
		list.head.next.next = new Node(333); 
		list.head.next.next.next = new Node(444); 
		
		
		list.printLinkedList(head); 
		Node res = list.reverseLL(head, null); 
		System.out.println(""); 
		System.out.println(""); 
		System.out.println("Reversed linked list "); 
		list.printLinkedList(res); 
	} 
} 

