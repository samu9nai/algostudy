#include <stdio.h>

int fact(int n)
{
    if (n <= 0) return 1;
    return (n * fact(n - 1));
}
int Combination(int n, int r)
{
    int c;
    c = fact(n) / (fact (r) * fact(n - r));
    return c;
}

int main()
{
    int n, r;
    scanf("%d %d", &n, &r);
    printf("%d\n", Combination(n, r));
}