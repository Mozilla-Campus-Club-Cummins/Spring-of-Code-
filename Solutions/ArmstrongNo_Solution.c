//Armstrong number is a number that is equal to the sum of cubes of its digits. 
//For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
//e.g
//input: 127
//Ouput format: No it's not an armstrong no.
# include <stdio.h>
int main()
{
	int no, r, sum=0, cube, orig;   //no accept i/p
                                 //r - stores remainder i.e last digit
                                //cube - stores cube of each digit
                                //sum - adds up the cube of each digit
                                //orig - stores the original i/p for checking

	printf("Enter a whole no.: ");
	scanf("%d", &no);
	
	orig = no;          //storing (taking a backup) of original i/p
	
	while(no != 0)      
	{
		r = no%10;          //fetches last digit of no. for each iteration
		cube = r*r*r;       //calc. cube of that digit
		sum += cube;        //stores the sum of cubes
		no /= 10;           //fetches rem (removes the last digit from R to L)
	}
	
	if(sum == orig)     //checks if original no. and sum of cubes is equal/not
		printf("%d is an Armstrong No.", orig);
	else
		printf("No it's not an armstrong no.");
		
	return 0;
}