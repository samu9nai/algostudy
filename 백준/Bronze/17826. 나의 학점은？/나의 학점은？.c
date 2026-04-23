#include <stdio.h>

int main()
{
    int a[100] = {0};
    int i, j;
    int hong;
    for (i = 0; i < 50; i++)
        scanf("%d", &a[i]);
    
    scanf("%d", &hong);
    
    for (j = 0; a[j]; j++)
        if (a[j] == hong) break;
    
    if (j >= 0 && j <= 4) printf("A+");
    else if (j >= 5 && j <= 14) printf("A0");
    else if (j >= 15 && j <= 29) printf("B+");
    else if (j >= 30 && j <= 34) printf("B0");
    else if (j >= 35 && j <= 44) printf("C+");
    else if (j >= 45 && j <= 47) printf("C0");
    else printf("F");
}