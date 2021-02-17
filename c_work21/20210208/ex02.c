#include <stdio.h>

void main(){
    int a=20;
    void *vp=&a;
    int *ip;

    printf("&a =%d\n",&a);
    printf("vp =%d",vp);

    *ip = (int*)vp;
    *ip =20;

    printf("*ip =%d\n",*ip);
    printf("ip =%d",ip);

    int *amalloc= (int*) malloc(sizeof(int)*8);
    amalloc[0] = 10;
    amalloc[1] = 11;
    printf("amalloc[0] = %d\n",amalloc[0]);
    printf("amalloc[1] = %d\n",amalloc[1]);


}
