/*
Name and Surname:  
Student Number: 
*/

public class Tester 
{
   public static void main(String[] args) throws Exception
   {
      ThreadedAVLTree<Integer> Mpilo=new ThreadedAVLTree<Integer>() ;
      int first=Mpilo.getNumberOfNodes();
      int first1=Mpilo.getHeight();
      Mpilo.insert(10);
      int second=Mpilo.getNumberOfNodes();
      int second1=Mpilo.getHeight();
      Mpilo.insert(20);
      int third=Mpilo.getNumberOfNodes();
      int third1=Mpilo.getHeight();
      Mpilo.insert(30);
      int fourth=Mpilo.getNumberOfNodes();
      int fourth1=Mpilo.getHeight();
      Mpilo.insert(40);
      int fifth=Mpilo.getNumberOfNodes();
      int fifth1=Mpilo.getHeight();
      Mpilo.insert(50);
      int sixth=Mpilo.getNumberOfNodes();
      int sixth1=Mpilo.getHeight();
      Mpilo.insert(25);
      int seventh=Mpilo.getNumberOfNodes();
      int seventh1=Mpilo.getHeight();
      Mpilo.insert(55);
      int eighth=Mpilo.getNumberOfNodes();
      int eighth1=Mpilo.getHeight();


      System.out.println("///////////////////////////////////////////////////////");
      System.out.println("THIS GIVES THE NUMBER OF NODES AFTER EACH INSERT, IT SHOULD GO 0,1,2,3,4,5,6,7");
      System.out.println(first);
      System.out.println(second);
      System.out.println(third);
      System.out.println(fourth);
      System.out.println(fifth);
      System.out.println(sixth);
      System.out.println(seventh);
      System.out.println(eighth);
      System.out.println();
      System.out.println();
      System.out.println("///////////////////////////////////////////////////////");
      System.out.println("THIS GIVES THE HEIGHT OF THE TREE AFTER EACH INSERT, IT SHOULD GO 0,1,2,2,3,3,3,3");
      System.out.println(first1);
      System.out.println(second1);
      System.out.println(third1);
      System.out.println(fourth1);
      System.out.println(fifth1);
      System.out.println(sixth1);
      System.out.println(seventh1);
      System.out.println(eighth1);
      System.out.println(" ");
      System.out.println(" ");
      System.out.println(" Tree 1 ");
      System.out.println("------------------------------------------------ ");
     

      BinaryTreePrinter p= new BinaryTreePrinter();
      ThreadedAVLTree<Integer> Zelu=new ThreadedAVLTree<Integer>(Mpilo) ;

      p.printNode(Zelu.getRoot());
      System.out.println();
      System.out.println(" Tree 2 ");
      System.out.println("------------------------------------------------ ");
      System.out.println("THE TREE ABOVE AND BELOW SHOULD BE EXACTLY THE SAME, THE COPY CONSTRUCTOR IS BEING TESTED");
      p.printNode(Mpilo.getRoot());
      System.out.println();
   


      System.out.println("THE TREE ABOVE AND BELOW SHOULD BE EXACTLY THE SAME, THE CLONE FUNCTION IS BEING TESTED");
      p.printNode(Mpilo.clone().getRoot());

      System.out.println();
   
      System.out.println("EVERYTHING FROM HERE SHOULD BE FOUND");
      System.out.println("////////////////////////////////////////////////////////////////////////");
    
       if(Mpilo.contains(10))
      {
          System.out.println("10 was found");
      }
       else
          System.out.println("10 was not found");

         
      if(Mpilo.contains(30))
      {
         System.out.println("30 was found");
      }
       else
         System.out.println("30 was not found");
         
      if(Mpilo.contains(40))
       {
           System.out.println("40 was found");
       }
      else
         System.out.println("40 was not found");

      if(Mpilo.contains(50))
        {
         System.out.println("50 was found");
        }
      else
         System.out.println("50 was not found");
               
      if(Mpilo.contains(25))
        {
          System.out.println("25 was found");
        }
      else
         System.out.println("25 was not found");

      if(Mpilo.contains(55))
         {
         System.out.println("55 was found");
         }
      else
         System.out.println("55 was not found");
         
        
         System.out.println();
         System.out.println();
         System.out.println("EVERYTHING FROM HERE SHOULD NOT NOT NOT NOT NOT NOT BE FOUND");
         System.out.println("////////////////////////////////////////////////////////////////////////");
         if(Mpilo.contains(1))
         {
            System.out.println("1 was found");
         }
          else
            System.out.println("1 was not found");
            
         if(Mpilo.contains(2))
          {
              System.out.println("2 was found");
          }
         else
            System.out.println("2 was not found");
   
         if(Mpilo.contains(22))
           {
            System.out.println("22 was found");
           }
         else
            System.out.println("22 was not found");
                  
         if(Mpilo.contains(51))
           {
             System.out.println("51 was found");
           }
         else
            System.out.println("51 was not found");
   
         if(Mpilo.contains(105))
            {
            System.out.println("105 was found");
            }
         else
            System.out.println("105 was not found");

            
         System.out.println();
         System.out.println("///////////////////// TESTING INORDER PRINTING... ");
         System.out.println(Mpilo.inorder());
         System.out.println();
         
         System.out.println("///////////////////// TESTING INORDER Detailed... ");
         System.out.println(Mpilo.inorderDetailed());
         System.out.println();
      
         System.out.println("///////////////////// TESTING PREORDER PRINTING... ");
         System.out.println(Mpilo.preorder());
         System.out.println();

         System.out.println("///////////////////// TESTING PREORDER DETAILED... ");
         System.out.println(Mpilo.preorderDetailed());
         System.out.println();   
         System.out.println(); 

         System.out.println("WE FIRST DELETE 55");
        
         System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////");
         System.out.println("FROM HERE WE WILL JUST CREATE A BIGGER TREE AND TEST INORDER AND PREORDER TRAVERSALS");

         ThreadedAVLTree<Integer> Keanu=new ThreadedAVLTree<Integer>() ;

         Keanu.insert(100);
         Keanu.insert(250);
         Keanu.insert(400);
         Keanu.insert(20);
         Keanu.insert(260);
         Keanu.insert(500);
         Keanu.insert(420);
         Keanu.insert(69);
         Keanu.insert(114);
         Keanu.insert(212);
         Keanu.insert(66);
         Keanu.insert(48);
         Keanu.insert(79);
         Keanu.insert(800);
         Keanu.insert(55);
         Keanu.insert(468);
         Keanu.insert(410);
         Keanu.insert(350);
         Keanu.insert(140);
         Keanu.insert(500);
       
         p.printNode(Keanu.getRoot());

         
         
         System.out.println(Keanu.doesItHaveAThread(20));
         System.out.println(Keanu.doesItHaveAThread(55));
         System.out.println(Keanu.doesItHaveAThread(66));
         System.out.println(Keanu.doesItHaveAThread(79));
         System.out.println(Keanu.doesItHaveAThread(100));
         System.out.println(Keanu.doesItHaveAThread(140));
         System.out.println(Keanu.doesItHaveAThread(212));
         System.out.println(Keanu.doesItHaveAThread(350));
         System.out.println(Keanu.doesItHaveAThread(410));
         System.out.println(Keanu.doesItHaveAThread(468));
         
   


         System.out.println();
         System.out.println("///////////////////// TESTING INORDER PRINTING... ");
         System.out.println(Keanu.inorder());
         System.out.println();
         System.out.println("///////////////////// TESTING INORDER Detailed... ");
         System.out.println(Keanu.inorderDetailed());
         System.out.println();
         System.out.println("///////////////////// TESTING PREORDER PRINTING... ");
         System.out.println(Keanu.preorder());
         System.out.println();
         System.out.println("///////////////////// TESTING PREORDER DETAILED... ");
         System.out.println(Keanu.preorderDetailed());
         System.out.println();   
         System.out.println();

         // System.out.println(Keanu.getHeight());
         // System.out.println();
         
         

   

         
         System.out.println("////////////////////////////////////////");
         System.out.println("HERE WE WILL START TO DELETE AND TEST...");
         System.out.println();

         System.out.println("WE FIRST DELETE 250");
         Keanu.delete(250);
            
        
         p.printNode(Keanu.getRoot());


         System.out.print("INORDER:");
      
   
         System.out.println(Keanu.inorder());
         System.out.print("PREORDER:");
         System.out.println(Keanu.preorder());
         System.out.print("INORDER DETAILED:");
         System.out.println(Keanu.inorderDetailed());
         System.out.print("PREORDER DETAILED:");
         System.out.println(Keanu.preorderDetailed());

       

         System.out.println();

         System.out.println("WE NOW DELETE 420");
         Keanu.delete(420);
         p.printNode(Keanu.getRoot());


         System.out.print("INORDER:");
         System.out.println(Keanu.inorder());
         System.out.print("PREORDER:");
         System.out.println(Keanu.preorder());
         System.out.print("INORDER DETAILED:");
         System.out.println(Keanu.inorderDetailed());
         System.out.print("PREORDER DETAILED:");
         System.out.println(Keanu.preorderDetailed());

         System.out.println();
            
         
      

         System.out.println("WE NOW DELETE 69");
         Keanu.delete(69);
         p.printNode(Keanu.getRoot());
         System.out.print("INORDER:");
         System.out.println(Keanu.inorder());
         System.out.print("PREORDER:");
         System.out.println(Keanu.preorder());
         System.out.print("INORDER DETAILED:");
         System.out.println(Keanu.inorderDetailed());
         System.out.print("PREORDER DETAILED:");
         System.out.println(Keanu.preorderDetailed());
   

         
         System.out.println();
         System.out.println("WE NOW DELETE 1");
         Keanu.delete(1);
         p.printNode(Keanu.getRoot());
         System.out.print("INORDER:");
         System.out.println(Keanu.inorder());
         System.out.print("PREORDER:");
         System.out.println(Keanu.preorder());
         System.out.print("INORDER DETAILED:");
         System.out.println(Keanu.inorderDetailed());
         System.out.print("PREORDER DETAILED:");
         System.out.println(Keanu.preorderDetailed());



         System.out.println();
         System.out.println("WE NOW DELETE 140");
         Keanu.delete(140);
         p.printNode(Keanu.getRoot());
         System.out.print("INORDER:");
         System.out.println(Keanu.inorder());
         System.out.print("PREORDER:");
         System.out.println(Keanu.preorder());
         System.out.print("INORDER DETAILED:");
         System.out.println(Keanu.inorderDetailed());
         System.out.print("PREORDER DETAILED:");
         System.out.println(Keanu.preorderDetailed());

         System.out.println();
         System.out.println("WE NOW DELETE 100");
         Keanu.delete(100);
         p.printNode(Keanu.getRoot());
         System.out.print("INORDER:");
         System.out.println(Keanu.inorder());
         System.out.print("PREORDER:");
         System.out.println(Keanu.preorder());
         System.out.print("INORDER DETAILED:");
         System.out.println(Keanu.inorderDetailed());
         System.out.print("PREORDER DETAILED:");
         System.out.println(Keanu.preorderDetailed());



         System.out.println();
         System.out.println("WE NOW DELETE 500");
         Keanu.delete(500);
         p.printNode(Keanu.getRoot());
         System.out.print("INORDER:");
         System.out.println(Keanu.inorder());
         System.out.print("PREORDER:");
         System.out.println(Keanu.preorder());
         System.out.print("INORDER DETAILED:");
         System.out.println(Keanu.inorderDetailed());
         System.out.print("PREORDER DETAILED:");
         System.out.println(Keanu.preorderDetailed());


         System.out.println();
         System.out.println("WE NOW DELETE 800");
         Keanu.delete(800);
         p.printNode(Keanu.getRoot());
         System.out.print("INORDER:");
         System.out.println(Keanu.inorder());
         System.out.print("PREORDER:");
         System.out.println(Keanu.preorder());
         System.out.print("INORDER DETAILED:");
         System.out.println(Keanu.inorderDetailed());
         System.out.print("PREORDER DETAILED:");
         System.out.println(Keanu.preorderDetailed());


         System.out.println();
         System.out.println("WE NOW DELETE 212");
         Keanu.delete(212);
         p.printNode(Keanu.getRoot());
         System.out.print("INORDER:");
         System.out.println(Keanu.inorder());
         System.out.print("PREORDER:");
         System.out.println(Keanu.preorder());
         System.out.print("INORDER DETAILED:");
         System.out.println(Keanu.inorderDetailed());
         System.out.print("PREORDER DETAILED:");
         System.out.println(Keanu.preorderDetailed());

         System.out.println();
         System.out.println("WE NOW DELETE 20");
         Keanu.delete(20);
         p.printNode(Keanu.getRoot());
         System.out.print("INORDER:");
         System.out.println(Keanu.inorder());
         System.out.print("PREORDER:");
         System.out.println(Keanu.preorder());
         System.out.print("INORDER DETAILED:");
         System.out.println(Keanu.inorderDetailed());
         System.out.print("PREORDER DETAILED:");
         System.out.println(Keanu.preorderDetailed());


         System.out.println();
         System.out.println("WE NOW DELETE 114");
         Keanu.delete(114);
         p.printNode(Keanu.getRoot());
         System.out.print("INORDER:");
         System.out.println(Keanu.inorder());
         System.out.print("PREORDER:");
         System.out.println(Keanu.preorder());
         System.out.print("INORDER DETAILED:");
         System.out.println(Keanu.inorderDetailed());
         System.out.print("PREORDER DETAILED:");
         System.out.println(Keanu.preorderDetailed());
   
         System.out.println();
         System.out.println("WE NOW DELETE 260");
         Keanu.delete(260);
         p.printNode(Keanu.getRoot());
         System.out.print("INORDER:");
         System.out.println(Keanu.inorder());
         System.out.print("PREORDER:");
         System.out.println(Keanu.preorder());
         System.out.print("INORDER DETAILED:");
         System.out.println(Keanu.inorderDetailed());
         System.out.print("PREORDER DETAILED:");
         System.out.println(Keanu.preorderDetailed());



         System.out.println();
         System.out.println("WE NOW DELETE 350");
         Keanu.delete(350);
         p.printNode(Keanu.getRoot());
         System.out.print("INORDER:");
         System.out.println(Keanu.inorder());
         System.out.print("PREORDER:");
         System.out.println(Keanu.preorder());
         System.out.print("INORDER DETAILED:");
         System.out.println(Keanu.inorderDetailed());
         System.out.print("PREORDER DETAILED:");
         System.out.println(Keanu.preorderDetailed());



         System.out.println();
         System.out.println("WE NOW DELETE 48");
         Keanu.delete(48);
         p.printNode(Keanu.getRoot());
         System.out.print("INORDER:");
         System.out.println(Keanu.inorder());
         System.out.print("PREORDER:");
         System.out.println(Keanu.preorder());
         System.out.print("INORDER DETAILED:");
         System.out.println(Keanu.inorderDetailed());
         System.out.print("PREORDER DETAILED:");
         System.out.println(Keanu.preorderDetailed());
         

         System.out.println();
         System.out.println("WE NOW DELETE 55");
         Keanu.delete(55);
         p.printNode(Keanu.getRoot());
         System.out.print("INORDER:");
         System.out.println(Keanu.inorder());
         System.out.print("PREORDER:");
         System.out.println(Keanu.preorder());
         System.out.print("INORDER DETAILED:");
         System.out.println(Keanu.inorderDetailed());
         System.out.print("PREORDER DETAILED:");
         System.out.println(Keanu.preorderDetailed());
         
      


         System.out.println();
         System.out.println("WE NOW DELETE 66");
         Keanu.delete(66);
         p.printNode(Keanu.getRoot());
         System.out.print("INORDER:");
         System.out.println(Keanu.inorder());
         System.out.print("PREORDER:");
         System.out.println(Keanu.preorder());
         System.out.print("INORDER DETAILED:");
         System.out.println(Keanu.inorderDetailed());
         System.out.print("PREORDER DETAILED:");
         System.out.println(Keanu.preorderDetailed());


         System.out.println();
         System.out.println("WE NOW DELETE 410");
         Keanu.delete(410);
         p.printNode(Keanu.getRoot());
         System.out.print("INORDER:");
         System.out.println(Keanu.inorder());
         System.out.print("PREORDER:");
         System.out.println(Keanu.preorder());
         System.out.print("INORDER DETAILED:");
         System.out.println(Keanu.inorderDetailed());
         System.out.print("PREORDER DETAILED:");
         System.out.println(Keanu.preorderDetailed());
   

         System.out.println();
         System.out.println("WE NOW DELETE 400");
         Keanu.delete(400);
         p.printNode(Keanu.getRoot());
         System.out.print("INORDER:");
         System.out.println(Keanu.inorder());
         System.out.print("PREORDER:");
         System.out.println(Keanu.preorder());
         System.out.print("INORDER DETAILED:");
         System.out.println(Keanu.inorderDetailed());
         System.out.print("PREORDER DETAILED:");
         System.out.println(Keanu.preorderDetailed());


         System.out.println();
         System.out.println("WE NOW DELETE 468");
         Keanu.delete(468);
         p.printNode(Keanu.getRoot());
         System.out.print("INORDER:");
         System.out.println(Keanu.inorder());
         System.out.print("PREORDER:");
         System.out.println(Keanu.preorder());
         System.out.print("INORDER DETAILED:");
         System.out.println(Keanu.inorderDetailed());
         System.out.print("PREORDER DETAILED:");
         System.out.println(Keanu.preorderDetailed());


         System.out.println();
         System.out.println("WE NOW DELETE 79");
         Keanu.delete(79);
         p.printNode(Keanu.getRoot());
         System.out.print("INORDER:");
         System.out.println(Keanu.inorder());
         System.out.print("PREORDER:");
         System.out.println(Keanu.preorder());
         System.out.print("INORDER DETAILED:");
         System.out.println(Keanu.inorderDetailed());
         System.out.print("PREORDER DETAILED:");
         System.out.println(Keanu.preorderDetailed());


         System.out.println();
      

            System.out.println("/////////////////////////////////////////////////////////");
         

            System.out.println("FROM HERE ON WE WILL DO NULL CHECKS TO SEE HOW YOUR CODE RESPONDS TO EMPTY TREE");
            System.out.println();


            System.out.println("Height of the tree is:"+ Keanu.getHeight());
            System.out.println("Does the tree contain 420: "+ Keanu.contains(420));
            System.out.println("The number of nodes in the tree is:"+ Keanu.getNumberOfNodes());
            System.out.println("The height of this tree is:" + Keanu.getHeight());
            System.out.println("Inorder:"+Keanu.inorder());
         
            System.out.println("Inorder Detailed:"+Keanu.inorderDetailed());
            System.out.println("preOrder:" + Keanu.preorder());
            System.out.println("preOrderDetailed:"+ Keanu.preorderDetailed());
         
            System.out.println("WE NOW DELETE 79");
            Keanu.delete(79);
            System.out.println("print out the tree with inorder once again");
            System.out.println(Keanu.inorder());
         
            
            System.out.println();

            System.out.println("NOW WE WILL TRY TO CLONE AN EMPTY TREE");
            ThreadedAVLTree<Integer> Michaela=new ThreadedAVLTree<Integer>(Keanu) ;
            p.printNode(Michaela.getRoot());
            System.out.println();
         
            System.out.println();
            System.out.println("NOW WE WILL TRY TO CLONE THE EMPTY TREE AND PRINT IT");

            ThreadedAVLTree<Integer> Luca=new ThreadedAVLTree<Integer>(Keanu.clone()) ;
            p.printNode(Luca.getRoot());
         
            System.out.println("NO TREE SHOULD HAVE BEEN PRINTED OUT AND NO NULL POINTER EXCEPTION... GREAT YOU ARE CLOSE....");

            System.out.println();
            System.out.println("If you can see me then you have come a long way, may the fitchfork be with you....");
            System.out.println();
            System.out.println(" +\"\"\"\"\"+ ");
            System.out.println("[| o o |]");
            System.out.println(" |  ^  | ");
            System.out.println(" | '-' | ");
            System.out.println(" +-----+ ");

            System.out.println();
            System.out.println("GOOD LUCK ");

            System.out.println();
            int a, b, size = 15;
            for (a = size / 2; a <= size; a = a + 2) {    
            for (b = 1; b < size - a; b = b + 2)
                System.out.print(" "); 
            for (b = 1; b <= a; b++)
                System.out.print("A");  
            for (b = 1; b <= size - a; b++)
                System.out.print(" ");   
            for (b = 1; b <= a - 1; b++)
                System.out.print("A");
        
            System.out.print("\n");
            }     
            for (a = size; a >= 0; a--) {
            for (b = a; b < size; b++)
                System.out.print(" ");
            for (b = 1; b <= ((a * 2) - 1); b++)
                System.out.print("V");
            System.out.print("\n");
            }
        }
   
	}
   

// // THIS IS THE CORRECT OUTPUT OF THE MAIN.............................

// /*

// ///////////////////////////////////////////////////////
// THIS GIVES THE NUMBER OF NODES AFTER EACH INSERT, IT SHOULD GO 0,1,2,3,4,5,6,7
// 0
// 1
// 2
// 3
// 4
// 5
// 6
// 7


// ///////////////////////////////////////////////////////
// THIS GIVES THE HEIGHT OF THE TREE AFTER EACH INSERT, IT SHOULD GO 0,1,2,2,3,3,3,3
// 0
// 1
// 2
// 2
// 3
// 3
// 3
// 3
//    30       
//   / \
//  /   \
//  20   50
// / \ / \
// 10 25 40 55 


// THE TREE ABOVE AND BELOW SHOULD BE EXACTLY THE SAME, THE COPY CONSTRUCTOR IS BEING TESTED
//    30       
//   / \
//  /   \
//  20   50
// / \ / \ 
// 10 25 40 55 


// THE TREE ABOVE AND BELOW SHOULD BE EXACTLY THE SAME, THE CLONE FUNCTION IS BEING TESTED
//    30       
//   / \
//  /   \
//  20   50
// / \ / \
// 10 25 40 55 


// EVERYTHING FROM HERE SHOULD BE FOUND
// ////////////////////////////////////////////////////////////////////////
// 10 was found
// 30 was found
// 40 was found
// 50 was found
// 25 was found
// 55 was found


// EVERYTHING FROM HERE SHOULD NOT NOT NOT NOT NOT NOT BE FOUND
// ////////////////////////////////////////////////////////////////////////
// 1 was not found
// 2 was not found
// 22 was not found
// 51 was not found
// 105 was not found

// ///////////////////// TESTING INORDER PRINTING...
// 10,20,25,30,40,50,55

// ///////////////////// TESTING INORDER Detailed...
// 10|20,25|30,40|50,55

// ///////////////////// TESTING PREORDER PRINTING...
// 30,20,10,25,50,40,55

// ///////////////////// TESTING PREORDER DETAILED...
// 30,20,10|25|50,40|55


// /////////////////////////////////////////////////////////////////////////////////////////////////
// FROM HERE WE WILL JUST CREATE A BIGGER TREE AND TEST INORDER AND PREORDER TRAVERSALS
//                250
//               / \               
//              /   \
//             /     \
//            /       \
//           /         \
//          /           \
//         /             \
//        /               \
//        69               420               
//       / \             / \
//      /   \           /   \
//     /     \         /     \     
//    /       \       /       \    
//    48       114       400       500
//   / \     / \     / \     / \
//  /   \   /   \   /   \   /   \
//  20   66   100   212   260   410   468   800   
//     /   /   /     \
//   55 79 140   350


// ///////////////////// TESTING INORDER PRINTING...
// 20,48,55,66,69,79,100,114,140,212,250,260,350,400,410,420,468,500,800

// ///////////////////// TESTING INORDER Detailed...
// 20|48,55|66|69,79|100|114,140|212|250,260,350|400,410|420,468|500,800

// ///////////////////// TESTING PREORDER PRINTING...
// 250,69,48,20,66,55,114,100,79,212,140,420,400,260,350,410,500,468,800

// ///////////////////// TESTING PREORDER DETAILED...
// 250,69,48,20|66,55||114,100,79||212,140||420,400,260,350|410|500,468|800


// ////////////////////////////////////////
// HERE WE WILL START TO DELETE AND TEST...

// WE FIRST DELETE 250
//                212
//               / \   
//              /   \
//             /     \
//            /       \
//           /         \
//          /           \
//         /             \
//        /               \        
//        69               420
//       / \             / \       
//      /   \           /   \      
//     /     \         /     \
//    /       \       /       \    
//    48       114       400       500       
//   / \     / \     / \     / \   
//  /   \   /   \   /   \   /   \
//  20   66   100   140   260   410   468   800
//     /   /         \
//   55 79     350         

// INORDER:20,48,55,66,69,79,100,114,140,212,260,350,400,410,420,468,500,800
// PREORDER:212,69,48,20,66,55,114,100,79,140,420,400,260,350,410,500,468,800
// INORDER DETAILED:20|48,55|66|69,79|100|114,140|212,260,350|400,410|420,468|500,800
// PREORDER DETAILED:212,69,48,20|66,55||114,100,79||140|420,400,260,350|410|500,468|800

// WE NOW DELETE 420
//                212
//               / \
//              /   \              
//             /     \
//            /       \            
//           /         \
//          /           \
//         /             \
//        /               \
//        69               410
//       / \             / \       
//      /   \           /   \
//     /     \         /     \     
//    /       \       /       \
//    48       114       350       500
//   / \     / \     / \     / \
//  /   \   /   \   /   \   /   \  
//  20   66   100   140   260   400   468   800
//     /   /
//   55 79

// INORDER:20,48,55,66,69,79,100,114,140,212,260,350,400,410,468,500,800
// PREORDER:212,69,48,20,66,55,114,100,79,140,410,350,260,400,500,468,800
// INORDER DETAILED:20|48,55|66|69,79|100|114,140|212,260|350,400|410,468|500,800
// PREORDER DETAILED:212,69,48,20|66,55||114,100,79||140|410,350,260|400|500,468|800

// WE NOW DELETE 69
//                212
//               / \
//              /   \
//             /     \
//            /       \
//           /         \
//          /           \
//         /             \         
//        /               \
//        66               410               
//       / \             / \
//      /   \           /   \      
//     /     \         /     \
//    /       \       /       \
//    48       114       350       500       
//   / \     / \     / \     / \
//  /   \   /   \   /   \   /   \  
//  20   55   100   140   260   400   468   800
//         /
//     79
     
// INORDER:20,48,55,66,79,100,114,140,212,260,350,400,410,468,500,800
// PREORDER:212,66,48,20,55,114,100,79,140,410,350,260,400,500,468,800
// INORDER DETAILED:20|48,55|66,79|100|114,140|212,260|350,400|410,468|500,800
// PREORDER DETAILED:212,66,48,20|55|114,100,79||140|410,350,260|400|500,468|800

// WE NOW DELETE 1
//                212
//               / \               
//              /   \
//             /     \
//            /       \  
//           /         \
//          /           \
//         /             \
//        /               \        
//        66               410
//       / \             / \
//      /   \           /   \
//     /     \         /     \     
//    /       \       /       \    
//    48       114       350       500       
//   / \     / \     / \     / \   
//  /   \   /   \   /   \   /   \  
//  20   55   100   140   260   400   468   800   
//         /
//     79

// INORDER:20,48,55,66,79,100,114,140,212,260,350,400,410,468,500,800
// PREORDER:212,66,48,20,55,114,100,79,140,410,350,260,400,500,468,800
// INORDER DETAILED:20|48,55|66,79|100|114,140|212,260|350,400|410,468|500,800
// PREORDER DETAILED:212,66,48,20|55|114,100,79||140|410,350,260|400|500,468|800

// WE NOW DELETE 140
//        212
//       / \       
//      /   \      
//     /     \
//    /       \    
//    66       410
//   / \     / \
//  /   \   /   \
//  48   100   350   500
// / \ / \ / \ / \
// 20 55 79 114 260 400 468 800 

// INORDER:20,48,55,66,79,100,114,212,260,350,400,410,468,500,800
// PREORDER:212,66,48,20,55,100,79,114,410,350,260,400,500,468,800
// INORDER DETAILED:20|48,55|66,79|100,114|212,260|350,400|410,468|500,800
// PREORDER DETAILED:212,66,48,20|55|100,79|114|410,350,260|400|500,468|800

// WE NOW DELETE 100
//        212
//       / \       
//      /   \      
//     /     \
//    /       \
//    66       410
//   / \     / \   
//  /   \   /   \  
//  48   79   350   500   
// / \   \ / \ / \
// 20 55   114 260 400 468 800

// INORDER:20,48,55,66,79,114,212,260,350,400,410,468,500,800
// PREORDER:212,66,48,20,55,79,114,410,350,260,400,500,468,800
// INORDER DETAILED:20|48,55|66,79,114|212,260|350,400|410,468|500,800
// PREORDER DETAILED:212,66,48,20|55|79,114|410,350,260|400|500,468|800

// WE NOW DELETE 500
//        212
//       / \
//      /   \      
//     /     \     
//    /       \
//    66       410       
//   / \     / \
//  /   \   /   \
//  48   79   350   468   
// / \   \ / \   \
// 20 55   114 260 400   800

// INORDER:20,48,55,66,79,114,212,260,350,400,410,468,800
// PREORDER:212,66,48,20,55,79,114,410,350,260,400,468,800
// INORDER DETAILED:20|48,55|66,79,114|212,260|350,400|410,468,800
// PREORDER DETAILED:212,66,48,20|55|79,114|410,350,260|400|468,800

// WE NOW DELETE 800
//        212               
//       / \
//      /   \
//     /     \
//    /       \
//    66       410       
//   / \     / \
//  /   \   /   \
//  48   79   350   468
// / \   \ / \
// 20 55   114 260 400     

// INORDER:20,48,55,66,79,114,212,260,350,400,410,468
// PREORDER:212,66,48,20,55,79,114,410,350,260,400,468
// INORDER DETAILED:20|48,55|66,79,114|212,260|350,400|410,468
// PREORDER DETAILED:212,66,48,20|55|79,114|410,350,260|400|468

// WE NOW DELETE 212
//        114
//       / \
//      /   \
//     /     \     
//    /       \
//    66       410
//   / \     / \   
//  /   \   /   \
//  48   79   350   468   
// / \     / \
// 20 55   260 400

// INORDER:20,48,55,66,79,114,260,350,400,410,468
// PREORDER:114,66,48,20,55,79,410,350,260,400,468
// INORDER DETAILED:20|48,55|66,79|114,260|350,400|410,468
// PREORDER DETAILED:114,66,48,20|55|79|410,350,260|400|468

// WE NOW DELETE 20
//        114
//       / \       
//      /   \
//     /     \
//    /       \
//    66       410       
//   / \     / \
//  /   \   /   \
//  48   79   350   468   
//   \     / \     
//   55   260 400     

// INORDER:48,55,66,79,114,260,350,400,410,468
// PREORDER:114,66,48,55,79,410,350,260,400,468
// INORDER DETAILED:48,55|66,79|114,260|350,400|410,468
// PREORDER DETAILED:114,66,48,55|79|410,350,260|400|468

// WE NOW DELETE 114
//        79
//       / \       
//      /   \      
//     /     \
//    /       \    
//    55       410
//   / \     / \   
//  /   \   /   \  
//  48   66   350   468   
//         / \     
//     260 400     

// INORDER:48,55,66,79,260,350,400,410,468
// PREORDER:79,55,48,66,410,350,260,400,468
// INORDER DETAILED:48|55,66|79,260|350,400|410,468
// PREORDER DETAILED:79,55,48|66|410,350,260|400|468

// WE NOW DELETE 260
//        79
//       / \
//      /   \
//     /     \
//    /       \
//    55       410
//   / \     / \   
//  /   \   /   \  
//  48   66   350   468
//           \
//       400

// INORDER:48,55,66,79,350,400,410,468
// PREORDER:79,55,48,66,410,350,400,468
// INORDER DETAILED:48|55,66|79,350,400|410,468
// PREORDER DETAILED:79,55,48|66|410,350,400|468

// WE NOW DELETE 350
//    79
//   / \   
//  /   \
//  55   410
// / \ / \
// 48 66 400 468

// INORDER:48,55,66,79,400,410,468
// PREORDER:79,55,48,66,410,400,468
// INORDER DETAILED:48|55,66|79,400|410,468
// PREORDER DETAILED:79,55,48|66|410,400|468

// WE NOW DELETE 48
//    79
//   / \
//  /   \
//  55   410
//   \ / \
//   66 400 468

// INORDER:55,66,79,400,410,468
// PREORDER:79,55,66,410,400,468
// INORDER DETAILED:55,66|79,400|410,468
// PREORDER DETAILED:79,55,66|410,400|468

// WE NOW DELETE 55
//    79       
//   / \
//  /   \
//  66   410
//     / \
//   400 468

// INORDER:66,79,400,410,468
// PREORDER:79,66,410,400,468
// INORDER DETAILED:66|79,400|410,468
// PREORDER DETAILED:79,66|410,400|468

// WE NOW DELETE 66
//    410
//   / \   
//  /   \
//  79   468
//   \
//   400

// INORDER:79,400,410,468
// PREORDER:410,79,400,468
// INORDER DETAILED:79,400|410,468
// PREORDER DETAILED:410,79,400|468

// WE NOW DELETE 410
//  400
// / \
// 79 468

// INORDER:79,400,468
// PREORDER:400,79,468
// INORDER DETAILED:79|400,468
// PREORDER DETAILED:400,79|468

// WE NOW DELETE 400
//  79
//   \
//   468 

// INORDER:79,468
// PREORDER:79,468
// INORDER DETAILED:79,468
// PREORDER DETAILED:79,468

// WE NOW DELETE 468
// 79

// INORDER:79
// PREORDER:79
// INORDER DETAILED:79
// PREORDER DETAILED:79

// WE NOW DELETE 79
// INORDER:
// PREORDER:
// INORDER DETAILED:
// PREORDER DETAILED:

// /////////////////////////////////////////////////////////
// FROM HERE ON WE WILL DO NULL CHECKS TO SEE HOW YOUR CODE RESPONDS TO EMPTY TREE

// Height of the tree is:0
// Does the tree contain 420: false
// The number of nodes in the tree is:0
// The height of this tree is:0
// Inorder:
// Inorder Detailed:
// preOrder:
// preOrderDetailed:
// WE NOW DELETE 79
// print out the tree with inorder once again


// NOW WE WILL TRY TO CLONE AN EMPTY TREE


// NOW WE WILL TRY TO CLONE THE EMPTY TREE AND PRINT IT
// NO TREE SHOULD HAVE BEEN PRINTED OUT AND NO NULL POINTER EXCEPTION... GREAT YOU ARE CLOSE....

// If you can see me then you have come a long way, may the fitchfork be with you....

//  +"""""+
// [| o o |]
//  |  ^  |
//  | '-' |
//  +-----+

// GOOD LUCK

//     AAAAAAA        AAAAAA
//    AAAAAAAAA      AAAAAAAA
//   AAAAAAAAAAA    AAAAAAAAAA
//  AAAAAAAAAAAAA  AAAAAAAAAAAA
// AAAAAAAAAAAAAAAAAAAAAAAAAAAAA
// VVVVVVVVVVVVVVVVVVVVVVVVVVVVV
//  VVVVVVVVVVVVVVVVVVVVVVVVVVV
//   VVVVVVVVVVVVVVVVVVVVVVVVV
//    VVVVVVVVVVVVVVVVVVVVVVV
//     VVVVVVVVVVVVVVVVVVVVV
//      VVVVVVVVVVVVVVVVVVV
//       VVVVVVVVVVVVVVVVV
//        VVVVVVVVVVVVVVV
//         VVVVVVVVVVVVV
//          VVVVVVVVVVV
//           VVVVVVVVV
//            VVVVVVV
//             VVVVV
//              VVV
//               V
//       */