
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
	
	
	void printList(){
		Node n = head;
		while(n!=null){
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	
	void push(int new_data){
		Node new_node = new Node(new_data);
		new_node.next =  head;
		head = new_node;
	}
	
	public void pairWiseSwap(){
		Node temp = head;
		while(temp!=null && temp.next!=null){
			int k = temp.data;
			temp.data = temp.next.data;
			temp.next.data = k;
			temp=temp.next.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedList lList = new LinkedList();
		lList.push(6);
		lList.push(5);
		lList.push(4);
		lList.push(3);
		lList.push(2);
		lList.push(1);
		System.out.println("Linked list");
		lList.printList();
		System.out.println();
		System.out.println("After Pairwise swap in Linked List");
		lList.pairWiseSwap();
		lList.printList();
		
	}
}
