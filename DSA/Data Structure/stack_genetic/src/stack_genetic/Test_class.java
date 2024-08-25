/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack_genetic;

/**
 *
 * @author ARC
 */
public class Test_class<T> implements ADT<T> {

private  T[] data;
   private static final int capacity=1000;
    private int t=-1;
   
     public Test_class()
    {
        data=(T[])new Object[capacity];
    }
    
    
    @Override
    public boolean isEmpty() 
    {
        return(t==-1);
    }

    @Override
    public int Size()
    {
     return(t+1);   
    }

    

    @Override
    public void push(T data) 
    {
     
        if(Size()==this.data.length)
        {
            System.out.println("\t\t stack is Full, so three is No Item to push.");
            return;
        }
        this.data[++t]=data;
    }

    @Override
    public T pop()
    {
     if(isEmpty())
     {
         System.out.println("\n\t\t List is Empty so, there is No Item to pop");
         return null;
     }
     T popValue=data[t];
     data[t]=null;
     --t;
     return popValue;
    }

    @Override
    public T top() 
    {
        if(isEmpty())
     {
         System.out.println("\n\t\t List is Empty so, there is No Item to pop");
         return null;
     }
        T topValue=data[t];
        return topValue;
    }
    
   
    public void reverseStack()
    {

        if(isEmpty())
        {
            System.out.println("List is Empty");
            
        }
//        T[] newStack=(T[]) new Object[data.length];
//        int cnt=t ;
//        T pop_valu;
//        for(int i=0;i<=cnt;i++)
//        {
//            pop_valu=pop();
//             newStack[i]=pop_valu;
//        }
//        for(int i=0;i<=cnt;i++)
//        {
//           push(newStack[i]); 
//        }
  T[] newStack=(T[]) new Object[data.length];
  //T[] newStack1=(T[]) new Object[data.length];
        int cnt=t ;
        T pop_valu;
        for(int i=0;i<=cnt;i++)
        {
            pop_valu=pop();
             newStack[i]=pop_valu;
             
        }
        for(int i=0;i<=cnt;i++)
        {
           push(newStack[i]); 
        }
        
       
    }

    
    public void display() 
    {
     if(isEmpty())
     {
         System.out.println("\t\t List is Empty, there is No Element to display.");
         return;
    }
        System.out.println("  ");
        for (int i = 0; i <=t; i++) 
        {
            System.out.print("    "+data[i]);
        }
        System.out.println("  ");
    }

    
}
