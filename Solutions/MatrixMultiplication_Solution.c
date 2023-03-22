//Issue : Matrix Multiplication
//Isha Baviskar
#include <stdio.h>


int main()
{
    int a[10][10], b[10][10], mulmat[10][10], row,clm,i,j,k;
    
    printf("Enter the number in a row: \n");
    scanf("%d", &row);
    printf("Enter the number in a column: \n");
    scanf("%d", &clm);

    printf("Enter the elements of Matrix A: \n");
    for(i=0;i<row;i++)
    {
        for(j=0;j<clm;j++)
        {
            scanf("%d",&a[i][j]);
        }
        
    }

    printf("Enter the elements of Matrix B: \n");
    for(i=0;i<row;i++)
    {
        for(j=0;j<clm;j++)
        {
            scanf("%d", &b[i][j]);
        }
    }

    printf("Multiplication of entered Matrices is: \n");
    for(i=0;i<row;i++)
    {
        for(j=0;j<clm;j++)
        {
            mulmat[i][j]=0;
            for(k=0;k<clm;k++)
            {
                mulmat[i][j]+= a[i][k]*b[k][j];
            }
        }
    }

    for(i=0;i<row;i++)
    {
        for(j=0;j<clm;j++)
        {
            printf("%d\t", mulmat[i][j]);
        }
        printf("\n");
    }

    return 0;
}
