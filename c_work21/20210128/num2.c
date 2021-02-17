#include <stdio.h>

void SquareByReference(int *ptr1, int *ptr2, int *ptr3){

    int temp = *ptr3;
    *ptr3 = *ptr2;
    *ptr2 = *ptr1;
    *ptr1 = temp;
}

void main(){

    int num1 = 10,num2 = 20, num3 = 30;
    SquareByReference(&num1,&num2,&num3);
    printf("%d %d %d",num1,num2,num3);

}