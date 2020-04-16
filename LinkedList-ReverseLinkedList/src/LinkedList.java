// Reverse a Linked List using the 3 pointer approach
public class LinkedList {

	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void push(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head=new_node;
	}
	
	public void printList(){
		Node n = head;
		while(n!=null){
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	
	public void reverseLinkedList(){
		Node prev= null;
		Node current = head;
		Node next = null;
		
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
	}
	
	public static void main(String[] args) {
		LinkedList lList = new LinkedList();
		lList.push(20); 
        lList.push(4); 
        lList.push(15); 
        lList.push(35);
        System.out.println("Linked List values");
        lList.printList();
        System.out.println();
        System.out.println("Reverse Linked List");
        lList.reverseLinkedList();
        lList.printList();
        
	}
}
