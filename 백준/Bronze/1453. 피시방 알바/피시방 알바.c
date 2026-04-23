#include <stdio.h>

int main()
{
    int n;
    scanf("%d", &n);
    int i, j;
    int a[101] = {0};
    int num, cnt = 0;
    for (i = 0; i < n; i++)
    {
        scanf("%d", &num);
        if(a[num]) cnt++;
        a[num] = 1;
    }
    printf("%d\n", cnt);
}