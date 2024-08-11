/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Genetic_arraylist;

/**
 *
 * @author ARC
 */
public interface ListADT<E>{
    boolean isFull();
	int size();
	boolean isEmpty();
	E get(int position);
	E set(int position, E value);
	boolean add(int position, E value);
	E remove(int position);
	// AXIOMS: write test cases
}


