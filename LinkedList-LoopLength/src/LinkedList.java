
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
	
	static int countNodes(Node n){
		int count = 1;
		Node temp = n;
		while(temp.next!=n){
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	int detectLoop(Node n){
		Node slow_ptr = n;
		Node fast_ptr = n;
		
		while(slow_ptr!=null && fast_ptr!=null && fast_ptr.next!=null){
			slow_ptr = slow_ptr.next;
			fast_ptr = fast_ptr.next;
			
			if(slow_ptr==fast_ptr){
				return countNodes(slow_ptr);
			}
		}
		return 0;
	}
	
	
	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		llist.push(20); 
        llist.push(4); 
        llist.push(15); 
        llist.push(10); 
  
        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;
        
        System.out.println("Length of loop is "+llist.detectLoop(llist.head));
	}
}
