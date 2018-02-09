package CustomDataArchitectures;

//just need to finish commenting/javadoc and insert/remove pos
public class DoublyLinkedList{
	private IntNode head, tail; //head reference and tail reference to beginning and end of list
	private int size = 0; //size incremented every insert, decremented every remove
	
	
	public DoublyLinkedList(){ //empty constructor
		this.head = null;
		this.tail = null;
	}
	public boolean isEmpty(){
		return head == null;
	}
	public void posInsert(int value, int index){
		IntNode data = new IntNode(value);
		if(index == 1){
			headInsert(data);
			return;
		}
		IntNode cursor = head;
		for(int i = 2; i < size; i++){
			if(i == index){
				IntNode temp = cursor.getNext();
				cursor.setNext(data);
				data.setPrev(cursor);
				data.setNext(temp);
				temp.setPrev(data);
			}
			cursor = cursor.getNext();
		}
		size++;
	}
	public void posRemove(int pos){
		if(pos == 1){
			if(size == 1){
				head = tail = null;
				size = 0;
				return;
			}else{
				head = head.getNext();
				head.setPrev(null);
				size--;
				return;
			}
		}
		if(pos == size){
			if(size == 1){
				head = tail = null;
				size = 0;
				return;
			}else{
				tail = tail.getPrev();
				tail.setNext(null);
				size--;
			}
		}
		IntNode cursor = head.getNext();
		for(int i = 2; i < size; i++){
			if(i == pos){
				IntNode previous = cursor.getPrev();
				IntNode next = cursor.getNext();
				previous.setNext(next);
				next.setPrev(previous);
				size--;
				return;
			}
			cursor = cursor.getNext();
		}
	}
	public String toString(){
		IntNode cursor = head;
		String x = "[";
		if(!isEmpty()){
			if(size == 1){
				x += cursor.getData()+"";
			}else x += cursor.getData()+", ";
			while(cursor.hasNext()){
			cursor = cursor.getNext();
			if(!cursor.hasNext()){
				x += cursor.getData()+"";
			}else{
			x += cursor.getData() + ", ";
			}
			}
			}
		return x + "]";
}	
	public void headInsert(IntNode insert){
		if(isEmpty()){
			head = tail = insert;
		}else{
			head.setPrev(insert);
			insert.setNext(head);
			head = insert;
		}
		size++;
	}
	public void headInsert(int a){
		IntNode insert = new IntNode(a);
		if(isEmpty()){
			head = tail = insert;
		}else{
			head.setPrev(insert);
			insert.setNext(head);
			head = insert;
		}
		size++;
	}
	public void headRemove(){
		if(isEmpty()){
			head = tail = null;
		}else{
			head = head.getNext();
			head.setPrev(null);
			size--;
		}
	}
	public void tailRemove(){
		if(isEmpty()){
			head = tail = null;
		}else{
			tail = tail.getPrev();
			tail.setNext(null);
			size--;
		}
	}
	public void tailInsert(IntNode insert){
		if(isEmpty()){
			head = tail = insert;
		}else{
			insert.setPrev(tail);
			tail.setNext(insert);
			tail = insert;
		}
		size++;
	}
	public void tailInsert(int a){
		IntNode insert = new IntNode(a);
		if(isEmpty()){
			head = tail = insert;
		}else{
			insert.setPrev(tail);
			tail.setNext(insert);
			tail = insert;
		}
		size++;
		
	}
	public int getSize(){
		return this.size;
	}
	
}
