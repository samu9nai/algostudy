#include <stdio.h> 

int main()
{
    int i, n, sum = 0;
    char str[101] = { 0 };
    scanf("%d", &n);
    scanf("%s", str);
    for (i = 0; i < n; i++)
        sum += str[i] - '0';
    printf("%d\n", sum);
}