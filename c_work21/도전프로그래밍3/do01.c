#include <stdio.h>

void Spin_90(int(*arr)[4], int len)
{

	int temp[4][4];
	int k = 0; 

	for (int i = 0; i < len; i++) {
		for (int j = 0; j < 4; j++)
			temp[i][j] = arr[i][j];
	}

	for (int i = len - 1; i >= 0; i--) {
		for (int j = 0; j < 4; j++)
			arr[j][i] = temp[k][j];
		k++;
	}

	for (int i = 0; i < len; i++) {
		for (int j = 0; j < 4; j++)
			printf("%3d", arr[i][j]);
		printf("\n");
	}
}

int main()
{

	int arr[4][4] = {
		1,  2,  3,  4,
		5,  6,  7,  8,
		9,  10, 11, 12,
		13, 14, 15, 16
	};
	int len = sizeof(arr) / sizeof(arr[0]);

    for(int i=0; i<4; i++){
	    Spin_90(arr, len);
	    printf("\n");
    }

	return 0;
}