#include <stdio.h>

// *a = 1
// a[0] = 1 동일한 표기법
//ex) ptr = &arr[0]
//   *ptr = arr

// *(b+1) = b[1]
// *(b+2) = b[2] 동일한 표기법

// a[0] = a[0]+1;
// a[0] += 1 동일한 표기법

// arr = &b;  arr의 포인터 변수값은 상수이기 때문에 변하지 않는다

// *a + 100 =  더하기
// (a + 1) = 다음 주소



void main(){
    int arr[5] = {0,1,2,3,4};
    int b = 20;

    printf ("arr = %d\n",&arr);
    printf ("arr[0] = %d\n",&arr[0]);
    printf ("arr[1] = %d\n",&arr[1]);
    printf ("arr[2] = %d\n",&arr[2]);
    printf ("arr[3] = %d\n",&arr[3]);
    printf ("arr[4] = %d\n",&arr[4]);

    
}