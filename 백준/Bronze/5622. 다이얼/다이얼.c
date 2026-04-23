#include <stdio.h>

int main()
{
    char dial[16];
    int dtime[] = {3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10};
    int i, time = 0;
    scanf("%s", dial);
    for (i = 0; dial[i]; i++)
        time += dtime[dial[i] - 'A'];
    printf("%d\n", time);
}