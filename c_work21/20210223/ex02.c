#define ADD
#define HIT_NUM 6

#include <stdio.h>
void main(){
#ifdef ADD
    printf("ADD가 선언 됨");
#endif

#if HIT_NUM == 5
    printf("HIT_NUM은 5임");
#elif HIT_NUM == 6
    printf("HIT_NUM은 6임");
#endif
}