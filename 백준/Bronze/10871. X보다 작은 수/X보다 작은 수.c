#include <stdio.h>

int main()
{
    int n, k, i, j;
    scanf("%d %d", &n, &k);
    
    for (i = 1; i <= n; i++)
    {
        scanf("%d", &j);
        if (j < k) printf("%d ", j);
    }
}