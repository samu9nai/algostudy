#include <stdio.h>
#include <math.h>

int main()
{
    int i, n, x, y, nx, ny;
    int fx, fy;
    int ans = 0;
    scanf("%d", &n);
    scanf("%d %d", &fx, &fy);
    x = fx;
    y = fy;
    for (i = 0; i < n - 1; i++)
    {
        scanf("%d %d", &nx, &ny);
        ans += abs(nx + ny - x - y);
        x = nx;
        y = ny;
    }
    ans += abs(x + y - fx - fy);
    printf("%d\n", ans);
}