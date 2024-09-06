/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package doubleendedqueue;

/**
 *
 * @author ARC
 */
public interface ATD_Queue<E> {
    int size();
    boolean isEmpty();
    E first();
    E last();   
    void addFirst(E element);
    void addLast(E element);
    E removeFirst();
    E removeLast();
    
}
