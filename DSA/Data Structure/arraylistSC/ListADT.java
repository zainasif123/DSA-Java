package List;
// ADT for the List
public interface ListADT<E> {
	// Domain : OPEN
	// OPERATIONS	
	int size();
	boolean isEmpty();
	E get(int position);
	E set(int position, E value);
	boolean add(int position, E value);
	E remove(int position);
	// AXIOMS: write test cases
}

