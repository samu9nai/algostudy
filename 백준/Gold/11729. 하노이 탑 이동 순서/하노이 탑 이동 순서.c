#include <stdio.h>

int count;

void move(int from, int to)
{
    printf("%d %d\n", from, to);
}

void hanoi(int n, int from, int mid, int to)
{
    if(n == 1)
        move(from, to);
    else {
        hanoi(n - 1, from, to, mid);
        move(from, to);
        hanoi(n - 1, mid, from, to);
    }
}

int main(void)
{
    int n;
    scanf("%d", &n);

    count = (1 << n) - 1;
    printf("%d\n", count);
    hanoi(n, 1, 2, 3);
}