#include <stdio.h>
#include <stdlib.h>

typedef struct node
{
    int data;
    struct node *next;
} Node;

Node *Create(int newData)
{
    Node *newNode = (Node *)malloc(sizeof(Node));
    newNode->data = newData;
    newNode->next = NULL;
    return newNode;
}

Node *Delete(Node *prev, Node *curr)
{
    Node *temp = curr->next;
    prev->next = temp;
    free(curr);
    return temp;
}

Node *Link(Node *prev, int newData)
{
    Node *temp = Create(newData);
    temp->data = newData;
    prev->next = temp;
    return temp;
}

int main()
{
    int n, k, i;
    int cnt = 0;
    Node *root = Create(1);
    Node *prev = root;
    scanf("%d %d", &n, &k);
    for (i = 2; i <= n; i++)
        root = Link(root, i);
    
    root->next = prev;
    root = prev;
    printf("<");

    while (n)
    {
        cnt++;
        if (k == cnt)
        {
            if (n - 1)
                printf("%d, ", root->data);
            else
                printf("%d", root->data);
            root = Delete(prev, root);
            cnt = 0;
            n--;
        }
        else
        {
            prev = root;
            root = root->next;
        }
    }
    printf(">");
}