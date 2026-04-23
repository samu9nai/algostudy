#include <stdio.h>

int main()
{
    int len[100001] = {0};
    int n, j, c = 0;
    scanf("%d", &n);
    while (n--)
    {
        int a, b, i;
        scanf("%d %d", &a, &b);
        for (i = a; i < b; i++)
            len[i] = 1;
    }
    for (j = 0; j <= 100000; j++)
        if (len[j] == 1) c++;
    printf("%d", c);
}