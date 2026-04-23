#include <stdio.h>
#include <stdlib.h>

typedef struct student
{
    int age;
    char name[102];
}Student;

int cmp(const void* a, const void* b)
{
    Student* ptrA = (Student*)a;
    Student* ptrB = (Student*)b;

    if (ptrA->age > ptrB->age)
        return 1;
    else if (ptrA->age == ptrB->age && ptrA->name > ptrB->name)
        return 1;
    else
        return 0;
}

Student a[100001];

int main()
{
    int n, i;
    scanf("%d", &n);
    for (i = 0; i < n; i++)
        scanf("%d %s", &a[i].age, a[i].name);
    qsort(a, n, sizeof(Student), cmp);
    for (i = 0; i < n; i++)
        printf("%d %s\n", a[i].age, a[i].name);
}