/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queues_linked_list;

/**
 *
 * @author ARC
 */
public class Queues_Test<T> implements Queues_ATD<T> {
  private ListSingleClass<T> list =new ListSingleClass<>();

    @Override
    public int size() {
        return (list.size());
    }

    @Override
    public boolean isEmpty() {
        return (list.isempty());
    }

    @Override
    public void enqueue(T elements) {
        list.addlast(elements);
    }

    @Override
    public T dequeue() {
        return (list.removefirst());
    }

    @Override
    public T first() {
       return list.first();
    }

    @Override
    public void display() {
       list.display();
    }
}
