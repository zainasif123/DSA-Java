package List;

import java.util.List;

public class TestDataStructure {
	public static void main(String[] args) {
			
			List<Integer> myListStoringIntegers = new List<Integer>();
			myListStoringIntegers.add(0, 100);
			myListStoringIntegers.add(1, 200);
			myListStoringIntegers.add(2, 300);
			myListStoringIntegers.add(3, 400);
			myListStoringIntegers.add(0, 500);
			myListStoringIntegers.printListContents();
			System.out.println("Result of calling Get "+ myListStoringIntegers.get(3));
			System.out.println("Result of calling Set "+ myListStoringIntegers.set(2, 700));
			myListStoringIntegers.printListContents();
			for (int i = 0; i < 30; i++) {
				myListStoringIntegers.add(myListStoringIntegers.size(), i);
			}
			myListStoringIntegers.printListContents();

		
		
	}
}
