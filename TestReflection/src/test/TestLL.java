package test;

public class TestLL {

	Node head;
	
	public void add(int data){
		Node t = new Node();
		t.setData(data);
		
		if(head == null){
			head = t;
		}
		else{
			Node p = head;
			while(p.getNext()!=null){
				p=p.getNext();
			}
			p.setNext(t);
		}
		
	}
	
	public void reverse(){
		
		if(head == null || head.getNext() == null)
			return;
		
		Node current = head,previous = null, next = head.getNext();
		
		while(current.getNext() != null) {
			
			current.setNext(previous);
			previous = current;
			current = next;
			next = next.getNext();
		}
		current.setNext(previous);
		head = current;
	}
	
	public void print(){
		Node p  = head;
		while(p!=null){
			System.out.print(p.getData()+" ");
			p = p.getNext();
		}
	}
	
	public static void main(String[] args) {
		TestLL testLL = new TestLL();
		//testLL.add(1);
		//testLL.add(2);
		//testLL.add(3);
		//testLL.add(4);
		//testLL.add(5);
		testLL.print();
		testLL.reverse();
		System.out.println("\n===>");
		testLL.print();
	}
}


class Node{
	
	private int data;
	private Node next;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Node [data=");
		builder.append(data);
		builder.append(", next=");
		builder.append(next);
		builder.append("]");
		return builder.toString();
	}
	
	
}