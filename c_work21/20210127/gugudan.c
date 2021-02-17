#include <stdio.h>

void main(){

    int n1, n2, t;
    int i =1;
    printf("두개의 정수 입력 : ");
    scanf("%d %d", &n1,&n2);

    if(n1>n2)
    {
        t=n1;
        n1=n2;
        n2=t;
    }

    for(n1;n1<=n2;n1++){
        printf("%d단 : \n",n1);
        for(i=1;i<=9;i++){
            printf("%d × %d = %d\n",n1,i,n1*i);
        }
    }
    return 0;
}