#include <stdio.h>

int main()
{
    char a[1000001] = { 0 };
    int alp[26] = { 0 }, i, j;
    int best = 0, max = 0, overlap = 0;
    scanf("%s", a);
    for (i = 0; a[i]; i++)
    {
        if (a[i] < 91) alp[a[i] - 65]++;
        else alp[a[i] - 97]++;
    }

    for(i = 0; i < 26; i++)
    {
        for(j = 0; j < 26; j++)
        {
            if(alp[j] > max)
            {
                max = alp[j];
              best = j;
            }
        }
        
        if(max == alp[i]) overlap++;
    }

    if(overlap >= 2) printf("?");
    else printf("%c", best + 65);

}