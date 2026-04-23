#include <stdio.h>

int main()
{
    int i, n;
    scanf("%d", &n);
    int b[101] = {0};
    for (i = 0; i < n; i++)
        scanf("%d", &b[i]);

    for (i = n - 1; i >= 0; i--)
	{
		b[i] *= (i + 1);
		if (i > 0)
			b[i] -= (b[i - 1] * i);
	}

	for (i = 0; i < n; i++)
		printf("%d ", b[i]);

}