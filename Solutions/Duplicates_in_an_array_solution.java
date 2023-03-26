package b;

import java.util.*;

public class Duplicates_in_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int []arr=new int[n];
        int []arr1=new int[n];
    

        for(int i=0;i<n;i++){                  //accept the elements of array
            arr[i]=sc.nextInt();
        }
        System.out.println("elements of array: ");  //prints elements of array
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        int flag=0,p=0;
        boolean present=false;
        
        for(int i=0;i<n;i++){
        	flag=0;
        	present=false;
        	for(int j=i+1;j<n;j++) {                    //search for element
        		if(arr[i]==arr[j]) {
        			flag++;
        		}
        	}
        	if(flag>0) {                                //if element present more than once then add it to the another array 
        		for(int k=0;k<arr1.length;k++) {
        			if(arr1[k]==arr[i]) {
        				present=true;
        			}
        		}
        		if(!(present)) {
        		arr1[p++]=arr[i];
        		}
        	}
        }


        System.out.println("Duplicate elements in given array: ");
         for(int j=0;j<p;j++){                                           //print the array that contains elements which are repeated
             System.out.println(arr1[j]);
         }

    }
}
