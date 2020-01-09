package data_structures_tutorials;

public class Runner {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(18);
		list.insert(12);
		list.insertAt(0, 55);
		list.deleteAt(2);
		
		
		list.show();

	}

}
