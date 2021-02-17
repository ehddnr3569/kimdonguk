#include <stdio.h>

void main(){
    int xarr[2][4] = {{1,2,3,4},{5,6,7,8}};
    int yarr[4][2];
    int i, j;

    for(i=0; i<2; i++){
        for(j=0 ; j<4; j++){
            yarr[j][i] = xarr[i][j];
        }
    }

    for(i=0; i<4 ; i++){
        for(j=0; j<2 ; j++){
            printf("%d",yarr[i][j]);
        printf("\n");
        }
    }
}  