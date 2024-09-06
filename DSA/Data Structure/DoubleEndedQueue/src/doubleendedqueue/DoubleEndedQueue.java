/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doubleendedqueue;

/**
 *
 * @author ARC
 */
public class DoubleEndedQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue_TestClass<Integer> q=new Queue_TestClass<>();
        System.out.println("");
       q.addFirst(1);
       q.addFirst(1);
       q.addFirst(1);
       q.addLast(3);
       q.addLast(6);
      q.addLast(11);
      System.out.println(q.removeFirst()+"");
      System.out.println(q.removeLast()+"");
        System.out.println(q.first()+"");
        
      
       q.display();
       
    }
    
}
