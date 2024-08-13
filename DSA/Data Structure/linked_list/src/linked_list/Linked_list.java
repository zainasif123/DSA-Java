/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked_list;

/**
 *
 * @author ARC
 */
public class Linked_list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         SinglyLinkedList<Integer> my_List= new SinglyLinkedList<Integer>();
        my_List.isEmpty();
        my_List.addFirst(22);
        my_List.addLast(22);
    my_List.add(2, 23);
        my_List.Display();
    }
    
}
