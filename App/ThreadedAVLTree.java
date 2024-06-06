/*
Name and Surname: Kieran Woodrow
Student Number: u19304308
*/

public class ThreadedAVLTree<T extends Comparable<? super T>>
{
   /*
    You must complete each of the methods in this class to create your own threaded AVL tree.
   Note that the AVL tree is single-threaded, as described in the textbook and slides.
   
   You may add any additional methods or data fields that you might need to accomplish your task.
   You may NOT alter the given class name, data fields, or method signatures.
   */
   
   private ThreadedAVLNode<T> root;       // the root node of the tree
   
   public ThreadedAVLTree() //EMPTY CONSTRUCTOR. SETS EVERYTHING TO NULL
   {
      /*
      The default constructor
      */
   }


   public ThreadedAVLTree(ThreadedAVLTree<T> other) //COPY CONSTRUCTOR. TAKES IN A WHOLE TREE NOT A NODE
   {
      
      if( other!=null )
      {
         ThreadedAVLTree<T> newOther= new ThreadedAVLTree<T> ();
         newOther=other.clone();
      

         if(other.root!=null)
            this.root=newOther.getRoot(); //get root from clone of other tree.( takes in a tree and clones it straight away)
        
      }

   }

   
   public ThreadedAVLTree<T> clone() //CLONE THE TREE
   {
      
         ThreadedAVLTree<T> clonedTree=new ThreadedAVLTree<T>();
         
   
         clonedTree.root=root;

         if(clonedTree.root==null)
            return null;

         else if(clonedTree.root != null)
         {
            unthreadNode(root);

            clonedTree.root=recursiveClone(root);

            threadNode(root);
            threadNode(clonedTree.root);
            return clonedTree;
         }
         else
            return null;  
         
      }
      
   
   public ThreadedAVLNode<T> getRoot() //RETURN THE ROOT OF THE TREE
   {  
      if(root==null)
         return null;

      else  
         return root;
   }
   
   public int getNumberOfNodes()//RETURN THE NUMBER OF NODES IN THE TREE
   {
      unthreadNode(root);

      int temp=countNode(root);
      threadNode(root);
      return temp;

   }
   
   public int getHeight()//RETURN THE MAX HEIGHT OF THE TREE
   {
      unthreadNode(root);
      int tempHeight=heightOfTree(root);
      threadNode(root);
      return tempHeight;
   }
   public boolean insert(T element)
   {  
      if(contains(element))
         return false;

      else
      {
         unthreadNode(root);

         root=insertHelperFunction(root, element);
         threadNode(root);
         return true;
      }     
         
   }
   
   public boolean delete(T element)
   {
      if(!contains(element))
         return false;
      
      else
         {  unthreadNode(root);

            root=deleteHelperFunction(root, element);
            threadNode(root);
            return true;
         }  
   }
   
   public boolean contains(T element)
   { 
      unthreadNode(root);

      boolean flag;
      flag=containsRecursive(root, element);
      threadNode(root);
      return flag;
       
   }

   
   public String inorder()
   {
    
      ThreadedAVLNode<T> x=root;
      String answer="";

      if(x==null)
         return "";

      else
      {
         while(x!=null)
         {
            if(x.left!=null)
            {
               while(x.left!=null)
               {
                  x=x.left;
               }   
            }

            while(x.left==null && x.hasThread==true)
            {
               answer+=x.data+",";
               x=x.right;     
            }

            if(x.left!=null && x.hasThread==true)
            {
               answer+=x.data+",";
               x=x.right;   
            }

            if(x.left==null && x.right!=null)
            {
               answer+=x.data+",";
               x=x.right;   
            }
           
            if(x.left!=null &&x.right!=null)
            {
               answer+=x.data+",";
               x=x.right;   
            }

            if(x.left==null && x.right==null)
            {
               answer+=x.data;
               break;
            } 
         }
         return answer;
      }
      
   }



   public String inorderDetailed()
   {
      ThreadedAVLNode<T> x=root;
      String answer="";

      if(x==null)
         return "";

      else
      {
         while(x!=null)
         {
            if(x.left!=null)
            {
               while(x.left!=null)
               {
                  x=x.left;
               }   
            }

            while(x.left==null && x.hasThread==true)
            {
               answer+=x.data+"|";
               x=x.right;     
            }

            if(x.left!=null && x.hasThread==true)
            {
               answer+=x.data+"|";
               x=x.right;   
            }

            if(x.left==null && x.right!=null)
            {
               answer+=x.data+",";
               x=x.right;   
            }
           
            if(x.left!=null &&x.right!=null)
            {
               answer+=x.data+",";
               x=x.right;   
            }

            if(x.left==null && x.right==null)
            {
               answer+=x.data;
               break;
            } 
         }
         return answer;
      }
      

   }
     
   
   
   // public String preorder()
   // {
      // ThreadedAVLNode<T> x=root;
      // ThreadedAVLNode<T> prev=null;
      // String answer="";

      // if( x==null )
      //    return "";
      
      // else
      // {  
      //    answer+=x.data+",";

      //    while(x!=null)
      //    {
      //       while(x.left !=null)
      //       {
      //          prev=x;
      //          x=x.left;
      //          answer+=x.data+",";
      //       }
      //       if(x.right!=null)
      //       {
      //          x=x.right;
      //       }
        
      //       if(x.left==null && x.right!=null)
      //       {
      //          prev=x;
      //          x=x.right;
      //          answer+=x.data+",";
      //          x=prev.right;
              
      //       }
      //       if(x.left==null && x.hasThread==true)
      //       {
      //          x=x.right;
      //       }

      //       if(x.left!=null && x.right!=null)
      //       {
      //          prev=x;
      //          x=x.right;
      //             if(x.left==null && x.right==null)
      //             {
      //                answer+=x.data;
      //                break;
      //             }
      //             else
      //             answer+=x.data+",";
      //       } 
      //       if(x.left==null && x.hasThread==true)
      //       {
      //          x=x.right;
      //       }
      //       if(x.left==null && x.right!=null)
      //       {
      //          prev=x;
      //          x=x.right;
      //          answer+=x.data+",";
                
      //       }
      //       if(x.left!=null && x.right!=null)
      //       {
      //          prev=x;
      //          x=x.right;
      //             if(x.left==null && x.right==null)
      //             {
      //                answer+=x.data;
      //                break;
      //             }
      //             else
      //             answer+=x.data+",";
      //       } 
      //    }
      //    return answer;
           
      //    }
      public String preorder()
      {
         if(root==null)
            return "";

         String var="";
   
         ThreadedAVLNode<T> x=root;
         
         var+=x.data+",";

         while(x!=null)
         {
            
            if(x.left!=null)
            { 
               x=x.left;

               var+=x.data.toString()+",";
            }
   
            else if(x.right!=null && x.hasThread==false)
            {
               
               x=x.right;

               var+=x.data.toString()+",";
            }
   
            else
            {
               while(x.right!=null && x.hasThread==true)
               {
                  x=x.right;
               }
   
               if(x.right!=null)
               {
                  x=x.right; 
                  var+=x.data.toString()+",";
               }
               else
                  break;  
            }
         }

         String var2=var.substring(0,var.length()-1);//smart way to get rid of comma

            return var2;
      }

    
      
   
   // public String preorderDetailed()//C,B,A||E,D|F
   // {
   //    ThreadedAVLNode<T> x=root;
   //    String answer="";

   //    if( x==null )
   //       return "";
      
   //    else
   //    {  
   //       answer+=x.data+",";
   //       while(x!=null)
   //       {
        

   //       if(x.left!=null)
   //       {
   //          while(x.left!=null)
   //          {
   //             x=x.left;
   //             if(x.hasThread)
   //                answer+=x.data+"|";
   //             else
   //                answer+=x.data+",";
   //          }
   //       }

   //       while(x.hasThread && x.left==null)
         
   //         {
   //            x=x.right;
   //            x=x.right;

   //            if(x.left==null && x.hasThread)
   //             answer+=x.data+"|";

   //             if(x.left!=null && x.right!=null)
   //                answer+=x.data+",";

   //            if(x.left==null && x.right==null)
   //            answer+=x.data;
   //         }

   //         if(x.left==null && x.right==null)
   //          break;
           
   //       }

   //       return answer; 

   //    }

      
   // }
   public String preorderDetailed()
   {
         if(root==null)
            return "";

         String var="";
   
         ThreadedAVLNode<T> x=root;
         
         var+=x.data;

         while(x!=null)
         {
            
            if(x.left!=null)
            { 
               x=x.left;

               var+=","+x.data.toString();
            }
   
            else if( x.hasThread==false && x.right!=null )
            {
               
               x=x.right;

               var+=","+x.data.toString();
            }
   
            else
            {
               while( x.hasThread==true && x.right!=null )
               {
                  x=x.right;

                  var+="|";
               }
   
               if(x.right==null)
               {
                 break;
               }
               else
                  {
                     x=x.right; 
                     var+=x.data.toString();
                  }
                  
            }
         }

            return var;
      }


                                                 //HELPER FUNCTIONS BELOW
   /*-----------------------------------------------------------------------------------------------------------------------------*/
                              
                           //THESE TWO FUNCTIONS DEAL WITH THREADING AND UNTHREADING THE AVL TREE
   /*-----------------------------------------------------------------------------------------------------------------------------*/

   public void unthreadNode(ThreadedAVLNode<T> node)
   {  
      if( node == null ) //IF THERE'S NO NODE, RETURN AND DO NOTHING
         return;
      
      if( node.hasThread == true ) //IF IT DOES HAVE A THREAD, MAKE IT NULL AND CHANGE THE STATUS TO FALSE
      {
         node.right=null;
         node.hasThread=false;
      }

      unthreadNode(node.left); //GO DOWN TREE RECURSIVELY BY CHECKING THE LEFT

      unthreadNode(node.right); //GO DOWN RECURSIVELY BY CHECKING THE RIGHT
   }

   public ThreadedAVLNode<T> threadNode(ThreadedAVLNode<T> node) //NOT MY FUNCTION, ZELU'S FUNCTION. A BIT CONFUSING
   {  
      if( node == null ) //IF THERE'S NO NODE, RETURN AND DO NOTHING
         return null;

      if( node.right==null && node.left==null  ) //IF IT IS A LEAF NODE
         return node;

         if( node.left!=null )
      {
         ThreadedAVLNode<T> tempvar=threadNode( node.left ); //TRAVERSE THROUGH THE LIST

         tempvar.right=node;

         tempvar.hasThread=true;
         
      }

      if( node.right==null ) 
         return node;

      

      return threadNode(node.right); 
   }
   /*-----------------------------------------------------------------------------------------------------------------------------*/

                              // THIS FUNCTION DEALS WITH RECURSIVELY CLONING A TREE
   /*-----------------------------------------------------------------------------------------------------------------------------*/
   public ThreadedAVLNode<T> recursiveClone(ThreadedAVLNode<T> rootNode) //RECURSIVE FUNCTION TO CLONE THE TREE 
   {
      if ( rootNode == null ) //CHECK IF THERE IS A TREE
         return rootNode;

      else
         {
            ThreadedAVLNode<T> newNode = new ThreadedAVLNode<T>();
            newNode.data=rootNode.data;
            newNode.left = recursiveClone(rootNode.left);
            newNode.right = recursiveClone(rootNode.right);
            return newNode;
         }
   }
/*-----------------------------------------------------------------------------------------------------------------------------*/
                     
                                 //THIS FUNCTION DEALS WITH COUNTING THE NODES IN THE TREE
/*-----------------------------------------------------------------------------------------------------------------------------*/
   public int countNode(ThreadedAVLNode<T> rootNode)//RECURSIVE FUNCTION FOR COUNTING THE NUMBER OF NODES
   {
       
      if( rootNode == null )
         return 0; //NO NODES TO RETURN

      else
         return 1 + countNode(rootNode.left) + countNode(rootNode.right);//recursive call to left child and right child 
                                                                     //and add the result of these with 1 ( 1 for counting the root)
   }
/*-----------------------------------------------------------------------------------------------------------------------------*/

                               //THESE TWO FUNCTIONS DEAL WITH FINDING MAX HEIGHT OF THE TREE
/*-----------------------------------------------------------------------------------------------------------------------------*/

   public int heightOfTree(ThreadedAVLNode<T> rootNode)  //RECURSIVE FUNCTION FOR GET HEIGHT
   { 
      if( rootNode==null ) //IF NO ROOT, RETURN NULL
			return 0;
   
      else if( rootNode.left==null && rootNode.right==null ) //IF ONLY ONE NODE, RETURN A HEIGHT OF 0
               return 1;
      
      else if( rootNode.left==null ) //IF THERE IS NO LEFT SIDE TO THE TREE
			      return 1+heightOfTree(rootNode.right); //YOU ADD ONE BECAUSE YOU ARE COUNTING THE ROOT AS WELL
      
      else if( rootNode.right==null ) //IF THERE IS NO RIGHT SIDE TO THE TREE
			      return 1+heightOfTree(rootNode.left); //YOU ADD ONE BECAUSE YOU ARE COUNTING THE ROOT AS WELL
      
      else //ELSE IF THERE IS BOTH SIDES TO THE TREE. THIS IS THE MOST LIKELY CASE
               return 1+findBiggerNumber(heightOfTree(rootNode.left), heightOfTree(rootNode.right));//FIND WHICH ONE IS BIGGER
		
   } 

   public int findBiggerNumber(int x, int y) //DOES THE COMPARING TO SEE WHICH WAS BIGGER
   {
      if (x > y)
       return x;

      else
          return y;
   }

   public void updateBalanceFactor(ThreadedAVLNode<T> node) 
   {
      if(node == null)
         return;
   
      updateBalanceFactor(node.left);

      updateBalanceFactor(node.right);
      
      node.balanceFactor=heightOfTree(node.left)-heightOfTree(node.right);
    
		
	}
   /*-----------------------------------------------------------------------------------------------------------------------------*/

                           //THIS FUNCTION DEALS WITH FINDING WHETHER OR NOT A NODE IS CONTAINED IN THE TREE
   /*-----------------------------------------------------------------------------------------------------------------------------*/

   public boolean containsRecursive(ThreadedAVLNode<T> Node, T element)
	{
      if( Node == null )//CHECK IF THERE IS A TREE
         return false; 
         
      boolean flag=true; //BOOL VARIABLE USED TO RETURN IF FALSE NOT FOUND

      if(element.compareTo(Node.data) < 0) //IF LESS THAN, THEN GO LEFT
         return containsRecursive(Node.left, element); //KEEP GOING LEFT
        
      if(element.compareTo(Node.data) > 0) //IF GREATER THAN, THEN GO RIGHT
         return containsRecursive(Node.right, element);//KEEP GOING RIGHT
      
      return flag; //RETURN FALSE IF NOT FOUND BY GOING LEFT OR RIGHT
   }
   
   /*-----------------------------------------------------------------------------------------------------------------------------*/
   public ThreadedAVLNode<T> rotateLeft(ThreadedAVLNode<T> node) //ROTATE LEFT FUNCTION
   {
      ThreadedAVLNode<T> temp1 = node.right;  
      ThreadedAVLNode<T> temp2 = temp1.left;  

      temp1.left = node;  //DO ROTATION
      node.right = temp2;  

      return temp1;  
   }

   public ThreadedAVLNode<T> rotateRight(ThreadedAVLNode<T> node) // ROTATE RIGHT FUNCTION
   {
      ThreadedAVLNode<T> temp1=node.left;
      ThreadedAVLNode<T> temp2=temp1.right;

      temp1.right=node; // DO ROTATION
      node.left=temp2;

      return temp1;  
   }

   public ThreadedAVLNode<T> insertHelperFunction(ThreadedAVLNode<T> root, T element)
   {
      //unthreadNode(root);
      if (root == null)  
      {
         ThreadedAVLNode<T> temp=new ThreadedAVLNode<T>();
         temp.data=element;
         return temp;  
      }
            
  
      if (element.compareTo(root.data) > 0) 
          root.right = insertHelperFunction(root.right, element);  
            
        else if (element.compareTo(root.data) < 0)
          root.left = insertHelperFunction(root.left, element);  

        else // NO DUPLICATES SO RETURN THE NODE IF THERE'S A DUPLICATE
            return root;  

         updateBalanceFactor(root); // UPDATE THE BALANCE FACTOR OF ALL THE NODES IN THE TREE
         
//---------------------------------------------------------------------------------------------------------------------
              // THERE ARE 4 CASES
//---------------------------------------------------------------------------------------------------------------------
              // left left Case 
       if (root.balanceFactor > 1 && element.compareTo(root.left.data) <  0 ) 
            return rotateRight(root); 

             // left right Case  
        if (root.balanceFactor > 1 && element.compareTo(root.left.data) > 0 )
        {  
            root.left = rotateLeft(root.left);  
            return rotateRight(root);  
        } 
        // Right Right Case  
        if (root.balanceFactor < -1 && element.compareTo(root.right.data)> 0 )  
            return rotateLeft(root);  
  
        // Right Left Case  
        if (root.balanceFactor < -1 && element.compareTo(root.right.data) < 0)  
        {  
            root.right = rotateRight(root.right);  
            return rotateLeft(root);  
        }  

       

        return root; 
   }

   ThreadedAVLNode<T> minValueNode(ThreadedAVLNode<T> root)  
    {  
      ThreadedAVLNode<T> temp = root;  
  
        /* loop down to find the leftmost leaf */
        while (temp.right != null)  
        temp = temp.right;  
  
        return temp;  
    }  

   public ThreadedAVLNode<T> deleteHelperFunction(ThreadedAVLNode<T> root, T element)
   {
      if (root == null)  
         return root;
            
  
       if (element.compareTo(root.data) < 0)
         root.left = deleteHelperFunction(root.left, element); 

      else if (element.compareTo(root.data) > 0) 
          root.right = deleteHelperFunction(root.right, element);  
            
 

      else
      {
            if( ( root.right == null ) || ( root.left == null ) )
            {
               ThreadedAVLNode<T> temp1=null;

               if( temp1 == root.left)
                  temp1=root.right;

               else
                  temp1=root.left;

               if(temp1 == null)
               {
                  temp1=root;
                  root=null;
               }

               else
                  root=temp1;
            }

               else
               {
                  ThreadedAVLNode<T> temp1=minValueNode(root.left);  
                  root.data=temp1.data;
                  root.left=deleteHelperFunction(root.left, temp1.data); 
               }
      }

      if( root == null )
         return root;

      updateBalanceFactor(root);
//---------------------------------------------------------------------------------------------------------------------
              // THERE ARE 4 CASES
//---------------------------------------------------------------------------------------------------------------------
        // right right Case  
        if (root.balanceFactor < -1 && root.right.balanceFactor <= 0 )  
            return rotateLeft(root);  
  
        // Right Left Case  
        if (root.balanceFactor < -1 && root.right.balanceFactor > 0)  
         {  
               root.right = rotateRight(root.right);  
               return rotateLeft(root);  
         }  
       // left left Case 
        if (root.balanceFactor > 1 && root.left.balanceFactor >=  0 ) 
           return rotateRight(root); 

        // left right Case  
       if (root.balanceFactor > 1 && root.left.balanceFactor < 0 )
         {  
            root.left = rotateLeft(root.left);  
            return rotateRight(root);  
         } 

         return root;
         
   }

   public String doesItHaveAThread(T x)
   {
      String answer="";
      ThreadedAVLNode<T>  temp=RecursiveFunctionSearch(root, x); //call recursive function to search
		
		if(temp != null)
      {  if(!temp.hasThread==true)
             answer="no";
         else
            answer= "yes";
      
      }
	
      return answer;
   }

   private ThreadedAVLNode<T>  RecursiveFunctionSearch(ThreadedAVLNode<T> currentNode, T number)
	{


		if(currentNode == null)
			{
				return null;
			}
		
			
				if(number.equals(currentNode.data)) //check first node. 
					return currentNode;

				else if(number.compareTo(currentNode.data) > 0)
				{
					return RecursiveFunctionSearch(currentNode.right, number);
				}

				else
					return RecursiveFunctionSearch(currentNode.left, number);
			
		
	}
  
}//END OF MAIN FUNCTION


