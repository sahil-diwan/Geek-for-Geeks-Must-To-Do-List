
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
		new_node.next=head;
		head=new_node;
	}
	
	public void printList(){
		Node n = head;
		while(n!=null){
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	
	public void printNthFromLast(int n){
		Node main_ptr=head;
		Node ref_ptr=head;
		
		int count = 0;
		if(head!=null){
			while(count<n){
				if(ref_ptr==null){
					System.out.println(n+" is greater than number of nodes in the list");
					return;
				}
				ref_ptr=ref_ptr.next;
				count++;
			}
			
			while(ref_ptr!=null){
				main_ptr=main_ptr.next;
				ref_ptr=ref_ptr.next;
			}
			
			System.out.println("Node no. "+n+" from last is "+main_ptr.data);
		}
	}
	
	public static void main(String[] args) {
		LinkedList lList = new LinkedList();
		lList.push(20);
		lList.push(14);
		lList.push(15);
		lList.push(35);
		
		System.out.println("Linked List Input");
		lList.printList();
		System.out.println();
		lList.printNthFromLast(2);
		
		
	}
}
