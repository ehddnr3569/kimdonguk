#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void main(){
    int seo =1;
    int select = 0;
    int compu_select =0;

    int win = 0;
    int lose = 0;
    int draw = 0;

    while(seo){
        printf("뭐 낼래?\n");
        scanf_s("%d", &select);

        srand((int)time(NULL));
        compu_select = (rand()%3) +1;

        if(select == 1){
            if(compu_select ==1){
                draw ++;
                printf("당신의 선택은 가위 선택, 컴퓨터도 가위선택\n");
            }else if(compu_select ==2){
                lose ++;
                seo = 0;
                printf("당신의 선택은 가위 선택, 컴퓨터는 바위선택\n");
            }else if(compu_select ==3){
                win ++;
                printf("당신의 선택은 가위 선택, 컴퓨터는 보선택\n");
            }
    }
    printf("게임의 결과 %d승 %d패 %d무\n",win,lose,draw);
}