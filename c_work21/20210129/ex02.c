#include <stdio.h>

void main(){
    int arr[4][3];

    printf("arr size = %d\n", sizeof(arr));
    printf("arr[0] size = %d\n", sizeof(arr[0]));
    printf("arr[1] size = %d\n", sizeof(arr[1]));
    printf("arr[2] size = %d\n", sizeof(arr[2]));
    printf("arr[3] size = %d\n", sizeof(arr[3]));

    printf("arr의 주소값 = %d\n", arr);
    printf("arr[0]의 주소값 = %d\n", arr[0]);
    printf("arr[1]의 주소값 = %d\n", arr[1]);
    printf("arr[2]의 주소값 = %d\n", arr[2]);
    printf("arr[3]의 주소값 = %d\n", arr[3]);
    
    //한 행이 증가
    printf("arr+1의 주소값 = %d\n", arr+1);
    printf("arr[0]+1의 주소값 = %d\n", arr[0]+1);
    printf("arr[1]+1의 주소값 = %d\n", arr[1]+1);
    printf("arr[2]+1의 주소값 = %d\n", arr[2]+1);
    printf("arr[3]+1의 주소값 = %d\n", arr[3]+1);
}