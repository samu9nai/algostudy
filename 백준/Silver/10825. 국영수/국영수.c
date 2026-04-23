#include <stdio.h>
#include <stdlib.h>

struct student {
    int kor, eng, math;
    char name[12];
};

struct student a[100001];

int cmp(const void *a, const void *b)
{
    struct student num1 = *(struct student *)a;
    struct student num2 = *(struct student *)b;

    if (num1.kor < num2.kor)
        return 1;
    else if (num1.kor > num2.kor)
        return -1;
    else if (num1.eng > num2.eng)
        return 1;
    else if (num1.eng < num2.eng)
        return -1;
    else if (num1.math > num2.math)
        return -1;
    else if (num1.math < num2.math)
        return 1;
	else if (strcmp(num1.name, num2.name) < 0)
		return -1;
	else if (strcmp(num1.name, num2.name) > 0)
		return 1;
    else
        return 0;
}

int main()
{
    int n, i;
    scanf("%d", &n);
    for (i = 0; i < n; i++)
        scanf("%s %d %d %d", a[i].name, &a[i].kor, &a[i].eng, &a[i].math);
    qsort(a, n, sizeof(struct student), cmp);
    for (i = 0; i < n; i++)
        printf("%s\n", a[i].name);
}