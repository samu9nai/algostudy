#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main()
{
    int i, n, j, len;
    char file[50][51] = { 0 };
    char ans[51] = { 0 };
    scanf("%d", &n);
    for (i = 0; i < n; i++)
        scanf("%s", file[i]);
    
    len = strlen(file[0]);
    memcpy(ans, file[0], len);

    for (i = 0; i < len; i++)
    {
        for (j = 0; j < n - 1; j++)
        {
            if (file[j][i] != file[j + 1][i])
            {
                ans[i] = '?';
                break;
            }
        }
    }
    printf("%s\n", ans);
}