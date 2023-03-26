

<!--Issue #73-->    
# ***ARRAY DATA STURUCTURE DOCUMENTATION***
Hi , I'm Sannidhi . <br/>
I am currently working on 'ARRAY DATA STURUCTURE DOCUMENTATION' problem statement .<br/>

you can reach me on:
Mail: nandgaonkar.sannidhi@gmail.com <br/><br/>

## Description
- This project explains Array Data Structure ,its working .<br/>
- fuctions used in array .<br/>
- Time complexity and Space complexity of each operation performed on the Array .

## **Introduction to Array Data Structure**
An array is a linear data structure that stores a collection of elements of the same data type. <br/>
It is one of the simplest data structures and is used to represent a fixed-size sequential collection of elements. <br/>
Each element in an array is identified by an index or a key, which is an integer value. <br/>
- Arrays have a number of useful properties: <br/>
      - including constant time access to individual elements<br/>
      - efficient memory usage, and fast traversal of elements in sequence.<br/> 
      - They are commonly used in algorithms and data processing applications<br/><br/>
![image](https://media.geeksforgeeks.org/wp-content/uploads/20220721080308/array.png)   
## **Operations**
The following are the common operations that can be performed on an array:    
- Insertion: Adding an element at a specified index  
- Deletion: Removing an element from a specified index  
- Traversal: Visiting each element in the array in sequence  
- Search: Finding the index of a specified element in the array  
- Sorting: Rearranging the elements of the array in a specified order    


## **Implementation**

In Java, all arrays are dynamically allocated.Arrays are stored in contiguous memory [consecutive memory locations].Since arrays are objects in Java, we can find their length using the object property length.A Java array variable can also be declared like other variables with [] after the data type.
The variables in the array are ordered, and each has an index beginning with 0.Java array can also be used as a static field, a local variable, or a method parameter.
The size of an array must be specified by int or short value and not long.Every array type implements the interfaces Cloneable and java.io.Serializable. 
 
 
 ### Declaration of array in java
 ***syntax :***  dataType[] arrayName;       
 ***examples :***   double[] data = new double[10];    
 ***declare and initialize and array :***   int[] age = {12, 4, 5, 2, 5}; 
 
 ##### Time complexity   
 Avereage: O(1)     
 worst:O(1) 
 
 ##### Space complexity :
 O(1)    
 
 
 ### Insertion of element in Array
 This function inserts a value at the specified index in the array. If the index is already occupied, the function shifts all the elements to the right of the index to make room for the new value.
 ![image](https://media.geeksforgeeks.org/wp-content/cdn-uploads/Insert-Operation-in-Unorted-Array.png)      

 ``` bash  
 static void insertElement(int arr[], int n, int x,int pos)   
    {   
        // shift elements to the right which are on the right side of pos   
        for (int i = n - 1; i >= pos; i--)   
            arr[i + 1] = arr[i];   
            arr[pos] = x;    
    }    
``` 
 ##### Time complexity   
 Avereage: O(n)         
 worst:O(n)         
    
 ##### Space complexity :
 O(1)    
 
 
 ### Search an element in Array
 In an unsorted array, the search operation can be performed by linear traversal from the first element to the last element     

``` bash
   static int findElement(int arr[], int n, int key)   
    {    
        for (int i = 0; i < n; i++)    
            if (arr[i] == key)    
                return i;   
        return -1;    
    }  
```     
 ##### Time complexity   
 Avereage: O(n)        
 worst:O(n)     
 
  ##### Space complexity :
 O(1)    
 
### Delete element from Array
In the delete operation, the element to be deleted is searched using the linear search, and then the delete operation is performed followed by shifting the elements.      
![image](https://media.geeksforgeeks.org/wp-content/cdn-uploads/Delete-Operation-in-Unsorted-Array.png)     
``` bash  
  static int deleteElement(int arr[], int n, int key)   
    {    
        // Find position of element to be deleted    
        int pos = findElement(arr, n, key);    
        if (pos == -1) {    
            System.out.println("Element not found");   
            return n;   
        }    
```        
 ##### Time complexity   
 Avereage: O(n)            
 worst:O(n)       
 
  ##### Space complexity :
 O(n)   
 
### Traversal in array
``` bash   
void reaverse(int arr[],int n){   
   for (int i = 0; i < n; i++){
       System.out.println(arr[i]);   
    }   
}    
```    

 ##### Time complexity   
 Avereage: O(n)          
 worst:O(n)      
 
  ###### Space complexity :
 O(1)   
 
### Sorting elements in Array
Sorting the given array in ascending order such that elements will be arranged from smallest to largest. This can be achieved through two loops. The outer loop will select an element, and inner loop allows us to compare selected element with rest of the elements.
``` bash   
void sort(){     
   for (int i = 0; i < arr.length; i++) {        
            for (int j = i+1; j < arr.length; j++) {         
               if(arr[i] > arr[j]) {      
                   temp = arr[i];      
                   arr[i] = arr[j];      
                   arr[j] = temp;      
               }      
            }      
        }      
        }   
```      
        
 ##### Time complexity   
 Avereage: O(n log n)      
 worst:O(n log n)   
 
  ##### Space complexity :
 O(1)
 
## ***Conclusion***
Arrays are a simple and efficient data structure used to store a collection of elements of the same data type. They have a number of useful properties, including constant time access to individual elements, efficient memory usage, and fast traversal of elements in sequence. However, their performance may degrade for insertion and deletion operations




