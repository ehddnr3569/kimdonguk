#define STRING_JOB(A,B) #A"의 직업은 "#B"입니다."
#define SYNUM(Y,S,P) Y##S##P

#include <stdio.h>

void main(){
    printf("%s\n",STRING_JOB(홍길동,나무꾼));
    printf("%s\n",STRING_JOB(김길동,선녀));

    printf("STNUM(10,10,10)=%d",SYNUM(10,10,10) );
}