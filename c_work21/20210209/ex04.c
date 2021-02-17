#include <stdio.h>

void main(){
    char str[7];
    int i = 0;

    for(i=0; i<3; i++){
        fgets(str, sizeof(str), stdin);
        printf("read %d: %s \n", i, str);

    }
}