/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doubleendedqueue;

/**
 *
 * @author ARC
 */
public class Queue_TestClass<T> implements ATD_Queue<T> {
private Double_Linked_List<T> dlist =new Double_Linked_List<>();

    @Override
    public int size() {
       
        return (dlist.size());
    }

    @Override
    public boolean isEmpty() {
       return (dlist.isEmpty());
    }

    @Override
    public T first() {
       return dlist.first();
    }

    @Override
    public T last() {
      return dlist.last();
      
    }

    @Override
    public void addFirst(T element) {
       dlist.addfirst(element);
    }

    @Override
    public void addLast(T element) {
       dlist.addlast(element);
    }

    @Override
    public T removeFirst() {
        return dlist.removefirst();
    }

    @Override
    public T removeLast() {
      return dlist.removelast();
    }
    public void display()
    {
        dlist.display();
    }
    
}
