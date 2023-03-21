//Armstrong number is a number that is equal to the sum of cubes of its digits. 
//For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
//e.g
//input: 127
//Ouput format: No it's not an armstrong no.
# include <stdio.h>
int main()
{
	int no, r, sum=0, cube, orig;
	printf("Enter a whole no.: ");
	scanf("%d", &no);
	
	orig = no;
	
	while(no != 0)
	{
		r = no%10;
		cube = r*r*r;
		sum += cube;
		no /= 10;
	}
	
	if(sum == orig)
		printf("%d is an Armstrong No.", orig);
	else
		printf("No it's not an armstrong no.");
		
	return 0;
}