/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package teststackds;

/**
 *
 * @author ARC
 */
public interface Stack <E>{
    int size();
    boolean isEmpty();
    void push(E element);
    E top();
    E pop();
    void display();
    
}
