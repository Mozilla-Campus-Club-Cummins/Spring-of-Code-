//solution is in java
import java.util.*;

public class CountTrianglesContainingOrigin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of points:");
        int n = sc.nextInt();
        int[][] points = new int[n][2];
        System.out.println("Enter the points (x,y):");
        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }
        int count = countTrianglesContainingOrigin(points);
        System.out.println("Number of subsets of size 3 that form a triangle containing the origin: " + count);
    }

    public static int countTrianglesContainingOrigin(int[][] points) {
        int count = 0;
        for (int i = 0; i < points.length - 2; i++) {
            for (int j = i + 1; j < points.length - 1; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    if (isTriangleContainingOrigin(points[i], points[j], points[k])) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static boolean isTriangleContainingOrigin(int[] p1, int[] p2, int[] p3) {
        // check if the origin is inside the triangle
        int d1 = p1[0] * (p2[1] - p1[1]) + p2[0] * (p1[1] - p2[1]) + 0 * (p2[1] - p1[1]);
        int d2 = p2[0] * (p3[1] - p2[1]) + p3[0] * (p2[1] - p3[1]) + 0 * (p3[1] - p2[1]);
        int d3 = p3[0] * (p1[1] - p3[1]) + p1[0] * (p3[1] - p1[1]) + 0 * (p1[1] - p3[1]);
        return (sameSign(d1, d2) && sameSign(d2, d3) && sameSign(d3, d1));
    }

    public static boolean sameSign(int a, int b) {
        return (a >= 0 && b >= 0) || (a < 0 && b < 0);
    }

}
