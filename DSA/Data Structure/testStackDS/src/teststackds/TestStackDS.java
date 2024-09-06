/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teststackds;

/**
 *
 * @author ARC
 */
public class TestStackDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedStack stack= new LinkedStack();
        System.out.println(  stack.size()+" ");
        System.out.println(stack.isEmpty()+"");
        stack.push("zain");
        stack.push("hassan");
        stack.pop();
        System.out.println( stack.top()+"");
        stack.display();
      
    }
    
}
