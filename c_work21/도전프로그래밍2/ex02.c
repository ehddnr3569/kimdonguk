 #include <stdio.h>

  int main(void)
  {
      int num;
      int i = 0;
      int arr[100];

      printf("10진수 정수 입력: ");
      scanf("%d", &num);

      while(num){
          // if(num == 1){
          //     arr[i] = 1;
          //     printf("%d", arr[i]);
          //     break;
          // }
          arr[i] = num%2;
          num = num/2;
          i+=1;
      }

      while(i){
          i--;
          printf("%d", arr[i]);
      }
        
      return 0;

  }