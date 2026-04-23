#include <stdio.h>

int main()
{
    char ml, mr, tl, tr;
    scanf("%c %c %c %c", &ml, &mr, &tl, &tr);
    if (((ml == 'R' || mr == 'R') && (tl == 'S' && tr == 'S'))
		|| (ml == 'S' || mr == 'S') && (tl == 'P' && tr == 'P')
		|| (ml == 'P' || mr == 'P') && (tl == 'R' && tr == 'R')) printf("MS\n");
    else if (((tl == 'R' || tr == 'R') && (ml == 'S' && mr == 'S'))
		|| (tl == 'S' || tr == 'S') && (ml == 'P' && mr == 'P')
		|| (tl == 'P' || tr == 'P') && (ml == 'R' && mr == 'R')) printf("TK\n");
    else printf("?\n");
}