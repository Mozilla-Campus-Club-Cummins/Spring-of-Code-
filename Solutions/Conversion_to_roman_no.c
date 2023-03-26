//Rishita Chourey FY comp
/*
Solution to issue number #62
Conversion of a number into its roman number form 
here i have used if-else if blocks to print the required symbols according to requirement
After printing the symbol of the maximum value according to the entered number the number 
gets updated to print the remaining part
*/
#include <stdio.h>
#include <conio.h>
int main()
{
    int num;
    printf("Enter a positive integer :");
    scanf("%d",&num);
    while(num!=0)
    {
        if(num>=1000)
        {
          printf("M");
          num=num-1000;
            
        }
        else if(num>=900&&num<1000)
        {
            printf("CM");
            num=num-900;
        }
        else if(num>=500&&num<900)
        {
            printf("D");
            num=num-500;
        }
        else if(num>=400&&num<500)
        {
            printf("CD");
            num=num-400;
        }
        else if(num>=100&&num<400)
        {
            printf("C");
            num=num-100;
        }
        else if(num>=90&&num<100)
        {
            printf("XC");
            num=num-90;
        }
        else if(num>=50&&num<90)
        {
            printf("L");
            num=num-50;
        }
        else if(num>=40&&num<50)
        {
            printf("XL");
            num=num-40;
        }
        else if(num>=10&&num<40)
        {
            printf("X");
            num=num-10;
        }
        else if(num>=9&&num<10)
        {
            printf("IX");
            num=num-9;
        }
        else if(num>=5&&num<9)
        {
            printf("V");
            num=num-5;
        }
        else if(num>=4&&num<5)
        {
            printf("IV");
            num=num-4;
        }
        else if(num>=1&&num<4)
        {
            printf("I");
            num=num-1;
        }
    }
    
}
