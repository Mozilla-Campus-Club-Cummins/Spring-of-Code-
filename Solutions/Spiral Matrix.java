import java.util.*;
public class Solution 
{
		public int[][] spiralMatrix(int R, int C, int r0, int c0) {
		        final int totalCellsToVisit = R * C;
		        final int[][] cells = new int[totalCellsToVisit][2];
		        int cellsVisited = 0;
		        int stepLength = 1;
		        int stepsTaken = 0;
		        int direction = 0;
		        int row = r0, column = c0;
		        
		        while (cellsVisited < totalCellsToVisit) {
		            // If we are inside the matrix, record the position
		            if (row >= 0 && row < R && column >= 0 && column < C) {
		                cells[cellsVisited][0] = row;
		                cells[cellsVisited][1] = column;
		                cellsVisited++;
		            }
		            
		            // Move a step to correct direction (0=E, 1=S, 2=W, 3=N)
		            if (direction == 0) { column++; }
		            else if (direction == 1) { row++; }
		            else if (direction == 2) { column--; }
		            else if (direction == 3) { row--; }
		            stepsTaken++;
		            
		            // If we are taken the correct amount of steps to the current direction,
		            // change direction
		            if (stepsTaken == stepLength) {
		                stepsTaken = 0;
		                direction++;
		                // When going east or west increase the steps we take for each direction
		                if (direction == 2) {
		                    stepLength++;
		                    stepsTaken = 0;
		                } else if (direction == 4) {
		                    direction = 0;
		                    stepLength++;
		                    stepsTaken = 0;
		                }
		            }
		        }
		        return cells;
		    }
		
	static void print(int [][]res)
	{
		System.out.print("[");
		for(int i=0;i<res.length;i++)
		{
			System.out.print("[");
			for(int j=0;j<res[i].length;j++)
			{
				System.out.print(res[i][j]+",");
			}
			System.out.print("],");
		}
		System.out.print("]");
	}
  
public static void main(String args[])
{
	Solution ob=new Solution();
	Scanner sc=new Scanner(System.in);
	System.out.println("**SPIRAL MATRIX**");
	System.out.println("\nEnter no. of rows:");
	int rows=sc.nextInt();
	System.out.println("Enter no. of columns:");
	int cols=sc.nextInt();
	System.out.println("\nEnter rows start:");
	int rStart=sc.nextInt();
	System.out.println("Enter columns start:");
	int cStart=sc.nextInt();

	System.out.println("\nOUTPUT:");
	print(ob.spiralMatrix(rows,cols,rStart,cStart));

}
}
