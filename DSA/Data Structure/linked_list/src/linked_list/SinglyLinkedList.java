/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked_list;

/**
 *
 * @author ARC
 */

public class SinglyLinkedList<T> {

public class Node<E> {
	E element;
	Node<E> next;
	
	public Node(E e, Node<E> n) {
		element = e;
		next = n;
	}
	
	public Node(E e) {
		element = e;
		next = null;
	}
	
}

	Node<T> head, tail;
	int size;

	// creating an empty linked list
	public SinglyLinkedList() {
		head = tail = null;
		size = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	// insert the given element at the start of the list
	public void addFirst(T element) {
		Node<T> newest = new Node<T>(element);
		newest.next = head;
		head = newest;
		if (isEmpty()) {
			tail = newest;
		}
		size++;
	}

	// insert the given element at the end of the list
	public void addLast(T element) {
		Node<T> newest = new Node<T>(element, null);
		if (isEmpty()) {
			head = newest;
		} else {
			tail.next = newest;
		}
		tail = newest;
		size++;
	}

	// remove the first element from the list
	public T removeFirst() {
		if (isEmpty()) {
			return null;
		}
		T valueToBeRemoved = head.element;
		head = head.next;
		size--;
		if (size == 0) {
			tail = null;
		}
		return valueToBeRemoved;
	}

	// remove the last element from the list
	public T removeLast() {
		if (isEmpty()) {
			return null;
		}
		T valueToBeRemoved = tail.element;
		if (size == 1) {
			head = tail = null;
		} else {
			// search for the second last node
			Node<T> current = head;
			while (current.next != tail) {
				current = current.next;
			}
			// current is now the second last node
			current.next = null;
			tail = current;
			size--;
		}
		return valueToBeRemoved;
	}

	// add an item at a given position in the list
	public boolean add(int position, T element) {
		if (position <= 0 || position > size + 1) {
			return false;
		}
		// insert first
		if (position == 1) {
			addFirst(element);
		} else if (position == size + 1) {
			addLast(element);
		} else {

			Node<T> previous = head;
			// find insertion position
			int currentNodePosition = 1;
			while (currentNodePosition != position - 1) {
				previous = previous.next;
				currentNodePosition++;
			}
			// previous node
			// newest node
			// current node
			Node<T> current = previous.next;
			// create the new node storing the given element
			Node<T> newest = new Node<T>(element);
			// link all three
			previous.next = newest;
			newest.next = current;
			size++;
		}
		return true;
	}

	// remove an item from a given position in the list
	public T remove(int position, T element) {
		if (isEmpty()||position <= 0 || position > size) {
			return null;
		}
		// insert first
		if (position == 1) {
			return removeFirst();
		} else if (position == size) {
			return removeLast();
		} else {
			Node<T> previous = head;
			// find deletion position
			int currentNodePosition = 1;
			while (currentNodePosition != position - 1) {
				previous = previous.next;
				currentNodePosition++;
			}
			// previous node
			// node to remove
			// current node
			T valueToBeRemoved = previous.next.element;
			Node<T> current = previous.next.next;
			// bypass node to be removed
			previous.next = current;
			size--;	
			return valueToBeRemoved;
		}
	}
        //print Linked List
        public void Display(){
            {
       if(head==null)
       {
           System.out.println("list is empty");
       }
        Node currnode=head;
       while (currnode!=null)
       {
           System.out.print(currnode.element+"--->");
           currnode=currnode.next;
       }
       System.out.print("NULL");
       
   }
        }

}

