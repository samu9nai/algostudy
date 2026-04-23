#include <stdio.h>

int myfact(int n)
{
    if (n <= 0) return 1;
    return (n * myfact(n - 1));
}

int main()
{
    int i;
    scanf("%d", &i);
    printf("%d\n", myfact(i));
}