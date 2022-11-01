/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9dsa;
/**
 *
 * @author Admin
 */

public class BinarySearchTree {
    //Defining Node class as follows
    class Node{
        int data;
        Node left,right; 
        
        public Node(int data){
            this.data = data; 
            this.left = right = null;
        }
    }
    //Declaring the root of BST
    Node root;
    //Constructor Overloading
    //1st Case for empty root
    public BinarySearchTree(){
        root = null;
    }
    //2nd Case we start off with one root Node and give it a value
    public BinarySearchTree(int value){
        root = new Node(value);
    }
    //This insert method is for user to use.
    //If the user enter a key value, it will initiate/create the BST 
    void insert(int key){
        //the insertRecursive returns a root which contains all child we inserted
        //see insertRecursive below******
        //I tried recursive with million N and stack overflow so 
        //I changed to iterative method instead
        //root = insertRecursive(root, key);
    root = insertIterative(root,key);
    }
    public  Node insertIterative(Node root, int key)
    {
        // start with the root node
        Node curr = root;
 
        // pointer to store the parent of the current node
        Node parent = null;
 
        // if the tree is empty, create a new node and set it as root
        if (root == null) {
            return new Node(key);
        }
 
        // traverse the tree and find the parent node of the given key
        while (curr != null)
        {
            // update the parent to the current node
            parent = curr;
 
            // if the given key is less than the current node,
            // go to the left subtree; otherwise, go to the right subtree.
            if (key < curr.data) {
                curr = curr.left;
            }
            else {
                curr = curr.right;
            }
        }
 
        // construct a node and assign it to the appropriate parent pointer
        if (key < parent.data) {
            parent.left = new Node(key);
        }
        else {
            parent.right = new Node(key);
        }
 
        return root;
    }
 
    //This insert method is the internal backend 
    private Node insertRecursive(Node root, int key){
        //If empty return set the key as the root so we'll have a single root node with a value.
        if (root == null){
            root = new Node(key);
            return root;
        }
        //Else if not empty, recur down the tree 
        
        //if the inserting key is less than the root go down left and bind the value at the left
        else if (key < root.data){
            root.left = insertRecursive(root.left,key);
        }
        //else if the inserting key is more than the root go down right and bind the value at the right
        else if(key > root.data){
            root.right = insertRecursive(root.right,key);
        }
        //Once all the condition is no longer met return the root.
        return root;
    }
    //Method for user to print out inorder
    
    void inorder(){
        //This method calls inorderRecursive method see the code below*******
        
        //I tried recursion and stackoverflows happens
        inorderRecursive(root);
    }
    //I actually copied this from geek4geek and dont understand sh** 
    //so I wrote my own iterative bst inroder method below.
    private void inorderRecursive(Node root){
        //This was quite hard to understand so I wrote a detailed explanation of what's happening here
        if (root!= null){
            //first imagine the first recursion of these 3 lines of code.
            //it goes down left then put println and inroderRecursive(root.right) into a "Queue"
            //println and inroderRecusive(root.right) will run but after inroderRecursive(root.left)
            //has finished 
            
            //basically it goes down left print current and down right
            //but down left execute first which goes further left print down left self and down further right
            
            //notice that at the leaf root.left and root.right is empty so the recursion stops and print itself
            inorderRecursive(root.left);
            System.out.println(root.data);
            inorderRecursive(root.right);
        }
    }
    
    public static void firstSetBenchmark(int N){
        long startTime = System.currentTimeMillis();
        BinarySearchTree tree = new BinarySearchTree();
        for (int i=0; i < N; i++){
            tree.insert(i);
        }
        long endTime =  System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
    
    public static void secondSetBenchmark(int N){
        long startTime = System.currentTimeMillis();
        BinarySearchTree tree = new BinarySearchTree();
        for (int i=0; i < N; i++){
            tree.insert((int)(N*Math.random()));
        }
        long endTime =  System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
    
    public static void main(String[] args) {
        //You might notice my time complexity is weird 
        //That's because I actually wrote a loop to print out run time
        //so i could go take a shower in the mean time.
        int[] myN = new int[10];
        for (int i= 0; i < myN.length;i++){
            myN[i] = (i+1)*30000;
            firstSetBenchmark(myN[i]);
        }
        System.out.println("--------------------------------");
        for (int i= 0; i < myN.length;i++){
            secondSetBenchmark(myN[i]);
        }
        
    }
    
}
