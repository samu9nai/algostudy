#include <stdio.h>

struct baseball
{
    int num, s, b;
}kbo[101];

int ans, a[3], b[3];

int main()
{
    int n, i, j, k;
    scanf("%d", &n);
    for (i = 0; i < n; i++)
        scanf("%d %d %d", &kbo[i].num, &kbo[i].s, &kbo[i].b);
    for (i = 123; i <= 987; i++)
    {
        int cnt = 0;
        a[0] = i / 100;
        a[1] = (i / 10) % 10;
        a[2] = i % 10;
        if (!a[1] || !a[2] || a[0] == a[1] || a[1] == a[2] || a[2] == a[0]) continue;
		for (j = 0; j < n; j++) 
        {
			int st = 0, ba = 0, t = kbo[j].num;
			b[0] = t / 100;
            b[1] = (t / 10) % 10;
            b[2] = t % 10;
			for (k = 0; k < 3; k++)
            {
				if (a[k] == b[k]) st++;
				if (a[k] == b[(k + 1) % 3] || a[k] == b[(k + 2) % 3]) ba++;
			}
			if (st == kbo[j].s && ba == kbo[j].b) cnt++;
		}
		if (cnt == n) ans++;
    }
    printf("%d\n", ans);
}