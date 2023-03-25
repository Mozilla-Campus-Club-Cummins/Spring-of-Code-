#include <stdio.h>
int a[4][4],b[4][4],c[4][4],i,j,k,d,r1,r2,c1,c2;
int main()
{
    printf("Enter the number of rows of matrix 1:");
    scanf("%d",&r1);
    printf("Enter the number of columns of matrix 1:");
    scanf("%d",&c1);
    printf("Enter the number of rows of matrix 2:");
    scanf("%d",&r2);
    printf("Enter the number of columns of matrix 2:");
    scanf("%d",&c2);
    if(c1==r2)
    {
        printf("Enter first matrix elements");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                scanf("\n%d",&a[i][j]);
            }
        }
        printf("Enter second matrix elements");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                scanf("\n%d",&b[i][j]);
            }
        }
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                printf("%d\t",a[i][j]);
            }
        }
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                printf("%d\t",b[i][j]);
            }
        }
        for(i=0;i<=r1;i++)
        {
            for(j=0;j<=c2;j++)
            {
                c[i][j]=0;
                for(k=0;k<=c1;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        printf("Multiplication matrix:");
        for(i=0;i<=r1;i++)
        {
            for(j=0;j<=c2;j++)
            {
                printf("%d\t",c[i][j]);
                printf("\n");
            }
        }
        
    }
    else
    {
        printf("Matrix cannot be multiplied");
    }

    return 0;
}
