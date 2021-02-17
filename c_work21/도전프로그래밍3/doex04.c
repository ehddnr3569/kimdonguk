#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void main(){
    // printf("=1970년 1월 1일 부터 초 의 변화 =\n");
    // printf("%d \n",(int)time(NULL));

    srand((int)time(NULL));
    for(int i=0; i<10; i++){
        printf("%d\n",rand()%100);
    }
    
}