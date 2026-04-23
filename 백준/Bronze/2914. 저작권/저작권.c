#include <stdio.h>

int main()
{
  int a, b, sum;
  scanf("%d %d", &a, &b);
  sum = (a * (b - 1)) + 1;
  printf("%d\n", sum);
}