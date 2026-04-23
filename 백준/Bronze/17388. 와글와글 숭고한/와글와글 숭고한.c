#include  <stdio.h>

int main()
{
	int s, k, h;
	scanf("%d %d %d", &s, &k, &h);

	if(s + k + h >= 100) printf("OK\n");

	else
	{
		int min = s;
		if (k < min) min = k;
		if (h < min) min = h;

		if (min == k) printf("Korea\n");
		else if (min == s) printf("Soongsil\n");
		else printf("Hanyang\n");
	}
}