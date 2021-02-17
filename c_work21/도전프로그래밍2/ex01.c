 #include <stdio.h>

  void showNumberEven(int param [], int len)
  {
      for(int i=0; i<len; i++)
      {
          if(param[i]%2 == 0)
              printf("%d ", param[i]);
      }
      printf("\n");
  }

  void showNumberOdd(int param [], int len)
  {
      for(int i=0; i<len; i++)
      {
          if(param[i]%2 == 1)
              printf("%d ", param[i]);
      }
      printf("\n");
  }

  int main(void)
  {
      int arr[10]; // 길이가 10인 int형 배열 arr 선언
      int len = (sizeof(arr)/sizeof(int));

      printf("총 10개의 정수를 입력하세요 \n");

      for(int i=0; i<len; i++)
      {
          printf("입력: ");
          scanf("%d", &arr[i]);
      }

      printf("홀수 출력 \n");
      showNumberOdd(arr, len);
      printf("짝수 출력 \n");
      showNumberEven(arr, len);

      return 0;
  }