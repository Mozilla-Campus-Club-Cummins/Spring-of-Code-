<!--Issue #74-->
# ***TREE DATA STRUCTURE DOCUMENTATION***
Hi, I'm Aastha. <br/>
I am currently working on 'TREE DATA STRUCTURE DOCUMENTATION'.  

you can reach me on:
Mail: aasthathorat83@gmail.com <br/><br/>

## **Description**  
- This project explains Tree Data Structure(Binary Tree and Binary Search Tree).
- Working of Tree Data Structure.
- Creation of Binary Tree and Binary Search Tree.
- Time complexity and Space complexity of Binary Tree and Binary Search Tree.

## **Introduction**
- A tree data structure is defined as a collection of objects or entities known as __nodes__ that are linked together to represent or simulate hierarchy.
- A tree data structure is a non-linear data structure because it does not store in a sequential manner. It is a hierarchical structure as elements in a Tree are arranged in multiple levels.
- In the Tree data structure, the topmost node is known as a __root__ node. Each node contains some data, and data can be of any type.
- Each node contains some data and the link or reference of other nodes that can be called __children__.  


## **Working**

**Here's how a tree data structure works:**

1.The tree starts with a root node. The root node is the topmost node in the tree and has no parent.  
2.Each node in the tree may have zero or more child nodes. A child node is a node that is directly connected to its parent node by an edge.  
3.Nodes that have no children are called leaf nodes. Leaf nodes are the nodes at the bottom of the tree.  
4.The path from the root node to any node in the tree is called a path.  
5.The height of a tree is the length of the longest path from the root node to any leaf node.  
6.The depth of a node is the length of the path from the root node to that node.  
A binary tree is a tree where each node has at most two child nodes, commonly referred to as the left child and the right child.  
7.Trees can be used to represent a wide variety of data structures, such as file systems, organizational charts, and family trees.  
8.Some common operations performed on trees include traversal (visiting every node in the tree), insertion (adding a new node to the tree), deletion (removing a node from the tree), and search (finding a specific node in the tree)  
9.Some common types of trees include binary trees, binary search trees, AVL trees, B-trees, and red-black trees. Each type of tree has its own specific characteristics and is suitable for specific types of applications.  


![image](https://media.geeksforgeeks.org/wp-content/uploads/20221124153129/Treedatastructure.png)<br/>

### __Types of Tree Data Structure__  
The following are the different types of trees data structures:

1.Binary Tree  
2.Binary Search Tree (BST)  
3.AVL Tree  
4.B-Tree  

1.***Binary Tree*** :  
A binary tree is a tree data structure in which each node can have 0, 1, or 2 children – left and right child.


![image2](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRyhepft5VrWPRCMw7U7c84QaZplhvlFAWIAkhKpVG5cqvJ4wrusLVpojRR-jb2Tp91gwY&usqp=CAU)<br/>  

2.***Binary Search Tree*** :    
A binary search tree (BST) is also called an ordered or sorted binary tree in which the value at the left sub-tree is lesser than that of the root and the right subtree has a value greater than that of the root.  
The most important difference between Binary Tree and Binary Search Tree is that in a BST, the left child node’s value must be less than the parent’s while the right child node’s value must be higher.  


![image3](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20221215114732/bst-21.png)  

3.***AVL Tree*** :  
An AVL tree is a self-balancing binary search tree. It is designed to keep the tree height balanced at all times, which ensures that the operations on the tree (insertion, deletion, search) run in O(log n) time complexity, where n is the number of nodes in the tree.
The height balance property of an AVL tree is maintained by enforcing a maximum height difference of one between any two subtrees of a node. If the height difference exceeds one, a rotation operation is performed to rebalance the tree.


![image4](https://media.geeksforgeeks.org/wp-content/uploads/20221229121830/avl.png)

4.***B-Tree*** :  
B tree is a self-balancing search tree wherein each node can contain more than one key and more than two children. It is a special type of m-way tree and a generalized type of binary search tree. B-tree can store many keys in a single node and can have multiple child nodes. This reduces the height and enables faster disk access.

![image4](https://media.geeksforgeeks.org/wp-content/uploads/20200506235136/output253.png)  



**________________________________________________________________________________________________________________________________________________________**




## ***BINARY TREE***  


### Creation of Binary Tree :  
 ``` bash    
    void create()                                   //method to create binary tree
    {
    node ptr,cur;
    node st[]=new node[50];                         //declaring stack
    int flag1=0;                                     //using 2 flag ( flag1 for  moving right or left)
    int flag=0,ans=0,v;                            //flag is to continueadding
    Scanner sc1=new Scanner(System.in);
    for(int i=0;i<50;i++)                           //initializing memory 
    {
    st[i]=new node();
    }
    System.out.println("Enter Value for Root :");   //accepting value of root
    v=sc1.nextInt();
    ptr=new node();                                 //creating new node ptr to add
    ptr.data=v;
    ptr.left=null;
    ptr.right=null;
    root=ptr;
    System.out.println("Created Root");
    cur=root;
    do
    {
    if(flag1==0)
    {
    flag1=1;
    System.out.println("Do you want to add to left of "+cur.data);      
                                                   //1 to add and 0 to not to add
    ans=sc1.nextInt();
    if(ans==1)                                     //if user want to add left of node
    {
    System.out.println("Enter value of Node :");

                                                   //accepting value of that node
    v=sc1.nextInt();
    ptr=new node();
    ptr.data=v;
    ptr.left=null;                                  //attaching that node to the root

    ptr.right=null;
    top++;
    st[top]=cur;                                    //push cur at top of the stack
    cur.left=ptr;
    cur=ptr;
    flag1=0;
    }
    }
    if(flag1==1)                                     //if user want to add to the right of node
    {
    System.out.println("Do you Want to Add to right of "+cur.data);

    ans=sc1.nextInt();                               //again asking user to add to the right of node

    if(ans==1)
    {
    System.out.println("Enter Value of Root :");

    //accepting value of root
    v=sc1.nextInt();
    ptr=new node();
    ptr.data=v;
    ptr.left=null;                                      //attaching that node to the right

    ptr.right=null;
    cur.right=ptr;
    cur=ptr;
    flag1=0;
    }
    else
    {
    if(top==-1)                                      //if stack is empty then it will stop creating further i.e flag=1
    {
    flag=1;
    }
    else
    cur=st[top--];                                   //else pop the cur
    }
    }
    }while(flag==0);                                //do while loop will continue till flag=0
    } 
 ```    
 
**Time Complexity and Space Complexity Of Creation of Binary Tree :**  
-- The time complexity of creating a binary tree is **O(n)** in the worst case and **O(n log n)** in the average case.  
-- The space complexity of creating a binary tree with n nodes is O(n).  
    
**Time Complexity of different operations on binary tree :**
-- Search: In the worst case, where the binary tree is skewed and unbalanced, the time complexity for search is O(n), where n is the number of nodes in the tree. In the average case, where the tree is balanced, the time complexity for search is O(log n).  
-- Insertion: The time complexity for insertion in a binary tree is the same as that of search. In the worst case, where the tree is unbalanced, the time complexity is O(n). In the average case, where the tree is balanced, the time complexity is O(log n).  
-- Deletion: The time complexity for deletion in a binary tree is the same as that of search. In the worst case, where the tree is unbalanced, the time complexity is O(n). In the average case, where the tree is balanced, the time complexity is O(log n).  
-- Traversal: There are three main types of tree traversal: inorder, preorder, and postorder. Each traversal visits every node in the tree exactly once. The time complexity for each type of traversal is O(n), where n is the number of nodes in the tree.  



**_______________________________________________________________________________________________________________________________________________________**





## ***BINARY SEARCH TREE***  


### Creation of Binary Search Tree :    


``` bash
    void create() 
    {
    int ans;
    Scanner sc1=new Scanner(System.in);
    do 
    {
    node ptr,prev,cur;
    ptr=new node();
    System.out.println("Enter the Integer to be added in the Tree -> ");
    int v = sc1.nextInt();                               //using scanner to take input
    ptr.data=word;
    ptr.left=null;
    ptr.right=null;
    prev=null;
    cur=root;
                                                          //this is the new self initialized node to be added at appropriate place
                                                          //if root is null , add node as root
    if(root==null)
    {
    root=ptr;
    System.out.println("Data added successfully at root");
    }
 
    else
    {
                                                            //if the node is not the root node , add it sequentially
    while(cur!=null && cur.data!=v)
    {
    prev=cur;
    if(prev.data>v)
    cur=cur.left;
    else
    cur=cur.right;
                                                           //cur is the place where node is to be added
    }
 
    if(cur!=null && cur.data==v)
    System.out.println("NO DUPLICATION ");
 
                                                          //now add node either to left or right of prev
    if(prev.data>v)
    {
    prev.left=ptr;
    System.out.println("Data added successfully in the dictionary");
    }
    else
    {
    prev.right=ptr;
    System.out.println("Data added successfully in the dictionary");
                                                           //node added
    }
 
    }
    System.out.println("DO YOU WANT TO ADD OTHER WORD ? ");
    System.out.println("1.YES\n2.NO");
    ans=Integer.parseInt(br.readLine());
    }while(ans==1);
    }  
```
**Time Complexity and Space Complexity Of Creation of Binary Tree :**    

-- The **worst-case** time complexity of creating a binary search tree (BST) is **O(n^2)**, where n is the number of nodes, if the nodes are inserted in a sorted order.    
-- The **best-case** time complexity of creating a binary search tree (BST) is **O(n)**, where n is the number of nodes, if the nodes are already sorted.    
-- The **average time** complexity of creating a binary search tree (BST) is **O(n log n)**, where n is the number of nodes.    
-- The **space complexity** of creating a binary search tree (BST) is **O(n)**, where n is the number of nodes in the tree.  

Here's the time complexity of different operations on a binary search tree (BST):

-- Search: The time complexity of searching for a value in a BST depends on the height of the tree. In the worst case, where the BST is completely unbalanced, the time complexity is O(n), where n is the number of nodes in the tree. However, in a balanced BST, the time complexity for searching is O(log n), where n is the number of nodes in the tree.  
-- Insertion: The time complexity for inserting a new node in a BST also depends on the height of the tree. In the worst case, where the BST is completely unbalanced, the time complexity is O(n), where n is the number of nodes in the tree. However, in a balanced BST, the time complexity for insertion is also O(log n), where n is the number of nodes in the tree.  
-- Deletion: The time complexity for deleting a node in a BST also depends on the height of the tree. In the worst case, where the BST is completely unbalanced, the time complexity is O(n), where n is the number of nodes in the tree. However, in a balanced BST, the time complexity for deletion is also O(log n), where n is the number of nodes in the tree.  
-- Traversal: In-order, pre-order, and post-order traversals of a BST visit every node exactly once. The time complexity for each type of traversal is O(n), where n is the number of nodes in the tree.  



**________________________________________________________________________________________________________________________________________________________**  

# **Conclusion:**  

In conclusion, a tree is a hierarchical data structure that has many real-world applications, such as representing organizational structures, file systems, and 
computer networks. Trees can be implemented using various data structures, such as arrays or linked lists, and different types of trees, such as binary search 
trees or AVL trees, have specific properties that make them useful for different scenarios. The terminology used in trees, such as root, parent, child, and leaf, 
is important for understanding how the structure works and designing efficient algorithms. Trees are an essential data structure for computer science and software 
engineering and are used in many applications to solve complex problems efficiently.  
