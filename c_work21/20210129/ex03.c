#include <stdio.h>

void main(){

    int arr[3][3];
    int i = 0;
    int j = 0;

    //2차언배열요소 입력받기
    for(i=0 ; i<3 ; i++){
        for(j=0; i<3; j++){
            printf("입력 : ");
            scanf("%d",&arr[i][j]);
        }
    }
    //2차원배열요소 출력하기
    for(i=0; i<3 ; i++){
        for(j=0; j<3 ; j++){
            printf("입력 : %d\n",arr[i][j]);
        }
    }
}