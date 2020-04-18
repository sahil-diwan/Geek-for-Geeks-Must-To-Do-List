import java.util.HashSet;

public class LinkedList {

	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
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
			n.next = null;
		}
	}
	
	public boolean detectLoop(Node n){
		HashSet<Node> s = new HashSet<>();
		while(n!=null){
			
			if(s.contains(n)){
				return true;
			}
			
			s.add(n);
			n=n.next;
		}
		return false;
	}
	
	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		llist.push(20); 
        llist.push(4); 
        llist.push(15); 
        llist.push(10); 
  
        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;
        
        
        if(llist.detectLoop(llist.head)){
        	System.out.println("Loop detected");
        }
        else{
        	System.out.println("No Loop detected");
        }
        
	}
}
