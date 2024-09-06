/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package queues_array_test;

/**
 *
 * @author ARC
 */
public interface ATD_Queues<E>
{
    int Size();
    boolean isEmpty();
    void enqueues(E element);
    E dequeues();
    E first();
    void display();
    
    
}
