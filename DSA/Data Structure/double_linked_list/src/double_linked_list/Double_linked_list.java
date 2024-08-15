/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package double_linked_list;

/**
 *
 * @author ARC
 */
public class Double_linked_list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Second_Class<Integer> dlist =new Second_Class<>();
      
        dlist.addfirst(1);
        dlist.addfirst(2);
          System.out.println(dlist.size() +" ");
        System.out.println(dlist.isEmpty() +" ");
        dlist.addlast(5);
        dlist.addfirst(9);
       dlist.addlast(20);
      
        System.out.println(dlist.removelast() +"");
        System.out.println(dlist.first() +"");
        dlist.display();
        
        
    }
    
}
