package Prime_Numbers;
import java.util.*;

class prime_number{
	int no1,no2,flag;

	prime_number(int a,int b){
		no1=a;
		no2=b;
		flag=0;
	}
	
	void calculate() {
		
		  for (int i = no1; i <= no2; i++) {
			 
	            if (i == 0 || i == 1)
	           //0 and 1 are not prime numbers
	            	continue;
	 
	            flag = 1;
	 
	            for (int j = 2; j <= i / 2; j++) {
	                if (i % j == 0) {
	                    flag = 0; 
	                  //flag=0 means not a prime number
	                    break;
	                }
	            }
	            //flag=1 means prime number 
	            if (flag == 1)
	                System.out.print(i+" ");
	        
	}
	}
}
public class Prime_Numbers_between_two_numbers_solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Numbers between which you want prime numbers:");
		System.out.print("From- ");
		int no1=sc.nextInt();
		
		System.out.print("to- ");
		int no2=sc.nextInt();
		
		System.out.println("Prime numbers between "+no1+" and "+no2+" : ");
		
		prime_number pn =new  prime_number(no1,no2);
		
		pn.calculate();
		
	}

}
