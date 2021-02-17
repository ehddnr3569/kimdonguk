#include <stdio.h>

typedef struct 
{
    int xpos;
    int ypos;
}Point;

void doA(Point *ptr){
    ptr ->xpos = (ptr -> xpos) *-1;
    ptr ->ypos = (ptr -> ypos) *-1;
}

void doB(Point pos){
    printf("pos.xpos = %d pos.ypos = %d", pos.xpos, pos.ypos);
}

void main(){
    Point pos = {10,-5};
    doA(&pos);
    doB(pos);
}