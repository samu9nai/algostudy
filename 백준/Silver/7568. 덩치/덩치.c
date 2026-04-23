#include <stdio.h>

int main() 
{
	int n, k, i , j;

	int x[50] = { 0 };
	int y[50] = { 0 };

	scanf("%d", &n);

	for (i = 0; i < n; i++)
		scanf("%d %d", &x[i], &y[i]);

	for (i = 0; i < n; i++) 
    {
		k = 0;
		for (j = 0; j < n; j++) 
        {
			if (x[i] < x[j] && y[i] < y[j])
				k++;
		}
		printf("%d ", k + 1);
	}

}