//Find even numbers in an array and store them in another one, find sum of digits
// of each of these numbers and form a new array, reverse this new array and give output
//example:
//INPUT={12 , 19 , 26 , 42 , 13 , 11 , 99}
//OUTPUT={ 6 , 8 , 3 }
# include <stdio.h>
# include <stdlib.h>
int main()
{
	int arr[20], even[20], sum_arr[20];	 //arr stores user's input, even stores even no. array and sum_arr, sum array
	int noe, n, i, j, even_ct=0, r, sum; //i & j are the iterators; noe - no. of elements
										 // even_ct counts the no. of even nos. in input array
										 //r stores remainder
										 //sum stores sum of digit for each element
										 
	printf("Enter no. of array elements: ");
	scanf("%d", &noe);
	
	if(noe > 20)
	{
		printf("Invalid size; enter less than 20");
		exit(0);
	}
	
	
	//input array from user
	printf("Enter array elements: \n");		
	for(i=0; i < noe; i++)
	{
		printf("Integer %d: ", i+1);
		scanf("%d", &arr[i]);
	}
	
	//storing array of even no.s from given i/p separately
	for(i=0, j=0; i < noe; i++)
	{
		if(arr[i] % 2 == 0)		//checks even no. or not
		{
			even_ct++;				//incr. counter ; this counts only no. of even no. which is used for sum array
			even[j] = arr[i];		//storing even nos. consecutively
			j++;					//incr. j only when element is even so no issues of garbage value
		}
	}

	
	//sum of digits array
	for(int i=0; i < even_ct; i++)		//even_ct used since no. of elements for sum array = even_ct
	{
		n = even[i]; 					//an arbitrary var is assigned array element for easier calc. of SOD
		sum = 0; 						//flushes sum value to 0 for every for loop iteration
		while(n != 0)
		{
			r = n % 10;
			sum += r;
			n /= 10;
		}
		sum_arr[i] = sum;				//sum_arr stores the SOD of that element resp.
	}
	
	printf("Sum array reversed: ");		//Reversed array 
	for(i = even_ct-1; i >= 0; i--)
		printf("%d ", sum_arr[i]);
	
		
	return 0;
}