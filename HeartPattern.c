//Heart Pattern 
// Isha Baviskar
#include <stdio.h>  
   
int main() {  
    int i,j,r;
     
    printf("Enter the number of rows: ");
    scanf("%d", &r);  
    //for top semi circular patter
    for(i = r/2; i <= r; i+=2){ 
     
        for(j = 1; j < r-i; j+=2) {  
            printf(" ");  
        }
       
        for(j = 1; j <= i; j++){  
            printf("*");  
        }  
        
        for(j = 1; j <= r-i; j++){  
            printf(" ");  
        }  
        
        for(j = 1; j <= i; j++){  
            printf("*");  
        } 
        
        printf("\n");  
    }  
     
     //Next Inverted Pyramid pattern
    for(i = r; i >= 1; i--){  
        for(j = i; j < r; j++){  
            printf(" ");  
        }  
        for(j = 1; j <= (i*2)-1; j++){  
            printf("*");  
        }  
        
        printf("\n");  
    } 
   
    return 0;  
}