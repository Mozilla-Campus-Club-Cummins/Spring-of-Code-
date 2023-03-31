//Issue No-#78

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Implementing Reverse of a string to check execution time of recursive and non recursive method
class Method{
  
	void recursive(String str) {
		 if ((str==null)||(str.length() <= 1))
	           System.out.print(str);
		else {
			System.out.print(str.charAt(str.length()-1));
			recursive(str.substring(0,str.length()-1));
		}
	}
	void non_recursive(String str) {
		String revStr="";
		char ch;
		for(int i=0;i<str.length();i++) {
		 ch=str.charAt(i);
			revStr=ch+revStr;
		}
		System.out.println("\nReveresed String [Non Recursive] : \n"+revStr);
	}
}

public class Execution_Time_of_Methods_Solution {

	public static void main(String[] args) throws IOException {
	
	   BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

			String str;
	   
			System.out.print("Enter String : ");
			str=br.readLine();
	       
			Method obj=new Method();
			
			System.out.println("\nReveresed String [ Recursive] : ");
      
			 // get the start time
			long start_recursive = System.nanoTime();
			
			obj.recursive(str); //call method
			
			 // get the end time
		   long end_recursive = System.nanoTime();
		    
		    
		   // get the start time
			 long start_Nonrecursive = System.nanoTime();
			
			  obj.non_recursive(str);
			
			  // get the end time
		    long end_Nonrecursive = System.nanoTime();
		    
		    long execution_recursive = end_recursive - start_recursive;
		    System.out.println("Execution time for Recursive Method : " + execution_recursive + " nanoseconds");
		    
		    long execution_Nonrecursive = end_Nonrecursive - start_Nonrecursive;
		    System.out.println("Execution time for Non Recursive Method : " + execution_Nonrecursive + " nanoseconds");
		    
		    
	}

}
