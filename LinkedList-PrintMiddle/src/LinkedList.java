
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
	
	public void push(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	public void printList(){
		Node n = head;
		while(n!=null){
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	
	public void printMiddle(){
		Node main_ptr = head;
		Node ref_ptr = head;
		
		if(head!=null){
			while(ref_ptr!=null && ref_ptr.next!=null){
				main_ptr=main_ptr.next;
				ref_ptr=ref_ptr.next.next;
			}
			System.out.println(main_ptr.data);
		}
	}
	
	public static void main(String[] args) {
		LinkedList lList = new LinkedList();
		lList.push(20); 
        lList.push(4); 
        lList.push(15); 
        lList.push(35);
        lList.push(3);
        System.out.println("Linked list");
        lList.printList();
        System.out.println();
        System.out.println("Middle element");
        lList.printMiddle();
	}
}
