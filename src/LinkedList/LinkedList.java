package LinkedList;

import Node.Node;

public class LinkedList {
	private Node head;
	private int size;

	public LinkedList(Integer data) {
		head=new Node(data);
		size = 1;
	}
	public LinkedList() {
		head=null;
		size=0;
	}
	
	public void insertAtHead(Integer data) {
		if(head==null) {
			head = new Node(data);
			size++;
			return;
		}
		Node newNode = new Node(data);
		newNode.setM_next(head);
		head = newNode;
		
	}
	
	public void insertAtTail(Integer data) {
		if(head==null) {
			head = new Node(data);
			return;
		} 
		Node newNode = new Node(data);
		Node temp = head;
		while(temp.getM_next()!=null) {
			temp = temp.getM_next();
			
		}
		temp.setM_next(newNode);
	}
	
	public void DeleteAtHead() {
		if(head==null) {
			System.out.println("Linked List is Empty");
			return;
		}
		if(head.getM_next()==null) {
			head = null;
			return;
		}
	
		head=head.getM_next();
	}
	
	public void DeleteAtTail() {
		if(head==null) {
			System.out.println("Linked List is Empty");
			return;
		}
		if(head.getM_next()==null) {
			head = null;
			return;
		}
		Node temp = head;
		while(temp.getM_next().getM_next()!=null) {
			temp = temp.getM_next();
		}
		temp.setM_next(null);
	} 
	// Insert at specific position
	public void InsertAtPos(int pos, int data) {
	    if (pos < 1 || pos > size + 1) {
	        System.out.println("Invalid position");
	        return;
	    }
	    if (pos == 1) {
	        insertAtHead(data);
	        return;
	    }
	    Node newNode = new Node(data);
	    Node temp = head;
	    for (int i = 1; i < pos - 1; i++) {
	        temp = temp.getM_next();
	    }
	    newNode.setM_next(temp.getM_next());
	    temp.setM_next(newNode);
	    size++;
	}

	// Delete at specific position
	public void DeleteAtPos(int pos) {
	    if (head == null) {
	        System.out.println("Linked List is Empty");
	        return;
	    }
	    if (pos < 1 || pos > size) {
	        System.out.println("Invalid position");
	        return;
	    }
	    if (pos == 1) {
	        DeleteAtHead();
	        return;
	    }
	    Node temp = head;
	    for (int i = 1; i < pos - 1; i++) {
	        temp = temp.getM_next();
	    }
	    temp.setM_next(temp.getM_next().getM_next());
	    size--;
	}

	// Search for an element
	public boolean search(int key) {
	    Node temp = head;
	    while (temp != null) {
	        if (temp.getM_data() == key) {
	            return true;
	        }
	        temp = temp.getM_next();
	    }
	    return false;
	}

	// Reverse the linked list
	public void reverse() {
	    Node prev = null;
	    Node current = head;
	    Node next = null;
	    while (current != null) {
	        next = current.getM_next();
	        current.setM_next(prev);
	        prev = current;
	        current = next;
	    }
	    head = prev;
	}

	// Get the size of the linked list
	public int getSize() {
	    return size;
	}

	// Check if list is empty
	public boolean isEmpty() {
	    return head == null;
	}

	// Find middle element (slow and fast pointer approach)
	public int findMiddle() {
	    if (head == null) {
	        throw new RuntimeException("List is empty");
	    }
	    Node slow = head;
	    Node fast = head;
	    while (fast != null && fast.getM_next() != null) {
	        slow = slow.getM_next();
	        fast = fast.getM_next().getM_next();
	    }
	    return slow.getM_data();
	}

	
	public void DisplayList() {
		if(head==null) {
			System.out.println("LinkedList is Empty");
		}
		Node temp = head;
		while(temp.getM_next()!=null) {
			System.out.println(temp.getM_data());
			temp = temp.getM_next();	
		}
		System.out.println(temp.getM_data());
	}
	
	

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

}
