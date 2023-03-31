//issue no. :  197
//By : Rasika Kanitkar
//Topic : Longest valid Parentheses

import java.util.Stack;

public class LongestValidParenthesis_Solution  {
            public static int longestValidParentheses(String str) {
            	
	    Stack<Integer> S = new Stack<>();
	    
	    int Length = 0;
	    int start = -1;
	    
	    for (int j = 0; j < str.length(); j++) {
	        if (str.charAt(j) == '(') {
	            S.push(j);
	        }
	        else 
	        
	        {
	        	if (S.isEmpty()) {
	                start = j;
	            } 
	        	else {
	                S.pop();
	                if (S.isEmpty()) {
	                    Length = Math.max(Length, j - start);
	                } else {
	                    Length = Math.max(Length, j - S.peek());
	                }
	            }
	        }
	    }
	    return Length;
	}
    
}

