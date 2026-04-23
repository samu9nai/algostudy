#include <stdio.h>

int main()
{
    int n;

    scanf("%d", &n);

    while (n--)
    {
        int a, b;
        scanf("%d %d", &a, &b);
        int result = 1;
        
        for (int i = 1; i <= b; ++i)
        {
            result = (result * a) % 10;
        }
        if (result == 0) result = 10;
        printf("%d\n", result);
    }
}