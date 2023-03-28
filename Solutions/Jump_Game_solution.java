import java.util.*;
class Ladder 
{

	public List<List<String>> findLadder(String beginWord, String endWord, List<String> wordList) 
	{
        List<List<String>> ans = new ArrayList<>(); 
        
        Map<String, Set<String>> reverse = new HashMap<>(); // reverse graph start from endWord
        Set<String> wordSet = new HashSet<>(wordList); // remove the duplicate words
        wordSet.remove(beginWord); // remove the first word to avoid cycle path
        
        Queue<String> q = new LinkedList<>(); // store current layer nodes
        q.add(beginWord); // first layer has only beginWord
        Set<String> nextlevel = new HashSet<>(); // store nextLayer nodes
        boolean findEnd = false; // find endWord flag
        while (!q.isEmpty()) 
        { 
        	// traverse current layer nodes
            String word = q.remove();
            for (String next : wordSet) 
            {
                if (isLadder(word, next)) 
                { // is ladder words
					// construct the reverse graph from endWord
                    Set<String> reverseLadders = reverse.computeIfAbsent(next, k -> new HashSet<>());
                    reverseLadders.add(word); 
                    if (endWord.equals(next)) 
                    {
                        findEnd = true;
                    }
                    nextlevel.add(next); // store next layer nodes
                }
            }
            if (q.isEmpty()) 
            { // when current layer is all visited
                if (findEnd) break; // if find the endWord, then break the while loop
                q.addAll(nextlevel); // add next layer nodes to queue
                wordSet.removeAll(nextlevel); // remove all next layer nodes in wordSet
                nextlevel.clear();
            }
        }
        if (!findEnd) return ans; // if can't reach endWord from startWord, then return ans.
        Set<String> path = new LinkedHashSet<>();
        path.add(endWord);
		// traverse reverse graph from endWord to beginWord
        findPath(endWord, beginWord, reverse, ans, path); 
        return ans;
    }


    private void findPath(String endWord, String beginWord, Map<String, Set<String>> graph,
                                 List<List<String>> ans, Set<String> path) {
        Set<String> next = graph.get(endWord);
        if (next == null) return;
        for (String word : next) {
            path.add(word);
            if (beginWord.equals(word)) {
                List<String> shortestPath = new ArrayList<>(path);
                Collections.reverse(shortestPath); // reverse words in shortest path
                ans.add(shortestPath); // add the shortest path to ans.
            } else {
                findPath(word, beginWord, graph, ans, path);
            }
            path.remove(word);
        }
    }

    private boolean isLadder(String s, String t) {
        if (s.length() != t.length()) return false;
        int diffCount = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != t.charAt(i)) diffCount++;
            if (diffCount > 1) return false;
        }
        return diffCount == 1;
    }
}
public class Jump_game 
{
       public static void main(String args[])
       {
    	   Ladder l=new Ladder();
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Enter Begin word: ");
    	   String beginword=sc.next();
    	   System.out.println("Enter ending word: ");
    	   String endword=sc.next();
    	   System.out.println("Enter no of words in list: ");
    	   int n=sc.nextInt();
    	   String[] arr=new String[n];
    	   for(int i=0;i<n;i++)
    	   {
    		   System.out.println("Enter word: ");
    		    arr[i]=sc.next();
    	   }
    	   ArrayList<String> st=new ArrayList<String>();
    	   for(int i=0;i<n;i++)
    	   {
    		   st.add(arr[i]);
    	   }
    	   
    	   System.out.println(l.findLadder(beginword,endword,st)); 
    	   
       }
}
