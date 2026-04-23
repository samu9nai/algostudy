#include <stdio.h>

int main()
{
  int a, b;
  int ans1, ans2, ans3, ans4;

  scanf("%d %d", &a, &b);
  ans1 = (a * (b % 10));
  ans2 = (a * ((b / 10) % 10));
  ans3 = (a * (b / 100));
  ans4 = (a * b);
  printf("%d\n%d\n%d\n%d\n", ans1, ans2, ans3, ans4);
}