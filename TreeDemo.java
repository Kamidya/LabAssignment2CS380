/**
 * An implementation of a Tree.
 * <p>
 * Uses an array to store nodes.
 * @author Kameron Barayuga
 *
 */
class Node{
   int value;
   Node left, right;
   
   public Node(int value){
      this.value = value;
      left = null;
      right = null;
   }

}

class BinarySearchTree{

   Node root;
   
   
   /*
   recursive insert method
   */
   public Node insert(Node root, int value){
      //base case
      if(root == null){
         root = new Node(value);
         return root;
      }
      
      //recursive step
      if(value < root.value){
         root.left = insert(root.left, value); 
      }else{
         root.right = insert(root.right, value);
      }
      
      return root;
   }



   /**
    * Sorts tree in pre-order of insertion
    * @param root Node to be sorted.
    */
   public void preOrderTraversal(Node root){
      if (root == null)
         return;

      //prints value of node
      System.out.print(root.value + " ");

      //first recursion on left child
      preOrderTraversal(root.left);

      //second recursion on right child
      preOrderTraversal(root.right);
   }

   
   
   /**
    * Sorts tree in order of insertion
    * @param root Node to be sorted.
    */
   public void inOrderTraversal(Node root){
      if (root == null)
         return;

      //first recursion on left child
      inOrderTraversal(root.left);

      //prints value of node
      System.out.print(root.value + " ");

      //second recursion on right child
      inOrderTraversal(root.right);
   }



   /**
    * Sorts tree in post order of insertion
    * @param root Node to be sorted.
    */
   public void postOrderTraversal(Node root){
      if (root == null)
         return;

      //first recursion on left child
      postOrderTraversal(root.left);

      //second recursion on right child
      postOrderTraversal(root.right);
      
      //prints value of node
      System.out.print(root.value + " ");

   }
   
   
   
   /*
   a method to find the node in the tree
   with a specific value
   */
   public boolean find(Node root, int key){
	  //implement me
      return false;           
   }
   
   
   
   /*
   a method to find the node in the tree
   with a smallest key
   */
   public int getMin(Node root){
      //implement me
      return 0;
   }
  
  
  
   /*
   a method to find the node in the tree
   with a largest key
   */
   public int getMax(Node root){
	  return 0;
   }
   
   
   
   /*
   this method will not compile until getMax
   is implemented
   */
   public Node delete(Node root, int key){
      
      if(root == null){
         return root;
      }else if(key < root.value){
         root.left = delete(root.left, key);
      }else if(key > root.value){
         root.right = delete(root.right, key);
      }else{
         //node has been found
         if(root.left==null && root.right==null){
            //case #1: leaf node
            root = null;
         }else if(root.right == null){
            //case #2 : only left child
            root = root.left;
         }else if(root.left == null){
            //case #2 : only right child
            root = root.right;
         }else{
            //case #3 : 2 children
            root.value = getMax(root.left);
            root.left = delete(root.left, root.value);
         }
      }
      return root;  
   }
   
   
   
}



public class TreeDemo{
   public static void main(String[] args){
      BinarySearchTree t1  = new BinarySearchTree();
      t1.insert(24);
      t1.insert(80);
      t1.insert(18);
      t1.insert(9);
      t1.insert(90);
      t1.insert(22);
            
      System.out.print("in-order :   ");
      t1.inOrderTraversal(t1.root);
      System.out.println();
           
      
   }  
}