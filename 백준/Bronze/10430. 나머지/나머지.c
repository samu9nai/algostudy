#include <stdio.h>

int main()
{
  int a, b, c;
  int ans1, ans2, ans3, ans4;

  scanf("%d %d %d", &a, &b, &c);
  ans1 = (a + b) % c;
  ans2 = ((a % c) + (b % c)) % c;
  ans3 = (a * b) % c;
  ans4 = ((a % c) * (b % c)) % c;
  printf("%d\n%d\n%d\n%d\n", ans1, ans2, ans3, ans4);
  return 0;
}