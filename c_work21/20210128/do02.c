#include <stdio.h>

int main(){
    int num1 = 10;
    int num2 = 20;
    int num3 = 30;

    printf("num1 = %d\n", num1);
    printf("num2 = %d\n", num2);
    printf("num3 = %d\n", num3);

    //num1 = 10 , num2 = 20
    int live_num1 = num2;
    num2 = num1;
    //num1 = 10 , num2 = 10 , live_num2 =20
    int live_num2 = num3;
    num3 = live_num2;
    num1 =

    printf("\nnum1 = %d\n", num1);
    printf("num2 = %d\n", num2);
    printf("num3 = %d\n", num3);


}