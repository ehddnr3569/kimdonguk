  #include <stdio.h>

  void checkStringLoop(char *param, int len){
      int start = 0;
      int end = len-1;
      for(int i=0; i < len/2; i++){
          if(start == end){
              break;
          }
          if(param[start] != param[end]){
              printf("회문이 아닙니다.\n");
              return;
          }

          start += 1;
          end -= 1;
      }
      printf("회문 입니다.\n");
      return;
  }

  int main(void)
  {   
      char str[30]; 
      int len;

      printf("단어 입력: ");
      scanf("%s", str);

      printf("입력한 단어: ");
      for(len=0; len<30; len++)
      {
          if(str[len] == '\0'){
              break;
          }
          printf("%c", str[len]);
      }
      printf("\n");

      printf("입력받은 단어의 길이: %d \n", len);
        
      checkStringLoop(str, len);

      return 0;

  }