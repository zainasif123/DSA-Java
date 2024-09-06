package reverse_linkedlsit;


public class Reverse_linkedlsit {

     Node head;
     int size=0;
     
     public Reverse_linkedlsit()
     {
         
     }
 public class Node
 {
     
     String data ;
     Node next ;
     Node head;
     
     Node (String data)
     {
         this.data= data ;
         this.next= null; 
         size ++;
     }
 }
 //add -first ,last ;
   public void add_fisrt(String data)
   {
       Node newnode = new Node(data);
       if (head == null)
       {
           head = newnode;
           return ;
           
       }
       
       newnode.next= head ;
       head = newnode; 
   }
   public void add_last(String data)
   {
       Node newnode = new Node(data);
        if (head == null)
       {
           head = newnode;
           return ;
           
       }
              
        Node currNode = new Node(data);
       currNode = head;
       while (currNode.next != null)
       {
           currNode= currNode.next;
           
       }
       currNode.next= newnode;
   }
   
   //print 
   public void printlist ()
   {
       if (head == null)
       {
           System.out.println(":list is empty");
           return ;
       }
              
       Node currNode = head ;
       while (currNode!= null)
               {
                   System.out.print(currNode.data+"-->");
                   currNode=currNode.next;
               }
       System.out.println("Null");
   }
   
   //delete first 
     public void delete_first_node()
     {
         if (head == null)
                 {
                     System.out.println("the list is empty");
                    
                 }
         size --;
         head = head.next;
        
     }
     
     public void delete_last_node()
     {
          if (head == null)
                 {
                     System.out.println("the list is empty");
                    
                 }
          size--;
          if (head.next == null)
          {
              head = null;
              return ;
          }
          Node second_node = head;
          Node last_node = head.next;
          while (last_node.next!= null)
          {
              last_node = last_node.next;
              second_node = second_node.next;
              
          }
         second_node.next= null;
          
         
     }
     public int getsize()
     {
         
         return size;
     }
     public void reverse()
     {
          if(head == null || head.next == null) {
           return;
       }
           Node nextNode ;
Node prevNode= head;
         Node currNode= head.next;
         while (currNode ==null)
         {
             nextNode = currNode.next;
           currNode.next = prevNode;
           prevNode = currNode;
           currNode = nextNode;
           
         }
        head.next = null;
        head = prevNode;
     }   
     
     public Node reverseListRecursive(Node head) {
       //empty node || last node or only one node
       if(head == null || head.next == null) {
           return head;
       }
 
       Node newHead = reverseListRecursive(head.next);
      
       head.next.next = head;
       head.next = null;
       return newHead;
   }

    public static void main(String[] args) {
       Reverse_linkedlsit obj = new  Reverse_linkedlsit();
//       obj.add_fisrt("a");
//       obj.add_fisrt("is");
//       obj.printlist(); 
//       obj.add_last("list ");
//       obj.printlist();
//       obj.add_fisrt("this");
//       obj.printlist(); 
//       obj.delete_first_node();
//        obj.printlist(); 
//       obj.delete_last_node();
//        obj.printlist(); 
//        System.out.print(obj.getsize());

obj.add_last("1");
obj.add_last("2");
obj.add_last("3");
obj.add_last("4");
obj.printlist();
//obj.reverse();
//        obj.printlist();
       obj.reverseListRecursive(obj.head);
       
      obj.printlist();
        
    }
    
}
