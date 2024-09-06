/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queues_array_test;

/**
 *
 * @author ARC
 */
public class Queues_Array_Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queues_Class<Integer> obj =new Queues_Class<>(10);
        obj.enqueues(1);
        obj.enqueues(2);
                obj.enqueues(3);
                obj.enqueues(4);
                obj.enqueues(5);
                obj.enqueues(6);
                obj.enqueues(7);
                obj.enqueues(8);
             
                System.out.println( obj.first()+" ");
               
         System.out.println(obj.Size()+" ");
         System.out.println(  obj.isEmpty()+" ");
        obj.display();
        
        
    }
    
}

