import java.util.Scanner;
public class TrappingRainWater {
    public int trappingrainwater(int[] height,int n) {
        int max = height[0];
        int left[] = new int[n];
        int right[] = new int[n];
        for (int i = 0; i <n; i++) {
            left[i] = Math.max(max, height[i]);
            max = left[i];
        }
        max = height[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            right[i] = Math.max(max, height[i]);
            max = right[i];
        }
        int sum = 0;
//        here block which will store water will be min between left and right array - block height that is
        for (int i = 0; i < n; i++) {
            int temp = Math.min(left[i], right[i]);
            int ans = temp - height[i];
            sum += ans;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        TrappingRainWater t1=new TrappingRainWater();
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        int height[]=new int[n];
        System.out.println("Enter the Array Elements : ");
        for(int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }
        System.out.println("Water trapped: "+t1.trappingrainwater(height,n));
        
//example:
//  int height[]={4,2,0,3,2,5};
//        left[]={4,4,4,4,4,5};
//        right[]={5,5,5,5,5,5}
//          sum=4-4=0
//          sum=0+ (4-2)=2
//          sum=2+(4-0)=6
//          sum=6+(4-3)=7
//          sum=7+(4-2)=9
//          sum=9+(5-5)=9
//        return sum=9


    }
}
