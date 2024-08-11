/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Genetic_arraylist;


 public class List<T> implements ListADT<T>,Iterable_interface<T>{
  
	// storage
	private T[] data;
	private int size;

	public List() {
		data =(T[]) new Object[10];
		size = 0;
	}
        
        
           public class ArrayIterator implements iterators<T>
     {
         private int index=0;
                 public boolean removeable=false;

        @Override
        
        public boolean hasNext() {
            return index<size;
        }

        @Override
        public T next() {
            if(index==size)
            {
                System.out.println("No next Elements");
            }
              removeable=true;   
            
           return data[index++];
        }

        @Override
        public void remove() {
           if(removeable==true)
           {
              List.this.remove(index-1);   
           }
           else
           {
               System.out.println("Nothing To Remove");
               return;
           }
               index--;
          removeable=false;
        }
         
     }
        @Override
           public iterators<T> iterator()
           {
               return new ArrayIterator();
           }

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return (size == 0);
	}
        

	@Override
        //joh value waha phari ha woh return karti ha
	public T get(int position) {
		if (position < 0 || position > size - 1) {
			throw new IndexOutOfBoundsException();
		}
		return data[position];
	}

	@Override
	public T set(int position, T value) {
		if (position < 0 || position > size - 1) {
			throw new IndexOutOfBoundsException();
		}
                //previosu value koh old variable amin rakh kah us index par new valur algai ah
		T oldValue = data[position];
		data[position] = value;
		return oldValue;
	}

	@Override
	public boolean add(int position, T value) {
		if (position < 0 || position > size) {
			 throw new IndexOutOfBoundsException();
			
		}
		// do we need to resize?
		if (size == data.length) {
			resize();
		}

		// shift items to make up space for insertion
		for (int i = size - 1; i >= position; i--) {
			data[i + 1] = data[i];
		}
		data[position] = value;
		size++;
		return true;
	}

	private void resize() {
		T[] expandedBackendStorage = (T[])new Object[size * 2];
		for (int i = 0; i < data.length; i++) {
			expandedBackendStorage[i] = data[i];
		}
		data = expandedBackendStorage;
	}

	@Override
	public T remove(int position) {
		if (position < 0 || position > size - 1) {
			throw new IndexOutOfBoundsException();
		}
		T valueRemoved = data[position];
//                System.out.println(size);
		for (int i = position; i <position+1; i++) {
			data[i] = data[i+1];
		}
		data[position] = null;
		size--;
		return valueRemoved;
	}

	public void printListContents() {
		for (int i = 0; i < size; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}

    @Override
    public boolean isFull() {
       return (size == data.length);
    }
	
	
}
