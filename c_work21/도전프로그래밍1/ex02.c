#include <stdio.h>

void Want_ggd(int n1, int n2)
{
	int range = ((n2 - n1) < 0) ? -(n2 - n1) : (n2 - n1);
	int min = ((n2 - n1) < 0) ? n2 : n1; 

	for (int j = 1; j < 10; j++)
	{
		for (int i = min; i <= (min + range); i++)
		{
			printf("%d×%d=%2d  ", i, j, i*j);
		}
		putchar('\n');
	}
}


int main()
{

	int n1, n2;
	printf("원하는 구구단 출력 범위(3 5 입력시 3~5단 출력) 입력 : "); scanf_s("%d%d", &n1, &n2);

	Want_ggd(n1, n2);

	return 0;
}