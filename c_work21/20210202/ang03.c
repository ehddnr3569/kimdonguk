#include <stdio.h>

void ComplexFuncOne(int **ptr1, int *(*ptr2)[5]) {}
void ComplexFuncTow(int ***ptr3,int ***(*ptr4)[5]) {}

void main(){
    int *arr1[3];
    int *arr2[3][5];
    int **arr3[5];
    int ***arr4[3][5];

    ComplexFuncOne(arr1, arr2);
    ComplexFuncOne(arr3, arr4);
}