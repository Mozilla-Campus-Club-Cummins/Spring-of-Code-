//Rishita Chourey FY comp
/*
Solution to issue number #65
Shifting the negative numbers at the front
here i have sorted the array entered by the user into two different arrays 
of positive and negative numbbers and the printed both the arrays
*/
#include <stdio.h>
#include <conio.h>
int main()
{
    int arr[500],neg[500],pos[500],n,counter1=0,counter2=0,i;
    printf("Enter the number of elements in the array\n");
    scanf("%d",&n);
    printf("Enter the elements of the array\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("The entered array is :\n");
    for(i=0;i<n;i++)
    {
        printf("%d ",arr[i]);
        if(arr[i]<0)
        {
            neg[counter1]=arr[i];
            counter1++;
        }
        else if(arr[i]>=0)
        {
            pos[counter2]=arr[i];
            counter2++;
        }
    }
    printf("\nThe required array is :\n");
    for(i=0;i<counter1;i++)
    {
        printf("%d ",neg[i]);
    }
    for(i=0;i<counter2;i++)
    {
        printf("%d ",pos[i]);
    }
    
    
}