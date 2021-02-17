  #include <stdio.h>

  int * bubbleSortDesc(int *param, int len){
      for(int i=0; i<len; i++){
          for(int j=0; j<len-i-1; j++){
              int temp;
              if(param[j] < param[j+1]){
                  temp = param[j+1];
                  param[j+1] = param[j];
                  param[j] = temp;
              }
          }
      }
        
      return param;
  }

  int * bubbleSortAsc(int *param, int len){
      for(int i=0; i<len; i++){
          for(int j=0; j<len-i-1; j++){
              int temp;
              if(param[j] > param[j+1]){
                  temp = param[j+1];
                  param[j+1] = param[j];
                  param[j] = temp;
              }
          }
      }

      return param;
  }

  void ShowArr(int *param, int len)
  {
      for(int i=0; i<len; i++){
          printf("%d ", param[i]);
      }

      printf("\n");
  }

  int main(void)
  {   
      int arr[7];
      printf("정수 7개를 입력해주세요. \n");

      for(int i=0; i<7; i++){
          printf("입력: ");
          scanf("%d", &arr[i]);
      }

      printf("입력하신 배열은: ");
      ShowArr(arr, 7);

      printf("배열의 오름차순: ");
      ShowArr(bubbleSortAsc(arr, 7), 7);

      printf("배열의 내림차순: ");
      ShowArr(bubbleSortDesc(arr, 7), 7);


      return 0;
  }