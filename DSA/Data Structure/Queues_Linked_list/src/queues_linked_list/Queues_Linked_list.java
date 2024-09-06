/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queues_linked_list;

/**
 *
 * @author ARC
 */
public class Queues_Linked_list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queues_Test<Integer> stack=new Queues_Test<> ();
        stack.size();
        stack.enqueue(1);
        stack.enqueue(4);
        stack.enqueue(6);
        stack.dequeue();
         System.out.println( stack.size()+"");
        System.out.println( stack.first()+"");
         System.out.println( stack.isEmpty()+"");
         
        stack.display();
    }
    
}
