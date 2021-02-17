#include <stdio.h>

typedef int INT;
typedef int *PTR_INT;

typedef unsigned int UINT;
typedef unsigned int * PTR_UINT;

typedef unsigned char UCHAR;
typedef unsigned char * PTR_UCHAR;

int main(){
    INT num1 =10;
    PTR_INT pNum1 = &num1;

    UINT num2 = 20;
    PTR_UINT pUnum2 = &num2;

    UCHAR ch ='A';
    PTR_UCHAR pCh = &ch;

    printf("%d,%u,%c \n", *pNum1, *pUnum2, *pCh);
}