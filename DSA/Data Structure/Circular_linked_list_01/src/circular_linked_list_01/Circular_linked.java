/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circular_linked_list_01;

/**
 *
 * @author ARC
 */
public class Circular_linked <T>{
    public class Node<E>{
    
        E data;
        Node<E> next;
        
        public Node(E data)
        {
            this.data=data;
            this.next=null;
        }
        
}
    //end class
    Node<T> head,tail;
    
    int size;
    
    public Circular_linked()
    {
        head =tail=null;
        size =0;
    }
    public int size()
    {
        return size;
    }
    public boolean isempty()
    {
        return size==0;
    }
    public void addfirst(T data)
    {
        Node<T> newnode=new Node<>(data);
         
        if(size()==0)
        {
            head=newnode;
            tail=newnode;
            newnode.next=head;
        }
        else
        {
            newnode.next=head;
            
        
        head=newnode;
        tail.next=head;
        
        }
        size++;
    }
    public void addlast(T data)
    {
        Node<T> newnode=new Node<>(data);
        if(size()==0)
        {
             head=newnode;
            tail=newnode;
            newnode.next=head;
        }
        else{
            tail.next=newnode; 
             tail=newnode;
             tail.next=head;
             
        }
        size++;
    }
    public void addpos(T data, int position)
    {
        if (position <=0 || position >size)
        {
            System.out.println("Invalid Input");
           
        }
        else if(size()==0)
        {
            System.out.println("list is empty");
        }
        else if(position==1)
        {
            addfirst(data);
            
        }
        else
        {
            Node<T> previousNode=head;
            int currnodepos=1;
            while(currnodepos!=position-1)
            {
                previousNode=previousNode.next;
                currnodepos++;
            }
            Node<T> currnode=previousNode.next;
            Node<T> newnode=new Node<>(data);
            previousNode.next=newnode;
            newnode.next=currnode;
            size++;
        }
        
    }
    
    public T removefirst()
    {
        if(size()==0)
        {
            System.out.println("list is empty");
        }
        T removevalue =head.data;
         if(size()==1)
        {
            tail=null;
           head=null;
        }
        
       head=head.next;
       tail.next=head;
       size--;
        return removevalue;
    }
    
    public T removelast()
    {
         if(size()==0)
        {
            System.out.println("list is empty");
        }
        T removevalue =tail.data;
         if(size()==1)
        {
            tail=null;
           head=null;
        }
        
       Node<T> currnode=head;
       while(currnode.next!=tail){
           currnode=currnode.next;
       }
       currnode.next=head;
       tail=currnode;
        size--;
        return removevalue;
    }
    
    public T removePos(int position)
    {
      T valueToBeRemoved = null;
       
        if(isempty())
        {
            System.out.println("list is empty");
        }
        else if(position <=0 || position >size)
        {
            System.out.println("Invalid Input");
        }
        else if(position==1)
        {
            return removefirst();
        }
        else if(position==size)
        {
          return  removelast();
            
        }
        else{
            
         Node<T> previous=head;
         Node<T> temp=head.next;
            int currentPos=1;
            while(currentPos!=position-1)
            {
                previous =previous.next;
                temp=temp.next;
                currentPos++;
            }
            
                      valueToBeRemoved=temp.next.data;
                        Node<T>current=temp.next;
                        previous.next=current;
                        
                        size--;
        }
        
        return valueToBeRemoved;
    }
    public void addposbefore(T data, int position)
    {
        if (position <=0 || position >size)
        {
            System.out.println("Invalid Input");
           
        }
        else if(size()==0)
        {
            System.out.println("list is empty");
        }
        else if(position==1)
        {
            addfirst(data);
            
        }
        else
        {
            Node<T> previousNode=head;
            int currnodepos=1;
            while(currnodepos!=position-1)
            {
                previousNode=previousNode.next;
                currnodepos++;
            }
            Node<T> currnode=previousNode.next;
            Node<T> newnode=new Node<>(data);
            previousNode.next=newnode;
            newnode.next=currnode;
            size++;
        }
        
    }
    public T removeposbefore(int position)
    {
         if(position<=1 || position>size+1)
       {
            System.out.printf(" is Incorrect Before Position, So removing procees is Failed.");
            return null;
       }
         if(position==2)
         {
             return removefirst();
         }
         
        if(position==size+1)
        {
            return removelast();
        }
        int currentPos=1;
        Node<T> currentNode=head;
        while (currentPos<position-2) 
        {
         currentNode=currentNode.next;
         currentPos++;
        }
         T removedValue=currentNode.next.data;
        currentNode.next=currentNode.next.next;
        size--;
        return removedValue;       
    }
    public void addposafter(T data, int position)
    {
        if (position <0 || position >=size)
        {
            System.out.println("Invalid Input");
           
        }
        else if(size()==0)
        {
            System.out.println("list is empty");
        }
        else if(position==0)
        {
            addfirst(data);
            
        }
        else if(position==size-1)
        {
            addlast(data);
        }
        else
        {
            Node<T> previousNode=head;
            int currnodepos=1;
            while(currnodepos!=position)
            {
                previousNode=previousNode.next;
                currnodepos++;
            }
            Node<T> currnode=previousNode.next;
            Node<T> newnode=new Node<>(data);
            previousNode.next=newnode;
            newnode.next=currnode;
            size++;
        }
        
    }
    public T removeosaafter(int position)
    {
         if(position<0 || position>=size)
       {
            System.out.printf(" Incorrect Before Position, So removing procees is Failed");
            return null;
       }
       if(position==0)
       {
           return removefirst();
       }
       if(position==size-1)
       {
          return removelast();
       }
       Node<T> currentNode=head;
       int currentPos=1;
        while (currentPos<position)
        {
         currentNode=currentNode.next;
         currentPos++;
        }
        T removedValue=currentNode.next.data;
        currentNode.next=currentNode.next.next;
        size--;
        return removedValue;
    }
    public void display()
    {
        Node currnode=head;
        if(size()==0)
        {
            System.out.println("list is Empty");
        }
        while(currnode!=tail)
        {
            System.out.print(currnode.data +"==>");
            currnode=currnode.next;
        }
        
        System.out.println(currnode.data );
        
        
    }
}
