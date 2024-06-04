/*
Name and Surname: Kieran Woodrow
Student Number: u19304308
*/

public class ThreadedAVLNode<T extends Comparable<? super T>>
{
   /*
   You must implement a node class which would be appropriate to use with your trees.
   
   You may add methods and data fields. You may NOT alter the given class name or data fields.
   */
   
   protected T data;                      // stored data
   protected int balanceFactor;           // balance factor (follow the definition in the textbook and slides exactly)
   protected ThreadedAVLNode<T> left;     // right child
   protected ThreadedAVLNode<T> right;    // left child
   protected boolean hasThread;           // flag indicating whether the right pointer is a thread

 
   public ThreadedAVLNode() //CONSTRUCTOR  NEW AVL NODE USED WHEN INSERTING A NODE
   {
       
   }

}
