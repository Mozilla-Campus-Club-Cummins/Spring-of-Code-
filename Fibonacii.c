//Fibonacii series using recursion
#include <stdio.h>
int fib(int n){
    if(n==0)
    return 0;
    if(n==1)
    return 1;
    else
    return fib(n-1)+fib(n-2);   

}
int main()
{  
   int n,i;
   printf("Enter number of  terms in Fibonacii series ");
   scanf("%d",&n);
   for(i=0;i<n;i++)
  {
   printf(" %d",fib(i));
  }
   return 0;
}
