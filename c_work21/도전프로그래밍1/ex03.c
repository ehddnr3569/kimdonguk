#include <stdio.h>

int GCD(int n1, int n2)
{

	int temp = 0;
	int rem = 0;

	if (n1 > n2) {
		temp = n1;
		n1 = n2;
		n2 = temp;
	}

	do {
		rem = n2 % n1;
		n2 = n1;
		n1 = rem;
	} while (rem);

	return n2;
}

int main()
{

	int n1, n2;
	printf("두 개의 정수 입력: "); scanf_s("%d%d", &n1, &n2);

	printf("최대공약수 : %d\n", GCD(n1, n2));

	return 0;
}