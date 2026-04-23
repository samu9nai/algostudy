#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct node
{
    int data;
    struct node *prev;
    struct node *next;
}Node;

int size;

Node *front = NULL, *back = NULL;

Node *Create()
{
    Node *newNode = (Node *)malloc(sizeof(Node));
    newNode->prev = NULL;
    newNode->next = NULL;
    return newNode;
}

void push_front(int newData)
{
    Node *newNode = Create();
    newNode->data = newData;
    if (!front || !back)
        front = back = newNode;
    else
    {
        newNode->next = front;
        front->prev = newNode;
        front = newNode;
    }
    size++;
}

void push_back(int newData)
{
    Node *newNode = Create();
    newNode->data = newData;
    if (!front || !back)
        front = back = newNode;
    else
    {
        newNode->prev = back;
        back->next = newNode;
        back = newNode;
    }
    size++;
}

int pop_front()
{
    if (!front || !back) return -1;
    else
    {
        int result;
        Node *temp = front;
        result = temp->data;
        front = temp->next;
        free(temp);
        if (!front)
            back = NULL;
        else
            front->prev = NULL;
        size--;
        return result;
    }
}

int pop_back()
{
    if (!front || !back) return -1;
    else
    {
        int result;
        Node *temp = back;
        result = temp->data;
        back = temp->prev;
        free(temp);
        if (!back)
            front = NULL;
        else
            back->next = NULL;
        size--;
        return result;
    }
}

int main()
{
    int n;
    char str[100];
    scanf("%d", &n);
    while (n--)
    {
        scanf("%s", str);
        if (strcmp(str, "push_back") == 0)
        {
            int m;
            scanf("%d", &m);
            push_back(m);
        }
        else if (strcmp(str, "push_front") == 0)
        {
            int m;
            scanf("%d", &m);
            push_front(m);
        }
        else if (strcmp(str, "pop_back") == 0)
            printf("%d\n", pop_back());
        else if (strcmp(str, "pop_front") == 0)
            printf("%d\n", pop_front());
        else if (strcmp(str, "size") == 0)
            printf("%d\n", size);
        else if (strcmp(str, "empty") == 0)
            printf("%d\n", size ? 0 : 1);
        else if (strcmp(str, "front") == 0)
            printf("%d\n", front == NULL ? -1 : front->data);
        else if (strcmp(str, "back") == 0)
            printf("%d\n", back == NULL ? -1 : back->data);
    }
}