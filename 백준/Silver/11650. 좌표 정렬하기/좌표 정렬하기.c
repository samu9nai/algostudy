#include <stdio.h>
#include <stdlib.h>

typedef struct Pos
{
    int xpos;
    int ypos;
}Pos;

int cmp(const void *a, const void *b)
{
    Pos *ptrA = (Pos*)a;
    Pos *ptrB = (Pos*)b;

    if (ptrA->xpos > ptrB->xpos) 
        return 1;
    else if (ptrA->xpos == ptrB->xpos && ptrA->ypos > ptrB->ypos) 
        return 1;
    else
        return 0;
}

int main()
{
    int n, i;
    scanf("%d", &n);
    Pos a[n + 1];
    for (i = 0; i < n; i++)
        scanf("%d %d", &a[i].xpos, &a[i].ypos);
    qsort(a, n, sizeof(Pos), cmp);
    for (i = 0; i < n; i++)
        printf("%d %d\n", a[i].xpos, a[i].ypos);   
}