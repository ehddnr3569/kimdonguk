  #include <stdio.h>

  int main(void)
  {
      int num;
      int arr[10];
      int evenCount = 9;
      int oddCount = 0;

      printf("정수 10개 입력: \n");
        
      for(int i=0; i<10; i++)
      {   
          printf("입력: ");
          scanf("%d", &num);
            
          switch(num%2){
              case 0:
                  arr[evenCount] = num;
                  evenCount--;
              break;

              case 1:
                  arr[oddCount] = num;
                  oddCount++;
              break;
          }
      }
        
      for(int i=0; i<10; i++){
          printf("%d ", arr[i]);
      }
        
      return 0;

  }