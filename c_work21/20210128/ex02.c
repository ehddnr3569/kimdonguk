#include <stdio.h>

void main(){
    char a[] = "abc"; //배열하나하나 변경가능
    char *b = "abc"; //통째로(주소값)

    printf("%s %s", a, b);

}
