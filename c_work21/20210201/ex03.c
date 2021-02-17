//swap(p1,p2) = 
//swap(&p1,&p2) = 주소값
//swap(*p1,*p2) = 값

#include <stdio.h>

void MaxAndMin(int *arr,int **maxPtr,int **minptr,int len){
    
    int *max,*min;
    int i;

    max=min=arr[0];
    for(i=0;i<len;i++){
        if(*max<arr[i])
        max=i;
        if(*min>arr[i])
        min=i;
    }
    *maxPtr=max;
    *minptr=min;

}

int  main(){
    int *maxPtr;
    int *minPtr;
    int arr[5];
    int i;
    int len = (sizeof(arr)/sizeof(int));

    for(i=0; i<len ; i++){
        printf("정수 입력 : ");
        scanf("%d",&arr[i]);
    }
    
    MaxAndMin(&maxPtr,&minPtr,arr,len);

    printf("MAX : %d\n MIN : %d",*maxPtr,*minPtr);
    return 0;

     



}