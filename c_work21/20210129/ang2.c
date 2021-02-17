#include <stdio.h>

void main(){
    int arr[10];
    int *fip = &arr[0];
    int *eip = &arr[9];
    int i = 0;

    while(i<10){
        int temp = 0;
        printf("정수 입력");
        scanf("%d", &temp);
        
        if(temp%2==1){
            *fip = temp;
            fip = fip+1;
        }
        else{
            *eip = temp;
            eip = eip-1;
        }
        i++;
    }
    for( i=0; i<10; i++){
        printf("%d\n",arr[i]);
    }
}