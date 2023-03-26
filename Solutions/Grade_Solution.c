//Problem: 
//marks is < 30 - C grade
//30<= marks <70 is B grade
//70<= marks <90 is A grade
//90<= marks <=100 is A+
//Issue No: #56
//Approach: Validate / check the marks using nested if - else
//          if marks > 90  ==>  print "A+"
//          else implies that marks are definitely < 90, 
//          when marks are less than 90 but greater than 70 it is A grade.
//          This follows for condition where marks < 30.
# include <stdio.h>

int main()
{
	int mks;
	
	printf("Enter Marks of the student: ");
	scanf("%d", &mks);
	
	if(mks >= 90)
		printf("A+ grade");
		
	else					//mks < 90
	{
		if(mks >= 70)
			printf("A grade");
		else				//mks < 70
		{
			if(mks >= 30)
				printf("B grade");
			else			//mks < 30
				printf("C grade");
		}
	}
	return 0;
}