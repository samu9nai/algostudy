#include <stdio.h>

int a[301][301];
int main()
{
    int n, m, r, c;
    scanf("%d %d", &n, &m);
    for (r = 1; r <= n; r++)
        for (c = 1; c <= m; c++)
            scanf("%d", &a[r][c]);
    int k;
    scanf("%d", &k);
    while (k--)
    {
        int i, j, x, y;
        int sum = 0;
        scanf("%d %d %d %d", &i, &j, &x, &y);
        for (r = i; r <= x; r++)
            for (c = j; c <= y; c++)
                sum += a[r][c];
        printf("%d\n", sum);
    }
    return 0;
}