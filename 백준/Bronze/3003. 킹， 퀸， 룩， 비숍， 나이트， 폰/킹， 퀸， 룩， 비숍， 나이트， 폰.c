#include <stdio.h>

int main()
{
  int a, b, c, d, e, f;
  int ans1, ans2, ans3, ans4, ans5, ans6;

  scanf("%d %d %d %d %d %d", &a, &b, &c, &d, &e, &f);
  
  ans1 = 1 - a;
  ans2 = 1 - b;
  ans3 = 2 - c;
  ans4 = 2 - d;
  ans5 = 2 - e;
  ans6 = 8 - f; 
  printf("%d %d %d %d %d %d", ans1, ans2, ans3, ans4, ans5, ans6);
}