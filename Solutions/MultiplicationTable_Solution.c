//Name: Kruti Newalkar
//Issue No: 63
//Multiplication table of any no.
# include <stdio.h>
int main()
{
	int no, i;
	printf("Enter a whole no: ");
	scanf("%d", &no);
	
	for(i=1; i<=10; i++)			//printing tables upto 10
		printf("\n%d X %d = %d", no, i, (no*i));
		
	return 0;
}
