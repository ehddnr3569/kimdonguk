#include <stdio.h>

void main(){

    int num=8;
    int *pnum;
    pnum = &num;

    printf("pnum value is  \n");
    printf("*pnum = %d\n",*pnum);
    printf("pnum address valus is  \n");
    printf("pnum =%d\n",pnum);

    printf("&num = %d",&num);
}