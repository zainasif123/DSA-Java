/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queues_linked_list;

/**
 *
 * @author ARC
 */
public class ListSingleClass<T> {
    public class Node<E>{
        E data;
        Node<E> next;
        
       
        public Node(E data)
        {
            this.data=data;
            this.next=null;
        }
        
    }
    //class end
    Node<T> head,tail;
    int size;
    
    public ListSingleClass()
    {
        head=tail=null;
       size=0;
       
    }
    
    public boolean isempty()
    {
        return (size()==0);
    }
    public int size()
    {
        return size;
    }
    public void addlast(T data)
    {
        Node<T> newnode=new Node<>(data);
      if(size()==0)
        {
            head=newnode;
        }
        else
        {
         tail.next=newnode; 
        }
        
        tail=newnode;
       size++;
    }
    public T removefirst()
    {
        if(size()==0)
        {
            System.out.println("list is empty");
        }
         if(size()==1)
        {
            tail=null;
        }
        T removevalue =head.data;
       head=head.next;
       size--;
        return removevalue;
    }
    public T first()
    {
         if(size()==0)
        {
            System.out.println("list is empty");
        }
        
        return head.data;
    }
    
        public void display()
    {
        if(size()==0)
        {
            System.out.println("list is empty");
        }
       
        Node<T> currnode=head;
        while (currnode.next!=null)
        {
            System.out.print(currnode.data+"-->");
            currnode=currnode.next;
            
        }
        System.out.println(currnode.data+ " ");
        
    }
}
