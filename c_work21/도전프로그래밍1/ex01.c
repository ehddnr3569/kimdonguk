#include<stdio.h>
int main()
{
    int num;
    printf("10진수 정수를 입력해주세요 : ");
    scanf("%d",&num);
    printf("16진수로 변환 후 : %x\n",num);
    return 0;
}