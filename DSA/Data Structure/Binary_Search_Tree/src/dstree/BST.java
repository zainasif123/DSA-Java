/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dstree;

import org.w3c.dom.Node;

/**
 *
 * @author ARC
 */
public interface BST<E> {
     void insertNode(int data);
    Node<T> deleteNode();
   public Node<T> getRoot();
   void preOrder(Node node);
    void inOrder(Node node);
   void postOrder(Node node);
   
}
