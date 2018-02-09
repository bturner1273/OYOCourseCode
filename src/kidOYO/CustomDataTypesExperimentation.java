package kidOYO;
import CustomDataArchitectures.*;

public class CustomDataTypesExperimentation {
	public static void main(String[] args){
		DoublyLinkedList a = new DoublyLinkedList();
		System.out.println(a);
		a.headInsert(new IntNode(5));
		System.out.println(a);
		a.headInsert(4);
		System.out.println(a);
		a.headInsert(3);
		System.out.println(a);
		a.posInsert(2, 2);
		System.out.println(a);
		a.tailInsert(17);
		System.out.println(a);
		a.posRemove(5);
		System.out.println(a);
	}
}
