#include <stdio.h>

#define bread 500
#define snack 700
#define drink 400

void Branch(int money)
{

	int zero;
	money -= bread + snack + drink;

	
	for (int i = 0; i <= money / bread; i++)
	{
		for (int j = 0; j <= money / snack; j++)
		{
			for (int k = 0; k <= money / drink; k++)
			{
				zero = money - (bread * i + snack * j + drink * k);
				if (zero == 0)
					printf("크림빵 %d개, 새우깡 %d개, 콜 라 %d개\n", i + 1, j + 1, k + 1);
			}
		}
	}
}

int main()
{

	int money;
	printf("현재 당신이 소유하고 있는 금액 : "); scanf_s("%d", &money);

	Branch(money);

	printf("어떻게 구입하시겠습니까?\n");
}
