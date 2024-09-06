/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package queues_linked_list;

/**
 *
 * @author ARC
 */
public interface Queues_ATD<E> {
    int size();
    boolean isEmpty();
    void enqueue(E elements);
    E dequeue();
    E first();
    void display();
}
