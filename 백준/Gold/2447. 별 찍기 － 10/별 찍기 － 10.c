#include <stdio.h>

void star(int x, int y, int num)
{
    if ((y / num) % 3 == 1 && (x / num) % 3 == 1) printf(" ");
    else
    {
        if (num / 3 == 0) printf("*");
        else star(y, x, num / 3);
    }
}

int main()
{
    int i, j, n;
    scanf("%d", &n);

    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
            star(i, j, n);
            
        printf("\n");
    }
}