//Solution to Issue #47 : Alphabetical Order
//Isha Baviskar


#include <stdio.h>
#include <string.h>

void main()
{
    char names[100][100], naam[100][100], t[100];
    int i,j,n;
    printf("Enter the number of names:");
    scanf("%d", &n);
    printf("Enter %d names in any order:", n);
    for(i=0; i<n; i++)
    {
        scanf("%s", names[i]);
        strcpy(naam[i], names[i]);
    }

    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(strcmp(names[i],names[j])> 0)
            {
                strcpy(t,names[i]);
                strcpy(names[i],names[j]);
                strcpy(names[j], t);
            }
        }
    }

    printf("Ordered names:\n");
    for(i=0;i<n;i++)
    {
        printf("%s\n",  names[i]);

    }


}