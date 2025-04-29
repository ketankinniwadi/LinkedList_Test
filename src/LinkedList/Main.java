package LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

        System.out.println("Inserting at head: 10, 20, 30");
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);

        System.out.println("Current List:");
        list.DisplayList();

        System.out.println("\nInserting at tail: 40, 50");
        list.insertAtTail(40);
        list.DisplayList();

        list.insertAtTail(50);

        System.out.println("Updated List:");
        list.DisplayList();

	}

}
