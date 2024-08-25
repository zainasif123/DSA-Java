/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack_genetic;

/**
 *
 * @author ARC
 */
public class Stack_genetic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test_class<Integer> stack=new  Test_class<>();
       
        stack.push(7);
        stack.push(2);
        stack.push(77);
        stack.reverseStack();
        stack.push(44);
        
        System.out.println(""+stack.Size());
         System.out.println(stack.isEmpty()+" ");
        int remove = stack.pop();
        System.out.println(remove);
          stack.display();
      stack.reverseStack();
      stack.display();
    
      
    }
    
}
