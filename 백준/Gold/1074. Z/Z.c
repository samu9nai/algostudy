#include <stdio.h>

int square(int n)
{
    if (n == 0) return 1;
    else if (n == 1) return 2;
    else return 2 * square(n - 1);
}

int compare(int r, int c)
{
    int i, max;
    max = (r > c) ? r : c;
    for (i = 1; square(i) < max + 1; i++);
    return i;
}

int main(void)
{
    int N, r, c;
    int num, r1, c1, q1, q2, k = 1;
    scanf("%d %d %d", &N, &r, &c);
    
    if (r % 2 == 0 && c % 2 == 0) num = 0;
    else if (r % 2 == 0 && c % 2 == 1) num = 1;
    else if (r % 2 == 1 && c % 2 == 0) num = 2;
    else num=3;
    
    if(compare(r, c) == 1) printf("%d\n", num);
   
    else
    {
       while(compare(r, c) > k)
       {
         r1 = r % square(k + 1);
         c1 = c % square(k + 1);
         
         q1 = r1 / square(k);
         q2 = c1 / square(k);

         num += q1 * square(k) * square(k) * 2 + q2 * square(k) * square(k);
         k++;
       }
       printf("%d\n", num);
    }
    return 0;
}
