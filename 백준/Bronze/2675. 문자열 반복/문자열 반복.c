#include <stdio.h> 
#include <string.h>

int main()
{
    int t, r, i, j, k, len;
    char s[21];
    scanf("%d", &t);
    for (i = 0; i < t; i++)
    {
        scanf("%d %s", &r, s);
        len = strlen(s);
        for (j = 0; j < len; j++)
            for (k = 0; k < r; k++)
                printf("%c", s[j]);
        printf("\n");
    }    
    
}