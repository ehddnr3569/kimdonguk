#include <stdio.h>



void main(){
    char *arrp[3] = {"aaa","bbb","ccc"};

    printf("arr[0] = %d\n",arrp[0]);
    printf("arr[1] = %d\n",arrp[1]);
    printf("arr[2] = %d\n",arrp[2]);

    printf("??\n");
    
    printf("arrp[0] = %s\n",arrp[0]);
    printf("arrp[1] = %s\n",arrp[1]);
    printf("arrp[2] = %s\n",arrp[2]); //주소값을 보낼때는 *을 붙이지않는다

}