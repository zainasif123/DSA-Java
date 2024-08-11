package List;

import Genetic_arraylist.ListADT;

public class List<T> implements ListADT<T>{

	// storage
	private T[] backendStorage;
	private int totalItems;

	public List() {
		backendStorage =(T[]) new Object[10];
		totalItems = 0;
	}

	@Override
	public int size() {
		return totalItems;
	}

	@Override
	public boolean isEmpty() {
		return (totalItems == 0);
	}

	@Override
	public T get(int position) {
		if (position < 0 || position > totalItems - 1) {
			throw new IndexOutOfBoundsException();
		}
		return backendStorage[position];
	}

	@Override
	public T set(int position, T value) {
		if (position < 0 || position > totalItems - 1) {
			throw new IndexOutOfBoundsException();
		}
		T oldValue = backendStorage[position];
		backendStorage[position] = value;
		return oldValue;
	}

	@Override
	public boolean add(int position, T value) {
		if (position < 0 || position > totalItems) {
			// throw new IndexOutOfBoundsException();
			return false;
		}
		// do we need to resize?
		if (totalItems == backendStorage.length) {
			resize();
		}

		// shift items to make up space for insertion
		for (int i = totalItems - 1; i >= position; i--) {
			backendStorage[i + 1] = backendStorage[i];
		}
		backendStorage[position] = value;
		totalItems++;
		return true;
	}

	private void resize() {
		T[] expandedBackendStorage = (T[])new Object[totalItems * 2];
		for (int i = 0; i < backendStorage.length; i++) {
			expandedBackendStorage[i] = backendStorage[i];
		}
		backendStorage = expandedBackendStorage;
	}

	@Override
	public T remove(int position) {
		if (position < 0 || position > totalItems - 1) {
			throw new IndexOutOfBoundsException();
		}
		T valueRemoved = backendStorage[position];
		for (int i = position; i <totalItems-1; i++) {
			backendStorage[i] = backendStorage[i+1];
		}
		backendStorage[position] = null;
		totalItems--;
		return valueRemoved;
	}

	public void printListContents() {
		for (int i = 0; i < totalItems; i++) {
			System.out.print(backendStorage[i]+" ");
		}
		System.out.println();
	}

    @Override
    public boolean isFull() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
	
	
}
