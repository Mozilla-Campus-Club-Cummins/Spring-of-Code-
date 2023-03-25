import java.util.*;
 class super_washing_machines {
    public  void findminmoves(int[] machines)
    {
        int n=machines.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=machines[i];
        }

        if(sum%n!=0)
        {
            System.out.println(-1);
        }
        else
        {
        	
            int avg=sum/n;
            int diff[]=new int[n];
            int maxdiff=0;
            int rem=0;

            for(int i=0;i<n;i++)
            {
                diff[i]=machines[i]-avg;
                rem=rem+diff[i];
               maxdiff= Math.max(maxdiff, Math.abs(rem));
               maxdiff=Math.max(maxdiff,diff[i]);
            }
            System.out.println(maxdiff);

        }

        
    }
}
public class super_washing_machine_solution
{
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);

        //given examples 
       /*super_washing_machines obj1=new super_washing_machines();
       super_washing_machines obj2=new super_washing_machines();
       super_washing_machines obj3=new super_washing_machines();
       int m1[]={1,0,5};
       int m2[]={0,3,0};
       int m3[]={0,2,0};
       obj1.findminmoves(m1);
       obj2.findminmoves(m2);
       obj3.findminmoves(m3);
       */

       System.out.println("enter the number of machines: ");
       int count=sc.nextInt();
       System.out.println("enter the number of dresses per machine:");
       int mach[]=new int[count];
       for(int i=0;i<count;i++)
       {
            mach[i]=sc.nextInt();
       }
       super_washing_machines obj=new super_washing_machines();
       obj.findminmoves(mach);
    }
}
