// basics of trees pre order, post order, in order, level order traversal.
// sum of all nodes, height of tree, spiral traversal.
package trees;

import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class basictree {

  //preorder
    static void preOrder(Node root) {
      if(root == null)
        return;
      System.out.print(root.data + " ");
      preOrder(root.left);
      preOrder(root.right);
    }

  //postorder  
    static void postOrder(Node root) {
      if(root == null)
        return;
      postOrder(root.left);
      postOrder(root.right);
      System.out.print(root.data + " ");
    }

  //inorder  
    static void inOrder(Node root){
      if(root == null)
        return;
      inOrder(root.left);
      System.out.print(root.data + " ");
      inOrder(root.right);  
    }

  //levelorder  
    static void levelOrder(Node root){
        if (root == null)
            return;
        Queue<Node> qt = new LinkedList<>();
        qt.add(root);
        while (!qt.isEmpty()) {
            Node temp = qt.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null)
                qt.add(temp.left);
            if (temp.right != null)
                qt.add(temp.right);
        }
    }

  //spiralorder
    static void spiralOrder(Node root){
      if(root == null)
        return;

      Stack<Node> s1 = new Stack<>();
      Stack<Node> s2 = new Stack<>();

      s1.push(root);

      while(!s1.isEmpty() || !s2.isEmpty()){
          while(!s1.isEmpty()){
            Node temp = s1.pop();
            System.out.print(temp.data + " ");
            
            if(temp.right != null)
              s2.push(temp.right);
            if(temp.left != null)
              s1.push(temp.left);
          }

          while(!s2.isEmpty()){
            Node temp = s2.pop();
            System.out.print(temp.data + " ");

            if(temp.left != null)
              s1.push(temp.left);
            if(temp.right != null)
              s2.push(temp.right);  
          }
      }      
    }

    //sum of all nodes
    static int sumofNodes(Node root){
      if(root == null)
        return 0;

      return root.data + sumofNodes(root.left) + sumofNodes(root.right);  
    }

    // height of tree
    static int height(Node root){
      if(root == null)
        return 0;

      int leftHeight = height(root.left); 
      int rightHeight = height(root.right);
      
      return Math.max(leftHeight, rightHeight) + 1;
    }
    
    //main method
    static Node root;
    public static void main(String[] args) {
        root = new Node(10);
        root.left = new Node(11);
        root.right = new Node(12);
        root.left.left = new Node(13);
        root.left.right = new Node(14);
        root.right.left = new Node(15);
        root.right.right = new Node(16);

        int totalsum = sumofNodes(root);
        int treeheight = height(root);

        System.out.print("Preorder Traversal: ");
        preOrder(root);

        System.out.print("\nPostorder Traversal: ");
        postOrder(root);

        System.out.print("\nInorder Traversal: ");
        inOrder(root);

        System.out.print("\nLevelorder Traversal: ");
        levelOrder(root);

        System.out.print("\nSpiralorder Traversal: ");
        spiralOrder(root);

        System.out.print("\nSumofNodes: " + totalsum);
        sumofNodes(root);

        System.out.print("\nheightoftree: " + treeheight);
        height(root);
    }
}