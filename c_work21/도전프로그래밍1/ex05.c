#include <stdio.h>

int main()
{

	int prime[10];
	int p_index = 0; 
	prime[p_index] = 2; 
	int i, j;

	for (i = 3; i < 30; i += 2) {
		for (j = 0; j < p_index + 1; j++) {
			if (i%prime[j] == 0) break;
		}
		if (j == p_index + 1) prime[++p_index] = i;
	}

	for (int i = 0; i < p_index + 1; i++) {
		printf("%3d", prime[i]);
	}
	putchar('\n');

	return 0;
}
