#include <stdio.h>

int main()
{
    int a[31] = {0};
    int i, j, temp = 0;
    for (i = 0; i < 28; i++)
    {
        scanf("%d", &temp);
        a[temp - 1] = 1;
    }

    for (j = 0; j < 30; j++)
        if (!a[j]) printf("%d\n", j + 1);
}