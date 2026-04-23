#include <stdio.h>

int main()
{
    int a[10000000] = {0};
    int n, c;
    int i, num, temp, cnt = 0;
    scanf("%d %d", &n, &c);
    for (i = 0; i < n; i++)
    {
        scanf("%d", &num);
        temp = num;
        if (!a[num])
        {
            while (1)
            {
                if (num > c)
                    break;
                else
                {
                    a[num] = 1;
                    num += temp;
                }
            }
        }
    }

    for (i = 1; i <= c; i++)
        if (a[i])
            cnt++;
    printf("%d", cnt);
}