#include <stdio.h>

int total(int k, int e, int m, int s, int g);
double ave(int tot);
void print_title(void);

int main(void)
{
	int k, e, m, s, g;
	int tot;
	int im;
	double res;

	printf("다섯 과목의 점수 입력 : ");
	scanf_s("%d%d%d%d%d", &k, &e, &m, &s, &g);
	print_title();
	printf("국어 영어 수학 사회 과학 총점 평균\n");
	tot = total(k, e, m, s, g);
	res = ave(tot);
	printf("%3d%5d%5d%5d%5d%6d %5.1lf\n", k, e, m, s, g, tot, res);

	return 0;
}

int total(int k, int e, int m, int s, int g)
{
	int temp;
	temp = k + e + m + s + g;
	return temp;
}

double ave(int tot)
{
	double temp;
	temp = (double)tot / 5;
	return temp;
}

void print_title(void)
{
	int i;
	for (i = 0; i < 30; i++)
	{
		printf("-");
	}
	printf("\n");
}


int main(void)
{
int score[4][5];
int i, j;
int tot;
double avg;

for (i = 0; i < 4; i++)
{
	printf("국,영,수,사,과 점수를 순서대로 입력하세요  ");
	for (j = 0; j < 5; j++)
	{
		scanf_s("%d", &score[i][j]);
	}
}

for (i = 0; i < 4; i++)
{
	for (j = 0; j < 5; j++)
	{
		printf("%3d\t", score[i][j]);
	}
	printf("\n");
}
printf("\n\n");

for (i = 0; i < 4; i++)
{

	double avg = (score[i][0] + score[i][1] + score[i][2] + score[i][3] + score[i][4]) / 5;

	int tot = score[i][0] + score[i][1] + score[i][2] + score[i][3] + score[i][4];

	printf("학생 %d 의평균 = %2.2f, 총점 = %d\n", i + 1, avg, tot);

}

return 0;
}

