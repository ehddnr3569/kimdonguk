#include <stdio.h>
void main(){
    char arr[100];
    char brr[100];
    int input_len = 0;
    int i;

    printf("글자입력 : \n");
    scanf("%s",arr);

    while(1){
        if(arr[i]=='\0'){
            input_len = i;
            break;
        }
        i++;
    }
    brr[input_len]='\0';
    int j = input_len-1;
    for(i = 0; i<input_len ;){
        brr[j] = arr[i];
         i++;
         j--;
    }
    
    int chk = 1;
    for(i=0;i<input_len;i++){
        if(arr[i] != brr[i]){
            chk = 0;
            printf("회문이 아닙니다.");
            break;
        }
    }
    if(chk){
        printf("회문입니다");
    }
}