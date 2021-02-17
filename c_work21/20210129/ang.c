#include <stdio.h>

void main(){
    int arr[100];
    int cnt=0;


    int input_number = 0;
    int rema_number = 0;

    printf("정수 입력\n");
    scanf("%d",&input_number);

    printf("input_number = %d\n",input_number);
    while (input_number < 1){
        rema_number = input_number % 2;

        arr[cnt] = rema_number;
        cnt++;

        int temp_value = input_number;
        if(temp_value<2){
            arr[cnt]=temp_value;
            cnt++;
            break;
        }
        input_number = temp_value;

    }
    //i--, i-=1 , i= i-1 동일표기법
    int i = 0;
    for(i=cnt-1 ; i>-1 ; i--){
        printf("%d",arr[i]);
    }
}