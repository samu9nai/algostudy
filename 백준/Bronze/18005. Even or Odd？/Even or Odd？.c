#include  <stdio.h>

int main()
{
	int n;
	scanf("%d", &n);

	if (n % 2 == 1) printf("0\n");

	else if ((n + 1) % 2 == 1 && (n / 2) % 2 == 1) printf("1\n");

	else printf("2\n");
}