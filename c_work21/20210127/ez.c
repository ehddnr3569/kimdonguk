#include <stdio.h>

int Recursive(int);

int Recursive(int num) {
    
    if (num == 0)
        return 1;
    else
        return 2 * Recursive(num-1);
}

int main() {
    int num;
    printf("입력 : \n");
    scanf("%d", &num);

    
    printf("%d", Recursive(num));
}
