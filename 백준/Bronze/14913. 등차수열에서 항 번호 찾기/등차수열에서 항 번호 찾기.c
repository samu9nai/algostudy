#include <stdio.h>

int main(void)
{
	int a, d, k;
	scanf("%d %d %d", &a, &d, &k);

	if ((k - a) % d || (k-a) / d < 0)
		printf("X\n");
	else
		printf("%d\n", (k - a) / d + 1);
	return 0;
}
