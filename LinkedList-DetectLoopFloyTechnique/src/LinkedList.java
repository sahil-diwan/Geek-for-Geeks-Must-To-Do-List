
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
			System.out.println(n.data);
			n=n.next;
		}
	}
	
	boolean detectLoop(Node n){
		Node slow_ptr = n;
		Node fast_ptr = n;
		
		while(slow_ptr!=null&&fast_ptr!=null&&fast_ptr.next!=null){
			slow_ptr=slow_ptr.next;
			fast_ptr=fast_ptr.next.next;
			if(slow_ptr==fast_ptr){
				return true;
			}
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
        	System.out.println("Loop exists");
        }
        else{
        	System.out.println("No Loop Exists");
        }
	}
}
