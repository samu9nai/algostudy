#include <stdio.h>

int main()
{
  double a, b;
  double sum;
  sum = 0;
  scanf("%lf %lf", &a, &b);
  sum = a / b;
  printf("%0.9lf\n", sum);
  return 0;
}
