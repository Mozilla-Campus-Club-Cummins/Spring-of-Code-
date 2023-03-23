#include <stdio.h>
void main()
{
	/* program to find sum of first 50 even numbers
	issue no. 16*/
	int sum = 0;
	for ( int i = 2; i <= 50; i = i + 2)
	{
		 sum = sum + i;
	}
	printf("%d is the sum of first 50 even numbers", sum);	
}		
