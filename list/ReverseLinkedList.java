package list;

public class ReverseLinkedList {

	public static void main(String[] args) {
		
		// create the list
		Node next = new Node(null, "10");
		Node head = null;
		Node node = null;
		for (int i = 9; i >= 0; i--) {
			node = new Node(next, "" + i);
			next = node;
			if (i == 0) {
				head = node;
			}
		}
		
		node = head;
		System.out.println(node.getName());
		while (node.next != null) {
			node = node.next;
			System.out.println(node.getName());
		}
		
		node = reverse(head);
		System.out.println(node.getName());
		while (node.next != null) {
			node = node.next;
			System.out.println(node.getName());
		}
	}
	
	/**
	 * @return the new head Node
	 */
	public static Node reverse(Node head) {
		Node before = null;
		Node next = null;
		Node tmp = head;
		while (tmp != null) {
		    next = tmp.next;
		    tmp.next = before;
		    before = tmp;
		    tmp = next;
		}
		head = before;
		
		return head;
	}

	private static class Node {
		
		private Node next;
		private String name;
		
		Node(Node next, String name) {
			this.next = next;
			this.setName(name);
		}
		
		public Node getNext() {
			return this.next;
		}
		
		public void setNext(Node next){
			this.next = next;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
}
