#include <stdio.h>

int main(){
    int arr[6] = {1,2,3,4,5,6};
    int *xptr = &arr[0];
    int *yptr = &arr[5];

    int temp,i;
    
    for(i=0;i<3;i++){
        temp = *xptr; //arr[0] 를 temp에 저장
        *xptr = *yptr; 
        *yptr = temp;
        xptr += 1;
        yptr -= 1;
    }
    for(i=0;i<6;i++){
        printf("%d\n",arr[i]);
    }
    return 0;
}