#include <stdio.h>

int main()
{
    int h, m ,s, T, tc, c, mod = 86400;
    scanf("%d %d %d %d", &h, &m, &s, &tc);
    s += m * 60 + h * 3600;
    while (tc--)
    {
        scanf("%d", &T);
        if (T == 1) scanf("%d", &c), s = (s + c) % mod;
        if (T == 2) scanf("%d", &c), s = (s - c) % mod;
        if (T == 3)
        {
			if (s < 0) s += mod;
			printf("%d %d %d\n", s / 3600, s % 3600 / 60, s % 60);
		}
    }
}