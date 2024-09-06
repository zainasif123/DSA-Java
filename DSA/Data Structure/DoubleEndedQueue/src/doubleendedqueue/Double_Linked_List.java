/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doubleendedqueue;

/**
 *
 * @author ARC
 */
public class Double_Linked_List<T> {
     public class Node<E>
    {
        E data;
        Node<E> next;
        Node<E> prev;
        
        public Node(E data,Node<E> next,Node<E> prev)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    //end class
    Node<T> header,trailer;
    int size ;
    
    public Double_Linked_List()
    {
        header=new Node<>(null,null,null);//header=(data,prev,next)
        trailer=new Node<>(null,header,null);//trailer=(data,prev,next)
        header.next=trailer;
        size=0; 
    }
    
    public int size()
    {
        return size;
    }
    
    public boolean isEmpty()
    {
        return (size==0);
    }
   
    public T first()
    {
     if(isEmpty())
     {
         System.out.println("List is Empty");
         return null;
     }
     return (header.next.data);   
    }
    
     public T last()
    {
     if(isEmpty())
     {
         return null;
     }
     return (trailer.prev.data);   
    }
     
     public void addfirst(T data)
     {
         addbetween(data,header,header.next);
     }
     
      public void addlast(T data)
     {
         addbetween(data,trailer.prev,trailer);
     }
      
     public boolean addbetween(T data,Node<T> predessor,Node<T> successor)
     {
         Node<T> newnode=new Node<>(data,predessor,successor);
         newnode.prev=predessor;
         predessor.next= newnode;
         newnode.next=successor;
         successor.prev=newnode;
         size++;
         return true;
     }
     
     public T removefirst()
     {
         if(isEmpty())
         {
             return null;
         }
         
          return remove(header.next);
     }
     
     public T removelast()
     {
         if(isEmpty())
         {
             return null;
         }
         return remove(trailer.prev);
     }
     public T remove(Node<T> node)
     {
        Node<T> predessor=node.prev;
        Node<T> successor=node.next;
        predessor.next=successor;
        successor.prev=predessor;
        size--;
        
return node.data;
     }             
     public void display()
     {
         if(isEmpty())
         {
             System.out.println("list is Empty");
         }
         Node<T> currnode=header.next;
         while(currnode!=trailer)
         {
             System.out.print(currnode.data +"==>");
             currnode=currnode.next;
         }
         System.out.println(" ");
     }
    
}


