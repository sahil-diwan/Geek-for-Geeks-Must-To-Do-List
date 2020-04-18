import java.util.Stack;

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
	
	void push(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	void printList(){
		Node n = head;
		while(n!=null){
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	
	boolean checkPallindrome(){
		Stack<Integer> s = new Stack<>();
		
		Node n = head;
		
		while(n!=null){
			s.add(n.data);
			n=n.next;
		}
		
		Node temp = head;
		
		while(temp!=null){
			if(s.pop()!=temp.data){
				return false;
				
			}
			
			temp = temp.next;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		LinkedList lList = new LinkedList();
		lList.push(5);
		lList.push(4);
		lList.push(3);
		lList.push(4);
		lList.push(5);
		
		System.out.println("Linked List");
		lList.printList();
		System.out.println();
		if(lList.checkPallindrome()){
			System.out.println("Pallindrome");
		}
		else{
			System.out.println("Not Pallindrome");
		}
		
	}
}
