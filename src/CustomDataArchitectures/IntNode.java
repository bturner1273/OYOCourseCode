package CustomDataArchitectures;

public class IntNode {
	int data;
	IntNode next;
	IntNode prev;
	
	public IntNode(int data){
		this.data = data;
		this.prev = null;
		this.next = null;
		
	}
	public IntNode(){
		this.data = (Integer) null;
		this.prev = null;
		this.next = null;
	}
	
	public IntNode(int data, IntNode prev, IntNode next){
		this.data = data;
		this.prev = prev;
		this.next = next;
	}
	public boolean hasNext(){
		return this.next != null;
	}
	public int getData(){
		return data;
	}
	public void setData(int data){
		this.data = data;
	}
	public IntNode getPrev(){
		return prev;
	}
	public void setPrev(IntNode prev){
		this.prev = prev;
	}
	public IntNode getNext(){
		return next;
	}
	public void setNext(IntNode next){
		this.next = next;
	}
}
